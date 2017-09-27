package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationKeyframesSequenceMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:1417
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationKeyframesSequenceMetadata")
public class CompileAnimationKeyframesSequenceMetadata extends CompileAnimationMetadata
{

    /*
        Constructors
    */
    public CompileAnimationKeyframesSequenceMetadata(Array<CompileAnimationStyleMetadata> steps){
    }

    /*
        Properties
    */

    public Array<CompileAnimationStyleMetadata> steps;

    @JsProperty( name = "steps")
    public native Array<CompileAnimationStyleMetadata> getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( Array<CompileAnimationStyleMetadata> value );
}
