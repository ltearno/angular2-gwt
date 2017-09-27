package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfCompileIdentifierMetadataAndCompileTypeMetadata  {
    @JsOverlay
    default CompileIdentifierMetadata asCompileIdentifierMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCompileIdentifierMetadataAndCompileTypeMetadata ofCompileIdentifierMetadata(CompileIdentifierMetadata value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CompileTypeMetadata asCompileTypeMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCompileIdentifierMetadataAndCompileTypeMetadata ofCompileTypeMetadata(CompileTypeMetadata value) {
        return Js.cast( value );
    }
    
}
