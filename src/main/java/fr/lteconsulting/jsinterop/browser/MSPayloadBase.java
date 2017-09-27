package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSPayloadBase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:264913
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSPayloadBase")
public class MSPayloadBase extends RTCStats
{

    /*
        Properties
    */

    public String payloadDescription;

    @JsProperty( name = "payloadDescription")
    public native String getPayloadDescription();

    @JsProperty( name = "payloadDescription")
    public native void setPayloadDescription( String value );
}
