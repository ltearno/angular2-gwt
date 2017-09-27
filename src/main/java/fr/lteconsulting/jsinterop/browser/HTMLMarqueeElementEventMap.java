package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLMarqueeElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:437044
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMarqueeElementEventMap")
public class HTMLMarqueeElementEventMap extends HTMLElementEventMap
{

    /*
        Properties
    */

    public Event bounce;

    @JsProperty( name = "bounce")
    public native Event getBounce();

    @JsProperty( name = "bounce")
    public native void setBounce( Event value );

    public Event finish;

    @JsProperty( name = "finish")
    public native Event getFinish();

    @JsProperty( name = "finish")
    public native void setFinish( Event value );

    public Event start;

    @JsProperty( name = "start")
    public native Event getStart();

    @JsProperty( name = "start")
    public native void setStart( Event value );
}
