package hangman

class LetsPlayController {

    def index() {
		
		Game myGame = new Game("Once upon a time")
		session["myGame"] = myGame
		[myGame : myGame]
	}
	
	def guess() {
		Game myGame = session["myGame"]
		myGame.Guess(params.id)
		render(view:'index', model:[myGame : myGame])
	}
	
	def newPhrase() {
		Game myGame = new Game(params.Phrase)
		session["myGame"] = myGame
		render(view:'index', model:[myGame : myGame])
	}
}