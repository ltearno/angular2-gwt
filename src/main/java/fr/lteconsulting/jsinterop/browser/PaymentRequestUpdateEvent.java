package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: PaymentRequestUpdateEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:542405
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:542523
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentRequestUpdateEvent")
public class PaymentRequestUpdateEvent extends Event
{

    /*
        Constructors
    */
    public PaymentRequestUpdateEvent(String type, PaymentRequestUpdateEventInit eventInitDict){
        super(null, null);
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(updateWith,289,,P(d88<248>))
      * TE Signature : S(updateWith,P(d88))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@542463
     */
    public native void updateWith(Promise<PaymentDetails> d);
}
