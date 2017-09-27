package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer".Serializer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts:239
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="Serializer")
public class Serializer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(createNameMapper,1234,,P(d603))
      * TE Signature : S(createNameMapper,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@586
     */
    public native PlaceholderMapper createNameMapper(Message message);
    /** 
      * Std Signature : S(digest,1,,P(d603))
      * TE Signature : S(digest,P(d603))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@534
     */
    public native String digest(Message message);
    /** 
      * Std Signature : S(load,3,,P(d1),P(d1))
      * TE Signature : S(load,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@364
     */
    public native Object load(String content, String url);
    /** 
      * Std Signature : S(write,1,,P(d7<603>),P(d1))
      * TE Signature : S(write,P(d7),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@287
     */
    public native String write(Array<Message> messages, String locale);
}
