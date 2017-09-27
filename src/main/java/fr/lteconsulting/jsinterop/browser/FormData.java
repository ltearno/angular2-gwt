package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: FormData
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376231
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:376328
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FormData")
public class FormData
{

    /*
        Constructors
    */
    public FormData(HTMLFormElement form){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,289,,P(d3),P(d3))
      * TE Signature : S(append,P(d3),P(d3))
      * 
     */
    public native void append(Object name, Object value);
    /** 
      * Std Signature : S(append,289,,P(d3),P(d3),P(d1))
      * TE Signature : S(append,P(d3),P(d3),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@376258
     */
    public native void append(Object name, Object value, String blobName /* optional */);
}
