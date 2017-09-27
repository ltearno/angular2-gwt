package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/Observable".Subscribable
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/Observable.d.ts:334
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Subscribable<T>
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(subscribe,348,,)
      * TE Signature : S(subscribe,)
      * 
     */
    AnonymousSubscription subscribe();
    /** 
      * Std Signature : S(subscribe,348,,P(d351<T->))
      * TE Signature : S(subscribe,P(d351))
      * 
     */
    AnonymousSubscription subscribe(CompletionObserver<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(CompletionObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    AnonymousSubscription subscribe(CompletionObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<T->))
      * TE Signature : S(subscribe,P(d352))
      * 
     */
    AnonymousSubscription subscribe(ErrorObserver<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(ErrorObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    AnonymousSubscription subscribe(ErrorObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<T->))
      * TE Signature : S(subscribe,P(d353))
      * 
     */
    AnonymousSubscription subscribe(NextObserver<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(NextObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    AnonymousSubscription subscribe(NextObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(Action1<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(Action1<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    AnonymousSubscription subscribe(Action1<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)))
      * 
     */
    AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)))
      * 
     */
    AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@374
     */
    AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
}
