package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MessagePortEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:525306
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessagePortEventMap")
public class MessagePortEventMap
{

    /*
        Properties
    */

    public MessageEvent message;

    @JsProperty( name = "message")
    public native MessageEvent getMessage();

    @JsProperty( name = "message")
    public native void setMessage( MessageEvent value );
}
