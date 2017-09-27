package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationWithStepsMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:2274
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationWithStepsMetadata")
public class CompileAnimationWithStepsMetadata extends CompileAnimationMetadata
{

    /*
        Constructors
    */
    public CompileAnimationWithStepsMetadata(Array<CompileAnimationMetadata> steps){
    }

    /*
        Properties
    */

    public Array<CompileAnimationMetadata> steps;

    @JsProperty( name = "steps")
    public native Array<CompileAnimationMetadata> getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( Array<CompileAnimationMetadata> value );
}
