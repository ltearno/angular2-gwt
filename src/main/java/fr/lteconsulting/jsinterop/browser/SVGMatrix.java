package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGMatrix
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:607407
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:607993
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGMatrix")
public class SVGMatrix
{

    /*
        Constructors
    */
    public SVGMatrix(){
    }

    /*
        Properties
    */

    public Number a;

    @JsProperty( name = "a")
    public native Number getA();

    @JsProperty( name = "a")
    public native void setA( Number value );

    public Number b;

    @JsProperty( name = "b")
    public native Number getB();

    @JsProperty( name = "b")
    public native void setB( Number value );

    public Number c;

    @JsProperty( name = "c")
    public native Number getC();

    @JsProperty( name = "c")
    public native void setC( Number value );

    public Number d;

    @JsProperty( name = "d")
    public native Number getD();

    @JsProperty( name = "d")
    public native void setD( Number value );

    public Number e;

    @JsProperty( name = "e")
    public native Number getE();

    @JsProperty( name = "e")
    public native void setE( Number value );

    public Number f;

    @JsProperty( name = "f")
    public native Number getF();

    @JsProperty( name = "f")
    public native void setF( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(flipX,94,,)
      * TE Signature : S(flipX,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607525
     */
    public native SVGMatrix flipX();
    /** 
      * Std Signature : S(flipY,94,,)
      * TE Signature : S(flipY,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607549
     */
    public native SVGMatrix flipY();
    /** 
      * Std Signature : S(inverse,94,,)
      * TE Signature : S(inverse,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607573
     */
    public native SVGMatrix inverse();
    /** 
      * Std Signature : S(multiply,94,,P(d94))
      * TE Signature : S(multiply,P(d94))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607599
     */
    public native SVGMatrix multiply(SVGMatrix secondMatrix);
    /** 
      * Std Signature : S(rotate,94,,P(d2))
      * TE Signature : S(rotate,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607649
     */
    public native SVGMatrix rotate(Number angle);
    /** 
      * Std Signature : S(rotateFromVector,94,,P(d2),P(d2))
      * TE Signature : S(rotateFromVector,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607687
     */
    public native SVGMatrix rotateFromVector(Number x, Number y);
    /** 
      * Std Signature : S(scale,94,,P(d2))
      * TE Signature : S(scale,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607742
     */
    public native SVGMatrix scale(Number scaleFactor);
    /** 
      * Std Signature : S(scaleNonUniform,94,,P(d2),P(d2))
      * TE Signature : S(scaleNonUniform,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607785
     */
    public native SVGMatrix scaleNonUniform(Number scaleFactorX, Number scaleFactorY);
    /** 
      * Std Signature : S(skewX,94,,P(d2))
      * TE Signature : S(skewX,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607861
     */
    public native SVGMatrix skewX(Number angle);
    /** 
      * Std Signature : S(skewY,94,,P(d2))
      * TE Signature : S(skewY,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607898
     */
    public native SVGMatrix skewY(Number angle);
    /** 
      * Std Signature : S(translate,94,,P(d2),P(d2))
      * TE Signature : S(translate,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@607935
     */
    public native SVGMatrix translate(Number x, Number y);
}
