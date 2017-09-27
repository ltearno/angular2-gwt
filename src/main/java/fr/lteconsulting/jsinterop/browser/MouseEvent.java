package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MouseEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:526396
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:527571
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MouseEvent")
public class MouseEvent extends UIEvent
{

    /*
        Constructors
    */
    public MouseEvent(String typeArg, MouseEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Boolean altKey;

    @JsProperty( name = "altKey")
    public native Boolean getAltKey();

    @JsProperty( name = "altKey")
    public native void setAltKey( Boolean value );

    public Number button;

    @JsProperty( name = "button")
    public native Number getButton();

    @JsProperty( name = "button")
    public native void setButton( Number value );

    public Number buttons;

    @JsProperty( name = "buttons")
    public native Number getButtons();

    @JsProperty( name = "buttons")
    public native void setButtons( Number value );

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

    public Boolean ctrlKey;

    @JsProperty( name = "ctrlKey")
    public native Boolean getCtrlKey();

    @JsProperty( name = "ctrlKey")
    public native void setCtrlKey( Boolean value );

    public Element fromElement;

    @JsProperty( name = "fromElement")
    public native Element getFromElement();

    @JsProperty( name = "fromElement")
    public native void setFromElement( Element value );

    public Number layerX;

    @JsProperty( name = "layerX")
    public native Number getLayerX();

    @JsProperty( name = "layerX")
    public native void setLayerX( Number value );

    public Number layerY;

    @JsProperty( name = "layerY")
    public native Number getLayerY();

    @JsProperty( name = "layerY")
    public native void setLayerY( Number value );

    public Boolean metaKey;

    @JsProperty( name = "metaKey")
    public native Boolean getMetaKey();

    @JsProperty( name = "metaKey")
    public native void setMetaKey( Boolean value );

    public Number movementX;

    @JsProperty( name = "movementX")
    public native Number getMovementX();

    @JsProperty( name = "movementX")
    public native void setMovementX( Number value );

    public Number movementY;

    @JsProperty( name = "movementY")
    public native Number getMovementY();

    @JsProperty( name = "movementY")
    public native void setMovementY( Number value );

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

    public Number pageX;

    @JsProperty( name = "pageX")
    public native Number getPageX();

    @JsProperty( name = "pageX")
    public native void setPageX( Number value );

    public Number pageY;

    @JsProperty( name = "pageY")
    public native Number getPageY();

    @JsProperty( name = "pageY")
    public native void setPageY( Number value );

    public EventTarget relatedTarget;

    @JsProperty( name = "relatedTarget")
    public native EventTarget getRelatedTarget();

    @JsProperty( name = "relatedTarget")
    public native void setRelatedTarget( EventTarget value );

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

    public Boolean shiftKey;

    @JsProperty( name = "shiftKey")
    public native Boolean getShiftKey();

    @JsProperty( name = "shiftKey")
    public native void setShiftKey( Boolean value );

    public Element toElement;

    @JsProperty( name = "toElement")
    public native Element getToElement();

    @JsProperty( name = "toElement")
    public native void setToElement( Element value );

    public Number which;

    @JsProperty( name = "which")
    public native Number getWhich();

    @JsProperty( name = "which")
    public native void setWhich( Number value );

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getModifierState,27,,P(d1))
      * TE Signature : S(getModifierState,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@527167
     */
    public native Boolean getModifierState(String keyArg);
    /** 
      * Std Signature : S(initMouseEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47))
      * TE Signature : S(initMouseEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@527214
     */
    public native void initMouseEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, Number buttonArg, EventTarget relatedTargetArg);
}
