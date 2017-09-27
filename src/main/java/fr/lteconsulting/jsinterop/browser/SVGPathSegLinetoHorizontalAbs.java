package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoHorizontalAbs
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616733
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616825
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoHorizontalAbs")
public class SVGPathSegLinetoHorizontalAbs extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoHorizontalAbs(){
    }

    /*
        Properties
    */

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );
}
