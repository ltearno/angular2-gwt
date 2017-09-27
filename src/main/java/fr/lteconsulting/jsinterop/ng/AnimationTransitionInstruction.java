package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType772;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_instruction".AnimationTransitionInstruction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_instruction.d.ts:418
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationTransitionInstruction")
public class AnimationTransitionInstruction extends AnimationEngineInstruction
{

    /*
        Properties
    */

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Array<Object> errors;

    @JsProperty( name = "errors")
    public native Array<Object> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<Object> value );

    public String fromState;

    @JsProperty( name = "fromState")
    public native String getFromState();

    @JsProperty( name = "fromState")
    public native void setFromState( String value );

    public ThetaStyleData fromStyles;

    @JsProperty( name = "fromStyles")
    public native ThetaStyleData getFromStyles();

    @JsProperty( name = "fromStyles")
    public native void setFromStyles( ThetaStyleData value );

    public Boolean isRemovalTransition;

    @JsProperty( name = "isRemovalTransition")
    public native Boolean getIsRemovalTransition();

    @JsProperty( name = "isRemovalTransition")
    public native void setIsRemovalTransition( Boolean value );

    public Map<Object, AnonymousType772> postStyleProps;

    @JsProperty( name = "postStyleProps")
    public native Map<Object, AnonymousType772> getPostStyleProps();

    @JsProperty( name = "postStyleProps")
    public native void setPostStyleProps( Map<Object, AnonymousType772> value );

    public Map<Object, AnonymousType772> preStyleProps;

    @JsProperty( name = "preStyleProps")
    public native Map<Object, AnonymousType772> getPreStyleProps();

    @JsProperty( name = "preStyleProps")
    public native void setPreStyleProps( Map<Object, AnonymousType772> value );

    public Array<Object> queriedElements;

    @JsProperty( name = "queriedElements")
    public native Array<Object> getQueriedElements();

    @JsProperty( name = "queriedElements")
    public native void setQueriedElements( Array<Object> value );

    public Array<AnimationTimelineInstruction> timelines;

    @JsProperty( name = "timelines")
    public native Array<AnimationTimelineInstruction> getTimelines();

    @JsProperty( name = "timelines")
    public native void setTimelines( Array<AnimationTimelineInstruction> value );

    public String toState;

    @JsProperty( name = "toState")
    public native String getToState();

    @JsProperty( name = "toState")
    public native void setToState( String value );

    public ThetaStyleData toStyles;

    @JsProperty( name = "toStyles")
    public native ThetaStyleData getToStyles();

    @JsProperty( name = "toStyles")
    public native void setToStyles( ThetaStyleData value );

    public String triggerName;

    @JsProperty( name = "triggerName")
    public native String getTriggerName();

    @JsProperty( name = "triggerName")
    public native void setTriggerName( String value );
}
