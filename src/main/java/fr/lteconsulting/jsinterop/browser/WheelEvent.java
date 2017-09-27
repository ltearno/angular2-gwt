package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WheelEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:703500
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:704293
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WheelEvent")
public class WheelEvent extends MouseEvent
{

    /*
        Constructors
    */
    public WheelEvent(String typeArg, WheelEventInit eventInitDict){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_LINE")
    public static Number DOM_DELTA_LINE;

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_PAGE")
    public static Number DOM_DELTA_PAGE;

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_PIXEL")
    public static Number DOM_DELTA_PIXEL;

    /*
        Properties
    */

    public Number deltaMode;

    @JsProperty( name = "deltaMode")
    public native Number getDeltaMode();

    @JsProperty( name = "deltaMode")
    public native void setDeltaMode( Number value );

    public Number deltaX;

    @JsProperty( name = "deltaX")
    public native Number getDeltaX();

    @JsProperty( name = "deltaX")
    public native void setDeltaX( Number value );

    public Number deltaY;

    @JsProperty( name = "deltaY")
    public native Number getDeltaY();

    @JsProperty( name = "deltaY")
    public native void setDeltaY( Number value );

    public Number deltaZ;

    @JsProperty( name = "deltaZ")
    public native Number getDeltaZ();

    @JsProperty( name = "deltaZ")
    public native void setDeltaZ( Number value );

    public Number wheelDelta;

    @JsProperty( name = "wheelDelta")
    public native Number getWheelDelta();

    @JsProperty( name = "wheelDelta")
    public native void setWheelDelta( Number value );

    public Number wheelDeltaX;

    @JsProperty( name = "wheelDeltaX")
    public native Number getWheelDeltaX();

    @JsProperty( name = "wheelDeltaX")
    public native void setWheelDeltaX( Number value );

    public Number wheelDeltaY;

    @JsProperty( name = "wheelDeltaY")
    public native Number getWheelDeltaY();

    @JsProperty( name = "wheelDeltaY")
    public native void setWheelDeltaY( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getCurrentPoint,289,,P(d49))
      * TE Signature : S(getCurrentPoint,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@703768
     */
    public native void getCurrentPoint(Element element);
    /** 
      * Std Signature : S(initWheelEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d47),P(d1),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(initWheelEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d47),P(d1),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@703813
     */
    public native void initWheelEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Number buttonArg, EventTarget relatedTargetArg, String modifiersListArg, Number deltaXArg, Number deltaYArg, Number deltaZArg, Number deltaMode);
}
