package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileNgModuleSummary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:12123
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileNgModuleSummary")
public class CompileNgModuleSummary extends CompileTypeSummary
{

    /*
        Properties
    */

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

    public Array<CompileIdentifierMetadata> exportedPipes;

    @JsProperty( name = "exportedPipes")
    public native Array<CompileIdentifierMetadata> getExportedPipes();

    @JsProperty( name = "exportedPipes")
    public native void setExportedPipes( Array<CompileIdentifierMetadata> value );

    public Array<CompileTypeMetadata> modules;

    @JsProperty( name = "modules")
    public native Array<CompileTypeMetadata> getModules();

    @JsProperty( name = "modules")
    public native void setModules( Array<CompileTypeMetadata> value );

    public Array<Object> providers;

    @JsProperty( name = "providers")
    public native Array<Object> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<Object> value );
}
