import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='facebook-sdk', version='2.5.0')
class gsp_facebookSdk_tags_picture_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/facebook-sdk-2.5.0/grails-app/views/tags/_picture.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
if(true && (linkEnabled)) {
printHtmlPart(0)
expressionOut.print(protocol)
printHtmlPart(1)
expressionOut.print(facebookId)
printHtmlPart(2)
}
printHtmlPart(3)
if(true && (elementId)) {
printHtmlPart(4)
expressionOut.print(elementId)
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (elementClass)) {
printHtmlPart(7)
expressionOut.print(elementClass)
printHtmlPart(5)
}
printHtmlPart(8)
expressionOut.print(protocol)
printHtmlPart(9)
expressionOut.print(facebookId)
printHtmlPart(10)
expressionOut.print(queryString)
printHtmlPart(5)
if(true && (height)) {
printHtmlPart(11)
expressionOut.print(height)
printHtmlPart(5)
}
if(true && (width)) {
printHtmlPart(12)
expressionOut.print(width)
printHtmlPart(5)
}
printHtmlPart(13)
if(true && (linkEnabled)) {
printHtmlPart(14)
}
printHtmlPart(15)
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
