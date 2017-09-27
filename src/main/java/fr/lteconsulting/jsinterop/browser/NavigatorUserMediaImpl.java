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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NavigatorUserMedia")
public class NavigatorUserMediaImpl implements NavigatorUserMedia
{

    /*
        Properties
    */

    public MediaDevices mediaDevices;

    @JsProperty( name = "mediaDevices")
    public native MediaDevices getMediaDevices();

    @JsProperty( name = "mediaDevices")
    public native void setMediaDevices( MediaDevices value );

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
    public native void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
}
