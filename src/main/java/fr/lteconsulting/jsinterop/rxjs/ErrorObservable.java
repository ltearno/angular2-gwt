package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT;
import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther;
import fr.lteconsulting.jsinterop.SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber;
import fr.lteconsulting.jsinterop.SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO;
import fr.lteconsulting.jsinterop.SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject;
import fr.lteconsulting.jsinterop.TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid;
import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.TupleOf3;
import fr.lteconsulting.jsinterop.TupleOf4;
import fr.lteconsulting.jsinterop.TupleOf5;
import fr.lteconsulting.jsinterop.TupleOf6;
import fr.lteconsulting.jsinterop.UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT;
import fr.lteconsulting.jsinterop.UnionOfArrayLikeOfTAndISchedulerAndNumberAndPromiseLikeOfTAndSubscribableOfT;
import fr.lteconsulting.jsinterop.UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT;
import fr.lteconsulting.jsinterop.UnionOfArrayOfObservableOfTAndObservableOfT;
import fr.lteconsulting.jsinterop.UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject;
import fr.lteconsulting.jsinterop.UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT;
import fr.lteconsulting.jsinterop.browser.AnonymousType922;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.ArrayLike;
import fr.lteconsulting.jsinterop.browser.Date;
import fr.lteconsulting.jsinterop.browser.Promise;
import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.browser.UnionOfDateAndNumber;
import fr.lteconsulting.jsinterop.browser.UnionOfRAndT;
import fr.lteconsulting.jsinterop.browser.UnionOfTAndT2;
import fr.lteconsulting.jsinterop.browser.UnionOfTAndT2AndT3;
import fr.lteconsulting.jsinterop.browser.UnionOfTAndT2AndT3AndT4;
import fr.lteconsulting.jsinterop.browser.UnionOfTAndT2AndT3AndT4AndT5;
import fr.lteconsulting.jsinterop.browser.UnionOfTAndT2AndT3AndT4AndT5AndT6;
import fr.lteconsulting.jsinterop.factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function3;
import fr.lteconsulting.prebuilt.Function4;
import fr.lteconsulting.prebuilt.Function5;
import fr.lteconsulting.prebuilt.Function6;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/ErrorObservable".ErrorObservable
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/ErrorObservable.d.ts:249
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="ErrorObservable")
public class ErrorObservable implements Observable<Object>
{

    /*
        Constructors
    */
    public ErrorObservable(Object error, IScheduler scheduler){
    }

    /*
        Static methods
    */
    /** 
      * Creates an Observable that emits no items to the Observer and immediately
      * emits an error notification.
      * 
      * <span class="informal">Just emits 'error', and nothing else.
      * </span>
      * 
      * <img src="./img/throw.png" width="100%">
      * 
      * This static operator is useful for creating a simple Observable that only
      * emits the error notification. It can be used for composing with other
      * Observables, such as in a {@link mergeMap}.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/ErrorObservable.d.ts:2095
     */
    @JsMethod(namespace="rxjs.ErrorObservable", name = "create")
    public static native ErrorObservable create(Object error, IScheduler scheduler /* optional */);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/ErrorObservable.d.ts:2167
     */
    @JsMethod(namespace="rxjs.ErrorObservable", name = "dispatch")
    public static native void dispatch(DispatchArg arg);

    /*
        Properties
    */

    public Boolean _isScalar;

    @JsProperty( name = "_isScalar")
    public native Boolean get_isScalar();

    @JsProperty( name = "_isScalar")
    public native void set_isScalar( Boolean value );

    public Object error;

    @JsProperty( name = "error")
    public native Object getError();

    @JsProperty( name = "error")
    public native void setError( Object value );

    public AnonymousType922 onErrorResumeNext;

    @JsProperty( name = "onErrorResumeNext")
    public native AnonymousType922 getOnErrorResumeNext();

    @JsProperty( name = "onErrorResumeNext")
    public native void setOnErrorResumeNext( AnonymousType922 value );

    public Operator<Object, Object> operator;

    @JsProperty( name = "operator")
    public native Operator<Object, Object> getOperator();

    @JsProperty( name = "operator")
    public native void setOperator( Operator<Object, Object> value );

    public Object scheduler;

    @JsProperty( name = "scheduler")
    public native Object getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( Object value );

    public Observable<Object> source;

    @JsProperty( name = "source")
    public native Observable<Object> getSource();

