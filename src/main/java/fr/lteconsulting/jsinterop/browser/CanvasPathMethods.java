package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: CanvasPathMethods
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:723190
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CanvasPathMethods")
public class CanvasPathMethods
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(arc,289,,P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(arc,P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void arc(Number x, Number y, Number radius, Number startAngle, Number endAngle);
    /** 
      * Std Signature : S(arc,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d27))
      * TE Signature : S(arc,P(d2),P(d2),P(d2),P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723226
     */
    public native void arc(Number x, Number y, Number radius, Number startAngle, Number endAngle, Boolean anticlockwise /* optional */);
    /** 
      * Std Signature : S(arcTo,289,,P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(arcTo,P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723342
     */
    public native void arcTo(Number x1, Number y1, Number x2, Number y2, Number radius);
    /** 
      * Std Signature : S(bezierCurveTo,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(bezierCurveTo,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723423
     */
    public native void bezierCurveTo(Number cp1x, Number cp1y, Number cp2x, Number cp2y, Number x, Number y);
    /** 
      * Std Signature : S(closePath,289,,)
      * TE Signature : S(closePath,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723526
     */
    public native void closePath();
    /** 
      * Std Signature : S(ellipse,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(ellipse,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native void ellipse(Number x, Number y, Number radiusX, Number radiusY, Number rotation, Number startAngle, Number endAngle);
    /** 
      * Std Signature : S(ellipse,289,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27))
      * TE Signature : S(ellipse,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723549
     */
    public native void ellipse(Number x, Number y, Number radiusX, Number radiusY, Number rotation, Number startAngle, Number endAngle, Boolean anticlockwise /* optional */);
    /** 
      * Std Signature : S(lineTo,289,,P(d2),P(d2))
      * TE Signature : S(lineTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723705
     */
    public native void lineTo(Number x, Number y);
    /** 
      * Std Signature : S(moveTo,289,,P(d2),P(d2))
      * TE Signature : S(moveTo,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723745
     */
    public native void moveTo(Number x, Number y);
    /** 
      * Std Signature : S(quadraticCurveTo,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(quadraticCurveTo,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723785
     */
    public native void quadraticCurveTo(Number cpx, Number cpy, Number x, Number y);
    /** 
      * Std Signature : S(rect,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(rect,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@723861
     */
    public native void rect(Number x, Number y, Number w, Number h);
}
