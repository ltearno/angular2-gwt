package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Event;
import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxSubscriber
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:3176
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxSubscriber")
public class AjaxSubscriber<T> extends Subscriber<Event>
{

    /*
        Constructors
    */
    public AjaxSubscriber(Subscriber<T> destination, AjaxRequest request){
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

    public Object done;

    @JsProperty( name = "done")
    public native Object getDone();

    @JsProperty( name = "done")
    public native void setDone( Object value );

    public AjaxRequest request;

    @JsProperty( name = "request")
    public native AjaxRequest getRequest();

    @JsProperty( name = "request")
    public native void setRequest( AjaxRequest value );

    public Object xhr;

    @JsProperty( name = "xhr")
    public native Object getXhr();

    @JsProperty( name = "xhr")
    public native void setXhr( Object value );

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
      * Std Signature : S(next,429,,P(d77))
      * TE Signature : S(next,P(d77))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@3468
     */
    public native void next(Event e);
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
      * Std Signature : S(send,3,,)
      * TE Signature : S(send,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@3494
     */
    public native Object send();
    /** 
      * Std Signature : S(serializeBody,3,,P(d3))
      * TE Signature : S(serializeBody,P(d3))
      * 
     */
    public native Object serializeBody(Object body);
    /** 
      * Std Signature : S(serializeBody,3,,P(d3),P(d3))
      * TE Signature : S(serializeBody,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@3514
     */
    public native Object serializeBody(Object body, Object contentType /* optional */);
    /** 
      * Std Signature : S(setHeaders,3,,P(d3),P(d3))
      * TE Signature : S(setHeaders,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@3561
     */
    public native Object setHeaders(Object xhr, Object headers);
    /** 
      * Std Signature : S(setupEvents,3,,P(d3),P(d3))
      * TE Signature : S(setupEvents,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts@3599
     */
    public native Object setupEvents(Object xhr, Object request);
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
