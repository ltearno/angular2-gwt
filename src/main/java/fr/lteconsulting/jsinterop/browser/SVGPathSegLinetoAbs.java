package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoAbs
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616543
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616640
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoAbs")
public class SVGPathSegLinetoAbs extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoAbs(){
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
