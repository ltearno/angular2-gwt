package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.ng.router.RouterInitializer;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfObjectAndRouterInitializer  {
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObjectAndRouterInitializer ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RouterInitializer asRouterInitializer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfObjectAndRouterInitializer ofRouterInitializer(RouterInitializer value) {
        return Js.cast( value );
    }
    
}
