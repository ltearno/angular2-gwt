package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PopStateEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551062
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:551251
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PopStateEvent")
public class PopStateEvent extends Event
{

    /*
        Constructors
    */
    public PopStateEvent(String typeArg, PopStateEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Object state;

    @JsProperty( name = "state")
    public native Object getState();

    @JsProperty( name = "state")
    public native void setState( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initPopStateEvent,289,,P(d1),P(d27),P(d27),P(d3))
      * TE Signature : S(initPopStateEvent,P(d1),P(d27),P(d27),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@551133
     */
    public native void initPopStateEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object stateArg);
}
