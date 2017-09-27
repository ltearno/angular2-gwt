package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaKeyMessageEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:268090
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeyMessageEventInit")
public class MediaKeyMessageEventInit extends EventInit
{

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
