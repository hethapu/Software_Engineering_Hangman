import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hangman_letsPlaylist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/letsPlay/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("hangman")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('hiddenField','g',10,['name':("NextTheme"),'value':("NA")],-1)
printHtmlPart(5)
invokeTag('select','g',11,['onchange':("document.getElementById('NextTheme').value=value;submit()"),'optionKey':("key"),'optionValue':("value"),'name':("theme"),'from':(['BasicBlue': 'Nova Blue', 'BasicGreen': 'Green', 'Hema': 'Hema']),'value':(session.theme)],-1)
printHtmlPart(4)
})
invokeTag('form','g',12,['action':("SetTheme")],2)
printHtmlPart(6)
if(true && (myGames.size() > 0)) {
printHtmlPart(7)
for( aGame in (myGames) ) {
printHtmlPart(8)
expressionOut.print(aGame[1])
printHtmlPart(9)
expressionOut.print(aGame[0])
printHtmlPart(9)
expressionOut.print(aGame[4])
if(true && (aGame[3] == 'false')) {
printHtmlPart(10)
}
printHtmlPart(11)
expressionOut.print(aGame[2])
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('select','g',26,['name':("nextcategory"),'from':(cat)],-1)
printHtmlPart(2)
invokeTag('submitButton','g',27,['name':("select"),'value':("select")],-1)
printHtmlPart(2)
})
invokeTag('form','g',28,['action':("selectbycategory")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',38,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1448908936070L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
