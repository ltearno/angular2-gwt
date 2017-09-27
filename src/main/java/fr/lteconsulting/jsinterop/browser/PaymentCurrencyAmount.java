package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentCurrencyAmount
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271673
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentCurrencyAmount")
public class PaymentCurrencyAmount
{

    /*
        Properties
    */

    public String currency;

    @JsProperty( name = "currency")
    public native String getCurrency();

    @JsProperty( name = "currency")
    public native void setCurrency( String value );

    public String currencySystem;

    @JsProperty( name = "currencySystem")
    public native String getCurrencySystem();

    @JsProperty( name = "currencySystem")
    public native void setCurrencySystem( String value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}
