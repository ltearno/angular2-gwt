package fr.lteconsulting.jsinterop.ng.forms;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAsyncValidatorAndAsyncValidatorFn  {
    @JsOverlay
    default AsyncValidator asAsyncValidator() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAsyncValidatorAndAsyncValidatorFn ofAsyncValidator(AsyncValidator value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AsyncValidatorFn asAsyncValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAsyncValidatorAndAsyncValidatorFn ofAsyncValidatorFn(AsyncValidatorFn value) {
        return Js.cast( value );
    }
    
}
