package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Event
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:372249
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:373035
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class Event
{

    /*
        Constructors
    */
    public Event(String typeArg, EventInit eventInitDict){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="Event", name="AT_TARGET")
    public static Number AT_TARGET;

    @JsProperty(namespace="Event", name="BUBBLING_PHASE")
    public static Number BUBBLING_PHASE;

    @JsProperty(namespace="Event", name="CAPTURING_PHASE")
    public static Number CAPTURING_PHASE;

    /*
        Properties
    */

    public Boolean bubbles;

    @JsProperty( name = "bubbles")
    public native Boolean getBubbles();

    @JsProperty( name = "bubbles")
    public native void setBubbles( Boolean value );

    public Boolean cancelBubble;

    @JsProperty( name = "cancelBubble")
    public native Boolean getCancelBubble();

    @JsProperty( name = "cancelBubble")
    public native void setCancelBubble( Boolean value );

    public Boolean cancelable;

    @JsProperty( name = "cancelable")
    public native Boolean getCancelable();

    @JsProperty( name = "cancelable")
    public native void setCancelable( Boolean value );

    public EventTarget currentTarget;

    @JsProperty( name = "currentTarget")
    public native EventTarget getCurrentTarget();

    @JsProperty( name = "currentTarget")
    public native void setCurrentTarget( EventTarget value );

    public Boolean defaultPrevented;

    @JsProperty( name = "defaultPrevented")
    public native Boolean getDefaultPrevented();

    @JsProperty( name = "defaultPrevented")
    public native void setDefaultPrevented( Boolean value );

    public Number eventPhase;

    @JsProperty( name = "eventPhase")
    public native Number getEventPhase();

    @JsProperty( name = "eventPhase")
    public native void setEventPhase( Number value );

    public Boolean isTrusted;

    @JsProperty( name = "isTrusted")
    public native Boolean getIsTrusted();

    @JsProperty( name = "isTrusted")
    public native void setIsTrusted( Boolean value );

    public Boolean returnValue;

    @JsProperty( name = "returnValue")
    public native Boolean getReturnValue();

    @JsProperty( name = "returnValue")
    public native void setReturnValue( Boolean value );

    public Boolean scoped;

    @JsProperty( name = "scoped")
    public native Boolean getScoped();

    @JsProperty( name = "scoped")
    public native void setScoped( Boolean value );

    public Element srcElement;

    @JsProperty( name = "srcElement")
    public native Element getSrcElement();

    @JsProperty( name = "srcElement")
    public native void setSrcElement( Element value );

    public EventTarget target;

    @JsProperty( name = "target")
    public native EventTarget getTarget();

    @JsProperty( name = "target")
    public native void setTarget( EventTarget value );

    public Number timeStamp;

    @JsProperty( name = "timeStamp")
    public native Number getTimeStamp();

    @JsProperty( name = "timeStamp")
    public native void setTimeStamp( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(deepPath,7<47>,,)
      * TE Signature : S(deepPath,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@372887
     */
    public native Array<EventTarget> deepPath();
    /** 
      * Std Signature : S(initEvent,289,,P(d1),P(d27),P(d27))
      * TE Signature : S(initEvent,P(d1),P(d27),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@372702
     */
    public native void initEvent(String eventTypeArg, Boolean canBubbleArg, Boolean cancelableArg);
    /** 
      * Std Signature : S(preventDefault,289,,)
      * TE Signature : S(preventDefault,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@372792
     */
    public native void preventDefault();
    /** 
      * Std Signature : S(stopImmediatePropagation,289,,)
      * TE Signature : S(stopImmediatePropagation,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@372820
     */
    public native void stopImmediatePropagation();
    /** 
      * Std Signature : S(stopPropagation,289,,)
      * TE Signature : S(stopPropagation,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@372858
     */
    public native void stopPropagation();
}
