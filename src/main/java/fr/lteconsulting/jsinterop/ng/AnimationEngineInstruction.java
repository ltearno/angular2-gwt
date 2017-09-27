package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_instruction".AnimationEngineInstruction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/render/animation_engine_instruction.d.ts:323
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationEngineInstruction")
public class AnimationEngineInstruction
{

    /*
        Properties
    */

    public AnimationTransitionInstructionType type;

    @JsProperty( name = "type")
    public native AnimationTransitionInstructionType getType();

    @JsProperty( name = "type")
    public native void setType( AnimationTransitionInstructionType value );
}
