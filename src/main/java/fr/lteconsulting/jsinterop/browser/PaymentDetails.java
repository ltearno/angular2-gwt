package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentDetails
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271782
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentDetails")
public class PaymentDetails
{

    /*
        Properties
    */

    public Array<PaymentItem> displayItems;

    @JsProperty( name = "displayItems")
    public native Array<PaymentItem> getDisplayItems();

    @JsProperty( name = "displayItems")
    public native void setDisplayItems( Array<PaymentItem> value );

    public String error;

    @JsProperty( name = "error")
    public native String getError();

    @JsProperty( name = "error")
    public native void setError( String value );

    public Array<PaymentDetailsModifier> modifiers;

    @JsProperty( name = "modifiers")
    public native Array<PaymentDetailsModifier> getModifiers();

    @JsProperty( name = "modifiers")
    public native void setModifiers( Array<PaymentDetailsModifier> value );

    public Array<PaymentShippingOption> shippingOptions;

    @JsProperty( name = "shippingOptions")
    public native Array<PaymentShippingOption> getShippingOptions();

    @JsProperty( name = "shippingOptions")
    public native void setShippingOptions( Array<PaymentShippingOption> value );

    public PaymentItem total;

    @JsProperty( name = "total")
    public native PaymentItem getTotal();

    @JsProperty( name = "total")
    public native void setTotal( PaymentItem value );
}
