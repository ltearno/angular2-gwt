package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction".AsyncAction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts:133
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="AsyncAction")
public class AsyncAction<T> extends Action<T>
{

    /*
        Constructors
    */
    public AsyncAction(AsyncScheduler scheduler, Action1<T> work){
        super(null, null);
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

    public Number delay;

    @JsProperty( name = "delay")
    public native Number getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( Number value );

    public Object id;

    @JsProperty( name = "id")
    public native Object getId();

    @JsProperty( name = "id")
    public native void setId( Object value );

    public Boolean pending;

    @JsProperty( name = "pending")
    public native Boolean getPending();

    @JsProperty( name = "pending")
    public native void setPending( Boolean value );

    public AsyncScheduler scheduler;

    @JsProperty( name = "scheduler")
    public native AsyncScheduler getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( AsyncScheduler value );

    public T state;

    @JsProperty( name = "state")
    public native T getState();

    @JsProperty( name = "state")
    public native void setState( T value );

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
      * Std Signature : S(_execute,3,,P(dT-),P(d2))
      * TE Signature : S(_execute,P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@939
     */
    public native Object _execute(T state, Number delay);
    /** 
      * Std Signature : S(_unsubscribe,429,,)
      * TE Signature : S(_unsubscribe,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@993
     */
    public native void _unsubscribe();
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
      * Std Signature : S(execute,3,,P(dT-),P(d2))
      * TE Signature : S(execute,P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@896
      * Immediately executes this action and the `work` it contains.
     */
    public native Object execute(T state, Number delay);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d711),P(d3))
      * TE Signature : S(recycleAsyncId,P(d711),P(d3))
      * 
     */
    public native Object recycleAsyncId(AsyncScheduler scheduler, Object id);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d711),P(d3),P(d2))
      * TE Signature : S(recycleAsyncId,P(d711),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@704
     */
    public native Object recycleAsyncId(AsyncScheduler scheduler, Object id, Number delay /* optional */);
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
      * Std Signature : S(requestAsyncId,3,,P(d711))
      * TE Signature : S(requestAsyncId,P(d711))
      * 
     */
    public native Object requestAsyncId(AsyncScheduler scheduler);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d711),P(d3))
      * TE Signature : S(requestAsyncId,P(d711),P(d3))
      * 
     */
    public native Object requestAsyncId(AsyncScheduler scheduler, Object id /* optional */);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d711),P(d3),P(d2))
      * TE Signature : S(requestAsyncId,P(d711),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@616
     */
    public native Object requestAsyncId(AsyncScheduler scheduler, Object id /* optional */, Number delay /* optional */);
    /** 
      * Std Signature : S(unsubscribe,429,,)
      * TE Signature : S(unsubscribe,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void unsubscribe();
    /** 
      * Std Signature : S(work,429,,)
      * TE Signature : S(work,)
      * 
     */
    public native void work();
    /** 
      * Std Signature : S(work,429,,P(dT-))
      * TE Signature : S(work,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncAction.d.ts@343
     */
    public native void work(T state /* optional */);
}
