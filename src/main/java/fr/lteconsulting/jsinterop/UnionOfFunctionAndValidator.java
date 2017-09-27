package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.jsinterop.ng.forms.Validator;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunctionAndValidator  {
    @JsOverlay
    default Function asFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndValidator ofFunction(Function value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Validator asValidator() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFunctionAndValidator ofValidator(Validator value) {
        return Js.cast( value );
    }
    
}
