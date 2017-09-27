package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfStringAndWebSocketSubjectConfig  {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndWebSocketSubjectConfig ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default WebSocketSubjectConfig asWebSocketSubjectConfig() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndWebSocketSubjectConfig ofWebSocketSubjectConfig(WebSocketSubjectConfig value) {
        return Js.cast( value );
    }
    
}
