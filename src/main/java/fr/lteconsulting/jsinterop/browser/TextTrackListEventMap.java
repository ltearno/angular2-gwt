package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextTrackListEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:657261
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackListEventMap")
public class TextTrackListEventMap
{

    /*
        Properties
    */

    public TrackEvent addtrack;

    @JsProperty( name = "addtrack")
    public native TrackEvent getAddtrack();

    @JsProperty( name = "addtrack")
    public native void setAddtrack( TrackEvent value );
}
