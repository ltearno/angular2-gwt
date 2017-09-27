package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand".ExpandSubscriber
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts:975
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="ExpandSubscriber")
public class ExpandSubscriber<T, R> extends OuterSubscriber<T, R>
{

    /*
        Constructors
    */
    public ExpandSubscriber(Subscriber<R> destination, Function2<T, Number, Observable<R>> project, Number concurrent, IScheduler scheduler){
        super(null, null, null);
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts:1442
     */
    @JsMethod(namespace="rxjs.ExpandSubscriber", name = "dispatch")
    public static native <T, R> Object dispatch(Object arg);

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

    public Object active;

    @JsProperty( name = "active")
    public native Object getActive();

    @JsProperty( name = "active")
    public native void setActive( Object value );

    public Object buffer;

    @JsProperty( name = "buffer")
    public native Object getBuffer();

    @JsProperty( name = "buffer")
    public native void setBuffer( Object value );

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    public Object concurrent;

    @JsProperty( name = "concurrent")
    public native Object getConcurrent();

    @JsProperty( name = "concurrent")
    public native void setConcurrent( Object value );

    public Object hasCompleted;

    @JsProperty( name = "hasCompleted")
    public native Object getHasCompleted();

    @JsProperty( name = "hasCompleted")
    public native void setHasCompleted( Object value );

    public Object index;

    @JsProperty( name = "index")
    public native Object getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Object value );

    public Object project;

    @JsProperty( name = "project")
    public native Object getProject();

    @JsProperty( name = "project")
    public native void setProject( Object value );

    public Object scheduler;

    @JsProperty( name = "scheduler")
    public native Object getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( Object value );

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
      * Std Signature : S(notifyComplete,429,,P(d350))
      * TE Signature : S(notifyComplete,P(d350))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts@1736
     */
    public native void notifyComplete(Subscription innerSub);
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
      * Std Signature : S(subscribeToProjection,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(subscribeToProjection,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts@1521
     */
    public native Object subscribeToProjection(Object result, Object value, Object index);
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
