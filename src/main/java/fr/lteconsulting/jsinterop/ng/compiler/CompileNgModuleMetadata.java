package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.SchemaMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileNgModuleMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:12528
  * 1 constructors
  * Metadata regarding compilation of a module.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileNgModuleMetadata")
public class CompileNgModuleMetadata
{

    /*
        Constructors
    */
    public CompileNgModuleMetadata(Object __0){
    }

    /*
        Properties
    */

    public Array<CompileIdentifierMetadata> bootstrapComponents;

    @JsProperty( name = "bootstrapComponents")
    public native Array<CompileIdentifierMetadata> getBootstrapComponents();

    @JsProperty( name = "bootstrapComponents")
    public native void setBootstrapComponents( Array<CompileIdentifierMetadata> value );

    public Array<CompileIdentifierMetadata> declaredDirectives;

    @JsProperty( name = "declaredDirectives")
    public native Array<CompileIdentifierMetadata> getDeclaredDirectives();

    @JsProperty( name = "declaredDirectives")
    public native void setDeclaredDirectives( Array<CompileIdentifierMetadata> value );

    public Array<CompileIdentifierMetadata> declaredPipes;

    @JsProperty( name = "declaredPipes")
    public native Array<CompileIdentifierMetadata> getDeclaredPipes();

    @JsProperty( name = "declaredPipes")
    public native void setDeclaredPipes( Array<CompileIdentifierMetadata> value );

    public Array<CompileEntryComponentMetadata> entryComponents;

    @JsProperty( name = "entryComponents")
    public native Array<CompileEntryComponentMetadata> getEntryComponents();

    @JsProperty( name = "entryComponents")
    public native void setEntryComponents( Array<CompileEntryComponentMetadata> value );

    public Array<CompileIdentifierMetadata> exportedDirectives;

    @JsProperty( name = "exportedDirectives")
    public native Array<CompileIdentifierMetadata> getExportedDirectives();

    @JsProperty( name = "exportedDirectives")
    public native void setExportedDirectives( Array<CompileIdentifierMetadata> value );

    public Array<CompileNgModuleSummary> exportedModules;

    @JsProperty( name = "exportedModules")
    public native Array<CompileNgModuleSummary> getExportedModules();

    @JsProperty( name = "exportedModules")
    public native void setExportedModules( Array<CompileNgModuleSummary> value );

    public Array<CompileIdentifierMetadata> exportedPipes;

    @JsProperty( name = "exportedPipes")
    public native Array<CompileIdentifierMetadata> getExportedPipes();

    @JsProperty( name = "exportedPipes")
    public native void setExportedPipes( Array<CompileIdentifierMetadata> value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Array<CompileNgModuleSummary> importedModules;

    @JsProperty( name = "importedModules")
    public native Array<CompileNgModuleSummary> getImportedModules();

    @JsProperty( name = "importedModules")
    public native void setImportedModules( Array<CompileNgModuleSummary> value );

    public Array<CompileProviderMetadata> providers;

    @JsProperty( name = "providers")
    public native Array<CompileProviderMetadata> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<CompileProviderMetadata> value );

    public Array<SchemaMetadata> schemas;

    @JsProperty( name = "schemas")
    public native Array<SchemaMetadata> getSchemas();

    @JsProperty( name = "schemas")
    public native void setSchemas( Array<SchemaMetadata> value );

    public TransitiveCompileNgModuleMetadata transitiveModule;

    @JsProperty( name = "transitiveModule")
    public native TransitiveCompileNgModuleMetadata getTransitiveModule();

    @JsProperty( name = "transitiveModule")
    public native void setTransitiveModule( TransitiveCompileNgModuleMetadata value );

    public CompileTypeMetadata type;

    @JsProperty( name = "type")
    public native CompileTypeMetadata getType();

    @JsProperty( name = "type")
    public native void setType( CompileTypeMetadata value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toSummary,1223,,)
      * TE Signature : S(toSummary,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@14081
     */
    public native CompileNgModuleSummary toSummary();
}
