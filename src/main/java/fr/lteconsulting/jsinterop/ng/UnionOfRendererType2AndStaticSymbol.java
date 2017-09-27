package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.jsinterop.ng.core.RendererType2;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfRendererType2AndStaticSymbol  {
    @JsOverlay
    default RendererType2 asRendererType2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRendererType2AndStaticSymbol ofRendererType2(RendererType2 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StaticSymbol asStaticSymbol() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfRendererType2AndStaticSymbol ofStaticSymbol(StaticSymbol value) {
        return Js.cast( value );
    }
    
}
