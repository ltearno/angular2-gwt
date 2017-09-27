package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: PushManager
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:552598
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:552846
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushManager")
public class PushManager
{

    /*
        Constructors
    */
    public PushManager(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(getSubscription,88<492>,,)
      * TE Signature : S(getSubscription,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@552628
     */
    public native Promise<PushSubscription> getSubscription();
    /** 
      * Std Signature : S(permissionState,88<1>,,)
      * TE Signature : S(permissionState,)
      * 
     */
    public native Promise<String> permissionState();
    /** 
      * Std Signature : S(permissionState,88<1>,,P(d162))
      * TE Signature : S(permissionState,P(d162))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@552678
     */
    public native Promise<String> permissionState(PushSubscriptionOptionsInit options /* optional */);
    /** 
      * Std Signature : S(subscribe,88<492>,,)
      * TE Signature : S(subscribe,)
      * 
     */
    public native Promise<PushSubscription> subscribe();
    /** 
      * Std Signature : S(subscribe,88<492>,,P(d162))
      * TE Signature : S(subscribe,P(d162))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@552755
     */
    public native Promise<PushSubscription> subscribe(PushSubscriptionOptionsInit options /* optional */);
}
