package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitFileEntry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701641
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701795
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitFileEntry")
public class WebKitFileEntry extends WebKitEntry
{

    /*
        Constructors
    */
    public WebKitFileEntry(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(file,289,,P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(file,P(dF--S(?,P(d77))------)))
      * 
     */
    public native void file(WebKitFileCallback successCallback);
    /** 
      * Std Signature : S(file,289,,P(dF--S(?,289,,P(d77))------)),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(file,P(dF--S(?,P(d77))------)),P(dF--S(?,P(d77))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@701695
     */
    public native void file(WebKitFileCallback successCallback, WebKitErrorCallback errorCallback /* optional */);
}
