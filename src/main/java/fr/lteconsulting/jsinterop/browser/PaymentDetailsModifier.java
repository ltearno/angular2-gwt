package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentDetailsModifier
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271980
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentDetailsModifier")
public class PaymentDetailsModifier
{

    /*
        Properties
    */

    public Array<PaymentItem> additionalDisplayItems;

    @JsProperty( name = "additionalDisplayItems")
    public native Array<PaymentItem> getAdditionalDisplayItems();

    @JsProperty( name = "additionalDisplayItems")
    public native void setAdditionalDisplayItems( Array<PaymentItem> value );

    public Object data;

    @JsProperty( name = "data")
    public native Object getData();

    @JsProperty( name = "data")
    public native void setData( Object value );

    public Array<String> supportedMethods;

    @JsProperty( name = "supportedMethods")
    public native Array<String> getSupportedMethods();

    @JsProperty( name = "supportedMethods")
    public native void setSupportedMethods( Array<String> value );

    public PaymentItem total;

    @JsProperty( name = "total")
    public native PaymentItem getTotal();

    @JsProperty( name = "total")
    public native void setTotal( PaymentItem value );
}
