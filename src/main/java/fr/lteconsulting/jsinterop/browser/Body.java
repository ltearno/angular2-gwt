package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Body
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:723015
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Body")
public class Body
{

    /*
        Properties
    */

    public Boolean bodyUsed;

    @JsProperty( name = "bodyUsed")
    public native Boolean getBodyUsed();

    @JsProperty( name = "bodyUsed")
    public native void setBodyUsed( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(arrayBuffer,88<26>,,)
      * TE Signature : S(arrayBuffer,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723070
     */
    public native Promise<ArrayBuffer> arrayBuffer();
    /** 
      * Std Signature : S(blob,88<235>,,)
      * TE Signature : S(blob,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723111
     */
    public native Promise<Blob> blob();
    /** 
      * Std Signature : S(json,88<3>,,)
      * TE Signature : S(json,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723138
     */
    public native Promise<Object> json();
    /** 
      * Std Signature : S(text,88<1>,,)
      * TE Signature : S(text,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723164
     */
    public native Promise<String> text();
}
