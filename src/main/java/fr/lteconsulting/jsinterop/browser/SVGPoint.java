package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGPoint
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:619440
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:619557
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPoint")
public class SVGPoint
{

    /*
        Constructors
    */
    public SVGPoint(){
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

    /*
        Methods
    */
    /** 
      * Std Signature : S(matrixTransform,120,,P(d94))
      * TE Signature : S(matrixTransform,P(d94))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@619497
     */
    public native SVGPoint matrixTransform(SVGMatrix matrix);
}
