import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hangman_layoutshangman_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/hangman.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',3,['var':("theme"),'value':("BasicBlue")],-1)
printHtmlPart(1)
if(true && (session.theme)) {
printHtmlPart(1)
invokeTag('set','g',5,['var':("theme"),'value':(session.theme)],-1)
printHtmlPart(1)
}
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('resource','g',9,['dir':("css"),'file':(theme + '.css')],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('initJS','facebook',17,['appId':(facebookContext.app.id),'xfbml':("true")],2)
printHtmlPart(7)
if(true && (facebookContext.authenticated)) {
printHtmlPart(8)
if(true && (user)) {
printHtmlPart(9)
invokeTag('picture','facebook',26,['facebookId':(facebookContext.user.id),'height':("80"),'width':("80"),'linkEnabled':("true")],-1)
printHtmlPart(10)
expressionOut.print(user.name)
printHtmlPart(11)
}
else {
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('img','g',44,['dir':("images"),'file':(theme + '_logo.png'),'height':("100")],-1)
printHtmlPart(15)
invokeTag('layoutBody','g',49,[:],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1448908173841L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
