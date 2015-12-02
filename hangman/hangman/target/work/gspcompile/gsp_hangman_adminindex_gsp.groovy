import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hangman_adminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/index.gsp" }
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
for( _it715570093 in (Phrases) ) {
changeItVariable(_it715570093)
printHtmlPart(4)
expressionOut.print(it.id)
printHtmlPart(5)
expressionOut.print(createLink(action: 'delete', id:it.id))
printHtmlPart(6)
expressionOut.print(it.category)
printHtmlPart(7)
expressionOut.print(it.phrasevalue)
printHtmlPart(7)
expressionOut.print(it.hint)
printHtmlPart(8)
}
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('textField','g',17,['name':("PhraseCategory")],-1)
printHtmlPart(10)
invokeTag('textField','g',18,['name':("PhraseValue")],-1)
printHtmlPart(11)
invokeTag('textField','g',19,['name':("PhraseHint")],-1)
printHtmlPart(2)
invokeTag('submitButton','g',20,['name':("New")],-1)
printHtmlPart(2)
})
invokeTag('form','g',21,['name':("myForm"),'action':("newPhrase")],2)
printHtmlPart(12)
expressionOut.print(createLink(controller: 'LetsPlay', action: 'list'))
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',1,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1448915048332L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
