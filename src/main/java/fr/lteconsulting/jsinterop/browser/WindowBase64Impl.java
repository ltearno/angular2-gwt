package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WindowBase64
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:735402
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WindowBase64")
public class WindowBase64Impl implements WindowBase64
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(atob,1,,P(d1))
      * TE Signature : S(atob,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735433
     */
    public native String atob(String encodedString);
    /** 
      * Std Signature : S(btoa,1,,P(d1))
      * TE Signature : S(btoa,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@735474
     */
    public native String btoa(String rawString);
}
