package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegCurvetoQuadraticSmoothRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616289
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616402
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoQuadraticSmoothRel")
public class SVGPathSegCurvetoQuadraticSmoothRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoQuadraticSmoothRel(){
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
