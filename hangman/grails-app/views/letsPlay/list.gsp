<html>
<body>
<g:each in="${Phrases}">
<a href="${createLink(action: 'select', id: it.id)}">Game ${it.id }</a><br>
${ it.Category }<br>
${ it.Value }<br>
<br>
</g:each>
	
</body></html>