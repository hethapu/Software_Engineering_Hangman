<html xmlns:fb="http://ogp.me/ns/fb#">

<g:set var="theme" value="BasicBlue"/>
<g:if test="${session.theme}">
<g:set var="theme" value="${session.theme}"/>
</g:if> 

<head>
		<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="${theme + '.css' }" />"></link>
	
</head>
<body>
<div id="header">


			<facebook:initJS appId="${facebookContext.app.id}" xfbml="true">
			</facebook:initJS>
			
			
		
			<g:if test="${facebookContext.authenticated}">
               <g:if test="${user}">
				
				<div id="FBPic">
					<div>
						<facebook:picture facebookId="${facebookContext.user.id}" height="80" width="80" linkEnabled="true" />
					</div>
					${user.name}
				</div>
		
				
			</g:if>
			<g:else>
				<strong><em>You are not Connected.</em></strong>
			</g:else>
                
			</g:if>



</div>

<div id="Logo">
<g:img dir="images" file="${theme + '_logo.png' }" height="100"/>
</div>



<g:layoutBody />




</body>
        
</html>