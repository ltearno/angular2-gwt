package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/FromEventObservable.d.ts:562
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface EventListenerOptions_UnionOfObjectAndBoolean  {
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOptions_UnionOfObjectAndBoolean ofObject(Object value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Boolean asBoolean() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOptions_UnionOfObjectAndBoolean ofBoolean(Boolean value) {
        return Js.cast( value );
    }
    
}
