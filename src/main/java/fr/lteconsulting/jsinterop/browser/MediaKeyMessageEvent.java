package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeyMessageEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:518258
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:518390
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeyMessageEvent")
public class MediaKeyMessageEvent extends Event
{

    /*
        Constructors
    */
    public MediaKeyMessageEvent(String type, MediaKeyMessageEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public ArrayBuffer message;

    @JsProperty( name = "message")
    public native ArrayBuffer getMessage();

    @JsProperty( name = "message")
    public native void setMessage( ArrayBuffer value );

    public String messageType;

    @JsProperty( name = "messageType")
    public native String getMessageType();

    @JsProperty( name = "messageType")
    public native void setMessageType( String value );
}
