package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MessageEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:270669
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessageEventInit")
public class MessageEventInit extends EventInit
{

    /*
        Properties
    */

    public String channel;

    @JsProperty( name = "channel")
    public native String getChannel();

    @JsProperty( name = "channel")
    public native void setChannel( String value );

    public Object data;

    @JsProperty( name = "data")
    public native Object getData();

    @JsProperty( name = "data")
    public native void setData( Object value );

    public String lastEventId;

    @JsProperty( name = "lastEventId")
    public native String getLastEventId();

    @JsProperty( name = "lastEventId")
    public native void setLastEventId( String value );

    public String origin;

    @JsProperty( name = "origin")
    public native String getOrigin();

    @JsProperty( name = "origin")
    public native void setOrigin( String value );

    public Array<MessagePort> ports;

    @JsProperty( name = "ports")
    public native Array<MessagePort> getPorts();

    @JsProperty( name = "ports")
    public native void setPorts( Array<MessagePort> value );

    public Window source;

    @JsProperty( name = "source")
    public native Window getSource();

    @JsProperty( name = "source")
    public native void setSource( Window value );
}
