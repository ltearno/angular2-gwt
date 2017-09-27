package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfHashLocationStrategyAndPathLocationStrategy extends LocationStrategy  {
    @JsOverlay
    public final HashLocationStrategy asHashLocationStrategy() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHashLocationStrategyAndPathLocationStrategy ofHashLocationStrategy(HashLocationStrategy value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final PathLocationStrategy asPathLocationStrategy() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHashLocationStrategyAndPathLocationStrategy ofPathLocationStrategy(PathLocationStrategy value) {
        return Js.uncheckedCast( value );
    }
    
}
