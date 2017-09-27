package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.ng.compiler.CompileNgModuleMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler".NgAnalyzedModules
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler.d.ts:3001
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="NgAnalyzedModules")
public class NgAnalyzedModules
{

    /*
        Properties
    */

    public Array<Object> files;

    @JsProperty( name = "files")
    public native Array<Object> getFiles();

    @JsProperty( name = "files")
    public native void setFiles( Array<Object> value );

    public Map<StaticSymbol, CompileNgModuleMetadata> ngModuleByPipeOrDirective;

    @JsProperty( name = "ngModuleByPipeOrDirective")
    public native Map<StaticSymbol, CompileNgModuleMetadata> getNgModuleByPipeOrDirective();

    @JsProperty( name = "ngModuleByPipeOrDirective")
    public native void setNgModuleByPipeOrDirective( Map<StaticSymbol, CompileNgModuleMetadata> value );

    public Array<CompileNgModuleMetadata> ngModules;

    @JsProperty( name = "ngModules")
    public native Array<CompileNgModuleMetadata> getNgModules();

    @JsProperty( name = "ngModules")
    public native void setNgModules( Array<CompileNgModuleMetadata> value );

    public Array<StaticSymbol> symbolsMissingModule;

    @JsProperty( name = "symbolsMissingModule")
    public native Array<StaticSymbol> getSymbolsMissingModule();

    @JsProperty( name = "symbolsMissingModule")
    public native void setSymbolsMissingModule( Array<StaticSymbol> value );
}
