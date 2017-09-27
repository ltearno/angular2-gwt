package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ANGLE_instanced_arrays
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:282226
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:282616
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ANGLE_instanced_arrays")
public class ANGLE_instanced_arrays
{

    /*
        Constructors
    */
    public ANGLE_instanced_arrays(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="ANGLE_instanced_arrays", name="VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE")
    public static Number VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE;

    /*
        Properties
    */

    /*
        Methods
    */
    /** 
      * Std Signature : S(drawArraysInstancedANGLE,289,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawArraysInstancedANGLE,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@282267
     */
    public native void drawArraysInstancedANGLE(Number mode, Number first, Number count, Number primcount);
    /** 
      * Std Signature : S(drawElementsInstancedANGLE,289,,P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(drawElementsInstancedANGLE,P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@282366
     */
    public native void drawElementsInstancedANGLE(Number mode, Number count, Number type, Number offset, Number primcount);
    /** 
      * Std Signature : S(vertexAttribDivisorANGLE,289,,P(d2),P(d2))
      * TE Signature : S(vertexAttribDivisorANGLE,P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@282482
     */
    public native void vertexAttribDivisorANGLE(Number index, Number divisor);
}
