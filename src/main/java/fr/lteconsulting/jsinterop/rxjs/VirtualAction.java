package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler".VirtualAction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts:554
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="VirtualAction")
public class VirtualAction<T> extends AsyncAction<T>
{

    /*
        Constructors
    */
    public VirtualAction(VirtualTimeScheduler scheduler, Action1<T> work, Number index){
        super(null, null);
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts:1300
     */
    @JsMethod(namespace="rxjs.VirtualAction", name = "sortActions")
    public static native <T> Number sortActions(VirtualAction<T> a, VirtualAction<T> b);

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

    public Boolean active;

    @JsProperty( name = "active")
    public native Boolean getActive();

    @JsProperty( name = "active")
    public native void setActive( Boolean value );

    public Boolean closed;

    @JsProperty( name = "closed")
    public native Boolean getClosed();

    @JsProperty( name = "closed")
    public native void setClosed( Boolean value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

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
      * Std Signature : S(recycleAsyncId,3,,P(d713))
      * TE Signature : S(recycleAsyncId,P(d713))
      * 
     */
    public native Object recycleAsyncId(VirtualTimeScheduler scheduler);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d713),P(d3))
      * TE Signature : S(recycleAsyncId,P(d713),P(d3))
      * 
     */
    public native Object recycleAsyncId(VirtualTimeScheduler scheduler, Object id /* optional */);
    /** 
      * Std Signature : S(recycleAsyncId,3,,P(d713),P(d3),P(d2))
      * TE Signature : S(recycleAsyncId,P(d713),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts@1152
     */
    public native Object recycleAsyncId(VirtualTimeScheduler scheduler, Object id /* optional */, Number delay /* optional */);
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
      * Std Signature : S(requestAsyncId,3,,P(d713))
      * TE Signature : S(requestAsyncId,P(d713))
      * 
     */
    public native Object requestAsyncId(VirtualTimeScheduler scheduler);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d713),P(d3))
      * TE Signature : S(requestAsyncId,P(d713),P(d3))
      * 
     */
    public native Object requestAsyncId(VirtualTimeScheduler scheduler, Object id /* optional */);
    /** 
      * Std Signature : S(requestAsyncId,3,,P(d713),P(d3),P(d2))
      * TE Signature : S(requestAsyncId,P(d713),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/VirtualTimeScheduler.d.ts@1058
     */
    public native Object requestAsyncId(VirtualTimeScheduler scheduler, Object id /* optional */, Number delay /* optional */);
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
