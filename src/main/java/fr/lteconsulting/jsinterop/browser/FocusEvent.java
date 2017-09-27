package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: FocusEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:375453
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:375706
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusEvent")
public class FocusEvent extends UIEvent
{

    /*
        Constructors
    */
    public FocusEvent(String typeArg, FocusEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public EventTarget relatedTarget;

    @JsProperty( name = "relatedTarget")
    public native EventTarget getRelatedTarget();

    @JsProperty( name = "relatedTarget")
    public native void setRelatedTarget( EventTarget value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initFocusEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d47))
      * TE Signature : S(initFocusEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d47))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@375539
     */
    public native void initFocusEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, EventTarget relatedTargetArg);
}
