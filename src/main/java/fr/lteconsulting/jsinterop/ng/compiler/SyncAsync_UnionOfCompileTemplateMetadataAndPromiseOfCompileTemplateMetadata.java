package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Promise;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts:1197
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts:1269
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata  {
    @JsOverlay
    default CompileTemplateMetadata asCompileTemplateMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata ofCompileTemplateMetadata(CompileTemplateMetadata value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Promise<CompileTemplateMetadata> asPromiseOfCompileTemplateMetadata() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  SyncAsync_UnionOfCompileTemplateMetadataAndPromiseOfCompileTemplateMetadata ofPromiseOfCompileTemplateMetadata(Promise<CompileTemplateMetadata> value) {
        return Js.cast( value );
    }
    
}
