package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CustomEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:318959
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:319146
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CustomEvent")
public class CustomEvent extends Event
{

    /*
        Constructors
    */
    public CustomEvent(String typeArg, CustomEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Object detail;

    @JsProperty( name = "detail")
    public native Object getDetail();

    @JsProperty( name = "detail")
    public native void setDetail( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initCustomEvent,289,,P(d1),P(d27),P(d27),P(d3))
      * TE Signature : S(initCustomEvent,P(d1),P(d27),P(d27),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@319029
     */
    public native void initCustomEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object detailArg);
}
