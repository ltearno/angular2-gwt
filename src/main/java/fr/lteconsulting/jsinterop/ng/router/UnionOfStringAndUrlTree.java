package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfStringAndUrlTree  {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndUrlTree ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default UrlTree asUrlTree() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndUrlTree ofUrlTree(UrlTree value) {
        return Js.cast( value );
    }
    
}
