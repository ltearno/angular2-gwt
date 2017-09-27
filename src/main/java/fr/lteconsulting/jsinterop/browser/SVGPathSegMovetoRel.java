package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegMovetoRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:618449
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:618546
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegMovetoRel")
public class SVGPathSegMovetoRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegMovetoRel(){
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
