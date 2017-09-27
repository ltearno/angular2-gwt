package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileAnimationSequenceMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:2481
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileAnimationSequenceMetadata")
public class CompileAnimationSequenceMetadata extends CompileAnimationWithStepsMetadata
{

    /*
        Constructors
    */
    public CompileAnimationSequenceMetadata(Array<CompileAnimationMetadata> steps){
        super(null);
    }
}
