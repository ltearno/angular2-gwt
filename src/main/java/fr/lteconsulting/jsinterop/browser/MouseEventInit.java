package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MouseEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:270852
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MouseEventInit")
public class MouseEventInit extends EventModifierInit
{

    /*
        Properties
    */

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
}
