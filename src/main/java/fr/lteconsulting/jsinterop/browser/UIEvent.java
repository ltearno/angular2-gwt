package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: UIEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660152
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660381
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="UIEvent")
public class UIEvent extends Event
{

    /*
        Constructors
    */
    public UIEvent(String typeArg, UIEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public Number detail;

    @JsProperty( name = "detail")
    public native Number getDetail();

    @JsProperty( name = "detail")
    public native void setDetail( Number value );

    public Window view;

    @JsProperty( name = "view")
    public native Window getView();

    @JsProperty( name = "view")
    public native void setView( Window value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initUIEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2))
      * TE Signature : S(initUIEvent,P(d1),P(d27),P(d27),P(d45),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@660248
     */
    public native void initUIEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg);
}
