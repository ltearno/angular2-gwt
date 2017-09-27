package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PushSubscription
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:552915
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:553143
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushSubscription")
public class PushSubscription
{

    /*
        Constructors
    */
    public PushSubscription(){
    }

    /*
        Properties
    */

    public String endpoint;

    @JsProperty( name = "endpoint")
    public native String getEndpoint();

    @JsProperty( name = "endpoint")
    public native void setEndpoint( String value );

    public PushSubscriptionOptions options;

    @JsProperty( name = "options")
    public native PushSubscriptionOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( PushSubscriptionOptions value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getKey,26,,P(d1))
      * TE Signature : S(getKey,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@553031
     */
    public native ArrayBuffer getKey(String name);
    /** 
      * Std Signature : S(toJSON,3,,)
      * TE Signature : S(toJSON,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@553077
     */
    public native Object toJSON();
    /** 
      * Std Signature : S(unsubscribe,88<27>,,)
      * TE Signature : S(unsubscribe,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@553096
     */
    public native Promise<Boolean> unsubscribe();
}
