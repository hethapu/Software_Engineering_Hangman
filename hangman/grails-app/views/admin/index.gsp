<html>
<body>
<g:each in="${Phrases}">
Game ${it.id }<br>
${ it.Category }<br>
${ it.Value }<br>
<br>
</g:each>
<g:form name="myForm"  action="newPhrase">
Enter New Phrase:<g:textField name="PhraseValue"/><br>
Enter Category:<g:textField name="PhraseCategory"/>
<g:submitButton name="New"/>
</g:form>
</body></html>