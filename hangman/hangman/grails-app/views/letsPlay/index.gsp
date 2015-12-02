<html>
<head>
		<meta name="layout" content="hangman"/>
</head>
<body>
<br>
<br>

<div align="center"">
<g:img dir="images" file="${myGame.BadGuesses }.jpg" width="300" height="300"/>
</div>

<g:if test="${myGame.Complete }">
	<div class="phrase">
		${myGame.Phrase.phrasevalue }
	</div>
	<div align="center">
		
		<g:if test="${myGame.won }">
			<br>
			YOU WIN... It took you ${myGame.TimeSpent} and ${myGame.BadGuesses } Incorrect Guesses
			<br>
		</g:if>
		<g:else>
			<br>
			Good Try...
			<br> 
		</g:else>
		<a href="${createLink(action: 'list')}">Back To Home</a>
	</div>
</g:if>
<g:else>
<div class="phrase">
${myGame.SpacedView().encodeAsRaw() }
</div>

<br>
<div align="center">
   <g:if test="${myGame.ShowHint }">
   		Hint: ${myGame.Phrase.hint }
   </g:if>
   <g:else>
   		<a href="${createLink(action: 'showHint')}">Show Hint</a>
   </g:else>
</div>
</g:else>

<g:set var="ucphrase" value="${myGame.Phrase.phrasevalue.toUpperCase()}" scope="page"/>
	<ul class="nav">
	<li><a href="${createLink(action: 'guess', id:'A', params:'[hide: true]')}" <g:if test="${myGame.Aguessed && ucphrase.contains('A')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Aguessed }"> class="badguess" </g:elseif> >A</a></li>    
	<li><a href="${createLink(action: 'guess', id:'B', params:'[hide: true]')}" <g:if test="${myGame.Bguessed && ucphrase.contains('B')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Bguessed }"> class="badguess" </g:elseif> >B</a></li>    
    <li><a href="${createLink(action: 'guess', id:'C', params:'[hide: true]')}" <g:if test="${myGame.Cguessed && ucphrase.contains('C')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Cguessed }"> class="badguess" </g:elseif> >C</a></li>    
	<li><a href="${createLink(action: 'guess', id:'D', params:'[hide: true]')}" <g:if test="${myGame.Dguessed && ucphrase.contains('D')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Dguessed }"> class="badguess" </g:elseif> >D</a></li>    
	<li><a href="${createLink(action: 'guess', id:'E', params:'[hide: true]')}" <g:if test="${myGame.Eguessed && ucphrase.contains('E')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Eguessed }"> class="badguess" </g:elseif> >E</a></li>    
	<li><a href="${createLink(action: 'guess', id:'F', params:'[hide: true]')}" <g:if test="${myGame.Fguessed && ucphrase.contains('F')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Fguessed }"> class="badguess" </g:elseif> >F</a></li>    
	<li><a href="${createLink(action: 'guess', id:'G', params:'[hide: true]')}" <g:if test="${myGame.Gguessed && ucphrase.contains('G')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Gguessed }"> class="badguess" </g:elseif> >G</a></li>     
	<li><a href="${createLink(action: 'guess', id:'H', params:'[hide: true]')}" <g:if test="${myGame.Hguessed && ucphrase.contains('H')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Hguessed }"> class="badguess" </g:elseif> >H</a></li>    
	<li><a href="${createLink(action: 'guess', id:'I', params:'[hide: true]')}" <g:if test="${myGame.Iguessed && ucphrase.contains('I')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Iguessed }"> class="badguess" </g:elseif> >I</a></li>    
	<li><a href="${createLink(action: 'guess', id:'J', params:'[hide: true]')}" <g:if test="${myGame.Jguessed && ucphrase.contains('J')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Jguessed }"> class="badguess" </g:elseif> >J</a></li>    
	<li><a href="${createLink(action: 'guess', id:'K', params:'[hide: true]')}" <g:if test="${myGame.Kguessed && ucphrase.contains('K')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Kguessed }"> class="badguess" </g:elseif> >K</a></li>    
	<li><a href="${createLink(action: 'guess', id:'L', params:'[hide: true]')}" <g:if test="${myGame.Lguessed && ucphrase.contains('L')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Lguessed }"> class="badguess" </g:elseif> >L</a></li>    
	<li><a href="${createLink(action: 'guess', id:'M', params:'[hide: true]')}" <g:if test="${myGame.Mguessed && ucphrase.contains('M')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Mguessed }"> class="badguess" </g:elseif> >M</a></li>    
	<li><a href="${createLink(action: 'guess', id:'N', params:'[hide: true]')}" <g:if test="${myGame.Nguessed && ucphrase.contains('N')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Nguessed }"> class="badguess" </g:elseif> >N</a></li>    
	<li><a href="${createLink(action: 'guess', id:'O', params:'[hide: true]')}" <g:if test="${myGame.Oguessed && ucphrase.contains('O')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Oguessed }"> class="badguess" </g:elseif> >O</a></li>    
	<li><a href="${createLink(action: 'guess', id:'P', params:'[hide: true]')}" <g:if test="${myGame.Pguessed && ucphrase.contains('P')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Pguessed }"> class="badguess" </g:elseif> >P</a></li>    
	<li><a href="${createLink(action: 'guess', id:'Q', params:'[hide: true]')}" <g:if test="${myGame.Qguessed && ucphrase.contains('Q')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Qguessed }"> class="badguess" </g:elseif> >Q</a></li>    
	<li><a href="${createLink(action: 'guess', id:'R', params:'[hide: true]')}" <g:if test="${myGame.Rguessed && ucphrase.contains('R')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Rguessed }"> class="badguess" </g:elseif> >R</a></li>    
	<li><a href="${createLink(action: 'guess', id:'S', params:'[hide: true]')}" <g:if test="${myGame.Sguessed && ucphrase.contains('S')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Sguessed }"> class="badguess" </g:elseif> >S</a></li>    
	<li><a href="${createLink(action: 'guess', id:'T', params:'[hide: true]')}" <g:if test="${myGame.Tguessed && ucphrase.contains('T')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Tguessed }"> class="badguess" </g:elseif> >T</a></li>    
	<li><a href="${createLink(action: 'guess', id:'U', params:'[hide: true]')}" <g:if test="${myGame.Uguessed && ucphrase.contains('U')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Uguessed }"> class="badguess" </g:elseif> >U</a></li>    
	<li><a href="${createLink(action: 'guess', id:'V', params:'[hide: true]')}" <g:if test="${myGame.Vguessed && ucphrase.contains('V')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Vguessed }"> class="badguess" </g:elseif> >V</a></li>    
	<li><a href="${createLink(action: 'guess', id:'W', params:'[hide: true]')}" <g:if test="${myGame.Wguessed && ucphrase.contains('W')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Wguessed }"> class="badguess" </g:elseif> >W</a></li>    
	<li><a href="${createLink(action: 'guess', id:'X', params:'[hide: true]')}" <g:if test="${myGame.Xguessed && ucphrase.contains('X')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Xguessed }"> class="badguess" </g:elseif> >X</a></li>    
	<li><a href="${createLink(action: 'guess', id:'Y', params:'[hide: true]')}" <g:if test="${myGame.Yguessed && ucphrase.contains('Y')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Yguessed }"> class="badguess" </g:elseif> >Y</a></li>    
	<li><a href="${createLink(action: 'guess', id:'Z', params:'[hide: true]')}" <g:if test="${myGame.Zguessed && ucphrase.contains('Z')}"> class="goodguess"</g:if> <g:elseif test="${myGame.Zguessed }"> class="badguess" </g:elseif> >Z</a></li>    
   </ul>
<br>


   

   
</body>
</html>