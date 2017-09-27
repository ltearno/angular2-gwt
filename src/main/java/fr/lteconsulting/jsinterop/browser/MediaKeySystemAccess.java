package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeySystemAccess
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519315
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519492
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeySystemAccess")
public class MediaKeySystemAccess
{

    /*
        Constructors
    */
    public MediaKeySystemAccess(){
    }

    /*
        Properties
    */

    public String keySystem;

    @JsProperty( name = "keySystem")
    public native String getKeySystem();

    @JsProperty( name = "keySystem")
    public native void setKeySystem( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createMediaKeys,88<213>,,)
      * TE Signature : S(createMediaKeys,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519386
     */
    public native Promise<MediaKeys> createMediaKeys();
    /** 
      * Std Signature : S(getConfiguration,479,,)
      * TE Signature : S(getConfiguration,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519429
     */
    public native MediaKeySystemConfiguration getConfiguration();
}
