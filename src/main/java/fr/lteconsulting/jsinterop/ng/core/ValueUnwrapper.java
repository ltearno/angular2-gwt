package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util".ValueUnwrapper
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts:716

  * Helper class for unwrapping WrappedValue s
 */
@JsType(isNative=true, namespace="ng.core", name="ValueUnwrapper")
public class ValueUnwrapper
{

    /*
        Properties
    */

    public Boolean hasWrappedValue;

    @JsProperty( name = "hasWrappedValue")
    public native Boolean getHasWrappedValue();

    @JsProperty( name = "hasWrappedValue")
    public native void setHasWrappedValue( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(reset,429,,)
      * TE Signature : S(reset,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts@872
     */
    public native void reset();
    /** 
      * Std Signature : S(unwrap,3,,P(d3))
      * TE Signature : S(unwrap,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts@843
     */
    public native Object unwrap(Object value);
}
