import grails.converters.JSON
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='facebook-sdk', version='2.5.0')
class gsp_facebookSdk_tags_invite_link_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/facebook-sdk-2.5.0/grails-app/views/tags/_invite-link.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (includeScript)) {
printHtmlPart(1)
expressionOut.print(customSelector ?: '$')
printHtmlPart(2)
expressionOut.print(customSelector ?: '$')
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (elementId)) {
printHtmlPart(5)
expressionOut.print(elementId)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (elementClass)) {
expressionOut.print(elementClass)
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(message.encodeAsHTML())
printHtmlPart(10)
if(true && (callback)) {
printHtmlPart(11)
expressionOut.print(callback)
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (data)) {
printHtmlPart(13)
expressionOut.print(data)
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (display)) {
printHtmlPart(14)
expressionOut.print(display)
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (excludeIds)) {
printHtmlPart(15)
expressionOut.print((excludeIds as JSON).toString().replace('"',"'"))
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (filters)) {
printHtmlPart(16)
expressionOut.print((filters as JSON).toString().replace('"',"'"))
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (maxRecipients)) {
printHtmlPart(17)
expressionOut.print(maxRecipients)
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (title)) {
printHtmlPart(18)
expressionOut.print(title.encodeAsHTML())
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (to)) {
printHtmlPart(19)
expressionOut.print(to)
printHtmlPart(6)
}
printHtmlPart(12)
if(true && (disabled)) {
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(raw(body))
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430794394000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
