package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ReadableStreamReader
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567756
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567885
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadableStreamReader")
public class ReadableStreamReader
{

    /*
        Constructors
    */
    public ReadableStreamReader(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(cancel,88<369>,,)
      * TE Signature : S(cancel,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567795
     */
    public native Promise<Void> cancel();
    /** 
      * Std Signature : S(read,88<3>,,)
      * TE Signature : S(read,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567824
     */
    public native Promise<Object> read();
    /** 
      * Std Signature : S(releaseLock,289,,)
      * TE Signature : S(releaseLock,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567850
     */
    public native void releaseLock();
}
