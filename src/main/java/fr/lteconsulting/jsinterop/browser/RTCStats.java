package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCStats
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:279346
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCStats")
public class RTCStats
{

    /*
        Properties
    */

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String msType;

    @JsProperty( name = "msType")
    public native String getMsType();

    @JsProperty( name = "msType")
    public native void setMsType( String value );

    public Number timestamp;

    @JsProperty( name = "timestamp")
    public native Number getTimestamp();

    @JsProperty( name = "timestamp")
    public native void setTimestamp( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
