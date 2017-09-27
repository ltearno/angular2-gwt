package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextTrackEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:654789
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackEventMap")
public class TextTrackEventMap
{

    /*
        Properties
    */

    public Event cuechange;

    @JsProperty( name = "cuechange")
    public native Event getCuechange();

    @JsProperty( name = "cuechange")
    public native void setCuechange( Event value );

    public Event error;

    @JsProperty( name = "error")
    public native Event getError();

    @JsProperty( name = "error")
    public native void setError( Event value );

    public Event load;

    @JsProperty( name = "load")
    public native Event getLoad();

    @JsProperty( name = "load")
    public native void setLoad( Event value );
}
