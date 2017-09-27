package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.forms.AsyncValidatorFn;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn  {
    @JsOverlay
    default Array<AsyncValidatorFn> asArrayOfAsyncValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn ofArrayOfAsyncValidatorFn(Array<AsyncValidatorFn> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AsyncValidatorFn asAsyncValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfAsyncValidatorFnAndAsyncValidatorFn ofAsyncValidatorFn(AsyncValidatorFn value) {
        return Js.cast( value );
    }
    
}
