package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfSelfAndSkipSelf  {
    @JsOverlay
    default Self asSelf() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfSelfAndSkipSelf ofSelf(Self value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SkipSelf asSkipSelf() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfSelfAndSkipSelf ofSkipSelf(SkipSelf value) {
        return Js.cast( value );
    }
    
}
