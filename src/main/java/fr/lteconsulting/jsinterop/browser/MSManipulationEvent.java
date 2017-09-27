package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSManipulationEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:508805
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:509620
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSManipulationEvent")
public class MSManipulationEvent extends UIEvent
{

    /*
        Constructors
    */
    public MSManipulationEvent(){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_ACTIVE")
    public static Number MS_MANIPULATION_STATE_ACTIVE;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_CANCELLED")
    public static Number MS_MANIPULATION_STATE_CANCELLED;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_COMMITTED")
    public static Number MS_MANIPULATION_STATE_COMMITTED;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_DRAGGING")
    public static Number MS_MANIPULATION_STATE_DRAGGING;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_INERTIA")
    public static Number MS_MANIPULATION_STATE_INERTIA;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_PRESELECT")
    public static Number MS_MANIPULATION_STATE_PRESELECT;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_SELECTING")
    public static Number MS_MANIPULATION_STATE_SELECTING;

    @JsProperty(namespace="MSManipulationEvent", name="MS_MANIPULATION_STATE_STOPPED")
    public static Number MS_MANIPULATION_STATE_STOPPED;

    /*
        Properties
    */

    public Number currentState;

    @JsProperty( name = "currentState")
    public native Number getCurrentState();

    @JsProperty( name = "currentState")
    public native void setCurrentState( Number value );

    public Number inertiaDestinationX;

    @JsProperty( name = "inertiaDestinationX")
    public native Number getInertiaDestinationX();

    @JsProperty( name = "inertiaDestinationX")
    public native void setInertiaDestinationX( Number value );

    public Number inertiaDestinationY;

    @JsProperty( name = "inertiaDestinationY")
    public native Number getInertiaDestinationY();

    @JsProperty( name = "inertiaDestinationY")
    public native void setInertiaDestinationY( Number value );

    public Number lastState;

    @JsProperty( name = "lastState")
    public native Number getLastState();

    @JsProperty( name = "lastState")
    public native void setLastState( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initMSManipulationEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2))
      * TE Signature : S(initMSManipulationEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@509010
     */
    public native void initMSManipulationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number lastState, Number currentState);
}
