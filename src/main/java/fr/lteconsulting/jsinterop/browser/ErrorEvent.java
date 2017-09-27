package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ErrorEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:371788
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:372134
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ErrorEvent")
public class ErrorEvent extends Event
{

    /*
        Constructors
    */
    public ErrorEvent(String type, ErrorEventInit errorEventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Number colno;

    @JsProperty( name = "colno")
    public native Number getColno();

    @JsProperty( name = "colno")
    public native void setColno( Number value );

    public Object error;

    @JsProperty( name = "error")
    public native Object getError();

    @JsProperty( name = "error")
    public native void setError( Object value );

    public String filename;

    @JsProperty( name = "filename")
    public native String getFilename();

    @JsProperty( name = "filename")
    public native void setFilename( String value );

    public Number lineno;

    @JsProperty( name = "lineno")
    public native Number getLineno();

    @JsProperty( name = "lineno")
    public native void setLineno( Number value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initErrorEvent,289,,P(d1),P(d27),P(d27),P(d1),P(d1),P(d2))
      * TE Signature : S(initErrorEvent,P(d1),P(d27),P(d27),P(d1),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@371974
     */
    public native void initErrorEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String messageArg, String filenameArg, Number linenoArg);
}
