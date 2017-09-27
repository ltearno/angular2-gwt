package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine".QueueInstruction
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:660
  * 
 */
@JsType(isNative=true, namespace="ng", name="QueueInstruction")
public class QueueInstruction
{

    /*
        Properties
    */

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public StateValue fromState;

    @JsProperty( name = "fromState")
    public native StateValue getFromState();

    @JsProperty( name = "fromState")
    public native void setFromState( StateValue value );

    public Boolean isFallbackTransition;

    @JsProperty( name = "isFallbackTransition")
    public native Boolean getIsFallbackTransition();

    @JsProperty( name = "isFallbackTransition")
    public native void setIsFallbackTransition( Boolean value );

    public TransitionAnimationPlayer player;

    @JsProperty( name = "player")
    public native TransitionAnimationPlayer getPlayer();

    @JsProperty( name = "player")
    public native void setPlayer( TransitionAnimationPlayer value );

    public StateValue toState;

    @JsProperty( name = "toState")
    public native StateValue getToState();

    @JsProperty( name = "toState")
    public native void setToState( StateValue value );

    public AnimationTransitionFactory transition;

    @JsProperty( name = "transition")
    public native AnimationTransitionFactory getTransition();

    @JsProperty( name = "transition")
    public native void setTransition( AnimationTransitionFactory value );

    public String triggerName;

    @JsProperty( name = "triggerName")
    public native String getTriggerName();

    @JsProperty( name = "triggerName")
    public native void setTriggerName( String value );
}
