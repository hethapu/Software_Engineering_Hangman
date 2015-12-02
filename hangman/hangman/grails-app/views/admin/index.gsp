<html>
<head>
		<meta name="layout" content="hangman"/>
</head>
<body>
<br>
<br>
<div align="center">
<g:each in="${Phrases}">
Game ${it.id } <a href="${createLink(action: 'delete', id:it.id)}">Delete</a><br>
${ it.category }<br>
${ it.phrasevalue }<br>
${ it.hint } <br>
<br>
</g:each>
<g:form name="myForm"  action="newPhrase">
Enter Category:<g:textField name="PhraseCategory"/><br>
Enter New Phrase:<g:textField name="PhraseValue"/><br>
Enter Hint:<g:textField name="PhraseHint"/>
<g:submitButton name="New"/>
</g:form>
<br><br>
<a href="${createLink(controller: 'LetsPlay', action: 'list')}">Back to Home</a>

</div>
</body></html>