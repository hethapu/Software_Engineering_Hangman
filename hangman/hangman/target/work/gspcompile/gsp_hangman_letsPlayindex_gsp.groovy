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
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("hangman")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('img','g',10,['dir':("images"),'file':("${myGame.BadGuesses}.jpg"),'width':("300"),'height':("300")],-1)
printHtmlPart(4)
if(true && (myGame.Complete)) {
printHtmlPart(5)
expressionOut.print(myGame.Phrase.phrasevalue)
printHtmlPart(6)
if(true && (myGame.won)) {
printHtmlPart(7)
expressionOut.print(myGame.TimeSpent)
printHtmlPart(8)
expressionOut.print(myGame.BadGuesses)
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(11)
expressionOut.print(createLink(action: 'list'))
printHtmlPart(12)
}
else {
printHtmlPart(13)
expressionOut.print(myGame.SpacedView().encodeAsRaw())
printHtmlPart(14)
if(true && (myGame.ShowHint)) {
printHtmlPart(15)
expressionOut.print(myGame.Phrase.hint)
printHtmlPart(16)
}
else {
printHtmlPart(17)
expressionOut.print(createLink(action: 'showHint'))
printHtmlPart(18)
}
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('set','g',48,['var':("ucphrase"),'value':(myGame.Phrase.phrasevalue.toUpperCase()),'scope':("page")],-1)
printHtmlPart(21)
expressionOut.print(createLink(action: 'guess', id:'A', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Aguessed && ucphrase.contains('A'))) {
printHtmlPart(23)
}
else if(true && (myGame.Aguessed)) {
printHtmlPart(24)
}
printHtmlPart(25)
expressionOut.print(createLink(action: 'guess', id:'B', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Bguessed && ucphrase.contains('B'))) {
printHtmlPart(23)
}
else if(true && (myGame.Bguessed)) {
printHtmlPart(24)
}
printHtmlPart(26)
expressionOut.print(createLink(action: 'guess', id:'C', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Cguessed && ucphrase.contains('C'))) {
printHtmlPart(23)
}
else if(true && (myGame.Cguessed)) {
printHtmlPart(24)
}
printHtmlPart(27)
expressionOut.print(createLink(action: 'guess', id:'D', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Dguessed && ucphrase.contains('D'))) {
printHtmlPart(23)
}
else if(true && (myGame.Dguessed)) {
printHtmlPart(24)
}
printHtmlPart(28)
expressionOut.print(createLink(action: 'guess', id:'E', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Eguessed && ucphrase.contains('E'))) {
printHtmlPart(23)
}
else if(true && (myGame.Eguessed)) {
printHtmlPart(24)
}
printHtmlPart(29)
expressionOut.print(createLink(action: 'guess', id:'F', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Fguessed && ucphrase.contains('F'))) {
printHtmlPart(23)
}
else if(true && (myGame.Fguessed)) {
printHtmlPart(24)
}
printHtmlPart(30)
expressionOut.print(createLink(action: 'guess', id:'G', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Gguessed && ucphrase.contains('G'))) {
printHtmlPart(23)
}
else if(true && (myGame.Gguessed)) {
printHtmlPart(24)
}
printHtmlPart(31)
expressionOut.print(createLink(action: 'guess', id:'H', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Hguessed && ucphrase.contains('H'))) {
printHtmlPart(23)
}
else if(true && (myGame.Hguessed)) {
printHtmlPart(24)
}
printHtmlPart(32)
expressionOut.print(createLink(action: 'guess', id:'I', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Iguessed && ucphrase.contains('I'))) {
printHtmlPart(23)
}
else if(true && (myGame.Iguessed)) {
printHtmlPart(24)
}
printHtmlPart(33)
expressionOut.print(createLink(action: 'guess', id:'J', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Jguessed && ucphrase.contains('J'))) {
printHtmlPart(23)
}
else if(true && (myGame.Jguessed)) {
printHtmlPart(24)
}
printHtmlPart(34)
expressionOut.print(createLink(action: 'guess', id:'K', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Kguessed && ucphrase.contains('K'))) {
printHtmlPart(23)
}
else if(true && (myGame.Kguessed)) {
printHtmlPart(24)
}
printHtmlPart(35)
expressionOut.print(createLink(action: 'guess', id:'L', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Lguessed && ucphrase.contains('L'))) {
printHtmlPart(23)
}
else if(true && (myGame.Lguessed)) {
printHtmlPart(24)
}
printHtmlPart(36)
expressionOut.print(createLink(action: 'guess', id:'M', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Mguessed && ucphrase.contains('M'))) {
printHtmlPart(23)
}
else if(true && (myGame.Mguessed)) {
printHtmlPart(24)
}
printHtmlPart(37)
expressionOut.print(createLink(action: 'guess', id:'N', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Nguessed && ucphrase.contains('N'))) {
printHtmlPart(23)
}
else if(true && (myGame.Nguessed)) {
printHtmlPart(24)
}
printHtmlPart(38)
expressionOut.print(createLink(action: 'guess', id:'O', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Oguessed && ucphrase.contains('O'))) {
printHtmlPart(23)
}
else if(true && (myGame.Oguessed)) {
printHtmlPart(24)
}
printHtmlPart(39)
expressionOut.print(createLink(action: 'guess', id:'P', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Pguessed && ucphrase.contains('P'))) {
printHtmlPart(23)
}
else if(true && (myGame.Pguessed)) {
printHtmlPart(24)
}
printHtmlPart(40)
expressionOut.print(createLink(action: 'guess', id:'Q', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Qguessed && ucphrase.contains('Q'))) {
printHtmlPart(23)
}
else if(true && (myGame.Qguessed)) {
printHtmlPart(24)
}
printHtmlPart(41)
expressionOut.print(createLink(action: 'guess', id:'R', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Rguessed && ucphrase.contains('R'))) {
printHtmlPart(23)
}
else if(true && (myGame.Rguessed)) {
printHtmlPart(24)
}
printHtmlPart(42)
expressionOut.print(createLink(action: 'guess', id:'S', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Sguessed && ucphrase.contains('S'))) {
printHtmlPart(23)
}
else if(true && (myGame.Sguessed)) {
printHtmlPart(24)
}
printHtmlPart(43)
expressionOut.print(createLink(action: 'guess', id:'T', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Tguessed && ucphrase.contains('T'))) {
printHtmlPart(23)
}
else if(true && (myGame.Tguessed)) {
printHtmlPart(24)
}
printHtmlPart(44)
expressionOut.print(createLink(action: 'guess', id:'U', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Uguessed && ucphrase.contains('U'))) {
printHtmlPart(23)
}
else if(true && (myGame.Uguessed)) {
printHtmlPart(24)
}
printHtmlPart(45)
expressionOut.print(createLink(action: 'guess', id:'V', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Vguessed && ucphrase.contains('V'))) {
printHtmlPart(23)
}
else if(true && (myGame.Vguessed)) {
printHtmlPart(24)
}
printHtmlPart(46)
expressionOut.print(createLink(action: 'guess', id:'W', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Wguessed && ucphrase.contains('W'))) {
printHtmlPart(23)
}
else if(true && (myGame.Wguessed)) {
printHtmlPart(24)
}
printHtmlPart(47)
expressionOut.print(createLink(action: 'guess', id:'X', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Xguessed && ucphrase.contains('X'))) {
printHtmlPart(23)
}
else if(true && (myGame.Xguessed)) {
printHtmlPart(24)
}
printHtmlPart(48)
expressionOut.print(createLink(action: 'guess', id:'Y', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Yguessed && ucphrase.contains('Y'))) {
printHtmlPart(23)
}
else if(true && (myGame.Yguessed)) {
printHtmlPart(24)
}
printHtmlPart(49)
expressionOut.print(createLink(action: 'guess', id:'Z', params:'[hide: true]'))
printHtmlPart(22)
if(true && (myGame.Zguessed && ucphrase.contains('Z'))) {
printHtmlPart(23)
}
else if(true && (myGame.Zguessed)) {
printHtmlPart(24)
}
printHtmlPart(50)
})
invokeTag('captureBody','sitemesh',83,[:],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1448911650908L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
