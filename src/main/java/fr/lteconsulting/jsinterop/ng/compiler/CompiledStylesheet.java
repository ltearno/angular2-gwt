package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler".CompiledStylesheet
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts:383
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompiledStylesheet")
public class CompiledStylesheet
{

    /*
        Constructors
    */
    public CompiledStylesheet(OutputContext outputCtx, String stylesVar, Array<StylesCompileDependency> dependencies, Boolean isShimmed, CompileStylesheetMetadata meta){
    }

    /*
        Properties
    */

    public Array<StylesCompileDependency> dependencies;

    @JsProperty( name = "dependencies")
    public native Array<StylesCompileDependency> getDependencies();

    @JsProperty( name = "dependencies")
    public native void setDependencies( Array<StylesCompileDependency> value );

    public Boolean isShimmed;

    @JsProperty( name = "isShimmed")
    public native Boolean getIsShimmed();

    @JsProperty( name = "isShimmed")
    public native void setIsShimmed( Boolean value );

    public CompileStylesheetMetadata meta;

    @JsProperty( name = "meta")
    public native CompileStylesheetMetadata getMeta();

    @JsProperty( name = "meta")
    public native void setMeta( CompileStylesheetMetadata value );

    public OutputContext outputCtx;

    @JsProperty( name = "outputCtx")
    public native OutputContext getOutputCtx();

    @JsProperty( name = "outputCtx")
    public native void setOutputCtx( OutputContext value );

    public String stylesVar;

    @JsProperty( name = "stylesVar")
    public native String getStylesVar();

    @JsProperty( name = "stylesVar")
    public native void setStylesVar( String value );
}
