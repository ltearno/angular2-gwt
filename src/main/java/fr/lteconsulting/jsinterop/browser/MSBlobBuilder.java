package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: MSBlobBuilder
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:502767
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:502897
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSBlobBuilder")
public class MSBlobBuilder
{

    /*
        Constructors
    */
    public MSBlobBuilder(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,289,,P(d3))
      * TE Signature : S(append,P(d3))
      * 
     */
    public native void append(Object data);
    /** 
      * Std Signature : S(append,289,,P(d3),P(d1))
      * TE Signature : S(append,P(d3),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@502799
     */
    public native void append(Object data, String endings /* optional */);
    /** 
      * Std Signature : S(getBlob,235,,)
      * TE Signature : S(getBlob,)
      * 
     */
    public native Blob getBlob();
    /** 
      * Std Signature : S(getBlob,235,,P(d1))
      * TE Signature : S(getBlob,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@502846
     */
    public native Blob getBlob(String contentType /* optional */);
}
