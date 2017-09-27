package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Set;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".TransitiveCompileNgModuleMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:14119
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="TransitiveCompileNgModuleMetadata")
public class TransitiveCompileNgModuleMetadata
{

    /*
        Properties
    */

    public Array<CompileIdentifierMetadata> directives;

    @JsProperty( name = "directives")
    public native Array<CompileIdentifierMetadata> getDirectives();

    @JsProperty( name = "directives")
    public native void setDirectives( Array<CompileIdentifierMetadata> value );

    public Set<Object> directivesSet;

    @JsProperty( name = "directivesSet")
    public native Set<Object> getDirectivesSet();

    @JsProperty( name = "directivesSet")
    public native void setDirectivesSet( Set<Object> value );

    public Array<CompileEntryComponentMetadata> entryComponents;

    @JsProperty( name = "entryComponents")
    public native Array<CompileEntryComponentMetadata> getEntryComponents();

    @JsProperty( name = "entryComponents")
    public native void setEntryComponents( Array<CompileEntryComponentMetadata> value );

    public Set<Object> entryComponentsSet;

    @JsProperty( name = "entryComponentsSet")
    public native Set<Object> getEntryComponentsSet();

    @JsProperty( name = "entryComponentsSet")
    public native void setEntryComponentsSet( Set<Object> value );

    public Array<CompileIdentifierMetadata> exportedDirectives;

    @JsProperty( name = "exportedDirectives")
    public native Array<CompileIdentifierMetadata> getExportedDirectives();

    @JsProperty( name = "exportedDirectives")
    public native void setExportedDirectives( Array<CompileIdentifierMetadata> value );

    public Set<Object> exportedDirectivesSet;

    @JsProperty( name = "exportedDirectivesSet")
    public native Set<Object> getExportedDirectivesSet();

    @JsProperty( name = "exportedDirectivesSet")
    public native void setExportedDirectivesSet( Set<Object> value );

    public Array<CompileIdentifierMetadata> exportedPipes;

    @JsProperty( name = "exportedPipes")
    public native Array<CompileIdentifierMetadata> getExportedPipes();

    @JsProperty( name = "exportedPipes")
    public native void setExportedPipes( Array<CompileIdentifierMetadata> value );

    public Set<Object> exportedPipesSet;

    @JsProperty( name = "exportedPipesSet")
    public native Set<Object> getExportedPipesSet();

    @JsProperty( name = "exportedPipesSet")
    public native void setExportedPipesSet( Set<Object> value );

    public Array<CompileTypeMetadata> modules;

    @JsProperty( name = "modules")
    public native Array<CompileTypeMetadata> getModules();

    @JsProperty( name = "modules")
    public native void setModules( Array<CompileTypeMetadata> value );

    public Set<Object> modulesSet;

    @JsProperty( name = "modulesSet")
    public native Set<Object> getModulesSet();

    @JsProperty( name = "modulesSet")
    public native void setModulesSet( Set<Object> value );

    public Array<CompileIdentifierMetadata> pipes;

    @JsProperty( name = "pipes")
    public native Array<CompileIdentifierMetadata> getPipes();

    @JsProperty( name = "pipes")
    public native void setPipes( Array<CompileIdentifierMetadata> value );

    public Set<Object> pipesSet;

    @JsProperty( name = "pipesSet")
    public native Set<Object> getPipesSet();

    @JsProperty( name = "pipesSet")
    public native void setPipesSet( Set<Object> value );

    public Array<Object> providers;

    @JsProperty( name = "providers")
    public native Array<Object> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addDirective,429,,P(d443))
      * TE Signature : S(addDirective,P(d443))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@14844
     */
    public native void addDirective(CompileIdentifierMetadata id);
    /** 
      * Std Signature : S(addEntryComponent,429,,P(d500))
      * TE Signature : S(addEntryComponent,P(d500))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@15116
     */
    public native void addEntryComponent(CompileEntryComponentMetadata ec);
    /** 
      * Std Signature : S(addExportedDirective,429,,P(d443))
      * TE Signature : S(addExportedDirective,P(d443))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@14899
     */
    public native void addExportedDirective(CompileIdentifierMetadata id);
    /** 
      * Std Signature : S(addExportedPipe,429,,P(d443))
      * TE Signature : S(addExportedPipe,P(d443))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@15012
     */
    public native void addExportedPipe(CompileIdentifierMetadata id);
    /** 
      * Std Signature : S(addModule,429,,P(d499))
      * TE Signature : S(addModule,P(d499))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@15070
     */
    public native void addModule(CompileTypeMetadata id);
    /** 
      * Std Signature : S(addPipe,429,,P(d443))
      * TE Signature : S(addPipe,P(d443))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@14962
     */
    public native void addPipe(CompileIdentifierMetadata id);
    /** 
      * Std Signature : S(addProvider,429,,P(d498),P(d443))
      * TE Signature : S(addProvider,P(d498),P(d443))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@14751
     */
    public native void addProvider(CompileProviderMetadata provider, CompileIdentifierMetadata module);
}
