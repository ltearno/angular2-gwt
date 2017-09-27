package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegCurvetoCubicSmoothRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:615241
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:615382
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoCubicSmoothRel")
public class SVGPathSegCurvetoCubicSmoothRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoCubicSmoothRel(){
    }

    /*
        Properties
    */

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

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

    public Number y2;

    @JsProperty( name = "y2")
    public native Number getY2();

    @JsProperty( name = "y2")
    public native void setY2( Number value );
}
