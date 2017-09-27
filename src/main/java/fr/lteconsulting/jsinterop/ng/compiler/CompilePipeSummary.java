package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompilePipeSummary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:11712
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompilePipeSummary")
public class CompilePipeSummary extends CompileTypeSummary
{

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Boolean pure;

    @JsProperty( name = "pure")
    public native Boolean getPure();

    @JsProperty( name = "pure")
    public native void setPure( Boolean value );
}
