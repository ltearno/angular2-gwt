package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType1288;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.HtmlParser;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.InterpolationConfig;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle".MessageBundle
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle.d.ts:465
  * 1 constructors
  * A container for message extracted from the templates.
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="MessageBundle")
public class MessageBundle
{

    /*
        Constructors
    */
    public MessageBundle(HtmlParser _htmlParser, Array<String> _implicitTags, AnonymousType1288 _implicitAttrs, String _locale){
    }

    /*
        Properties
    */

    public Object _htmlParser;

    @JsProperty( name = "_htmlParser")
    public native Object get_htmlParser();

    @JsProperty( name = "_htmlParser")
    public native void set_htmlParser( Object value );

    public Object _implicitAttrs;

    @JsProperty( name = "_implicitAttrs")
    public native Object get_implicitAttrs();

    @JsProperty( name = "_implicitAttrs")
    public native void set_implicitAttrs( Object value );

    public Object _implicitTags;

    @JsProperty( name = "_implicitTags")
    public native Object get_implicitTags();

    @JsProperty( name = "_implicitTags")
    public native void set_implicitTags( Object value );

    public Object _locale;

    @JsProperty( name = "_locale")
    public native Object get_locale();

    @JsProperty( name = "_locale")
    public native void set_locale( Object value );

    public Object _messages;

    @JsProperty( name = "_messages")
    public native Object get_messages();

    @JsProperty( name = "_messages")
    public native void set_messages( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getMessages,7<603>,,)
      * TE Signature : S(getMessages,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle.d.ts@951
     */
    public native Array<Message> getMessages();
    /** 
      * Std Signature : S(updateFromTemplate,7<848>,,P(d1),P(d1),P(d546))
      * TE Signature : S(updateFromTemplate,P(d1),P(d1),P(d546))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle.d.ts@844
     */
    public native Array<ParseError> updateFromTemplate(String html, String url, InterpolationConfig interpolationConfig);
    /** 
      * Std Signature : S(write,1,,P(d604))
      * TE Signature : S(write,P(d604))
      * 
     */
    public native String write(Serializer serializer);
    /** 
      * Std Signature : S(write,1,,P(d604),P(dFP1-,R--S(?,4,,P(d3))------)<1,5>))
      * TE Signature : S(write,P(d604),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle.d.ts@986
     */
    public native String write(Serializer serializer, Function1<String, String> filterSources /* optional */);
}
