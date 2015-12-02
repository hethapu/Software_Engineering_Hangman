package hangman

import grails.plugin.facebooksdk.FacebookContext;
import grails.plugin.facebooksdk.FacebookGraphClient

import com.hangman.Phrase;



class AdminController {

	FacebookContext facebookContext
	
	private def getadmin ()
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
	
	
	
	def index() {
		
		
		[Phrases:Phrase.getAll(), facebookContext : facebookContext, user: getadmin()]
	}
	
	def delete() {
		
		Phrase DeletePhrase = Phrase.get(params.id)
		DeletePhrase.delete(flush:true)
		
		render(view:'index', model:[Phrases:Phrase.getAll(), facebookContext : facebookContext, user: getadmin()])
		
	}
	
	
	
	def newPhrase() {
		Phrase NewPhrase = new Phrase()
		NewPhrase.category = params.PhraseCategory
		NewPhrase.phrasevalue = params.PhraseValue
		NewPhrase.hint = params.PhraseHint
		NewPhrase.save()

		render(view:'index', model:[Phrases:Phrase.getAll(), facebookContext : facebookContext, user: getadmin()])
	}
}