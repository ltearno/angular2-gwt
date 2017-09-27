package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoHorizontalRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:616948
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617040
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoHorizontalRel")
public class SVGPathSegLinetoHorizontalRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoHorizontalRel(){
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
