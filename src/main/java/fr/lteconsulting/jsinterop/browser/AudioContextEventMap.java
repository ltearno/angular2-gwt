package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AudioContextEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:286916
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioContextEventMap")
public class AudioContextEventMap
{

    /*
        Properties
    */

    public Event statechange;

    @JsProperty( name = "statechange")
    public native Event getStatechange();

    @JsProperty( name = "statechange")
    public native void setStatechange( Event value );
}
