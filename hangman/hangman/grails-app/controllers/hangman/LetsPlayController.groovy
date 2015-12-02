package hangman

import hangman.Game;
import com.hangman.GameLog;
import com.hangman.Phrase;
import grails.plugin.facebooksdk.FacebookContext
import grails.plugin.facebooksdk.FacebookGraphClient

class LetsPlayController {


		
	FacebookContext facebookContext
		
	
	private def getuser ()
	{
	def user
	
	if (facebookContext.app.id && facebookContext.authenticated) {

		def token = facebookContext.user.token
		
		if(token)
		{
			FacebookGraphClient facebookGraphClient = new FacebookGraphClient(token)
			
			user = facebookGraphClient.fetchObject(facebookContext.user.id.toString())
	
		}
		
	
		}
	
		if(facebookContext.user.id == 0)
		{
			redirect(controller: "login", action:"index")
		}
		
		return user
	}
	
	
	def selectbycategory() {
		
		def message 
		
		message = "start"
		
		def result = GameLog.executeQuery("select max(p.id) from GameLog gl, Phrase p where gl.phraseID = p.id and gl.faceBookUserID = " + facebookContext.user.id + " and p.category = '"+ params.nextcategory + "'")
		
		def lastplayed
		
		if(result[0])
		{
			lastplayed = result[0]
		}
		else
		{
			lastplayed = 0
		}
		
		def nextphrase = Phrase.executeQuery("select min(id) from Phrase where category = '"+ params.nextcategory + "' and id > " + lastplayed)
		
		if(nextphrase[0])
		{
			Phrase SelectedPhrase = Phrase.get(nextphrase[0])
			
			if(SelectedPhrase)
			{
			Game myGame = new Game(SelectedPhrase)
			session["myGame"] = myGame
			
			render(view:"index",  model: [myGame: myGame, facebookContext : facebookContext, user: getuser()])
			}
		}
		[facebookContext : facebookContext, user: getuser()]
	}
	
	
	def select() {
		
		Integer GameID = params.int('id') 
		
		Phrase SelectedPhrase = Phrase.get(GameID)
		
		if(SelectedPhrase)
		{
		Game myGame = new Game(SelectedPhrase)
		session["myGame"] = myGame
		
		render(view:"index",  model: [myGame: myGame, facebookContext : facebookContext, user: getuser()])
		}
		
	}
	
	def list() {
		def myGames = GameLog.executeQuery("select p.phrasevalue, p.category, gl.timeSpent, gl.won, gl.badGuesses from GameLog gl, Phrase p where gl.phraseID = p.id and gl.faceBookUserID = " + facebookContext.user.id)
		
		def cat = Phrase.executeQuery("select distinct category from Phrase")
			
		render(view:"list", model: [cat:cat, myGames:myGames, facebookContext : facebookContext, user: getuser()])
	}
	
	def showHint() {
		Game myGame = session["myGame"]
		if(myGame)
		{
			myGame.ShowHint = true
			render(view:"index", model: [myGame : myGame, facebookContext : facebookContext, user: getuser()])
		}
		else
			redirect action: 'list'
	}
	
    def index() {
		Game myGame = session["myGame"]
		if(myGame)
			[myGame : myGame, facebookContext : facebookContext, user: getuser()]
		else
			redirect action: 'list'
	}
	
	def guess() {
		Game myGame = session["myGame"]
		
		def user = getuser()
		if(!myGame.Complete)
		{
			myGame.Guess(params.id)
			
			if(myGame.Complete)
			{
				if(user)
				{
					GameLog NewLog = new GameLog()
					NewLog.phraseID = myGame.Phrase.id
					NewLog.won = myGame.Won
					NewLog.badGuesses = myGame.BadGuesses
					NewLog.faceBookUserID = facebookContext.user.id
					NewLog.timeSpent = myGame.TimeSpent
					NewLog.save()
				}
			}
		}
		render(view:'index', model:[myGame : myGame, facebookContext : facebookContext, user:user])
	}
	
	def setTheme()
	{
		if(params.NextTheme)
		{
		session.theme = params.NextTheme
		}
		list()
	}

}