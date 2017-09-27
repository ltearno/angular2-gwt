package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtpHeaderExtensionParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278398
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpHeaderExtensionParameters")
public class RTCRtpHeaderExtensionParameters
{

    /*
        Properties
    */

    public Boolean encrypt;

    @JsProperty( name = "encrypt")
    public native Boolean getEncrypt();

    @JsProperty( name = "encrypt")
    public native void setEncrypt( Boolean value );

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public String uri;

    @JsProperty( name = "uri")
    public native String getUri();

    @JsProperty( name = "uri")
    public native void setUri( String value );
}
