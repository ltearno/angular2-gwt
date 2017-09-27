package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy".RefCountSubscription
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts:1037
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="RefCountSubscription")
public class RefCountSubscription
{

    /*
        Properties
    */

    public Boolean attemptedToUnsubscribe;

    @JsProperty( name = "attemptedToUnsubscribe")
    public native Boolean getAttemptedToUnsubscribe();

    @JsProperty( name = "attemptedToUnsubscribe")
    public native void setAttemptedToUnsubscribe( Boolean value );

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    public Number count;

    @JsProperty( name = "count")
    public native Number getCount();

    @JsProperty( name = "count")
    public native void setCount( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(unsubscribe,429,,)
      * TE Signature : S(unsubscribe,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts@1114
     */
    public native void unsubscribe();
}
