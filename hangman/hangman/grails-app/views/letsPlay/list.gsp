<html>
<head>
		<meta name="layout" content="hangman"/>
</head>
<body>

<div align="center">
<br><br>
<g:form action="SetTheme">
  <g:hiddenField name="NextTheme" value="NA" />
 Theme:&nbsp;<g:select onchange="document.getElementById('NextTheme').value=value;submit()" optionKey="key" optionValue="value" name="theme" from="${['BasicBlue': 'Nova Blue', 'BasicGreen': 'Green', 'Hema': 'Hema']}" value="${session.theme }"/>
  </g:form>

<g:if test="${myGames.size() > 0 }">

<br>
<table><tr><th>Category</th><th>Phrase</th><th>Bad Guesses</th><th>Time</th></tr>
<g:each var="aGame" in="${myGames }">
<tr><td>${aGame[1]}</td><td>${aGame[0]}</td><td>${aGame[4]}<g:if test="${aGame[3] == 'false'}"> - LOST </g:if>  </td><td>${aGame[2]}</td></tr>
</g:each>
</table>
</g:if>
<br>
<br>
<g:form action="selectbycategory">
Select Game Category: <g:select name="nextcategory" from="${cat }"/>
<g:submitButton name="select" value="select" />
</g:form>





</div> 



    </body>
</html>