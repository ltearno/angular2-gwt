package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ReadableStream
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567537
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567678
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadableStream")
public class ReadableStream
{

    /*
        Constructors
    */
    public ReadableStream(){
    }

    /*
        Properties
    */

    public Boolean locked;

    @JsProperty( name = "locked")
    public native Boolean getLocked();

    @JsProperty( name = "locked")
    public native void setLocked( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(cancel,88<369>,,)
      * TE Signature : S(cancel,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567600
     */
    public native Promise<Void> cancel();
    /** 
      * Std Signature : S(getReader,470,,)
      * TE Signature : S(getReader,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567629
     */
    public native ReadableStreamReader getReader();
}
