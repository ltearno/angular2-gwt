package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileFactoryMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:4394
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileFactoryMetadata")
public class CompileFactoryMetadata extends CompileIdentifierMetadata
{

    /*
        Properties
    */

    public Array<CompileDiDependencyMetadata> diDeps;

    @JsProperty( name = "diDeps")
    public native Array<CompileDiDependencyMetadata> getDiDeps();

    @JsProperty( name = "diDeps")
    public native void setDiDeps( Array<CompileDiDependencyMetadata> value );
}
