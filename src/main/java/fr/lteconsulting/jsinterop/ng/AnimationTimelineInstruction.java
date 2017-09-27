package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_instruction".AnimationTimelineInstruction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_instruction.d.ts:337
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationTimelineInstruction")
public class AnimationTimelineInstruction extends AnimationEngineInstruction
{

    /*
        Properties
    */

    public Number delay;

    @JsProperty( name = "delay")
    public native Number getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( Number value );

    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    public String easing;

    @JsProperty( name = "easing")
    public native String getEasing();

    @JsProperty( name = "easing")
    public native void setEasing( String value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Array<ThetaStyleData> keyframes;

    @JsProperty( name = "keyframes")
    public native Array<ThetaStyleData> getKeyframes();

    @JsProperty( name = "keyframes")
    public native void setKeyframes( Array<ThetaStyleData> value );

    public Array<String> postStyleProps;

    @JsProperty( name = "postStyleProps")
    public native Array<String> getPostStyleProps();

    @JsProperty( name = "postStyleProps")
    public native void setPostStyleProps( Array<String> value );

    public Array<String> preStyleProps;

    @JsProperty( name = "preStyleProps")
    public native Array<String> getPreStyleProps();

    @JsProperty( name = "preStyleProps")
    public native void setPreStyleProps( Array<String> value );

    public Boolean stretchStartingKeyframe;

    @JsProperty( name = "stretchStartingKeyframe")
    public native Boolean getStretchStartingKeyframe();

    @JsProperty( name = "stretchStartingKeyframe")
    public native void setStretchStartingKeyframe( Boolean value );

    public Boolean subTimeline;

    @JsProperty( name = "subTimeline")
    public native Boolean getSubTimeline();

    @JsProperty( name = "subTimeline")
    public native void setSubTimeline( Boolean value );

    public Number totalTime;

    @JsProperty( name = "totalTime")
    public native Number getTotalTime();

    @JsProperty( name = "totalTime")
    public native void setTotalTime( Number value );
}