    @JsProperty( name = "source")
    public native void setSource( Observable<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_catch,357<U(3,R-R-,6)>,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,357<7>,U(R-5<R->,16<15>,358<15>)>))
      * TE Signature : S(_catch,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<UnionOfRAndT<Object, R>> _catch(Function2<Object, Observable<Object>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
    /** 
      * Std Signature : S(_do,357<3>,,P(d351<3>))
      * TE Signature : S(_do,P(d351))
      * 
     */
    public native Observable<Object> _do(CompletionObserver<Object> observer);
    /** 
      * Std Signature : S(_do,357<3>,,P(d352<3>))
      * TE Signature : S(_do,P(d352))
      * 
     */
    public native Observable<Object> _do(ErrorObserver<Object> observer);
    /** 
      * Std Signature : S(_do,357<3>,,P(d353<3>))
      * TE Signature : S(_do,P(d353))
      * 
     */
    public native Observable<Object> _do(NextObserver<Object> observer);
    /** 
      * Std Signature : S(_do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Object> _do(Action1<Object> next);
    /** 
      * Std Signature : S(_do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Object> _do(Action1<Object> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(_do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> _do(Action1<Object> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(_do,357<3>,,P(dU(3351<4>,352<7>,353<7>)))
      * TE Signature : S(_do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> _do(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observer);
    /** 
      * Std Signature : S(_finally,357<3>,,P(dF--S(?,429,,)------)))
      * TE Signature : S(_finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> _finally(Action callback);
    /** 
      * Std Signature : S(_subscribe,U(-348,205,349),,P(d354<3>))
      * TE Signature : S(_subscribe,P(d354))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid _subscribe(Subscriber<Object> subscriber);
    /** 
      * Std Signature : S(_switch,3,,)
      * TE Signature : S(_switch,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object _switch();
    /** 
      * Std Signature : S(_trySubscribe,U(-348,205,349),,P(d354<3>))
      * TE Signature : S(_trySubscribe,P(d354))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid _trySubscribe(Subscriber<Object> sink);
    /** 
      * Std Signature : S(audit,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,U(-16<7>,358<7>)>))
      * TE Signature : S(audit,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> audit(Function1<Object, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> durationSelector);
    /** 
      * Std Signature : S(auditTime,357<3>,,P(d2))
      * TE Signature : S(auditTime,P(d2))
      * 
     */
    public native Observable<Object> auditTime(Number duration);
    /** 
      * Std Signature : S(auditTime,357<3>,,P(d2),P(d356))
      * TE Signature : S(auditTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> auditTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(buffer,357<7<3>>,,P(d357<3>))
      * TE Signature : S(buffer,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> buffer(Observable<Object> closingNotifier);
    /** 
      * Std Signature : S(bufferCount,357<7<3>>,,P(d2))
      * TE Signature : S(bufferCount,P(d2))
      * 
     */
    public native Observable<Array<Object>> bufferCount(Number bufferSize);
    /** 
      * Std Signature : S(bufferCount,357<7<3>>,,P(d2),P(d2))
      * TE Signature : S(bufferCount,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> bufferCount(Number bufferSize, Number startBufferEvery /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2))
      * TE Signature : S(bufferTime,P(d2))
      * 
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2))
      * 
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2),P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<3>>,,P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> bufferTime(Number bufferTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferToggle,357<7<3>>,O-,P(d16<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(d16),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<Object>> bufferToggle(PromiseLike<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<3>>,O-,P(d358<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(d358),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<Object>> bufferToggle(Subscribable<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<3>>,O-,P(dU(O-16<O->,358<6>)),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(dU(-16,358)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <O> Observable<Array<Object>> bufferToggle(SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferWhen,357<7<3>>,,P(dFR--S(?,4,,)------)<357<3>>))
      * TE Signature : S(bufferWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> bufferWhen(Function<Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(catch,357<U(3,R-R-,6)>,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,357<7>,U(R-5<R->,16<15>,358<15>)>))
      * TE Signature : S(catch,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "catch")
    public native <R> Observable<UnionOfRAndT<Object, R>> catch_(Function2<Object, Observable<Object>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
    /** 
      * Std Signature : S(combineAll,357<R->,R-,)
      * TE Signature : S(combineAll,)
      * 
     */
    public native <R> Observable<R> combineAll();
    /** 
      * Std Signature : S(combineAll,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(combineAll,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> combineAll(Function1<Object, R> project /* optional */);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,)
      * TE Signature : S(combineLatest,)
      * 
     */
    public native <R> Observable<R> combineLatest();
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D16<3>))
      * TE Signature : S(combineLatest,P(D16))
      * 
     */
    public native <R> Observable<R> combineLatest(PromiseLike<Object>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D358<3>))
      * TE Signature : S(combineLatest,P(D358))
      * 
     */
    public native <R> Observable<R> combineLatest(Subscribable<Object>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D5<3>))
      * TE Signature : S(combineLatest,P(D5))
      * 
     */
    public native <R> Observable<R> combineLatest(ArrayLike<Object>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(combineLatest,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> combineLatest(Function1<Object, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DU(3,R-FP1-,R--S(?,9,,P(d8))------)<4,R->,5<10>,16<10>,358<10>)))
      * TE Signature : S(combineLatest,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> combineLatest(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<25<3,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(combineLatest,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> combineLatest(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(combineLatest,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(PromiseLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<3,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(combineLatest,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> combineLatest(Subscribable<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(combineLatest,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(Subscribable<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<3,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(combineLatest,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> combineLatest(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(combineLatest,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(ArrayLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<7<3>>,R-,P(d7<U(35<6>,16<9>,358<9>)>))
      * TE Signature : S(combineLatest,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<Array<Object>> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object>> array);
    /** 
      * Std Signature : S(combineLatest,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<8>,358<8>)>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,TOther-,R->))
      * TE Signature : S(combineLatest,P(d7),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <TOther, R> Observable<R> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<Object, TOther, R> project);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(combineLatest,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> combineLatest(Function1<Object, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<3,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Object, T2>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<24<3,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Object, T2, T3>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,T2-,T3-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Object, T2, T3, R> project);
    /** 
      * Std Signature : S(combineLatest,357<23<3,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Object, T2, T3, T4>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,T2-,T3-,T4-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Object, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(combineLatest,357<22<3,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Object, T2, T3, T4, T5>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<3,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Object, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(combineLatest,357<21<3,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Object, T2, T3, T4, T5, T6>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<3,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Object, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(concat,357<3>,,)
      * TE Signature : S(concat,)
      * 
     */
    public native Observable<Object> concat();
    /** 
      * Std Signature : S(concat,357<3>,,P(D16<3>))
      * TE Signature : S(concat,P(D16))
      * 
     */
    public native Observable<Object> concat(PromiseLike<Object>... observables);
    /** 
      * Std Signature : S(concat,357<3>,,P(D356))
      * TE Signature : S(concat,P(D356))
      * 
     */
    public native Observable<Object> concat(IScheduler... observables);
    /** 
      * Std Signature : S(concat,357<3>,,P(D358<3>))
      * TE Signature : S(concat,P(D358))
      * 
     */
    public native Observable<Object> concat(Subscribable<Object>... observables);
    /** 
      * Std Signature : S(concat,357<3>,,P(D5<3>))
      * TE Signature : S(concat,P(D5))
      * 
     */
    public native Observable<Object> concat(ArrayLike<Object>... observables);
    /** 
      * Std Signature : S(concat,357<3>,,P(DU(35<4>,356,16<7>,358<7>)))
      * TE Signature : S(concat,P(DU(-5,356,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> concat(UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<Object>... observables);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(concat,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(concat,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<3>,,P(d356))
      * TE Signature : S(concat,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> concat(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(concat,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(Subscribable<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(concat,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(concat,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(concat,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(concat,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concatAll,3,,)
      * TE Signature : S(concatAll,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object concatAll();
    /** 
      * Std Signature : S(concatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> concatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(concatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> concatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(concatMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> concatMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(concatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(concatMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> concatMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(concatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(concatMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> concatMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(concatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)))
      * TE Signature : S(concatMapTo,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> concatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(concatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> concatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(count,357<2>,,)
      * TE Signature : S(count,)
      * 
     */
    public native Observable<Number> count();
    /** 
      * Std Signature : S(count,357<2>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(count,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> count(Function3<Object, Number, Observable<Object>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(debounce,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,U(-16<2>,358<11>)>))
      * TE Signature : S(debounce,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> debounce(Function1<Object, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(debounceTime,357<3>,,P(d2))
      * TE Signature : S(debounceTime,P(d2))
      * 
     */
    public native Observable<Object> debounceTime(Number dueTime);
    /** 
      * Std Signature : S(debounceTime,357<3>,,P(d2),P(d356))
      * TE Signature : S(debounceTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> debounceTime(Number dueTime, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(defaultIfEmpty,357<3>,,)
      * TE Signature : S(defaultIfEmpty,)
      * 
     */
    public native Observable<Object> defaultIfEmpty();
    /** 
      * Std Signature : S(defaultIfEmpty,357<3>,,P(d3))
      * TE Signature : S(defaultIfEmpty,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> defaultIfEmpty(Object defaultValue /* optional */);
    /** 
      * Std Signature : S(delay,357<3>,,P(d13))
      * TE Signature : S(delay,P(d13))
      * 
     */
    public native Observable<Object> delay(Date delay);
    /** 
      * Std Signature : S(delay,357<3>,,P(d13),P(d356))
      * TE Signature : S(delay,P(d13),P(d356))
      * 
     */
    public native Observable<Object> delay(Date delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<3>,,P(d2))
      * TE Signature : S(delay,P(d2))
      * 
     */
    public native Observable<Object> delay(Number delay);
    /** 
      * Std Signature : S(delay,357<3>,,P(d2),P(d356))
      * TE Signature : S(delay,P(d2),P(d356))
      * 
     */
    public native Observable<Object> delay(Number delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<3>,,P(dU(-13,2)))
      * TE Signature : S(delay,P(dU(-13,2)))
      * 
     */
    public native Observable<Object> delay(UnionOfDateAndNumber delay);
    /** 
      * Std Signature : S(delay,357<3>,,P(dU(-13,2)),P(d356))
      * TE Signature : S(delay,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> delay(UnionOfDateAndNumber delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delayWhen,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,357<7>>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Object> delayWhen(Function1<Object, Observable<Object>> delayDurationSelector);
    /** 
      * Std Signature : S(delayWhen,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,357<7>>),P(d357<3>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> delayWhen(Function1<Object, Observable<Object>> delayDurationSelector, Observable<Object> subscriptionDelay /* optional */);
    /** 
      * Std Signature : S(dematerialize,357<3>,,)
      * TE Signature : S(dematerialize,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> dematerialize();
    /** 
      * Std Signature : S(distinct,357<3>,K-,)
      * TE Signature : S(distinct,)
      * 
     */
    public native <K> Observable<Object> distinct();
    /** 
      * Std Signature : S(distinct,357<3>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K> Observable<Object> distinct(Function1<Object, K> keySelector /* optional */);
    /** 
      * Std Signature : S(distinct,357<3>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->),P(d357<3>))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Object> distinct(Function1<Object, K> keySelector /* optional */, Observable<Object> flushes /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<3>,,)
      * TE Signature : S(distinctUntilChanged,)
      * 
     */
    public native Observable<Object> distinctUntilChanged();
    /** 
      * Std Signature : S(distinctUntilChanged,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,7,27>))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> distinctUntilChanged(Function2<Object, Object, Boolean> compare /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<3>,K-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<K-,7,27>),P(dFP1-,R--S(?,5,,P(d4))------)<3,K->))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Object> distinctUntilChanged(Function2<K, K, Boolean> compare, Function1<Object, K> keySelector);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<3>,,P(d1))
      * TE Signature : S(distinctUntilKeyChanged,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> distinctUntilKeyChanged(String key);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<3>,K-,P(d1),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<K-,7,27>))
      * TE Signature : S(distinctUntilKeyChanged,P(d1),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Object> distinctUntilKeyChanged(String key, Function2<K, K, Boolean> compare);
    /** 
      * Std Signature : S(do,357<3>,,P(d351<3>))
      * TE Signature : S(do,P(d351))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(CompletionObserver<Object> observer);
    /** 
      * Std Signature : S(do,357<3>,,P(d352<3>))
      * TE Signature : S(do,P(d352))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(ErrorObserver<Object> observer);
    /** 
      * Std Signature : S(do,357<3>,,P(d353<3>))
      * TE Signature : S(do,P(d353))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(NextObserver<Object> observer);
    /** 
      * Std Signature : S(do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(Action1<Object> next);
    /** 
      * Std Signature : S(do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(Action1<Object> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(do,357<3>,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(Action1<Object> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(do,357<3>,,P(dU(3351<4>,352<7>,353<7>)))
      * TE Signature : S(do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "do")
    public native Observable<Object> do_(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observer);
    /** 
      * Std Signature : S(elementAt,357<3>,,P(d2))
      * TE Signature : S(elementAt,P(d2))
      * 
     */
    public native Observable<Object> elementAt(Number index);
    /** 
      * Std Signature : S(elementAt,357<3>,,P(d2),P(d3))
      * TE Signature : S(elementAt,P(d2),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> elementAt(Number index, Object defaultValue /* optional */);
    /** 
      * Std Signature : S(every,357<27>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(every,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Boolean> every(Function3<Object, Number, Observable<Object>, Boolean> predicate);
    /** 
      * Std Signature : S(exhaust,357<3>,,)
      * TE Signature : S(exhaust,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> exhaust();
    /** 
      * Std Signature : S(exhaustMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> exhaustMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(exhaustMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> exhaustMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(expand,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,357<7>>))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native Observable<Object> expand(Function2<Object, Number, Observable<Object>> project);
    /** 
      * Std Signature : S(expand,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,357<7>>),P(d2))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    public native Observable<Object> expand(Function2<Object, Number, Observable<Object>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(expand,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,357<7>>),P(d2),P(d356))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> expand(Function2<Object, Number, Observable<Object>> project, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(filter,357<S->,S-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,27>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> filter(Function2<Object, Number, Boolean> predicate);
    /** 
      * Std Signature : S(finally,357<3>,,P(dF--S(?,429,,)------)))
      * TE Signature : S(finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "finally")
    public native Observable<Object> finally_(Action callback);
    /** 
      * Std Signature : S(find,357<S->,S-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> find(Function2<Object, Number, Boolean> predicate);
    /** 
      * Std Signature : S(findIndex,357<2>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> findIndex(Function3<Object, Number, Observable<Object>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> first(Function3<Object, Number, Observable<Object>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(d349))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349))
      * 
     */
    public native <S> Observable<S> first(Function3<Object, Number, Observable<Object>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(d349),P(dS-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> first(Function3<Object, Number, Observable<Object>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,R->))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> first(Function3<Object, Number, Observable<Object>, Boolean> predicate, Function2<Object, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,R->),P(dR-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> first(Function3<Object, Number, Observable<Object>, Boolean> predicate, Function2<Object, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> flatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> flatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> flatMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(flatMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> flatMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d16<R->),P(d2))
      * TE Signature : S(flatMapTo,P(d16),P(d2))
      * 
     */
    public native <R> Observable<R> flatMapTo(PromiseLike<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(flatMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> flatMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d358<R->),P(d2))
      * TE Signature : S(flatMapTo,P(d358),P(d2))
      * 
     */
    public native <R> Observable<R> flatMapTo(Subscribable<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(flatMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> flatMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(d5<R->),P(d2))
      * TE Signature : S(flatMapTo,P(d5),P(d2))
      * 
     */
    public native <R> Observable<R> flatMapTo(ArrayLike<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)))
      * 
     */
    public native <R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)),P(d2))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Promise<Void> forEach(Action1<Object> next);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d4))------)<3>),P(d3))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Void> forEach(Action1<Object> next, Object PromiseCtor /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,3>>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<GroupedObservable<K, Object>> groupBy(Function1<Object, K> keySelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,3>>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->),P(d349),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,3>,357<10>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(d349),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<GroupedObservable<K, Object>> groupBy(Function1<Object, K> keySelector, Void elementSelector, Function1<GroupedObservable<K, Object>, Observable<Object>> durationSelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->),P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Object, K> keySelector, Function1<Object, R> elementSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->),P(dFP1-,R--S(?,5,,P(d4))------)<3,R->),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,R->,357<3>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Object, K> keySelector, Function1<Object, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,K->),P(dFP1-,R--S(?,5,,P(d4))------)<3,R->),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,R->,357<3>>),P(dFR--S(?,4,,)------)<359<R->>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Object, K> keySelector, Function1<Object, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */, Function<Subject<R>> subjectSelector /* optional */);
    /** 
      * Std Signature : S(ignoreElements,357<3>,,)
      * TE Signature : S(ignoreElements,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> ignoreElements();
    /** 
      * Std Signature : S(isEmpty,357<27>,,)
      * TE Signature : S(isEmpty,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Boolean> isEmpty();
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> last(Function3<Object, Number, Observable<Object>, Boolean> predicate);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(d349))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349))
      * 
     */
    public native <S> Observable<S> last(Function3<Object, Number, Observable<Object>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(d349),P(dS-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> last(Function3<Object, Number, Observable<Object>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,R->))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> last(Function3<Object, Number, Observable<Object>, Boolean> predicate, Function2<Object, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,R->),P(dR-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> last(Function3<Object, Number, Observable<Object>, Boolean> predicate, Function2<Object, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(let,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,7<R->>))
      * TE Signature : S(let,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> let(Function1<Observable<Object>, Observable<R>> func);
    /** 
      * Std Signature : S(letBind,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,7<R->>))
      * TE Signature : S(letBind,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> letBind(Function1<Observable<Object>, Observable<R>> func);
    /** 
      * Std Signature : S(lift,357<R->,R-,P(d355<3,R->))
      * TE Signature : S(lift,P(d355))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> lift(Operator<Object, R> operator);
    /** 
      * Std Signature : S(map,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,R->))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> map(Function2<Object, Number, R> project);
    /** 
      * Std Signature : S(mapTo,357<R->,R-,P(dR-))
      * TE Signature : S(mapTo,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mapTo(R value);
    /** 
      * Std Signature : S(materialize,357<708<3>>,,)
      * TE Signature : S(materialize,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Notification<Object>> materialize();
    /** 
      * Std Signature : S(max,357<3>,,)
      * TE Signature : S(max,)
      * 
     */
    public native Observable<Object> max();
    /** 
      * Std Signature : S(max,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,7,2>))
      * TE Signature : S(max,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> max(Function2<Object, Object, Number> comparer /* optional */);
    /** 
      * Std Signature : S(merge,357<3>,,)
      * TE Signature : S(merge,)
      * 
     */
    public native Observable<Object> merge();
    /** 
      * Std Signature : S(merge,357<3>,,P(D16<3>))
      * TE Signature : S(merge,P(D16))
      * 
     */
    public native Observable<Object> merge(PromiseLike<Object>... observables);
    /** 
      * Std Signature : S(merge,357<3>,,P(D2))
      * TE Signature : S(merge,P(D2))
      * 
     */
    public native Observable<Object> merge(Number... observables);
    /** 
      * Std Signature : S(merge,357<3>,,P(D356))
      * TE Signature : S(merge,P(D356))
      * 
     */
    public native Observable<Object> merge(IScheduler... observables);
    /** 
      * Std Signature : S(merge,357<3>,,P(D358<3>))
      * TE Signature : S(merge,P(D358))
      * 
     */
    public native Observable<Object> merge(Subscribable<Object>... observables);
    /** 
      * Std Signature : S(merge,357<3>,,P(D5<3>))
      * TE Signature : S(merge,P(D5))
      * 
     */
    public native Observable<Object> merge(ArrayLike<Object>... observables);
    /** 
      * Std Signature : S(merge,357<3>,,P(DU(35<4>,356,2,16<7>,358<7>)))
      * TE Signature : S(merge,P(DU(-5,356,2,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> merge(UnionOfArrayLikeOfTAndISchedulerAndNumberAndPromiseLikeOfTAndSubscribableOfT<Object>... observables);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(merge,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->),P(d2))
      * TE Signature : S(merge,P(d16),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d16),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(merge,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<3>,,P(d2))
      * TE Signature : S(merge,P(d2))
      * 
     */
    public native Observable<Object> merge(Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<3>,,P(d2),P(d356))
      * TE Signature : S(merge,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> merge(Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<3>,,P(d356))
      * TE Signature : S(merge,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> merge(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(merge,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(Subscribable<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->),P(d2))
      * TE Signature : S(merge,P(d358),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d358),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(merge,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(merge,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->),P(d2))
      * TE Signature : S(merge,P(d5),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d5),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(merge,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Object, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Object, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Object, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Object, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(3,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Object, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(mergeAll,3,,)
      * TE Signature : S(mergeAll,)
      * 
     */
    public native Object mergeAll();
    /** 
      * Std Signature : S(mergeAll,3,,P(d2))
      * TE Signature : S(mergeAll,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object mergeAll(Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> mergeMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mergeMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> mergeMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(mergeMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> mergeMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d16<R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d16),P(d2))
      * 
     */
    public native <R> Observable<R> mergeMapTo(PromiseLike<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(mergeMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> mergeMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d358<R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d358),P(d2))
      * 
     */
    public native <R> Observable<R> mergeMapTo(Subscribable<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(mergeMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> mergeMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(d5<R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d5),P(d2))
      * 
     */
    public native <R> Observable<R> mergeMapTo(ArrayLike<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)))
      * 
     */
    public native <R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)),P(d2))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<R-,3,357<7>>),P(dR-))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    public native <R> Observable<R> mergeScan(Function2<R, Object, Observable<R>> accumulator, R seed);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<R-,3,357<7>>),P(dR-),P(d2))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d5))------)),P(d3),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mergeScan(Function2<R, Object, Observable<R>> accumulator, R seed, Number concurrent /* optional */);
    /** 
      * Std Signature : S(min,357<3>,,)
      * TE Signature : S(min,)
      * 
     */
    public native Observable<Object> min();
    /** 
      * Std Signature : S(min,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,7,2>))
      * TE Signature : S(min,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> min(Function2<Object, Object, Number> comparer /* optional */);
    /** 
      * Std Signature : S(multicast,825<3>,,P(d359<3>))
      * TE Signature : S(multicast,P(d359))
      * 
     */
    public native ConnectableObservable<Object> multicast(Subject<Object> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,825<3>,,P(dFR--S(?,4,,)------)<359<3>>))
      * TE Signature : S(multicast,P(dF--S(?,)------)))
      * 
     */
    public native ConnectableObservable<Object> multicast(Function<Subject<Object>> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,357<3>,,P(dFR--S(?,4,,)------)<359<3>>),P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,7<9>>))
      * TE Signature : S(multicast,P(dF--S(?,)------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> multicast(Function<Subject<Object>> SubjectFactory, Function1<Observable<Object>, Observable<Object>> selector /* optional */);
    /** 
      * Std Signature : S(multicast,825<3>,,P(dU(3FR--S(?,7,,)------)<359<4>>,8)))
      * TE Signature : S(multicast,P(dU(-F--S(?,)------),359)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Object> multicast(factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<Object> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(observeOn,357<3>,,P(d356))
      * TE Signature : S(observeOn,P(d356))
      * 
     */
    public native Observable<Object> observeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(observeOn,357<3>,,P(d356),P(d2))
      * TE Signature : S(observeOn,P(d356),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> observeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(pairwise,357<25<3,6>>,,)
      * TE Signature : S(pairwise,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Tuple<Object, Object>> pairwise();
    /** 
      * Std Signature : S(partition,25<357<3>,4>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,27>))
      * TE Signature : S(partition,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Tuple<Observable<Object>, Observable<Object>> partition(Function1<Object, Boolean> predicate);
    /** 
      * Std Signature : S(pluck,357<R->,R-,)
      * TE Signature : S(pluck,)
      * 
     */
    public native <R> Observable<R> pluck();
    /** 
      * Std Signature : S(pluck,357<R->,R-,P(D1))
      * TE Signature : S(pluck,P(D1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> pluck(String... properties);
    /** 
      * Std Signature : S(publish,825<3>,,)
      * TE Signature : S(publish,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Object> publish();
    /** 
      * Std Signature : S(publish,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,7<9>>))
      * TE Signature : S(publish,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> publish(Function1<Observable<Object>, Observable<Object>> selector);
    /** 
      * Std Signature : S(publishBehavior,825<3>,,P(d3))
      * TE Signature : S(publishBehavior,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Object> publishBehavior(Object value);
    /** 
      * Std Signature : S(publishLast,825<3>,,)
      * TE Signature : S(publishLast,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Object> publishLast();
    /** 
      * Std Signature : S(publishReplay,825<3>,,)
      * TE Signature : S(publishReplay,)
      * 
     */
    public native ConnectableObservable<Object> publishReplay();
    /** 
      * Std Signature : S(publishReplay,825<3>,,P(d2))
      * TE Signature : S(publishReplay,P(d2))
      * 
     */
    public native ConnectableObservable<Object> publishReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<3>,,P(d2),P(d2))
      * TE Signature : S(publishReplay,P(d2),P(d2))
      * 
     */
    public native ConnectableObservable<Object> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<3>,,P(d2),P(d2),P(d356))
      * TE Signature : S(publishReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Object> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(race,357<3>,,)
      * TE Signature : S(race,)
      * 
     */
    public native Observable<Object> race();
    /** 
      * Std Signature : S(race,357<3>,,P(D357<3>))
      * TE Signature : S(race,P(D357))
      * 
     */
    public native Observable<Object> race(Observable<Object>... observables);
    /** 
      * Std Signature : S(race,357<3>,,P(D7<357<3>>))
      * TE Signature : S(race,P(D7))
      * 
     */
    public native Observable<Object> race(Array<Observable<Object>>... observables);
    /** 
      * Std Signature : S(race,357<3>,,P(DU(37<357<4>>,7)))
      * TE Signature : S(race,P(DU(-7,357)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> race(UnionOfArrayOfObservableOfTAndObservableOfT<Object>... observables);
    /** 
      * Std Signature : S(race,357<3>,,P(d7<357<3>>))
      * TE Signature : S(race,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> race(Array<Observable<Object>> observables);
    /** 
      * Std Signature : S(reduce,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,3,2,8>),P(dR-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> reduce(Function3<R, Object, Number, R> accumulator, R seed);
    /** 
      * Std Signature : S(reduce,357<7<3>>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<7<3>,10,2,8>),P(d7<3>))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> reduce(Function3<Array<Object>, Object, Number, Array<Object>> accumulator, Array<Object> seed);
    /** 
      * Std Signature : S(repeat,357<3>,,)
      * TE Signature : S(repeat,)
      * 
     */
    public native Observable<Object> repeat();
    /** 
      * Std Signature : S(repeat,357<3>,,P(d2))
      * TE Signature : S(repeat,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> repeat(Number count /* optional */);
    /** 
      * Std Signature : S(repeatWhen,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,6>))
      * TE Signature : S(repeatWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> repeatWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(retry,357<3>,,)
      * TE Signature : S(retry,)
      * 
     */
    public native Observable<Object> retry();
    /** 
      * Std Signature : S(retry,357<3>,,P(d2))
      * TE Signature : S(retry,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> retry(Number count /* optional */);
    /** 
      * Std Signature : S(retryWhen,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,6>))
      * TE Signature : S(retryWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> retryWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(sample,357<3>,,P(d357<3>))
      * TE Signature : S(sample,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> sample(Observable<Object> notifier);
    /** 
      * Std Signature : S(sampleTime,357<3>,,P(d2))
      * TE Signature : S(sampleTime,P(d2))
      * 
     */
    public native Observable<Object> sampleTime(Number period);
    /** 
      * Std Signature : S(sampleTime,357<3>,,P(d2),P(d356))
      * TE Signature : S(sampleTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> sampleTime(Number period, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,3,2,8>))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    public native <R> Observable<R> scan(Function3<R, Object, Number, R> accumulator);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,3,2,8>),P(dR-))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> scan(Function3<R, Object, Number, R> accumulator, R seed /* optional */);
    /** 
      * Std Signature : S(scan,357<7<3>>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<7<3>,10,2,8>),P(d7<3>))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> scan(Function3<Array<Object>, Object, Number, Array<Object>> accumulator, Array<Object> seed /* optional */);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<3>))
      * TE Signature : S(sequenceEqual,P(d357))
      * 
     */
    public native Observable<Boolean> sequenceEqual(Observable<Object> compareTo);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<3>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,7,27>))
      * TE Signature : S(sequenceEqual,P(d357),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Boolean> sequenceEqual(Observable<Object> compareTo, Function2<Object, Object, Boolean> comparor /* optional */);
    /** 
      * Std Signature : S(share,357<3>,,)
      * TE Signature : S(share,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> share();
    /** 
      * Std Signature : S(shareReplay,357<3>,,)
      * TE Signature : S(shareReplay,)
      * 
     */
    public native Observable<Object> shareReplay();
    /** 
      * Std Signature : S(shareReplay,357<3>,,P(d2))
      * TE Signature : S(shareReplay,P(d2))
      * 
     */
    public native Observable<Object> shareReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<3>,,P(d2),P(d2))
      * TE Signature : S(shareReplay,P(d2),P(d2))
      * 
     */
    public native Observable<Object> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<3>,,P(d2),P(d2),P(d356))
      * TE Signature : S(shareReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(single,357<3>,,)
      * TE Signature : S(single,)
      * 
     */
    public native Observable<Object> single();
    /** 
      * Std Signature : S(single,357<3>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,2,357<8>,27>))
      * TE Signature : S(single,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> single(Function3<Object, Number, Observable<Object>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(skip,357<3>,,P(d2))
      * TE Signature : S(skip,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> skip(Number count);
    /** 
      * Std Signature : S(skipLast,357<3>,,P(d2))
      * TE Signature : S(skipLast,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> skipLast(Number count);
    /** 
      * Std Signature : S(skipUntil,357<3>,,P(d357<3>))
      * TE Signature : S(skipUntil,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> skipUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(skipWhile,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,27>))
      * TE Signature : S(skipWhile,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> skipWhile(Function2<Object, Number, Boolean> predicate);
    /** 
      * Std Signature : S(startWith,357<3>,,)
      * TE Signature : S(startWith,)
      * 
     */
    public native Observable<Object> startWith();
    /** 
      * Std Signature : S(startWith,357<3>,,P(D3))
      * TE Signature : S(startWith,P(D3))
      * 
     */
    public native Observable<Object> startWith(Object... array);
    /** 
      * Std Signature : S(startWith,357<3>,,P(D356))
      * TE Signature : S(startWith,P(D356))
      * 
     */
    public native Observable<Object> startWith(IScheduler... array);
    /** 
      * Std Signature : S(startWith,357<3>,,P(DU(3356,4)))
      * TE Signature : S(startWith,P(DU(-356,3)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(UnionOfISchedulerAndT<Object>... array);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3))
      * TE Signature : S(startWith,P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3))
      * TE Signature : S(startWith,P(d3),P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1, Object v2);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4, Object v5);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4, Object v5, Object v6);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4, Object v5, Object v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4, Object v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, Object v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, Object v2, Object v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, Object v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<3>,,P(d3),P(d356))
      * TE Signature : S(startWith,P(d3),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> startWith(Object v1, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,)
      * TE Signature : S(subscribe,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription subscribe();
    /** 
      * Std Signature : S(subscribe,350,,P(d351<3>))
      * TE Signature : S(subscribe,P(d351))
      * 
     */
    public native Subscription subscribe(CompletionObserver<Object> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d352<3>))
      * TE Signature : S(subscribe,P(d352))
      * 
     */
    public native Subscription subscribe(ErrorObserver<Object> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d353<3>))
      * TE Signature : S(subscribe,P(d353))
      * 
     */
    public native Subscription subscribe(NextObserver<Object> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<Object> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<Object> next /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<Object> next /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<3>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription subscribe(Action1<Object> next /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dU(3351<4>,352<7>,353<7>)))
      * TE Signature : S(subscribe,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription subscribe(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(3FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(3FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(3FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Object> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribeOn,357<3>,,P(d356))
      * TE Signature : S(subscribeOn,P(d356))
      * 
     */
    public native Observable<Object> subscribeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(subscribeOn,357<3>,,P(d356),P(d2))
      * TE Signature : S(subscribeOn,P(d356),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> subscribeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(switch,3,,)
      * TE Signature : S(switch,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "switch")
    public native Object switch_();
    /** 
      * Std Signature : S(switchMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> switchMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(switchMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,U(I-5<I->,16<14>,358<14>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> switchMap(Function2<Object, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(switchMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> switchMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(switchMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(PromiseLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(switchMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> switchMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(switchMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(Subscribable<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(switchMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> switchMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(switchMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(ArrayLike<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(dU(R-5<R->,16<6>,358<6>)))
      * TE Signature : S(switchMapTo,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> switchMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,I-,2,12,R->))
      * TE Signature : S(switchMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> switchMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Object, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(take,357<3>,,P(d2))
      * TE Signature : S(take,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> take(Number count);
    /** 
      * Std Signature : S(takeLast,357<3>,,P(d2))
      * TE Signature : S(takeLast,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> takeLast(Number count);
    /** 
      * Std Signature : S(takeUntil,357<3>,,P(d357<3>))
      * TE Signature : S(takeUntil,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> takeUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(takeWhile,357<3>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,2,27>))
      * TE Signature : S(takeWhile,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> takeWhile(Function2<Object, Number, Boolean> predicate);
    /** 
      * Std Signature : S(throttle,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,U(-16<2>,358<11>)>))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Object> throttle(Function1<Object, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(throttle,357<3>,,P(dFP1-,R--S(?,5,,P(d4))------)<3,U(-16<2>,358<11>)>),P(d362))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)),P(d362))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> throttle(Function1<Object, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<3>,,P(d2))
      * TE Signature : S(throttleTime,P(d2))
      * 
     */
    public native Observable<Object> throttleTime(Number duration);
    /** 
      * Std Signature : S(throttleTime,357<3>,,P(d2),P(d356))
      * TE Signature : S(throttleTime,P(d2),P(d356))
      * 
     */
    public native Observable<Object> throttleTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<3>,,P(d2),P(d356),P(d362))
      * TE Signature : S(throttleTime,P(d2),P(d356),P(d362))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> throttleTime(Number duration, IScheduler scheduler /* optional */, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(timeInterval,357<826<3>>,,)
      * TE Signature : S(timeInterval,)
      * 
     */
    public native Observable<TimeInterval<Object>> timeInterval();
    /** 
      * Std Signature : S(timeInterval,357<826<3>>,,P(d356))
      * TE Signature : S(timeInterval,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<TimeInterval<Object>> timeInterval(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<3>,,P(d13))
      * TE Signature : S(timeout,P(d13))
      * 
     */
    public native Observable<Object> timeout(Date due);
    /** 
      * Std Signature : S(timeout,357<3>,,P(d13),P(d356))
      * TE Signature : S(timeout,P(d13),P(d356))
      * 
     */
    public native Observable<Object> timeout(Date due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<3>,,P(d2))
      * TE Signature : S(timeout,P(d2))
      * 
     */
    public native Observable<Object> timeout(Number due);
    /** 
      * Std Signature : S(timeout,357<3>,,P(d2),P(d356))
      * TE Signature : S(timeout,P(d2),P(d356))
      * 
     */
    public native Observable<Object> timeout(Number due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<3>,,P(dU(-13,2)))
      * TE Signature : S(timeout,P(dU(-13,2)))
      * 
     */
    public native Observable<Object> timeout(UnionOfDateAndNumber due);
    /** 
      * Std Signature : S(timeout,357<3>,,P(dU(-13,2)),P(d356))
      * TE Signature : S(timeout,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> timeout(UnionOfDateAndNumber due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeoutWith,357<3>,,P(dU(-13,2)),P(dU(35<4>,16<7>,358<7>)))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)))
      * 
     */
    public native Observable<Object> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object> withObservable);
    /** 
      * Std Signature : S(timeoutWith,357<3>,,P(dU(-13,2)),P(dU(35<4>,16<7>,358<7>)),P(d356))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Object> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object> withObservable, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timestamp,357<827<3>>,,)
      * TE Signature : S(timestamp,)
      * 
     */
    public native Observable<Timestamp<Object>> timestamp();
    /** 
      * Std Signature : S(timestamp,357<827<3>>,,P(d356))
      * TE Signature : S(timestamp,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Timestamp<Object>> timestamp(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(toArray,357<7<3>>,,)
      * TE Signature : S(toArray,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Object>> toArray();
    /** 
      * Std Signature : S(toPromise,88<3>,,)
      * TE Signature : S(toPromise,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Object> toPromise();
    /** 
      * Std Signature : S(toPromise,88<3>,,P(d3))
      * TE Signature : S(toPromise,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Object> toPromise(Object PromiseCtor);
    /** 
      * Std Signature : S(window,357<3<3>>,,P(d357<3>))
      * TE Signature : S(window,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> window(Observable<Object> windowBoundaries);
    /** 
      * Std Signature : S(windowCount,357<3<3>>,,P(d2))
      * TE Signature : S(windowCount,P(d2))
      * 
     */
    public native Observable<Observable<Object>> windowCount(Number windowSize);
    /** 
      * Std Signature : S(windowCount,357<3<3>>,,P(d2),P(d2))
      * TE Signature : S(windowCount,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> windowCount(Number windowSize, Number startWindowEvery /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2))
      * TE Signature : S(windowTime,P(d2))
      * 
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2))
      * 
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan, Number windowCreationInterval);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2),P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan, Number windowCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<3>>,,P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> windowTime(Number windowTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowToggle,357<3<3>>,O-,P(d357<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,357<3>>))
      * TE Signature : S(windowToggle,P(d357),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <O> Observable<Observable<Object>> windowToggle(Observable<O> openings, Function1<O, Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(windowWhen,357<3<3>>,,P(dFR--S(?,4,,)------)<357<3>>))
      * TE Signature : S(windowWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Object>> windowWhen(Function<Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,)
      * TE Signature : S(withLatestFrom,)
      * 
     */
    public native <R> Observable<R> withLatestFrom();
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(D16<3>))
      * TE Signature : S(withLatestFrom,P(D16))
      * 
     */
    public native <R> Observable<R> withLatestFrom(PromiseLike<Object>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(D358<3>))
      * TE Signature : S(withLatestFrom,P(D358))
      * 
     */
    public native <R> Observable<R> withLatestFrom(Subscribable<Object>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(D5<3>))
      * TE Signature : S(withLatestFrom,P(D5))
      * 
     */
    public native <R> Observable<R> withLatestFrom(ArrayLike<Object>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(DFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(withLatestFrom,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> withLatestFrom(Function1<Object, R>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(DU(R-FP1-,R--S(?,7,,P(d6))------)<3,R->,5<8>,16<8>,358<8>)))
      * TE Signature : S(withLatestFrom,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> withLatestFrom(UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<25<3,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(withLatestFrom,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> withLatestFrom(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(PromiseLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<3,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(withLatestFrom,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> withLatestFrom(Subscribable<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(Subscribable<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<3,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(withLatestFrom,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> withLatestFrom(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(ArrayLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(d7<U(-5<3>,16<7>,358<7>)>))
      * TE Signature : S(withLatestFrom,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> withLatestFrom(Array<ObservableInput_UnionOfArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject> array);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(d7<U(-5<3>,16<7>,358<7>)>),P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(withLatestFrom,P(d7),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> withLatestFrom(Array<ObservableInput_UnionOfArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject> array, Function1<Object, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(withLatestFrom,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> withLatestFrom(Function1<Object, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<3,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Object, T2>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<24<3,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Object, T2, T3>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,T2-,T3-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Object, T2, T3, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<23<3,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Object, T2, T3, T4>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,T2-,T3-,T4-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Object, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<22<3,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Object, T2, T3, T4, T5>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<3,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Object, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<21<3,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Object, T2, T3, T4, T5, T6>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<3,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Object, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,)
      * TE Signature : S(zip,)
      * 
     */
    public native <R> Observable<R> zip();
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D16<3>))
      * TE Signature : S(zip,P(D16))
      * 
     */
    public native <R> Observable<R> zip(PromiseLike<Object>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D358<3>))
      * TE Signature : S(zip,P(D358))
      * 
     */
    public native <R> Observable<R> zip(Subscribable<Object>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D5<3>))
      * TE Signature : S(zip,P(D5))
      * 
     */
    public native <R> Observable<R> zip(ArrayLike<Object>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(zip,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> zip(Function1<Object, R>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DU(3,R-FP1-,R--S(?,9,,P(d8))------)<4,R->,5<10>,16<10>,358<10>)))
      * TE Signature : S(zip,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object, R>... observables);
    /** 
      * Std Signature : S(zip,357<25<3,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(zip,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> zip(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(zip,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(PromiseLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<3,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(zip,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> zip(Subscribable<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(zip,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(Subscribable<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<3,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(zip,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Object, T2>> zip(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(zip,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(ArrayLike<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(d7<U(35<6>,16<9>,358<9>)>))
      * TE Signature : S(zip,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Object>> array);
    /** 
      * Std Signature : S(zip,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<8>,358<8>)>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,TOther-,R->))
      * TE Signature : S(zip,P(d7),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <TOther, R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<Object, TOther, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(zip,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(Function1<Object, R> project);
    /** 
      * Std Signature : S(zip,357<25<3,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Object, T2>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,T2-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Object, T2, R> project);
    /** 
      * Std Signature : S(zip,357<24<3,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Object, T2, T3>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<3,T2-,T3-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Object, T2, T3, R> project);
    /** 
      * Std Signature : S(zip,357<23<3,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Object, T2, T3, T4>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<3,T2-,T3-,T4-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Object, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(zip,357<22<3,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Object, T2, T3, T4, T5>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<3,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Object, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(zip,357<21<3,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Object, T2, T3, T4, T5, T6>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<3,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Object, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(zipAll,357<R->,R-,)
      * TE Signature : S(zipAll,)
      * 
     */
    public native <R> Observable<R> zipAll();
    /** 
      * Std Signature : S(zipAll,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<3,R->))
      * TE Signature : S(zipAll,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zipAll(Function1<Object, R> project /* optional */);
}
