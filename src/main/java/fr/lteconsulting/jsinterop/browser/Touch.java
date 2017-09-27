package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Touch
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658109
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:658386
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Touch")
public class Touch
{

    /*
        Constructors
    */
    public Touch(){
    }

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

    public Number identifier;

    @JsProperty( name = "identifier")
    public native Number getIdentifier();

    @JsProperty( name = "identifier")
    public native void setIdentifier( Number value );

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

    public EventTarget target;

    @JsProperty( name = "target")
    public native EventTarget getTarget();

    @JsProperty( name = "target")
    public native void setTarget( EventTarget value );
}
