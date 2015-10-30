package hangman

class LetsPlayController {

	
	def select() {
		
		Integer GameID = params.int('id') 
		
		Phrase SelectedPhrase = Phrase.get(GameID)
		
		if(SelectedPhrase)
		{
		Game myGame = new Game(SelectedPhrase.Value)
		session["myGame"] = myGame
		
		render(view:"index",  model: [myGame: myGame])
		}
		
	}
	
	def list() {
		[Phrases:Phrase.getAll()]
	}
	
    def index() {
		Game myGame = session["myGame"]
		if(myGame)
			[myGame : myGame]
		else
			redirect action: 'list'
	}
	
	def guess() {
		Game myGame = session["myGame"]
		myGame.Guess(params.id)
		render(view:'index', model:[myGame : myGame])
	}

}