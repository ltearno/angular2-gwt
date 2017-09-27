package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCDtlsFingerprint
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273657
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsFingerprint")
public class RTCDtlsFingerprint
{

    /*
        Properties
    */

    public String algorithm;

    @JsProperty( name = "algorithm")
    public native String getAlgorithm();

    @JsProperty( name = "algorithm")
    public native void setAlgorithm( String value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}
