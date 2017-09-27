package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpHeaderExtension
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278266
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpHeaderExtension")
public class RTCRtpHeaderExtension
{

    /*
        Properties
    */

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public Boolean preferredEncrypt;

    @JsProperty( name = "preferredEncrypt")
    public native Boolean getPreferredEncrypt();

    @JsProperty( name = "preferredEncrypt")
    public native void setPreferredEncrypt( Boolean value );

    public Number preferredId;

    @JsProperty( name = "preferredId")
    public native Number getPreferredId();

    @JsProperty( name = "preferredId")
    public native void setPreferredId( Number value );

    public String uri;

    @JsProperty( name = "uri")
    public native String getUri();

    @JsProperty( name = "uri")
    public native void setUri( String value );
}
