package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/view_compiler/view_compiler".ViewCompileResult
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/view_compiler/view_compiler.d.ts:406
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ViewCompileResult")
public class ViewCompileResult
{

    /*
        Constructors
    */
    public ViewCompileResult(String viewClassVar, String rendererTypeVar){
    }

    /*
        Properties
    */

    public String rendererTypeVar;

    @JsProperty( name = "rendererTypeVar")
    public native String getRendererTypeVar();

    @JsProperty( name = "rendererTypeVar")
    public native void setRendererTypeVar( String value );

    public String viewClassVar;

    @JsProperty( name = "viewClassVar")
    public native String getViewClassVar();

    @JsProperty( name = "viewClassVar")
    public native void setViewClassVar( String value );
}
