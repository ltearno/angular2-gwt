package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CloseEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315825
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:316114
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CloseEvent")
public class CloseEvent extends Event
{

    /*
        Constructors
    */
    public CloseEvent(String typeArg, CloseEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Number code;

    @JsProperty( name = "code")
    public native Number getCode();

    @JsProperty( name = "code")
    public native void setCode( Number value );

    public String reason;

    @JsProperty( name = "reason")
    public native String getReason();

    @JsProperty( name = "reason")
    public native void setReason( String value );

    public Boolean wasClean;

    @JsProperty( name = "wasClean")
    public native Boolean getWasClean();

    @JsProperty( name = "wasClean")
    public native void setWasClean( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initCloseEvent,289,,P(d1),P(d27),P(d27),P(d27),P(d2),P(d1))
      * TE Signature : S(initCloseEvent,P(d1),P(d27),P(d27),P(d27),P(d2),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@315956
     */
    public native void initCloseEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Boolean wasCleanArg, Number codeArg, String reasonArg);
}
