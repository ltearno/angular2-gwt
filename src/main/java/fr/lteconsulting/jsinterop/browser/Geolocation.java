package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: Geolocation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377249
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:377587
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Geolocation")
public class Geolocation
{

    /*
        Constructors
    */
    public Geolocation(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearWatch,289,,P(d2))
      * TE Signature : S(clearWatch,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@377279
     */
    public native void clearWatch(Number watchId);
    /** 
      * Std Signature : S(getCurrentPosition,289,,P(dF--S(?,289,,P(d149))------)))
      * TE Signature : S(getCurrentPosition,P(dF--S(?,P(d149))------)))
      * 
     */
    public native void getCurrentPosition(PositionCallback successCallback);
    /** 
      * Std Signature : S(getCurrentPosition,289,,P(dF--S(?,289,,P(d149))------)),P(dF--S(?,289,,P(d150))------)))
      * TE Signature : S(getCurrentPosition,P(dF--S(?,P(d149))------)),P(dF--S(?,P(d150))------)))
      * 
     */
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */);
    /** 
      * Std Signature : S(getCurrentPosition,289,,P(dF--S(?,289,,P(d149))------)),P(dF--S(?,289,,P(d150))------)),P(d151))
      * TE Signature : S(getCurrentPosition,P(dF--S(?,P(d149))------)),P(dF--S(?,P(d150))------)),P(d151))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@377318
     */
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */, PositionOptions options /* optional */);
    /** 
      * Std Signature : S(watchPosition,2,,P(dF--S(?,289,,P(d149))------)))
      * TE Signature : S(watchPosition,P(dF--S(?,P(d149))------)))
      * 
     */
    public native Number watchPosition(PositionCallback successCallback);
    /** 
      * Std Signature : S(watchPosition,2,,P(dF--S(?,289,,P(d149))------)),P(dF--S(?,289,,P(d150))------)))
      * TE Signature : S(watchPosition,P(dF--S(?,P(d149))------)),P(dF--S(?,P(d150))------)))
      * 
     */
    public native Number watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */);
    /** 
      * Std Signature : S(watchPosition,2,,P(dF--S(?,289,,P(d149))------)),P(dF--S(?,289,,P(d150))------)),P(d151))
      * TE Signature : S(watchPosition,P(dF--S(?,P(d149))------)),P(dF--S(?,P(d150))------)),P(d151))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@377449
     */
    public native Number watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback /* optional */, PositionOptions options /* optional */);
}
