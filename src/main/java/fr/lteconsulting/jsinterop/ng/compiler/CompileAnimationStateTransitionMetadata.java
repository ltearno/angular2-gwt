package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString;
import fr.lteconsulting.jsinterop.ng.compiler.aot.StaticSymbol;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationStateTransitionMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:988
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationStateTransitionMetadata")
public class CompileAnimationStateTransitionMetadata extends CompileAnimationStateMetadata
{

    /*
        Constructors
    */
    public CompileAnimationStateTransitionMetadata(UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString stateChangeExpr, CompileAnimationMetadata steps){
    }

    /*
        Properties
    */

    public UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString stateChangeExpr;

    @JsProperty( name = "stateChangeExpr")
    public native UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString getStateChangeExpr();

    @JsProperty( name = "stateChangeExpr")
    public native void setStateChangeExpr( UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString value );

    @JsOverlay
    public final void setStateChangeExpr( Function2<String, String, Boolean> value ) { setStateChangeExpr(UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString.ofFunction2OfStringAndStringAndBoolean( value )); }

    @JsOverlay
    public final void setStateChangeExpr( StaticSymbol value ) { setStateChangeExpr(UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString.ofStaticSymbol( value )); }

    @JsOverlay
    public final void setStateChangeExpr( String value ) { setStateChangeExpr(UnionOfFunction2OfStringAndStringAndBooleanAndStaticSymbolAndString.ofString( value )); }

    public CompileAnimationMetadata steps;

    @JsProperty( name = "steps")
    public native CompileAnimationMetadata getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( CompileAnimationMetadata value );
}
