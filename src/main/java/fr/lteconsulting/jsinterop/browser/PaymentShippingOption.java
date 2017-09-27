package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentShippingOption
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272573
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentShippingOption")
public class PaymentShippingOption
{

    /*
        Properties
    */

    public PaymentCurrencyAmount amount;

    @JsProperty( name = "amount")
    public native PaymentCurrencyAmount getAmount();

    @JsProperty( name = "amount")
    public native void setAmount( PaymentCurrencyAmount value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String label;

    @JsProperty( name = "label")
    public native String getLabel();

    @JsProperty( name = "label")
    public native void setLabel( String value );

    public Boolean selected;

    @JsProperty( name = "selected")
    public native Boolean getSelected();

    @JsProperty( name = "selected")
    public native void setSelected( Boolean value );
}
