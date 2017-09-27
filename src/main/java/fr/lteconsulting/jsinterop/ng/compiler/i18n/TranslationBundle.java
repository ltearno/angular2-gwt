package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.AnonymousType1305;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.Node;
import fr.lteconsulting.jsinterop.ng.core.Console;
import fr.lteconsulting.jsinterop.ng.core.MissingTranslationStrategy;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle".TranslationBundle
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts:435
  * 1 constructors
  * A container for translated messages
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="TranslationBundle")
public class TranslationBundle
{

    /*
        Constructors
    */
    public TranslationBundle(AnonymousType1305 _i18nNodesByMsgId, String locale, Function1<Message, String> digest, Function1<Message, PlaceholderMapper> mapperFactory, MissingTranslationStrategy missingTranslationStrategy, Console console){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts:959
     */
    @JsMethod(namespace="ng.compiler.i18n.TranslationBundle", name = "load")
    public static native TranslationBundle load(String content, String url, Serializer serializer, MissingTranslationStrategy missingTranslationStrategy, Console console /* optional */);

    /*
        Properties
    */

    public Object _i18nNodesByMsgId;

    @JsProperty( name = "_i18nNodesByMsgId")
    public native Object get_i18nNodesByMsgId();

    @JsProperty( name = "_i18nNodesByMsgId")
    public native void set_i18nNodesByMsgId( Object value );

    public Object _i18nToHtml;

    @JsProperty( name = "_i18nToHtml")
    public native Object get_i18nToHtml();

    @JsProperty( name = "_i18nToHtml")
    public native void set_i18nToHtml( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(digest,1,,P(d603))
      * TE Signature : S(digest,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts@567
     */
    public native String digest(Message m);
    /** 
      * Std Signature : S(get,7<547>,,P(d603))
      * TE Signature : S(get,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts@1124
     */
    public native Array<Node> get(Message srcMsg);
    /** 
      * Std Signature : S(has,27,,P(d603))
      * TE Signature : S(has,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts@1168
     */
    public native Boolean has(Message srcMsg);
    /** 
      * Std Signature : S(mapperFactory,1234,,P(d603))
      * TE Signature : S(mapperFactory,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts@615
     */
    public native PlaceholderMapper mapperFactory(Message m);
}
