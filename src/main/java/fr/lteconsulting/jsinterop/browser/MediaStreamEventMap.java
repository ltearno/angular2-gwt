package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:520906
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamEventMap")
public class MediaStreamEventMap
{

    /*
        Properties
    */

    public Event active;

    @JsProperty( name = "active")
    public native Event getActive();

    @JsProperty( name = "active")
    public native void setActive( Event value );

    public MediaStreamTrackEvent addtrack;

    @JsProperty( name = "addtrack")
    public native MediaStreamTrackEvent getAddtrack();

    @JsProperty( name = "addtrack")
    public native void setAddtrack( MediaStreamTrackEvent value );

    public Event inactive;

    @JsProperty( name = "inactive")
    public native Event getInactive();

    @JsProperty( name = "inactive")
    public native void setInactive( Event value );

    public MediaStreamTrackEvent removetrack;

    @JsProperty( name = "removetrack")
    public native MediaStreamTrackEvent getRemovetrack();

    @JsProperty( name = "removetrack")
    public native void setRemovetrack( MediaStreamTrackEvent value );
}
