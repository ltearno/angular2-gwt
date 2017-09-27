package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272324
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentOptions")
public class PaymentOptions
{

    /*
        Properties
    */

    public Boolean requestPayerEmail;

    @JsProperty( name = "requestPayerEmail")
    public native Boolean getRequestPayerEmail();

    @JsProperty( name = "requestPayerEmail")
    public native void setRequestPayerEmail( Boolean value );

    public Boolean requestPayerName;

    @JsProperty( name = "requestPayerName")
    public native Boolean getRequestPayerName();

    @JsProperty( name = "requestPayerName")
    public native void setRequestPayerName( Boolean value );

    public Boolean requestPayerPhone;

    @JsProperty( name = "requestPayerPhone")
    public native Boolean getRequestPayerPhone();

    @JsProperty( name = "requestPayerPhone")
    public native void setRequestPayerPhone( Boolean value );

    public Boolean requestShipping;

    @JsProperty( name = "requestShipping")
    public native Boolean getRequestShipping();

    @JsProperty( name = "requestShipping")
    public native void setRequestShipping( Boolean value );

    public String shippingType;

    @JsProperty( name = "shippingType")
    public native String getShippingType();

    @JsProperty( name = "shippingType")
    public native void setShippingType( String value );
}
