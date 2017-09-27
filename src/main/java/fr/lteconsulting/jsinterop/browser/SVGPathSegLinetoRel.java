package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617163
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617260
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoRel")
public class SVGPathSegLinetoRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoRel(){
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
