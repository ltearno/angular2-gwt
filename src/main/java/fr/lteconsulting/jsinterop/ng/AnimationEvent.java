package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_event".AnimationEvent
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_event.d.ts:0

  * An instance of this class is returned as an event parameter when an animation
  * callback is captured for an animation either during the start or done phase.
  * 
  * ```typescript
 */
@JsType(isNative=true, namespace="ng", name="AnimationEvent")
public class AnimationEvent
{

    /*
        Properties
    */

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public String fromState;

    @JsProperty( name = "fromState")
    public native String getFromState();

    @JsProperty( name = "fromState")
    public native void setFromState( String value );

    public String phaseName;

    @JsProperty( name = "phaseName")
    public native String getPhaseName();

    @JsProperty( name = "phaseName")
    public native void setPhaseName( String value );

    public String toState;

    @JsProperty( name = "toState")
    public native String getToState();

    @JsProperty( name = "toState")
    public native void setToState( String value );

    public Number totalTime;

    @JsProperty( name = "totalTime")
    public native Number getTotalTime();

    @JsProperty( name = "totalTime")
    public native void setTotalTime( Number value );

    public String triggerName;

    @JsProperty( name = "triggerName")
    public native String getTriggerName();

    @JsProperty( name = "triggerName")
    public native void setTriggerName( String value );
}
