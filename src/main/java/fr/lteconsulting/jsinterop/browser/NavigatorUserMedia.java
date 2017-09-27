package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NavigatorUserMedia
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:733969
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorUserMedia
{

    /*
        Properties
    */

    @JsProperty( name = "mediaDevices")
    MediaDevices getMediaDevices();

    @JsProperty( name = "mediaDevices")
    void setMediaDevices( MediaDevices value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getUserMedia,289,,P(d156),P(dF--S(?,289,,P(d79))------)),P(dF--S(?,289,,P(d157))------)))
      * TE Signature : S(getUserMedia,P(d156),P(dF--S(?,P(d79))------)),P(dF--S(?,P(d157))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@734047
     */
    void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
}
