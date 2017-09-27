package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitPoint
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:702073
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:702143
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitPoint")
public class WebKitPoint
{

    /*
        Constructors
    */
    public WebKitPoint(Number x, Number y){
    }

    /*
        Properties
    */

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );
}
