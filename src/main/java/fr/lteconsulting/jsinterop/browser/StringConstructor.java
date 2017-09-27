package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StringConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:17981
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:214338
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StringConstructor")
public class StringConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public String prototype;

    @JsProperty( name = "prototype")
    public native String getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(fromCharCode,1,,)
      * TE Signature : S(fromCharCode,)
      * 
     */
    public native String fromCharCode();
    /** 
      * Std Signature : S(fromCharCode,1,,P(D2))
      * TE Signature : S(fromCharCode,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@18107
     */
    public native String fromCharCode(Number... codes);
    /** 
      * Std Signature : S(fromCodePoint,1,,)
      * TE Signature : S(fromCodePoint,)
      * 
     */
    public native String fromCodePoint();
    /** 
      * Std Signature : S(fromCodePoint,1,,P(D2))
      * TE Signature : S(fromCodePoint,P(D2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@214542
      * Return the String value whose elements are, in order, the elements in the List elements.
      * If length is 0, the empty string is returned.
     */
    public native String fromCodePoint(Number... codePoints);
    /** 
      * Std Signature : S(raw,1,,P(d11))
      * TE Signature : S(raw,P(d11))
      * 
     */
    public native String raw(TemplateStringsArray template);
    /** 
      * Std Signature : S(raw,1,,P(d11),P(D3))
      * TE Signature : S(raw,P(d11),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215001
      * String.raw is intended for use as a tag function of a Tagged Template String. When called
      * as such the first argument will be a well formed template call site object and the rest
      * parameter will contain the substitution values.
     */
    public native String raw(TemplateStringsArray template, Object... substitutions);
}
