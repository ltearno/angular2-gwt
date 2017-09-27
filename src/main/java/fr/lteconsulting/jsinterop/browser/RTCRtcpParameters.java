package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCRtcpParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:276772
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtcpParameters")
public class RTCRtcpParameters
{

    /*
        Properties
    */

    public String cname;

    @JsProperty( name = "cname")
    public native String getCname();

    @JsProperty( name = "cname")
    public native void setCname( String value );

    public Boolean mux;

    @JsProperty( name = "mux")
    public native Boolean getMux();

    @JsProperty( name = "mux")
    public native void setMux( Boolean value );

    public Boolean reducedSize;

    @JsProperty( name = "reducedSize")
    public native Boolean getReducedSize();

    @JsProperty( name = "reducedSize")
    public native void setReducedSize( Boolean value );

    public Number ssrc;

    @JsProperty( name = "ssrc")
    public native Number getSsrc();

    @JsProperty( name = "ssrc")
    public native void setSsrc( Number value );
}
