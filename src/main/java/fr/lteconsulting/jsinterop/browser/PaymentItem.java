package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentItem
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272136
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentItem")
public class PaymentItem
{

    /*
        Properties
    */

    public PaymentCurrencyAmount amount;

    @JsProperty( name = "amount")
    public native PaymentCurrencyAmount getAmount();

    @JsProperty( name = "amount")
    public native void setAmount( PaymentCurrencyAmount value );

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );

    public Boolean pending;

    @JsProperty( name = "pending")
    public native Boolean getPending();

    @JsProperty( name = "pending")
    public native void setPending( Boolean value );
}
