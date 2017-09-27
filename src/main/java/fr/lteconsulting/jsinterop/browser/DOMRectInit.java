package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DOMRectInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257105
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMRectInit")
public class DOMRectInit
{

    /*
        Properties
    */

    public Object height;

    @JsProperty( name = "height")
    public native Object getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Object value );

    public Object width;

    @JsProperty( name = "width")
    public native Object getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Object value );

    public Object x;

    @JsProperty( name = "x")
    public native Object getX();

    @JsProperty( name = "x")
    public native void setX( Object value );

    public Object y;

    @JsProperty( name = "y")
    public native Object getY();

    @JsProperty( name = "y")
    public native void setY( Object value );
}
