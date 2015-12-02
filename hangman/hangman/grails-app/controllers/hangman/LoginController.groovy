package hangman

import hangman.Game;
import com.hangman.GameLog;
import com.hangman.Phrase;
import grails.plugin.facebooksdk.FacebookContext
import grails.plugin.facebooksdk.FacebookGraphClient

class LoginController {


		
	FacebookContext facebookContext
		

	
	
    def index() {
		if(facebookContext.user.id != 0)
		{
			redirect(controller: "LetsPlay", action:"list")
		}
	}
	


}