package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/Action".Action
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/Action.d.ts:89
  * 1 constructors
  * A unit of work to be executed in a {@link Scheduler}. An action is typically
  * created from within a Scheduler and an RxJS user does not need to concern
  * themselves about creating and manipulating an Action.
  * 
  * ```ts
  * class Action<T> extends Subscription {
  *    new (scheduler: Scheduler, work: (state?: T) => void);
  *    schedule(state?: T, delay: number = 0): Subscription;
  * }
  * ```
 */
@JsType(isNative=true, namespace="rxjs", name="Action")
public class Action<T> implements Subscription
{

    /*
        Constructors
    */
    public Action(Scheduler scheduler, Action1<T> work){
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
      * Std Signature : S(remove,429,,P(d350))
      * TE Signature : S(remove,P(d350))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void remove(Subscription subscription);
    /** 
      * Std Signature : S(schedule,350,,)
      * TE Signature : S(schedule,)
      * 
     */
    public native Subscription schedule();
    /** 
      * Std Signature : S(schedule,350,,P(dT-))
      * TE Signature : S(schedule,P(d3))
      * 
     */
    public native Subscription schedule(T state /* optional */);
    /** 
      * Std Signature : S(schedule,350,,P(dT-),P(d2))
      * TE Signature : S(schedule,P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/Action.d.ts@1169
      * Schedules this action on its parent Scheduler for execution. May be passed
      * some context object, `state`. May happen at some point in the future,
      * according to the `delay` parameter, if specified.
     */
    public native Subscription schedule(T state /* optional */, Number delay /* optional */);
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
