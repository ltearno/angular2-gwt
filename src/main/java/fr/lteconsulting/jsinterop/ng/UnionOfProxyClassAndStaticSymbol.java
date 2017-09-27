package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.compiler.ProxyClass;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfProxyClassAndStaticSymbol  {
    @JsOverlay
    default ProxyClass asProxyClass() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfProxyClassAndStaticSymbol ofProxyClass(ProxyClass value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StaticSymbol asStaticSymbol() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfProxyClassAndStaticSymbol ofStaticSymbol(StaticSymbol value) {
        return Js.cast( value );
    }
    
}
