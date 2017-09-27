package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: OscillatorNodeEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:538920
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OscillatorNodeEventMap")
public class OscillatorNodeEventMap
{

    /*
        Properties
    */

    public MediaStreamErrorEvent ended;

    @JsProperty( name = "ended")
    public native MediaStreamErrorEvent getEnded();

    @JsProperty( name = "ended")
    public native void setEnded( MediaStreamErrorEvent value );
}
