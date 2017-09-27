package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PositionError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551539
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551775
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PositionError")
public class PositionError
{

    /*
        Constructors
    */
    public PositionError(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="PositionError", name="PERMISSION_DENIED")
    public static Number PERMISSION_DENIED;

    @JsProperty(namespace="PositionError", name="POSITION_UNAVAILABLE")
    public static Number POSITION_UNAVAILABLE;

    @JsProperty(namespace="PositionError", name="TIMEOUT")
    public static Number TIMEOUT;

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );
}
