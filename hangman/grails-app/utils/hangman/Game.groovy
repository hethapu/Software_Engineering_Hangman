package hangman

class Game {
	String Phrase
	Integer BadGuesses
	Boolean Aguessed
	Boolean Bguessed
	Boolean Cguessed
	Boolean Dguessed
	Boolean Eguessed
	Boolean Fguessed
	Boolean Gguessed
	Boolean Hguessed
	Boolean Iguessed
	Boolean Jguessed
	Boolean Kguessed
	Boolean Lguessed
	Boolean Mguessed
	Boolean Nguessed
	Boolean Oguessed
	Boolean Pguessed
	Boolean Qguessed
	Boolean Rguessed
	Boolean Sguessed
	Boolean Tguessed
	Boolean Uguessed
	Boolean Vguessed
	Boolean Wguessed
	Boolean Xguessed
	Boolean Yguessed
	Boolean Zguessed

	def Game(String newPhrase)
	{
		Phrase = newPhrase
		BadGuesses = 0
		Aguessed = false
		Bguessed = false
		Cguessed = false
		Dguessed = false
		Eguessed = false
		Fguessed = false
		Gguessed = false
		Hguessed = false
		Iguessed = false
		Jguessed = false
		Kguessed = false
		Lguessed = false
		Mguessed = false
		Nguessed = false
		Oguessed = false
		Pguessed = false
		Qguessed = false
		Rguessed = false
		Sguessed = false
		Tguessed = false
		Uguessed = false
		Vguessed = false
		Wguessed = false
		Xguessed = false
		Yguessed = false
		Zguessed = false
	}
	
	def Guess(String newguess)
	{
		Boolean invalidGuess
		
		switch(newguess.toUpperCase())
		    {
			case 'A' :
				invalidGuess = Aguessed
				Aguessed = true
				break
			case 'B' :
				invalidGuess = Bguessed
				Bguessed = true
				break
			case 'C' :
				invalidGuess = Cguessed
				Cguessed = true
				break
			case 'D' :
				invalidGuess = Dguessed
				Dguessed = true
				break
			case 'E' :
				invalidGuess = Eguessed
				Eguessed = true
				break
			case 'F' :
				invalidGuess = Fguessed
				Fguessed = true
				break
			case 'G' :
				invalidGuess = Gguessed
				Gguessed = true
				break
			case 'H' :
				invalidGuess = Hguessed
				Hguessed = true
				break
			case 'I' :
				invalidGuess = Iguessed
				Iguessed = true
				break
			case 'J' :
				invalidGuess = Jguessed
				Jguessed = true
				break
			case 'K' :
				invalidGuess = Kguessed
				Kguessed = true
				break
			case 'L' :
				invalidGuess = Lguessed
				Lguessed = true
				break
			case 'M' :
				invalidGuess = Mguessed
				Mguessed = true
				break
			case 'N' :
				invalidGuess = Nguessed
				Nguessed = true
				break
			case 'O' :
				invalidGuess = Oguessed
				Oguessed = true
				break
			case 'P' :
				invalidGuess = Pguessed
				Pguessed = true
				break
			case 'Q' :
				invalidGuess = Qguessed
				Qguessed = true
				break
			case 'R' :
				invalidGuess = Rguessed
				Rguessed = true
				break
			case 'S' :
				invalidGuess = Sguessed
				Sguessed = true
				break
			case 'T' :
				invalidGuess = Tguessed
				Tguessed = true
				break
			case 'U' :
				invalidGuess = Uguessed
				Uguessed = true
				break
			case 'V' :
				invalidGuess = Vguessed
				Vguessed = true
				break
			case 'W' :
				invalidGuess = Wguessed
				Wguessed = true
				break
			case 'X' :
				invalidGuess = Xguessed
				Xguessed = true
				break
			case 'Y' :
				invalidGuess = Yguessed
				Yguessed = true
				break
			case 'Z' :
				invalidGuess = Zguessed
				Zguessed = true
				break
			default : 
				invalidGuess = true
				break
		}
		
		if(!invalidGuess)
			{
				if(!Phrase.toUpperCase().contains(newguess.toUpperCase()))
				{
					BadGuesses++
				}
			}
		}
	
	 
	def String CurrentView()
	{
		def Regex = '['
		if( !Aguessed ) { Regex += 'Aa' }
		if( !Bguessed ) { Regex += 'Bb' }
		if( !Cguessed ) { Regex += 'Cc' }
		if( !Dguessed ) { Regex += 'Dd' }
		if( !Eguessed ) { Regex += 'Ee' }
		if( !Fguessed ) { Regex += 'Ff' }
		if( !Gguessed ) { Regex += 'Gg' }
		if( !Hguessed ) { Regex += 'Hh' }
		if( !Iguessed ) { Regex += 'Ii' }
		if( !Jguessed ) { Regex += 'Jj' } 
		if( !Kguessed ) { Regex += 'Kk' } 
		if( !Lguessed ) { Regex += 'Ll' }
		if( !Mguessed ) { Regex += 'Mm' }
		if( !Nguessed ) { Regex += 'Nn' } 
		if( !Oguessed ) { Regex += 'Oo' }
		if( !Pguessed ) { Regex += 'Pp' }
		if( !Qguessed ) { Regex += 'Qq' }
		if( !Rguessed ) { Regex += 'Rr' } 
		if( !Sguessed ) { Regex += 'Ss' }
		if( !Tguessed ) { Regex += 'Tt' }
		if( !Uguessed ) { Regex += 'Uu' }
		if( !Vguessed ) { Regex += 'Vv' }
		if( !Wguessed ) { Regex += 'Ww' }
		if( !Xguessed ) { Regex += 'Xx' }
		if( !Yguessed ) { Regex += 'Yy' }
		if( !Zguessed ) { Regex += 'Zz' }
		Regex += ']'
		
		if(Regex == '[]')
		  return (Phrase)
		else
		  return (Phrase.replaceAll(~Regex, '_'))
	}
}
	


