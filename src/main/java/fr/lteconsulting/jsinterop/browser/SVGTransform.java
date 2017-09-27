package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGTransform
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:634179
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:634871
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTransform")
public class SVGTransform
{

    /*
        Constructors
    */
    public SVGTransform(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_MATRIX")
    public static Number SVG_TRANSFORM_MATRIX;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_ROTATE")
    public static Number SVG_TRANSFORM_ROTATE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SCALE")
    public static Number SVG_TRANSFORM_SCALE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SKEWX")
    public static Number SVG_TRANSFORM_SKEWX;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_SKEWY")
    public static Number SVG_TRANSFORM_SKEWY;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_TRANSLATE")
    public static Number SVG_TRANSFORM_TRANSLATE;

    @JsProperty(namespace="SVGTransform", name="SVG_TRANSFORM_UNKNOWN")
    public static Number SVG_TRANSFORM_UNKNOWN;

    /*
        Properties
    */

    public Number angle;

    @JsProperty( name = "angle")
    public native Number getAngle();

    @JsProperty( name = "angle")
    public native void setAngle( Number value );

    public SVGMatrix matrix;

    @JsProperty( name = "matrix")
    public native SVGMatrix getMatrix__();

    @JsProperty( name = "matrix")
    public native void setMatrix__( SVGMatrix value );

    public Number type;

    @JsProperty( name = "type")
    public native Number getType();

    @JsProperty( name = "type")
    public native void setType( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(setMatrix,289,,P(d94))
      * TE Signature : S(setMatrix,P(d94))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634297
     */
    public native void setMatrix(SVGMatrix matrix);
    /** 
      * Std Signature : S(setRotate,289,,P(d2),P(d2),P(d2))
      * TE Signature : S(setRotate,P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634337
     */
    public native void setRotate(Number angle, Number cx, Number cy);
    /** 
      * Std Signature : S(setScale,289,,P(d2),P(d2))
      * TE Signature : S(setScale,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634397
     */
    public native void setScale(Number sx, Number sy);
    /** 
      * Std Signature : S(setSkewX,289,,P(d2))
      * TE Signature : S(setSkewX,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634441
     */
    public native void setSkewX(Number angle);
    /** 
      * Std Signature : S(setSkewY,289,,P(d2))
      * TE Signature : S(setSkewY,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634476
     */
    public native void setSkewY(Number angle);
    /** 
      * Std Signature : S(setTranslate,289,,P(d2),P(d2))
      * TE Signature : S(setTranslate,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@634511
     */
    public native void setTranslate(Number tx, Number ty);
}
