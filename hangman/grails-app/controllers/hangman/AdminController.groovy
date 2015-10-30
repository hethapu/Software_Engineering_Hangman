package hangman

class AdminController {

	
	def index() {
		[Phrases:Phrase.getAll()]
	}
	
	
	def newPhrase() {
		Phrase NewPhrase = new Phrase()
		NewPhrase.Category = params.PhraseCategory
		NewPhrase.Value = params.PhraseValue
		NewPhrase.save()

		render(view:'index', model:[Phrases:Phrase.getAll()])
	}
}