package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MessageEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:524858
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:525188
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessageEvent")
public class MessageEvent extends Event
{

    /*
        Constructors
    */
    public MessageEvent(String type, MessageEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Object data;

    @JsProperty( name = "data")
    public native Object getData();

    @JsProperty( name = "data")
    public native void setData( Object value );

    public String origin;

    @JsProperty( name = "origin")
    public native String getOrigin();

    @JsProperty( name = "origin")
    public native void setOrigin( String value );

    public Object ports;

    @JsProperty( name = "ports")
    public native Object getPorts();

    @JsProperty( name = "ports")
    public native void setPorts( Object value );

    public Window source;

    @JsProperty( name = "source")
    public native Window getSource();

    @JsProperty( name = "source")
    public native void setSource( Window value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initMessageEvent,289,,P(d1),P(d27),P(d27),P(d3),P(d1),P(d1),P(d45))
      * TE Signature : S(initMessageEvent,P(d1),P(d27),P(d27),P(d3),P(d1),P(d1),P(d45))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@525010
     */
    public native void initMessageEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object dataArg, String originArg, String lastEventIdArg, Window sourceArg);
}
