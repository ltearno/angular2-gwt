package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription".Subscription
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts:264

  * Represents a disposable resource, such as the execution of an Observable. A
  * Subscription has one important method, `unsubscribe`, that takes no argument
  * and just disposes the resource held by the subscription.
  * 
  * Additionally, subscriptions may be grouped together through the `add()`
  * method, which will attach a child Subscription to the current Subscription.
  * When a Subscription is unsubscribed, all its children (and its grandchildren)
  * will be unsubscribed as well.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Subscription extends ISubscription
{

    /*
        Properties
    */

    @JsProperty( name = "_parent")
    Subscription get_parent();

    @JsProperty( name = "_parent")
    void set_parent( Subscription value );

    @JsProperty( name = "_parents")
    Array<Subscription> get_parents();

    @JsProperty( name = "_parents")
    void set_parents( Array<Subscription> value );

    @JsProperty( name = "_subscriptions")
    Object get_subscriptions();

    @JsProperty( name = "_subscriptions")
    void set_subscriptions( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addParent,3,,P(d3))
      * TE Signature : S(_addParent,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts@2771
     */
    Object _addParent(Object parent);
    /** 
      * Std Signature : S(add,350,,P(d205))
      * TE Signature : S(add,P(d205))
      * 
     */
    Subscription add(Function teardown);
    /** 
      * Std Signature : S(add,350,,P(d348))
      * TE Signature : S(add,P(d348))
      * 
     */
    Subscription add(AnonymousSubscription teardown);
    /** 
      * Std Signature : S(add,350,,P(d349))
      * TE Signature : S(add,P(d349))
      * 
     */
    Subscription add(Void teardown);
    /** 
      * Std Signature : S(add,350,,P(dU(-348,205,349)))
      * TE Signature : S(add,P(dU(-348,205,349)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts@2417
      * Adds a tear down to be called during the unsubscribe() of this
      * Subscription.
      * 
      * If the tear down being added is a subscription that is already
      * unsubscribed, is the same reference `add` is being called on, or is
      * `Subscription.EMPTY`, it will not be added.
      * 
      * If this subscription is already in an `closed` state, the passed
      * tear down logic will be executed immediately.
     */
    Subscription add(TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid teardown);
    /** 
      * Std Signature : S(remove,429,,P(d350))
      * TE Signature : S(remove,P(d350))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts@2725
      * Removes a Subscription from the internal list of subscriptions that will
      * unsubscribe during the unsubscribe process of this Subscription.
     */
    void remove(Subscription subscription);
}
