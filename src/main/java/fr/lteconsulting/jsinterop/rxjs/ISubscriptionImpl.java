package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription".ISubscription
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts:144
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="ISubscription")
public class ISubscriptionImpl implements ISubscription
{

    /*
        Properties
    */

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(unsubscribe,429,,)
      * TE Signature : S(unsubscribe,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void unsubscribe();
}
