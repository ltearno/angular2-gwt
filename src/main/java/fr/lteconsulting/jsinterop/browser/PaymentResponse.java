package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentResponse
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:542693
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:543078
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentResponse")
public class PaymentResponse
{

    /*
        Constructors
    */
    public PaymentResponse(){
    }

    /*
        Properties
    */

    public Object details;

    @JsProperty( name = "details")
    public native Object getDetails();

    @JsProperty( name = "details")
    public native void setDetails( Object value );

    public String methodName;

    @JsProperty( name = "methodName")
    public native String getMethodName();

    @JsProperty( name = "methodName")
    public native void setMethodName( String value );

    public String payerEmail;

    @JsProperty( name = "payerEmail")
    public native String getPayerEmail();

    @JsProperty( name = "payerEmail")
    public native void setPayerEmail( String value );

    public String payerName;

    @JsProperty( name = "payerName")
    public native String getPayerName();

    @JsProperty( name = "payerName")
    public native void setPayerName( String value );

    public String payerPhone;

    @JsProperty( name = "payerPhone")
    public native String getPayerPhone();

    @JsProperty( name = "payerPhone")
    public native void setPayerPhone( String value );

    public PaymentAddress shippingAddress;

    @JsProperty( name = "shippingAddress")
    public native PaymentAddress getShippingAddress();

    @JsProperty( name = "shippingAddress")
    public native void setShippingAddress( PaymentAddress value );

    public String shippingOption;

    @JsProperty( name = "shippingOption")
    public native String getShippingOption();

    @JsProperty( name = "shippingOption")
    public native void setShippingOption( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(complete,88<369>,,)
      * TE Signature : S(complete,)
      * 
     */
    public native Promise<Void> complete();
    /** 
      * Std Signature : S(complete,88<369>,,P(d1))
      * TE Signature : S(complete,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543003
     */
    public native Promise<Void> complete(String result /* optional */);
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@543049
     */
    public native Object toJSON();
}
