package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentMethodData
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:272242
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentMethodData")
public class PaymentMethodData
{

    /*
        Properties
    */

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
}
