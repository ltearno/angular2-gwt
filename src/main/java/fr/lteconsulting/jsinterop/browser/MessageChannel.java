package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MessageChannel
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524671
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524780
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessageChannel")
public class MessageChannel
{

    /*
        Constructors
    */
    public MessageChannel(){
    }

    /*
        Properties
    */

    public MessagePort port1;

    @JsProperty( name = "port1")
    public native MessagePort getPort1();

    @JsProperty( name = "port1")
    public native void setPort1( MessagePort value );

    public MessagePort port2;

    @JsProperty( name = "port2")
    public native MessagePort getPort2();

    @JsProperty( name = "port2")
    public native void setPort2( MessagePort value );
}
