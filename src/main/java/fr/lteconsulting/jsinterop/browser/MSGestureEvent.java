package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSGestureEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:504290
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:505599
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGestureEvent")
public class MSGestureEvent extends UIEvent
{

    /*
        Constructors
    */
    public MSGestureEvent(){
        super(null, null);
    }

    /*
        Static properties
    */

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_BEGIN")
    public static Number MSGESTURE_FLAG_BEGIN;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_CANCEL")
    public static Number MSGESTURE_FLAG_CANCEL;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_END")
    public static Number MSGESTURE_FLAG_END;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_INERTIA")
    public static Number MSGESTURE_FLAG_INERTIA;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_NONE")
    public static Number MSGESTURE_FLAG_NONE;

    /*
        Properties
    */

    public Number clientX;

    @JsProperty( name = "clientX")
    public native Number getClientX();

    @JsProperty( name = "clientX")
    public native void setClientX( Number value );

    public Number clientY;

    @JsProperty( name = "clientY")
    public native Number getClientY();

    @JsProperty( name = "clientY")
    public native void setClientY( Number value );

    public Number expansion;

    @JsProperty( name = "expansion")
    public native Number getExpansion();

    @JsProperty( name = "expansion")
    public native void setExpansion( Number value );

    public Object gestureObject;

    @JsProperty( name = "gestureObject")
    public native Object getGestureObject();

    @JsProperty( name = "gestureObject")
    public native void setGestureObject( Object value );

    public Number hwTimestamp;

    @JsProperty( name = "hwTimestamp")
    public native Number getHwTimestamp();

    @JsProperty( name = "hwTimestamp")
    public native void setHwTimestamp( Number value );

    public Number offsetX;

    @JsProperty( name = "offsetX")
    public native Number getOffsetX();

    @JsProperty( name = "offsetX")
    public native void setOffsetX( Number value );

    public Number offsetY;

    @JsProperty( name = "offsetY")
    public native Number getOffsetY();

    @JsProperty( name = "offsetY")
    public native void setOffsetY( Number value );

    public Number rotation;

    @JsProperty( name = "rotation")
    public native Number getRotation();

    @JsProperty( name = "rotation")
    public native void setRotation( Number value );

    public Number scale;

    @JsProperty( name = "scale")
    public native Number getScale();

    @JsProperty( name = "scale")
    public native void setScale( Number value );

    public Number screenX;

    @JsProperty( name = "screenX")
    public native Number getScreenX();

    @JsProperty( name = "screenX")
    public native void setScreenX( Number value );

    public Number screenY;

    @JsProperty( name = "screenY")
    public native Number getScreenY();

    @JsProperty( name = "screenY")
    public native void setScreenY( Number value );

    public Number translationX;

    @JsProperty( name = "translationX")
    public native Number getTranslationX();

    @JsProperty( name = "translationX")
    public native void setTranslationX( Number value );

    public Number translationY;

    @JsProperty( name = "translationY")
    public native Number getTranslationY();

    @JsProperty( name = "translationY")
    public native void setTranslationY( Number value );

    public Number velocityAngular;

    @JsProperty( name = "velocityAngular")
    public native Number getVelocityAngular();

    @JsProperty( name = "velocityAngular")
    public native void setVelocityAngular( Number value );

    public Number velocityExpansion;

    @JsProperty( name = "velocityExpansion")
    public native Number getVelocityExpansion();

    @JsProperty( name = "velocityExpansion")
    public native void setVelocityExpansion( Number value );

    public Number velocityX;

    @JsProperty( name = "velocityX")
    public native Number getVelocityX();

    @JsProperty( name = "velocityX")
    public native void setVelocityX( Number value );

    public Number velocityY;

    @JsProperty( name = "velocityY")
    public native Number getVelocityY();

    @JsProperty( name = "velocityY")
    public native void setVelocityY( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initGestureEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(initGestureEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@504889
     */
    public native void initGestureEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Number offsetXArg, Number offsetYArg, Number translationXArg, Number translationYArg, Number scaleArg, Number expansionArg, Number rotationArg, Number velocityXArg, Number velocityYArg, Number velocityExpansionArg, Number velocityAngularArg, Number hwTimestampArg);
}
