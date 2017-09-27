package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/OuterSubscriber".OuterSubscriber
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/OuterSubscriber.d.ts:95
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="OuterSubscriber")
public class OuterSubscriber<T, R> extends Subscriber<T>
{

    /*
        Constructors
    */
    public OuterSubscriber(UnionOfAction1OfTAndCompletionObserverOfObjectAndErrorObserverOfObjectAndNextObserverOfObject<T> destinationOrNext, Action1<Object> error, Action complete){
        super(null, null, null);
    }

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
      * Std Signature : S(notifyComplete,429,,P(d706<T-,R->))
      * TE Signature : S(notifyComplete,P(d706))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/OuterSubscriber.d.ts@452
     */
    public native void notifyComplete(InnerSubscriber<T, R> innerSub);
    /** 
      * Std Signature : S(notifyError,429,,P(d3),P(d706<T-,R->))
      * TE Signature : S(notifyError,P(d3),P(d706))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/OuterSubscriber.d.ts@384
     */
    public native void notifyError(Object error, InnerSubscriber<T, R> innerSub);
    /** 
      * Std Signature : S(notifyNext,429,,P(dT-),P(dR-),P(d2),P(d2),P(d706<T-,R->))
      * TE Signature : S(notifyNext,P(d3),P(d3),P(d2),P(d2),P(d706))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/OuterSubscriber.d.ts@259
     */
    public native void notifyNext(T outerValue, R innerValue, Number outerIndex, Number innerIndex, InnerSubscriber<T, R> innerSub);
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
