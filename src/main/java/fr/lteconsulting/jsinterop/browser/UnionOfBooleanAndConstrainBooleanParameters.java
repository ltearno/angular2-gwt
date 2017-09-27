package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfBooleanAndConstrainBooleanParameters  {
    @JsOverlay
    default Boolean asBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndConstrainBooleanParameters ofBoolean(Boolean value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ConstrainBooleanParameters asConstrainBooleanParameters() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBooleanAndConstrainBooleanParameters ofConstrainBooleanParameters(ConstrainBooleanParameters value) {
        return Js.cast( value );
    }
    
}
