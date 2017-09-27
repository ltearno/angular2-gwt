package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitDirectoryReader
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701117
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701267
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitDirectoryReader")
public class WebKitDirectoryReader
{

    /*
        Constructors
    */
    public WebKitDirectoryReader(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(readEntries,289,,P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(readEntries,P(dF--S(?,P(d77))------)))
      * 
     */
    public native void readEntries(WebKitEntriesCallback successCallback);
    /** 
      * Std Signature : S(readEntries,289,,P(dF--S(?,289,,P(d77))------)),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(readEntries,P(dF--S(?,P(d77))------)),P(dF--S(?,P(d77))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@701157
     */
    public native void readEntries(WebKitEntriesCallback successCallback, WebKitErrorCallback errorCallback /* optional */);
}
