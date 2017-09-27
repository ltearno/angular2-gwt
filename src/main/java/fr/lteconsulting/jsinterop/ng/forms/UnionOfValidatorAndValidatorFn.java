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
public interface UnionOfValidatorAndValidatorFn  {
    @JsOverlay
    default Validator asValidator() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfValidatorAndValidatorFn ofValidator(Validator value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ValidatorFn asValidatorFn() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfValidatorAndValidatorFn ofValidatorFn(ValidatorFn value) {
        return Js.cast( value );
    }
    
}
