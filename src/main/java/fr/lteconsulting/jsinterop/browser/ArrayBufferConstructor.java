package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ArrayBufferConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:63569
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ArrayBufferConstructor")
public class ArrayBufferConstructor
{

    /*
        Properties
    */

    public ArrayBuffer prototype;

    @JsProperty( name = "prototype")
    public native ArrayBuffer getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( ArrayBuffer value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isView,27,,P(d3))
      * TE Signature : S(isView,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@63690
     */
    public native Boolean isView(Object arg);
}
