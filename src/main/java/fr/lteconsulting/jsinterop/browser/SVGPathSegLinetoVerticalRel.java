package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPathSegLinetoVerticalRel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617560
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:617650
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoVerticalRel")
public class SVGPathSegLinetoVerticalRel extends SVGPathSeg
{

    /*
        Constructors
    */
    public SVGPathSegLinetoVerticalRel(){
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
