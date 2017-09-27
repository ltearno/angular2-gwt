package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegCurvetoQuadraticRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:615773
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:615912
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoQuadraticRel")
public class SVGPathSegCurvetoQuadraticRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoQuadraticRel(){
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
}
