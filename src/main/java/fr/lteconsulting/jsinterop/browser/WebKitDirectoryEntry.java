package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitDirectoryEntry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:700909
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701021
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitDirectoryEntry")
public class WebKitDirectoryEntry extends WebKitEntry
{

    /*
        Constructors
    */
    public WebKitDirectoryEntry(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(createReader,569,,)
      * TE Signature : S(createReader,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700968
     */
    public native WebKitDirectoryReader createReader();
}
