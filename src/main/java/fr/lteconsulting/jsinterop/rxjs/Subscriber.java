package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber".Subscriber
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts:102
  * 1 constructors
  * Implements the {@link Observer} interface and extends the
  * {@link Subscription} class. While the {@link Observer} is the public API for
  * consuming the values of an {@link Observable}, all Observers get converted to
  * a Subscriber, in order to provide Subscription-like capabilities such as
  * `unsubscribe`. Subscriber is a common type in RxJS, and crucial for
  * implementing operators, but it is rarely used as a public API.
 */
@JsType(isNative=true, namespace="rxjs", name="Subscriber")
public class Subscriber<T> implements Subscription, Observer<T>
{

    /*
        Constructors
    */
    public Subscriber(UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> destinationOrNext, Action1<Object> error, Action complete){
    }

    /*
        Static methods
    */
    /** 
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.): void} [next] The `next` callback of an Observer.): void} [error] The `error` callback of an
      * Observer.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts:1173
     */
    @JsMethod(namespace="rxjs.Subscriber", name = "create")
    public static native <T> Subscriber<T> create(Action1<T> next /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);

    /*
        Properties
    */

    public Subscription _parent;

    @JsProperty( name = "_parent")
    public native Subscription get_parent();

    @JsProperty( name = "_parent")
    public native void set_parent( Subscription value );

    public Array<Subscription> _parents;

    @JsProperty( name = "_parents")
    public native Array<Subscription> get_parents();

    @JsProperty( name = "_parents")
    public native void set_parents( Array<Subscription> value );

    public Object _subscriptions;

    @JsProperty( name = "_subscriptions")
    public native Object get_subscriptions();

    @JsProperty( name = "_subscriptions")
    public native void set_subscriptions( Object value );

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    public PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject destination;

    @JsProperty( name = "destination")
    public native PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject getDestination();

    @JsProperty( name = "destination")
    public native void setDestination( PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject value );

    @JsOverlay
    public final void setDestination( CompletionObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofCompletionObserverOfObject( value )); }

    @JsOverlay
    public final void setDestination( ErrorObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofErrorObserverOfObject( value )); }

    @JsOverlay
    public final void setDestination( NextObserver<Object> value ) { setDestination(PartialObserver_UnionOfCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject.ofNextObserverOfObject( value )); }

    public Boolean isStopped;

    @JsProperty( name = "isStopped")
    public native Boolean getIsStopped();

    @JsProperty( name = "isStopped")
    public native void setIsStopped( Boolean value );

    public Boolean syncErrorThrowable;

    @JsProperty( name = "syncErrorThrowable")
    public native Boolean getSyncErrorThrowable();

    @JsProperty( name = "syncErrorThrowable")
    public native void setSyncErrorThrowable( Boolean value );

    public Boolean syncErrorThrown;

    @JsProperty( name = "syncErrorThrown")
    public native Boolean getSyncErrorThrown();

    @JsProperty( name = "syncErrorThrown")
    public native void setSyncErrorThrown( Boolean value );

    public Object syncErrorValue;

    @JsProperty( name = "syncErrorValue")
    public native Object getSyncErrorValue();

    @JsProperty( name = "syncErrorValue")
    public native void setSyncErrorValue( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addParent,3,,P(d3))
      * TE Signature : S(_addParent,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object _addParent(Object parent);
    /** 
      * Std Signature : S(_complete,429,,)
      * TE Signature : S(_complete,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts@2925
     */
    public native void _complete();
    /** 
      * Std Signature : S(_error,429,,P(d3))
      * TE Signature : S(_error,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts@2887
     */
    public native void _error(Object err);
    /** 
      * Std Signature : S(_next,429,,P(dT-))
      * TE Signature : S(_next,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts@2850
     */
    public native void _next(T value);
    /** 
      * Std Signature : S(_unsubscribeAndRecycle,354,,)
      * TE Signature : S(_unsubscribeAndRecycle,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscriber.d.ts@2958
     */
    public native Subscriber<T> _unsubscribeAndRecycle();
    /** 
      * Std Signature : S(add,350,,P(d205))
      * TE Signature : S(add,P(d205))
      * 
     */
    public native Subscription add(Function teardown);
    /** 
      * Std Signature : S(add,350,,P(d348))
      * TE Signature : S(add,P(d348))
      * 
     */
    public native Subscription add(AnonymousSubscription teardown);
    /** 
      * Std Signature : S(add,350,,P(d349))
      * TE Signature : S(add,P(d349))
      * 
     */
    public native Subscription add(Void teardown);
    /** 
      * Std Signature : S(add,350,,P(dU(-348,205,349)))
      * TE Signature : S(add,P(dU(-348,205,349)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription add(TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid teardown);
    /** 
      * Std Signature : S(complete,429,,)
      * TE Signature : S(complete,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void complete();
    /** 
      * Std Signature : S(error,429,,P(d3))
      * TE Signature : S(error,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void error(Object err);
    /** 
      * Std Signature : S(next,429,,P(dT-))
      * TE Signature : S(next,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void next(T value);
    /** 
      * Std Signature : S(remove,429,,P(d350))
      * TE Signature : S(remove,P(d350))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void remove(Subscription subscription);
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
