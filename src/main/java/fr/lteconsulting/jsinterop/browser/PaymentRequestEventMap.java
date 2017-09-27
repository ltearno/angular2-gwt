package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentRequestEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:541446
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentRequestEventMap")
public class PaymentRequestEventMap
{

    /*
        Properties
    */

    public Event shippingaddresschange;

    @JsProperty( name = "shippingaddresschange")
    public native Event getShippingaddresschange();

    @JsProperty( name = "shippingaddresschange")
    public native void setShippingaddresschange( Event value );

    public Event shippingoptionchange;

    @JsProperty( name = "shippingoptionchange")
    public native Event getShippingoptionchange();

    @JsProperty( name = "shippingoptionchange")
    public native void setShippingoptionchange( Event value );
}
