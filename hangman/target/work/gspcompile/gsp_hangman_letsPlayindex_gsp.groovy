import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hangman_letsPlayindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/letsPlay/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
invokeTag('textField','g',4,['name':("Phrase")],-1)
printHtmlPart(1)
invokeTag('submitButton','g',5,['name':("New")],-1)
printHtmlPart(1)
})
invokeTag('form','g',6,['name':("myForm"),'action':("newPhrase")],2)
printHtmlPart(3)
expressionOut.print(myGame.BadGuesses)
printHtmlPart(4)
expressionOut.print(myGame.CurrentView())
printHtmlPart(5)
expressionOut.print(createLink(action: 'guess', id:'A'))
printHtmlPart(6)
expressionOut.print(createLink(action: 'guess', id:'B'))
printHtmlPart(7)
expressionOut.print(createLink(action: 'guess', id:'C'))
printHtmlPart(8)
expressionOut.print(createLink(action: 'guess', id:'D'))
printHtmlPart(9)
expressionOut.print(createLink(action: 'guess', id:'E'))
printHtmlPart(10)
expressionOut.print(createLink(action: 'guess', id:'F'))
printHtmlPart(11)
expressionOut.print(createLink(action: 'guess', id:'G'))
printHtmlPart(12)
expressionOut.print(createLink(action: 'guess', id:'H'))
printHtmlPart(13)
expressionOut.print(createLink(action: 'guess', id:'I'))
printHtmlPart(14)
expressionOut.print(createLink(action: 'guess', id:'J'))
printHtmlPart(15)
expressionOut.print(createLink(action: 'guess', id:'K'))
printHtmlPart(16)
expressionOut.print(createLink(action: 'guess', id:'L'))
printHtmlPart(17)
expressionOut.print(createLink(action: 'guess', id:'M'))
printHtmlPart(18)
expressionOut.print(createLink(action: 'guess', id:'N'))
printHtmlPart(19)
expressionOut.print(createLink(action: 'guess', id:'O'))
printHtmlPart(20)
expressionOut.print(createLink(action: 'guess', id:'P'))
printHtmlPart(21)
expressionOut.print(createLink(action: 'guess', id:'Q'))
printHtmlPart(22)
expressionOut.print(createLink(action: 'guess', id:'R'))
printHtmlPart(23)
expressionOut.print(createLink(action: 'guess', id:'S'))
printHtmlPart(24)
expressionOut.print(createLink(action: 'guess', id:'T'))
printHtmlPart(25)
expressionOut.print(createLink(action: 'guess', id:'U'))
printHtmlPart(26)
expressionOut.print(createLink(action: 'guess', id:'V'))
printHtmlPart(27)
expressionOut.print(createLink(action: 'guess', id:'W'))
printHtmlPart(28)
expressionOut.print(createLink(action: 'guess', id:'X'))
printHtmlPart(29)
expressionOut.print(createLink(action: 'guess', id:'Y'))
printHtmlPart(30)
expressionOut.print(createLink(action: 'guess', id:'Z'))
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',1,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1441861222411L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
