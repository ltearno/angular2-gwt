package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util".WrappedValue
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts:62
  * 1 constructors
  * Indicates that the result of a {@link Pipe} transformation has changed even though the
  * reference
  * has not changed.
  * 
  * The wrapped value will be unwrapped by change detection, and the unwrapped value will be stored.
  * 
  * Example:
  * 
  * ```
  * if (this._latestValue === this._latestReturnedValue) {
  *     return this._latestReturnedValue;
  *   } else {
  *     this._latestReturnedValue = this._latestValue;
  *     return WrappedValue.wrap(this._latestValue); // this will force update
  *   }
  * ```
 */
@JsType(isNative=true, namespace="ng.core", name="WrappedValue")
public class WrappedValue
{

    /*
        Constructors
    */
    public WrappedValue(Object wrapped){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/change_detection_util.d.ts:676
     */
    @JsMethod(namespace="ng.core.WrappedValue", name = "wrap")
    public static native WrappedValue wrap(Object value);

    /*
        Properties
    */

    public Object wrapped;

    @JsProperty( name = "wrapped")
    public native Object getWrapped();

    @JsProperty( name = "wrapped")
    public native void setWrapped( Object value );
}
