package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitCSSMatrix
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:699855
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:700815
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitCSSMatrix")
public class WebKitCSSMatrix
{

    /*
        Constructors
    */
    public WebKitCSSMatrix(String text){
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

    public Number m11;

    @JsProperty( name = "m11")
    public native Number getM11();

    @JsProperty( name = "m11")
    public native void setM11( Number value );

    public Number m12;

    @JsProperty( name = "m12")
    public native Number getM12();

    @JsProperty( name = "m12")
    public native void setM12( Number value );

    public Number m13;

    @JsProperty( name = "m13")
    public native Number getM13();

    @JsProperty( name = "m13")
    public native void setM13( Number value );

    public Number m14;

    @JsProperty( name = "m14")
    public native Number getM14();

    @JsProperty( name = "m14")
    public native void setM14( Number value );

    public Number m21;

    @JsProperty( name = "m21")
    public native Number getM21();

    @JsProperty( name = "m21")
    public native void setM21( Number value );

    public Number m22;

    @JsProperty( name = "m22")
    public native Number getM22();

    @JsProperty( name = "m22")
    public native void setM22( Number value );

    public Number m23;

    @JsProperty( name = "m23")
    public native Number getM23();

    @JsProperty( name = "m23")
    public native void setM23( Number value );

    public Number m24;

    @JsProperty( name = "m24")
    public native Number getM24();

    @JsProperty( name = "m24")
    public native void setM24( Number value );

    public Number m31;

    @JsProperty( name = "m31")
    public native Number getM31();

    @JsProperty( name = "m31")
    public native void setM31( Number value );

    public Number m32;

    @JsProperty( name = "m32")
    public native Number getM32();

    @JsProperty( name = "m32")
    public native void setM32( Number value );

    public Number m33;

    @JsProperty( name = "m33")
    public native Number getM33();

    @JsProperty( name = "m33")
    public native void setM33( Number value );

    public Number m34;

    @JsProperty( name = "m34")
    public native Number getM34();

    @JsProperty( name = "m34")
    public native void setM34( Number value );

    public Number m41;

    @JsProperty( name = "m41")
    public native Number getM41();

    @JsProperty( name = "m41")
    public native void setM41( Number value );

    public Number m42;

    @JsProperty( name = "m42")
    public native Number getM42();

    @JsProperty( name = "m42")
    public native void setM42( Number value );

    public Number m43;

    @JsProperty( name = "m43")
    public native Number getM43();

    @JsProperty( name = "m43")
    public native void setM43( Number value );

    public Number m44;

    @JsProperty( name = "m44")
    public native Number getM44();

    @JsProperty( name = "m44")
    public native void setM44( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(inverse,279,,)
      * TE Signature : S(inverse,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700251
     */
    public native WebKitCSSMatrix inverse();
    /** 
      * Std Signature : S(multiply,279,,P(d279))
      * TE Signature : S(multiply,P(d279))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700283
     */
    public native WebKitCSSMatrix multiply(WebKitCSSMatrix secondMatrix);
    /** 
      * Std Signature : S(rotate,279,,P(d2))
      * TE Signature : S(rotate,P(d2))
      * 
     */
    public native WebKitCSSMatrix rotate(Number angleX);
    /** 
      * Std Signature : S(rotate,279,,P(d2),P(d2))
      * TE Signature : S(rotate,P(d2),P(d2))
      * 
     */
    public native WebKitCSSMatrix rotate(Number angleX, Number angleY /* optional */);
    /** 
      * Std Signature : S(rotate,279,,P(d2),P(d2),P(d2))
      * TE Signature : S(rotate,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700345
     */
    public native WebKitCSSMatrix rotate(Number angleX, Number angleY /* optional */, Number angleZ /* optional */);
    /** 
      * Std Signature : S(rotateAxisAngle,279,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(rotateAxisAngle,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700424
     */
    public native WebKitCSSMatrix rotateAxisAngle(Number x, Number y, Number z, Number angle);
    /** 
      * Std Signature : S(scale,279,,P(d2))
      * TE Signature : S(scale,P(d2))
      * 
     */
    public native WebKitCSSMatrix scale(Number scaleX);
    /** 
      * Std Signature : S(scale,279,,P(d2),P(d2))
      * TE Signature : S(scale,P(d2),P(d2))
      * 
     */
    public native WebKitCSSMatrix scale(Number scaleX, Number scaleY /* optional */);
    /** 
      * Std Signature : S(scale,279,,P(d2),P(d2),P(d2))
      * TE Signature : S(scale,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700510
     */
    public native WebKitCSSMatrix scale(Number scaleX, Number scaleY /* optional */, Number scaleZ /* optional */);
    /** 
      * Std Signature : S(setMatrixValue,289,,P(d1))
      * TE Signature : S(setMatrixValue,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700588
     */
    public native void setMatrixValue(String value);
    /** 
      * Std Signature : S(skewX,279,,P(d2))
      * TE Signature : S(skewX,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700629
     */
    public native WebKitCSSMatrix skewX(Number angle);
    /** 
      * Std Signature : S(skewY,279,,P(d2))
      * TE Signature : S(skewY,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700672
     */
    public native WebKitCSSMatrix skewY(Number angle);
    /** 
      * Std Signature : S(translate,279,,P(d2),P(d2))
      * TE Signature : S(translate,P(d2),P(d2))
      * 
     */
    public native WebKitCSSMatrix translate(Number x, Number y);
    /** 
      * Std Signature : S(translate,279,,P(d2),P(d2),P(d2))
      * TE Signature : S(translate,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@700739
     */
    public native WebKitCSSMatrix translate(Number x, Number y, Number z /* optional */);
}
