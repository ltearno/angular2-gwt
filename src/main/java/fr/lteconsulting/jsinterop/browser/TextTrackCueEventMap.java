package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextTrackCueEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:656178
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackCueEventMap")
public class TextTrackCueEventMap
{

    /*
        Properties
    */

    public Event enter;

    @JsProperty( name = "enter")
    public native Event getEnter();

    @JsProperty( name = "enter")
    public native void setEnter( Event value );

    public Event exit;

    @JsProperty( name = "exit")
    public native Event getExit();

    @JsProperty( name = "exit")
    public native void setExit( Event value );
}
