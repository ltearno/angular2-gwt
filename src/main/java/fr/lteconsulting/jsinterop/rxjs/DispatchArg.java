package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/observable/SubscribeOnObservable".DispatchArg
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/observable/SubscribeOnObservable.d.ts:224
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="DispatchArg")
public class DispatchArg<T>
{

    /*
        Properties
    */

    public Observable<T> source;

    @JsProperty( name = "source")
    public native Observable<T> getSource();

    @JsProperty( name = "source")
    public native void setSource( Observable<T> value );

    public Subscriber<T> subscriber;

    @JsProperty( name = "subscriber")
    public native Subscriber<T> getSubscriber();

    @JsProperty( name = "subscriber")
    public native void setSubscriber( Subscriber<T> value );
}
