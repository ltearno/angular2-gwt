package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtcpFeedback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276698
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtcpFeedback")
public class RTCRtcpFeedback
{

    /*
        Properties
    */

    public String parameter;

    @JsProperty( name = "parameter")
    public native String getParameter();

    @JsProperty( name = "parameter")
    public native void setParameter( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
