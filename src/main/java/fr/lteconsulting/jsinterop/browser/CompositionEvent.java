package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CompositionEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:316360
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:316623
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CompositionEvent")
public class CompositionEvent extends UIEvent
{

    /*
        Constructors
    */
    public CompositionEvent(String typeArg, CompositionEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String data;

    @JsProperty( name = "data")
    public native String getData();

    @JsProperty( name = "data")
    public native void setData( String value );

    public String locale;

    @JsProperty( name = "locale")
    public native String getLocale();

    @JsProperty( name = "locale")
    public native void setLocale( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initCompositionEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d1),P(d1))
      * TE Signature : S(initCompositionEvent,P(d1),P(d27),P(d27),P(d45),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@316467
     */
    public native void initCompositionEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String dataArg, String locale);
}
