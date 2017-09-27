package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtlsParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273735
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsParameters")
public class RTCDtlsParameters
{

    /*
        Properties
    */

    public Array<RTCDtlsFingerprint> fingerprints;

    @JsProperty( name = "fingerprints")
    public native Array<RTCDtlsFingerprint> getFingerprints();

    @JsProperty( name = "fingerprints")
    public native void setFingerprints( Array<RTCDtlsFingerprint> value );

    public String role;

    @JsProperty( name = "role")
    public native String getRole();

    @JsProperty( name = "role")
    public native void setRole( String value );
}
