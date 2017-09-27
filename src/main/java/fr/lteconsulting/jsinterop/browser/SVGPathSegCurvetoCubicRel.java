package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegCurvetoCubicRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:614693
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:614860
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoCubicRel")
public class SVGPathSegCurvetoCubicRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoCubicRel(){
    }

    /*
        Properties
    */

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

    public Number x1;

    @JsProperty( name = "x1")
    public native Number getX1();

    @JsProperty( name = "x1")
    public native void setX1( Number value );

    public Number x2;

    @JsProperty( name = "x2")
    public native Number getX2();

    @JsProperty( name = "x2")
    public native void setX2( Number value );

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );

    public Number y1;

    @JsProperty( name = "y1")
    public native Number getY1();

    @JsProperty( name = "y1")
    public native void setY1( Number value );

    public Number y2;

    @JsProperty( name = "y2")
    public native Number getY2();

    @JsProperty( name = "y2")
    public native void setY2( Number value );
}
