package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGRect
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:623309
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:623414
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGRect")
public class SVGRect
{

    /*
        Constructors
    */
    public SVGRect(){
    }

    /*
        Properties
    */

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );

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
