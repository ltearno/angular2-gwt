package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: EventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:258030
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EventInit")
public class EventInit
{

    /*
        Properties
    */

    public Boolean bubbles;

    @JsProperty( name = "bubbles")
    public native Boolean getBubbles();

    @JsProperty( name = "bubbles")
    public native void setBubbles( Boolean value );

    public Boolean cancelable;

    @JsProperty( name = "cancelable")
    public native Boolean getCancelable();

    @JsProperty( name = "cancelable")
    public native void setCancelable( Boolean value );

    public Boolean scoped;

    @JsProperty( name = "scoped")
    public native Boolean getScoped();

    @JsProperty( name = "scoped")
    public native void setScoped( Boolean value );
}
