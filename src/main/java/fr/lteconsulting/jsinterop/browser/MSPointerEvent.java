package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSPointerEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:512040
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513142
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSPointerEvent")
public class MSPointerEvent extends MouseEvent
{

    /*
        Constructors
    */
    public MSPointerEvent(String typeArg, PointerEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Object currentPoint;

    @JsProperty( name = "currentPoint")
    public native Object getCurrentPoint();

    @JsProperty( name = "currentPoint")
    public native void setCurrentPoint( Object value );

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number hwTimestamp;

    @JsProperty( name = "hwTimestamp")
    public native Number getHwTimestamp();

    @JsProperty( name = "hwTimestamp")
    public native void setHwTimestamp( Number value );

    public Object intermediatePoints;

    @JsProperty( name = "intermediatePoints")
    public native Object getIntermediatePoints();

    @JsProperty( name = "intermediatePoints")
    public native void setIntermediatePoints( Object value );

    public Boolean isPrimary;

    @JsProperty( name = "isPrimary")
    public native Boolean getIsPrimary();

    @JsProperty( name = "isPrimary")
    public native void setIsPrimary( Boolean value );

    public Number pointerId;

    @JsProperty( name = "pointerId")
    public native Number getPointerId();

    @JsProperty( name = "pointerId")
    public native void setPointerId( Number value );

    public Object pointerType;

    @JsProperty( name = "pointerType")
    public native Object getPointerType();

    @JsProperty( name = "pointerType")
    public native void setPointerType( Object value );

    public Number pressure;

    @JsProperty( name = "pressure")
    public native Number getPressure();

    @JsProperty( name = "pressure")
    public native void setPressure( Number value );

    public Number rotation;

    @JsProperty( name = "rotation")
    public native Number getRotation();

    @JsProperty( name = "rotation")
    public native void setRotation( Number value );

    public Number tiltX;

    @JsProperty( name = "tiltX")
    public native Number getTiltX();

    @JsProperty( name = "tiltX")
    public native void setTiltX( Number value );

    public Number tiltY;

    @JsProperty( name = "tiltY")
    public native Number getTiltY();

    @JsProperty( name = "tiltY")
    public native void setTiltY( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getCurrentPoint,289,,P(d49))
      * TE Signature : S(getCurrentPoint,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@512467
     */
    public native void getCurrentPoint(Element element);
    /** 
      * Std Signature : S(getIntermediatePoints,289,,P(d49))
      * TE Signature : S(getIntermediatePoints,P(d49))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@512512
     */
    public native void getIntermediatePoints(Element element);
    /** 
      * Std Signature : S(initPointerEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d3),P(d2),P(d27))
      * TE Signature : S(initPointerEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d3),P(d2),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@512563
     */
    public native void initPointerEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, Number buttonArg, EventTarget relatedTargetArg, Number offsetXArg, Number offsetYArg, Number widthArg, Number heightArg, Number pressure, Number rotation, Number tiltX, Number tiltY, Number pointerIdArg, Object pointerType, Number hwTimestampArg, Boolean isPrimary);
}
