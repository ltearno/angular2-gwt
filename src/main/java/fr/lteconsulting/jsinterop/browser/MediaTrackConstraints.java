package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaTrackConstraints
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:269940
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaTrackConstraints")
public class MediaTrackConstraints extends MediaTrackConstraintSet
{

    /*
        Properties
    */

    public Array<MediaTrackConstraintSet> advanced;

    @JsProperty( name = "advanced")
    public native Array<MediaTrackConstraintSet> getAdvanced();

    @JsProperty( name = "advanced")
    public native void setAdvanced( Array<MediaTrackConstraintSet> value );
}
