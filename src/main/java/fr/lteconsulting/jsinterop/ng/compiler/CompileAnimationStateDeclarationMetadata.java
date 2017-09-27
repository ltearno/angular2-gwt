package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationStateDeclarationMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:735
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationStateDeclarationMetadata")
public class CompileAnimationStateDeclarationMetadata extends CompileAnimationStateMetadata
{

    /*
        Constructors
    */
    public CompileAnimationStateDeclarationMetadata(String stateNameExpr, CompileAnimationStyleMetadata styles){
    }

    /*
        Properties
    */

    public String stateNameExpr;

    @JsProperty( name = "stateNameExpr")
    public native String getStateNameExpr();

    @JsProperty( name = "stateNameExpr")
    public native void setStateNameExpr( String value );

    public CompileAnimationStyleMetadata styles;

    @JsProperty( name = "styles")
    public native CompileAnimationStyleMetadata getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( CompileAnimationStyleMetadata value );
}
