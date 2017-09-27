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
public interface UnionOfCanvasRenderingContext2DAndWebGLRenderingContext  {
    @JsOverlay
    default CanvasRenderingContext2D asCanvasRenderingContext2D() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCanvasRenderingContext2DAndWebGLRenderingContext ofCanvasRenderingContext2D(CanvasRenderingContext2D value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default WebGLRenderingContext asWebGLRenderingContext() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCanvasRenderingContext2DAndWebGLRenderingContext ofWebGLRenderingContext(WebGLRenderingContext value) {
        return Js.cast( value );
    }
    
}
