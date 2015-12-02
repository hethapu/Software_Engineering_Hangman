import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='facebook-sdk', version='2.5.0')
class gsp_facebookSdk_tags_init_js_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/facebook-sdk-2.5.0/grails-app/views/tags/_init-js.gsp" }
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
expressionOut.print(appId)
printHtmlPart(4)
expressionOut.print(version)
printHtmlPart(5)
if(true && (channelUrl)) {
printHtmlPart(6)
expressionOut.print(channelUrl)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (cookie)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (status)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(12)
if(true && (xfbml)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(13)
if(true && (frictionlessRequests)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(14)
expressionOut.print(customSelector ?: '$')
printHtmlPart(15)
if(true && (autoGrow)) {
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(body)
printHtmlPart(18)
expressionOut.print(locale)
printHtmlPart(19)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1430794394000L
public static final String EXPRESSION_CODEC = 'raw'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
