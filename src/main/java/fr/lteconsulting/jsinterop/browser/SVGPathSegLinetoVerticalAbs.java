package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoVerticalAbs
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617353
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617443
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoVerticalAbs")
public class SVGPathSegLinetoVerticalAbs extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoVerticalAbs(){
    }

    /*
        Properties
    */

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );
}
