package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification".Notification
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts:88
  * 1 constructors
  * Represents a push-based event or value that an {@link Observable} can emit.
  * This class is particularly useful for operators that manage notifications,
  * like {@link materialize}, {@link dematerialize}, {@link observeOn}, and
  * others. Besides wrapping the actual delivered value, it also annotates it
  * with metadata of, for instance, what type of push message it is (`next`,
  * `error`, or `complete`).
 */
@JsType(isNative=true, namespace="rxjs", name="Notification")
public class Notification<T>
{

    /*
        Constructors
    */
    public Notification(String kind, T value, Object error){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="rxjs.Notification", name="completeNotification")
    public static Object completeNotification;

    @JsProperty(namespace="rxjs.Notification", name="undefinedValueNotification")
    public static Object undefinedValueNotification;

    /*
        Static methods
    */
    /** 
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts:2573
     */
    @JsMethod(namespace="rxjs.Notification", name = "createNext")
    public static native <T> Notification<T> createNext(T value);
    /** 
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts:2878
     */
    @JsMethod(namespace="rxjs.Notification", name = "createError")
    public static native <T> Notification<T> createError(Object err /* optional */);
    /** 
      * A shortcut to create a Notification instance of the type `complete`.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts:3099
     */
    @JsMethod(namespace="rxjs.Notification", name = "createComplete")
    public static native <T> Notification<Object> createComplete();

    /*
        Properties
    */

    public Object error;

    @JsProperty( name = "error")
    public native Object getError();

    @JsProperty( name = "error")
    public native void setError( Object value );

    public Boolean hasValue;

    @JsProperty( name = "hasValue")
    public native Boolean getHasValue();

    @JsProperty( name = "hasValue")
    public native void setHasValue( Boolean value );

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(accept,3,,P(d351<T->))
      * TE Signature : S(accept,P(d351))
      * 
     */
    public native Object accept(CompletionObserver<T> nextOrObserver);
    /** 
      * Std Signature : S(accept,3,,P(d351<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(accept,P(d351),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(CompletionObserver<T> nextOrObserver, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(d351<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(accept,P(d351),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native Object accept(CompletionObserver<T> nextOrObserver, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(d352<T->))
      * TE Signature : S(accept,P(d352))
      * 
     */
    public native Object accept(ErrorObserver<T> nextOrObserver);
    /** 
      * Std Signature : S(accept,3,,P(d352<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(accept,P(d352),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(ErrorObserver<T> nextOrObserver, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(d352<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(accept,P(d352),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native Object accept(ErrorObserver<T> nextOrObserver, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(d353<T->))
      * TE Signature : S(accept,P(d353))
      * 
     */
    public native Object accept(NextObserver<T> nextOrObserver);
    /** 
      * Std Signature : S(accept,3,,P(d353<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(accept,P(d353),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(NextObserver<T> nextOrObserver, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(d353<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(accept,P(d353),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native Object accept(NextObserver<T> nextOrObserver, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(accept,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(Action1<T> nextOrObserver);
    /** 
      * Std Signature : S(accept,3,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(accept,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(Action1<T> nextOrObserver, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(accept,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native Object accept(Action1<T> nextOrObserver, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)))
      * TE Signature : S(accept,P(dU(-F--S(?,P(d3))------),351,352,353)))
      * 
     */
    public native Object accept(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> nextOrObserver);
    /** 
      * Std Signature : S(accept,3,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(accept,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object accept(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> nextOrObserver, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(accept,3,,P(dU(T-FP1--S(?,429,,P(d5))------)<T->,351<7>,352<7>,353<7>)),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(accept,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts@1918
      * Takes an Observer or its individual callback functions, and calls `observe`
      * or `do` methods accordingly.): void} nextOrObserver An Observer or
      * the `next` callback.): void} [error] An Observer `error` callback.
     */
    public native Object accept(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> nextOrObserver, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(do,3,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Object do_(Action1<T> next);
    /** 
      * Std Signature : S(do,3,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Object do_(Action1<T> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(do,3,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts@1408
      * Given some {@link Observer} callbacks, deliver the value represented by the
      * current Notification to the correctly corresponding callback.): void} next An Observer `next` callback.): void} [error] An Observer `error` callback.
     */
    @JsMethod(name = "do")
    public native Object do_(Action1<T> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(observe,3,,P(d351<T->))
      * TE Signature : S(observe,P(d351))
      * 
     */
    public native Object observe(CompletionObserver<T> observer);
    /** 
      * Std Signature : S(observe,3,,P(d352<T->))
      * TE Signature : S(observe,P(d352))
      * 
     */
    public native Object observe(ErrorObserver<T> observer);
    /** 
      * Std Signature : S(observe,3,,P(d353<T->))
      * TE Signature : S(observe,P(d353))
      * 
     */
    public native Object observe(NextObserver<T> observer);
    /** 
      * Std Signature : S(observe,3,,P(dU(T-351<T->,352<5>,353<5>)))
      * TE Signature : S(observe,P(dU(-351,352,353)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts@940
      * Delivers to the given `observer` the value wrapped by this Notification.
     */
    public native Object observe(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observer);
    /** 
      * Std Signature : S(toObservable,357<T->,,)
      * TE Signature : S(toObservable,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Notification.d.ts@2203
      * Returns a simple Observable that just delivers the notification represented
      * by this Notification instance.
     */
    public native Observable<T> toObservable();
}
