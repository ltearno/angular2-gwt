package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/scheduler/AsapAction".AsapAction
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/scheduler/AsapAction.d.ts:93
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="AsapAction")
public class AsapAction<T> extends AsyncAction<T>
{

    /*
        Constructors
    */
    public AsapAction(AsapScheduler scheduler, Action1<T> work){
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
      * Std Signature : S(recycleAsyncId,3,,P(d716))
      * TE Signature : S(recycleAsyncId,P(d716))
      * 
     */
    public native Object recycleAsyncId(AsapScheduler scheduler);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d716),P(d3))
      * TE Signature : S(recycleAsyncId,P(d716),P(d3))
      * 
     */
    public native Object recycleAsyncId(AsapScheduler scheduler, Object id /* optional */);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d716),P(d3),P(d2))
      * TE Signature : S(recycleAsyncId,P(d716),P(d3),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/scheduler/AsapAction.d.ts@530
     */
    public native Object recycleAsyncId(AsapScheduler scheduler, Object id /* optional */, Number delay /* optional */);
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
      * Std Signature : S(requestAsyncId,3,,P(d716))
      * TE Signature : S(requestAsyncId,P(d716))
      * 
     */
    public native Object requestAsyncId(AsapScheduler scheduler);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d716),P(d3))
      * TE Signature : S(requestAsyncId,P(d716),P(d3))
      * 
     */
    public native Object requestAsyncId(AsapScheduler scheduler, Object id /* optional */);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d716),P(d3),P(d2))
      * TE Signature : S(requestAsyncId,P(d716),P(d3),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/scheduler/AsapAction.d.ts@443
     */
    public native Object requestAsyncId(AsapScheduler scheduler, Object id /* optional */, Number delay /* optional */);
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
