package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".QueuedTransition
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:2568
  * 
 */
@JsType(isNative=true, namespace="ng", name="QueuedTransition")
public class QueuedTransition
{

    /*
        Properties
    */

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public AnimationTransitionInstruction instruction;

    @JsProperty( name = "instruction")
    public native AnimationTransitionInstruction getInstruction();

    @JsProperty( name = "instruction")
    public native void setInstruction( AnimationTransitionInstruction value );

    public TransitionAnimationPlayer player;

    @JsProperty( name = "player")
    public native TransitionAnimationPlayer getPlayer();

    @JsProperty( name = "player")
    public native void setPlayer( TransitionAnimationPlayer value );
}
