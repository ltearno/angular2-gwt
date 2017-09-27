package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileTypeSummary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:3561

  * A CompileSummary is the data needed to use a directive / pipe / module
  * in other modules / components. However, this data is not enough to compile
  * the directive / module itself.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileTypeSummary")
public class CompileTypeSummary
{

    /*
        Properties
    */

    public CompileSummaryKind summaryKind;

    @JsProperty( name = "summaryKind")
    public native CompileSummaryKind getSummaryKind();

    @JsProperty( name = "summaryKind")
    public native void setSummaryKind( CompileSummaryKind value );

    public CompileTypeMetadata type;

    @JsProperty( name = "type")
    public native CompileTypeMetadata getType();

    @JsProperty( name = "type")
    public native void setType( CompileTypeMetadata value );
}
