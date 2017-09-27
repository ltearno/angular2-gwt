package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522832
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522932
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamEvent")
public class MediaStreamEvent extends Event
{

    /*
        Constructors
    */
    public MediaStreamEvent(String type, MediaStreamEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public MediaStream stream;

    @JsProperty( name = "stream")
    public native MediaStream getStream();

    @JsProperty( name = "stream")
    public native void setStream( MediaStream value );
}
