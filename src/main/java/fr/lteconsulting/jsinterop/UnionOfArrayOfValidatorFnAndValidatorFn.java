package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.forms.ValidatorFn;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfValidatorFnAndValidatorFn  {
    @JsOverlay
    default Array<ValidatorFn> asArrayOfValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfValidatorFnAndValidatorFn ofArrayOfValidatorFn(Array<ValidatorFn> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ValidatorFn asValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfValidatorFnAndValidatorFn ofValidatorFn(ValidatorFn value) {
        return Js.cast( value );
    }
    
}
