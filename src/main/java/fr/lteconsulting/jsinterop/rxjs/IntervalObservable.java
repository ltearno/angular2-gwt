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
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/IntervalObservable".IntervalObservable
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/IntervalObservable.d.ts:130
  * 1 constructors
  * We need this JSDoc comment for affecting ESDoc.
 */
@JsType(isNative=true, namespace="rxjs", name="IntervalObservable")
public class IntervalObservable implements Observable<Number>
{

    /*
        Constructors
    */
    public IntervalObservable(Number period, IScheduler scheduler){
    }

    /*
        Static methods
    */
    /** 
      * Creates an Observable that emits sequential numbers every specified
      * interval of time, on a specified IScheduler.
      * 
      * <span class="informal">Emits incremental numbers periodically in time.
      * </span>
      * 
      * <img src="./img/interval.png" width="100%">
      * 
      * `interval` returns an Observable that emits an infinite sequence of
      * ascending integers, with a constant interval of time of your choosing
      * between those emissions. The first emission is not sent immediately, but
      * only after the first period has passed. By default, this operator uses the
      * `async` IScheduler to provide a notion of time, but you may pass any
      * IScheduler to it.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/IntervalObservable.d.ts:1777
     */
    @JsMethod(namespace="rxjs.IntervalObservable", name = "create")
    public static native Observable<Number> create(Number period /* optional */, IScheduler scheduler /* optional */);
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/IntervalObservable.d.ts:1857
     */
    @JsMethod(namespace="rxjs.IntervalObservable", name = "dispatch")
    public static native void dispatch(Object state);

    /*
        Properties
    */

    public Boolean _isScalar;

    @JsProperty( name = "_isScalar")
    public native Boolean get_isScalar();

    @JsProperty( name = "_isScalar")
    public native void set_isScalar( Boolean value );

    public AnonymousType922 onErrorResumeNext;

    @JsProperty( name = "onErrorResumeNext")
    public native AnonymousType922 getOnErrorResumeNext();

    @JsProperty( name = "onErrorResumeNext")
    public native void setOnErrorResumeNext( AnonymousType922 value );

    public Operator<Object, Number> operator;

    @JsProperty( name = "operator")
    public native Operator<Object, Number> getOperator();

    @JsProperty( name = "operator")
    public native void setOperator( Operator<Object, Number> value );

    public Object period;

    @JsProperty( name = "period")
    public native Object getPeriod();

    @JsProperty( name = "period")
    public native void setPeriod( Object value );

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
      * Std Signature : S(_catch,357<U(2,R-R-,6)>,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,357<2>,U(R-5<R->,16<16>,358<16>)>))
      * TE Signature : S(_catch,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<UnionOfRAndT<Number, R>> _catch(Function2<Object, Observable<Number>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
    /** 
      * Std Signature : S(_do,357<2>,,P(d351<2>))
      * TE Signature : S(_do,P(d351))
      * 
     */
    public native Observable<Number> _do(CompletionObserver<Number> observer);
    /** 
      * Std Signature : S(_do,357<2>,,P(d352<2>))
      * TE Signature : S(_do,P(d352))
      * 
     */
    public native Observable<Number> _do(ErrorObserver<Number> observer);
    /** 
      * Std Signature : S(_do,357<2>,,P(d353<2>))
      * TE Signature : S(_do,P(d353))
      * 
     */
    public native Observable<Number> _do(NextObserver<Number> observer);
    /** 
      * Std Signature : S(_do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Number> _do(Action1<Number> next);
    /** 
      * Std Signature : S(_do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Number> _do(Action1<Number> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(_do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> _do(Action1<Number> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(_do,357<2>,,P(dU(2351<4>,352<7>,353<7>)))
      * TE Signature : S(_do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> _do(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observer);
    /** 
      * Std Signature : S(_finally,357<2>,,P(dF--S(?,429,,)------)))
      * TE Signature : S(_finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> _finally(Action callback);
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
      * Std Signature : S(_switch,2,,)
      * TE Signature : S(_switch,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number _switch();
    /** 
      * Std Signature : S(_trySubscribe,U(-348,205,349),,P(d354<2>))
      * TE Signature : S(_trySubscribe,P(d354))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid _trySubscribe(Subscriber<Number> sink);
    /** 
      * Std Signature : S(audit,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,U(-16<3>,358<11>)>))
      * TE Signature : S(audit,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> audit(Function1<Number, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> durationSelector);
    /** 
      * Std Signature : S(auditTime,357<2>,,P(d2))
      * TE Signature : S(auditTime,P(d2))
      * 
     */
    public native Observable<Number> auditTime(Number duration);
    /** 
      * Std Signature : S(auditTime,357<2>,,P(d2),P(d356))
      * TE Signature : S(auditTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> auditTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(buffer,357<7<2>>,,P(d357<3>))
      * TE Signature : S(buffer,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> buffer(Observable<Object> closingNotifier);
    /** 
      * Std Signature : S(bufferCount,357<7<2>>,,P(d2))
      * TE Signature : S(bufferCount,P(d2))
      * 
     */
    public native Observable<Array<Number>> bufferCount(Number bufferSize);
    /** 
      * Std Signature : S(bufferCount,357<7<2>>,,P(d2),P(d2))
      * TE Signature : S(bufferCount,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> bufferCount(Number bufferSize, Number startBufferEvery /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2))
      * TE Signature : S(bufferTime,P(d2))
      * 
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2))
      * 
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2),P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<2>>,,P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> bufferTime(Number bufferTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferToggle,357<7<2>>,O-,P(d16<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(d16),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<Number>> bufferToggle(PromiseLike<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<2>>,O-,P(d358<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(d358),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<Number>> bufferToggle(Subscribable<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<2>>,O-,P(dU(O-16<O->,358<6>)),P(dFP1-,R--S(?,5,,P(d4))------)<O-,U(-16<3>,358<10>)>))
      * TE Signature : S(bufferToggle,P(dU(-16,358)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <O> Observable<Array<Number>> bufferToggle(SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferWhen,357<7<2>>,,P(dFR--S(?,4,,)------)<357<3>>))
      * TE Signature : S(bufferWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> bufferWhen(Function<Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(catch,357<U(2,R-R-,6)>,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<3,357<2>,U(R-5<R->,16<16>,358<16>)>))
      * TE Signature : S(catch,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "catch")
    public native <R> Observable<UnionOfRAndT<Number, R>> catch_(Function2<Object, Observable<Number>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
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
      * Std Signature : S(combineLatest,357<R->,R-,P(D16<2>))
      * TE Signature : S(combineLatest,P(D16))
      * 
     */
    public native <R> Observable<R> combineLatest(PromiseLike<Number>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D358<2>))
      * TE Signature : S(combineLatest,P(D358))
      * 
     */
    public native <R> Observable<R> combineLatest(Subscribable<Number>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D5<2>))
      * TE Signature : S(combineLatest,P(D5))
      * 
     */
    public native <R> Observable<R> combineLatest(ArrayLike<Number>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(combineLatest,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> combineLatest(Function1<Number, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DU(2,R-FP1-,R--S(?,9,,P(d8))------)<4,R->,5<10>,16<10>,358<10>)))
      * TE Signature : S(combineLatest,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> combineLatest(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<25<2,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(combineLatest,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> combineLatest(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(combineLatest,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(PromiseLike<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<2,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(combineLatest,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> combineLatest(Subscribable<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(combineLatest,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(Subscribable<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<2,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(combineLatest,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> combineLatest(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(combineLatest,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(ArrayLike<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<7<2>>,R-,P(d7<U(25<6>,16<9>,358<9>)>))
      * TE Signature : S(combineLatest,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<Array<Number>> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number>> array);
    /** 
      * Std Signature : S(combineLatest,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<8>,358<8>)>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,TOther-,R->))
      * TE Signature : S(combineLatest,P(d7),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <TOther, R> Observable<R> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<Number, TOther, R> project);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(combineLatest,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> combineLatest(Function1<Number, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<2,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Number, T2>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<24<2,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Number, T2, T3>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,T2-,T3-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Number, T2, T3, R> project);
    /** 
      * Std Signature : S(combineLatest,357<23<2,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Number, T2, T3, T4>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,T2-,T3-,T4-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Number, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(combineLatest,357<22<2,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Number, T2, T3, T4, T5>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<2,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Number, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(combineLatest,357<21<2,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Number, T2, T3, T4, T5, T6>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<2,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Number, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(concat,357<2>,,)
      * TE Signature : S(concat,)
      * 
     */
    public native Observable<Number> concat();
    /** 
      * Std Signature : S(concat,357<2>,,P(D16<2>))
      * TE Signature : S(concat,P(D16))
      * 
     */
    public native Observable<Number> concat(PromiseLike<Number>... observables);
    /** 
      * Std Signature : S(concat,357<2>,,P(D356))
      * TE Signature : S(concat,P(D356))
      * 
     */
    public native Observable<Number> concat(IScheduler... observables);
    /** 
      * Std Signature : S(concat,357<2>,,P(D358<2>))
      * TE Signature : S(concat,P(D358))
      * 
     */
    public native Observable<Number> concat(Subscribable<Number>... observables);
    /** 
      * Std Signature : S(concat,357<2>,,P(D5<2>))
      * TE Signature : S(concat,P(D5))
      * 
     */
    public native Observable<Number> concat(ArrayLike<Number>... observables);
    /** 
      * Std Signature : S(concat,357<2>,,P(DU(25<4>,356,16<7>,358<7>)))
      * TE Signature : S(concat,P(DU(-5,356,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> concat(UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<Number>... observables);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(concat,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(concat,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<2>,,P(d356))
      * TE Signature : S(concat,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> concat(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(concat,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(Subscribable<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(concat,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(concat,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(concat,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(concat,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concatAll,2,,)
      * TE Signature : S(concatAll,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number concatAll();
    /** 
      * Std Signature : S(concatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> concatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(concatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> concatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(concatMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> concatMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(concatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(concatMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> concatMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(concatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(concatMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> concatMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(concatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
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
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(concatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> concatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(count,357<2>,,)
      * TE Signature : S(count,)
      * 
     */
    public native Observable<Number> count();
    /** 
      * Std Signature : S(count,357<2>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(count,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> count(Function3<Number, Number, Observable<Number>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(debounce,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,U(-16<7>,358<7>)>))
      * TE Signature : S(debounce,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> debounce(Function1<Number, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(debounceTime,357<2>,,P(d2))
      * TE Signature : S(debounceTime,P(d2))
      * 
     */
    public native Observable<Number> debounceTime(Number dueTime);
    /** 
      * Std Signature : S(debounceTime,357<2>,,P(d2),P(d356))
      * TE Signature : S(debounceTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> debounceTime(Number dueTime, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(defaultIfEmpty,357<2>,,)
      * TE Signature : S(defaultIfEmpty,)
      * 
     */
    public native Observable<Number> defaultIfEmpty();
    /** 
      * Std Signature : S(defaultIfEmpty,357<2>,,P(d2))
      * TE Signature : S(defaultIfEmpty,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> defaultIfEmpty(Number defaultValue /* optional */);
    /** 
      * Std Signature : S(delay,357<2>,,P(d13))
      * TE Signature : S(delay,P(d13))
      * 
     */
    public native Observable<Number> delay(Date delay);
    /** 
      * Std Signature : S(delay,357<2>,,P(d13),P(d356))
      * TE Signature : S(delay,P(d13),P(d356))
      * 
     */
    public native Observable<Number> delay(Date delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<2>,,P(d2))
      * TE Signature : S(delay,P(d2))
      * 
     */
    public native Observable<Number> delay(Number delay);
    /** 
      * Std Signature : S(delay,357<2>,,P(d2),P(d356))
      * TE Signature : S(delay,P(d2),P(d356))
      * 
     */
    public native Observable<Number> delay(Number delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<2>,,P(dU(-13,2)))
      * TE Signature : S(delay,P(dU(-13,2)))
      * 
     */
    public native Observable<Number> delay(UnionOfDateAndNumber delay);
    /** 
      * Std Signature : S(delay,357<2>,,P(dU(-13,2)),P(d356))
      * TE Signature : S(delay,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> delay(UnionOfDateAndNumber delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delayWhen,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,357<3>>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Number> delayWhen(Function1<Number, Observable<Object>> delayDurationSelector);
    /** 
      * Std Signature : S(delayWhen,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,357<3>>),P(d357<3>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> delayWhen(Function1<Number, Observable<Object>> delayDurationSelector, Observable<Object> subscriptionDelay /* optional */);
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
      * Std Signature : S(distinct,357<2>,K-,)
      * TE Signature : S(distinct,)
      * 
     */
    public native <K> Observable<Number> distinct();
    /** 
      * Std Signature : S(distinct,357<2>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K> Observable<Number> distinct(Function1<Number, K> keySelector /* optional */);
    /** 
      * Std Signature : S(distinct,357<2>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->),P(d357<3>))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Number> distinct(Function1<Number, K> keySelector /* optional */, Observable<Object> flushes /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<2>,,)
      * TE Signature : S(distinctUntilChanged,)
      * 
     */
    public native Observable<Number> distinctUntilChanged();
    /** 
      * Std Signature : S(distinctUntilChanged,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,7,27>))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> distinctUntilChanged(Function2<Number, Number, Boolean> compare /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<2>,K-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<K-,7,27>),P(dFP1-,R--S(?,5,,P(d4))------)<2,K->))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Number> distinctUntilChanged(Function2<K, K, Boolean> compare, Function1<Number, K> keySelector);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<2>,,P(d1))
      * TE Signature : S(distinctUntilKeyChanged,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> distinctUntilKeyChanged(String key);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<2>,K-,P(d1),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<K-,7,27>))
      * TE Signature : S(distinctUntilKeyChanged,P(d1),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<Number> distinctUntilKeyChanged(String key, Function2<K, K, Boolean> compare);
    /** 
      * Std Signature : S(do,357<2>,,P(d351<2>))
      * TE Signature : S(do,P(d351))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(CompletionObserver<Number> observer);
    /** 
      * Std Signature : S(do,357<2>,,P(d352<2>))
      * TE Signature : S(do,P(d352))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(ErrorObserver<Number> observer);
    /** 
      * Std Signature : S(do,357<2>,,P(d353<2>))
      * TE Signature : S(do,P(d353))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(NextObserver<Number> observer);
    /** 
      * Std Signature : S(do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(Action1<Number> next);
    /** 
      * Std Signature : S(do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(Action1<Number> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(do,357<2>,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(Action1<Number> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(do,357<2>,,P(dU(2351<4>,352<7>,353<7>)))
      * TE Signature : S(do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "do")
    public native Observable<Number> do_(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observer);
    /** 
      * Std Signature : S(elementAt,357<2>,,P(d2))
      * TE Signature : S(elementAt,P(d2))
      * 
     */
    public native Observable<Number> elementAt(Number index);
    /** 
      * Std Signature : S(elementAt,357<2>,,P(d2),P(d2))
      * TE Signature : S(elementAt,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> elementAt(Number index, Number defaultValue /* optional */);
    /** 
      * Std Signature : S(every,357<27>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(every,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Boolean> every(Function3<Number, Number, Observable<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(exhaust,357<2>,,)
      * TE Signature : S(exhaust,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> exhaust();
    /** 
      * Std Signature : S(exhaustMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> exhaustMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(exhaustMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> exhaustMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(expand,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,357<7>>))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native Observable<Number> expand(Function2<Number, Number, Observable<Number>> project);
    /** 
      * Std Signature : S(expand,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,357<7>>),P(d2))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    public native Observable<Number> expand(Function2<Number, Number, Observable<Number>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(expand,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,357<7>>),P(d2),P(d356))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d5))------)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> expand(Function2<Number, Number, Observable<Number>> project, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(filter,357<S->,S-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,27>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> filter(Function2<Number, Number, Boolean> predicate);
    /** 
      * Std Signature : S(finally,357<2>,,P(dF--S(?,429,,)------)))
      * TE Signature : S(finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "finally")
    public native Observable<Number> finally_(Action callback);
    /** 
      * Std Signature : S(find,357<S->,S-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> find(Function2<Number, Number, Boolean> predicate);
    /** 
      * Std Signature : S(findIndex,357<2>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> findIndex(Function3<Number, Number, Observable<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> first(Function3<Number, Number, Observable<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(d349))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349))
      * 
     */
    public native <S> Observable<S> first(Function3<Number, Number, Observable<Number>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(d349),P(dS-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> first(Function3<Number, Number, Observable<Number>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,R->))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> first(Function3<Number, Number, Observable<Number>, Boolean> predicate, Function2<Number, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,R->),P(dR-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> first(Function3<Number, Number, Observable<Number>, Boolean> predicate, Function2<Number, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> flatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> flatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> flatMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d4))------)<2>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Promise<Void> forEach(Action1<Number> next);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d4))------)<2>),P(d3))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Void> forEach(Action1<Number> next, Object PromiseCtor /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,2>>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<GroupedObservable<K, Number>> groupBy(Function1<Number, K> keySelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,2>>,K-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->),P(d349),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,2>,357<3>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(d349),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K> Observable<GroupedObservable<K, Number>> groupBy(Function1<Number, K> keySelector, Void elementSelector, Function1<GroupedObservable<K, Number>, Observable<Object>> durationSelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->),P(dFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Number, K> keySelector, Function1<Number, R> elementSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->),P(dFP1-,R--S(?,5,,P(d4))------)<2,R->),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,R->,357<3>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Number, K> keySelector, Function1<Number, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,K->),P(dFP1-,R--S(?,5,,P(d4))------)<2,R->),P(dFP1-,R--S(?,5,,P(d4))------)<361<K-,R->,357<3>>),P(dFR--S(?,4,,)------)<359<R->>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<Number, K> keySelector, Function1<Number, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */, Function<Subject<R>> subjectSelector /* optional */);
    /** 
      * Std Signature : S(ignoreElements,357<2>,,)
      * TE Signature : S(ignoreElements,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> ignoreElements();
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
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> last(Function3<Number, Number, Observable<Number>, Boolean> predicate);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(d349))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349))
      * 
     */
    public native <S> Observable<S> last(Function3<Number, Number, Observable<Number>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(d349),P(dS-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d349),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <S> Observable<S> last(Function3<Number, Number, Observable<Number>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,R->))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> last(Function3<Number, Number, Observable<Number>, Boolean> predicate, Function2<Number, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,R->),P(dR-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> last(Function3<Number, Number, Observable<Number>, Boolean> predicate, Function2<Number, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(let,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<357<2>,7<R->>))
      * TE Signature : S(let,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> let(Function1<Observable<Number>, Observable<R>> func);
    /** 
      * Std Signature : S(letBind,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<357<2>,7<R->>))
      * TE Signature : S(letBind,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> letBind(Function1<Observable<Number>, Observable<R>> func);
    /** 
      * Std Signature : S(lift,357<R->,R-,P(d355<2,R->))
      * TE Signature : S(lift,P(d355))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> lift(Operator<Number, R> operator);
    /** 
      * Std Signature : S(map,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,R->))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> map(Function2<Number, Number, R> project);
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
      * Std Signature : S(materialize,357<708<2>>,,)
      * TE Signature : S(materialize,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Notification<Number>> materialize();
    /** 
      * Std Signature : S(max,357<2>,,)
      * TE Signature : S(max,)
      * 
     */
    public native Observable<Number> max();
    /** 
      * Std Signature : S(max,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,7,8>))
      * TE Signature : S(max,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> max(Function2<Number, Number, Number> comparer /* optional */);
    /** 
      * Std Signature : S(merge,357<2>,,)
      * TE Signature : S(merge,)
      * 
     */
    public native Observable<Number> merge();
    /** 
      * Std Signature : S(merge,357<2>,,P(D16<2>))
      * TE Signature : S(merge,P(D16))
      * 
     */
    public native Observable<Number> merge(PromiseLike<Number>... observables);
    /** 
      * Std Signature : S(merge,357<2>,,P(D2))
      * TE Signature : S(merge,P(D2))
      * 
     */
    public native Observable<Number> merge(Number... observables);
    /** 
      * Std Signature : S(merge,357<2>,,P(D356))
      * TE Signature : S(merge,P(D356))
      * 
     */
    public native Observable<Number> merge(IScheduler... observables);
    /** 
      * Std Signature : S(merge,357<2>,,P(D358<2>))
      * TE Signature : S(merge,P(D358))
      * 
     */
    public native Observable<Number> merge(Subscribable<Number>... observables);
    /** 
      * Std Signature : S(merge,357<2>,,P(D5<2>))
      * TE Signature : S(merge,P(D5))
      * 
     */
    public native Observable<Number> merge(ArrayLike<Number>... observables);
    /** 
      * Std Signature : S(merge,357<2>,,P(DU(25<4>,356,4,16<7>,358<7>)))
      * TE Signature : S(merge,P(DU(-5,356,2,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> merge(UnionOfArrayLikeOfTAndISchedulerAndNumberAndPromiseLikeOfTAndSubscribableOfT<Number>... observables);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(merge,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->),P(d2))
      * TE Signature : S(merge,P(d16),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d16),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(merge,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<2>,,P(d2))
      * TE Signature : S(merge,P(d2))
      * 
     */
    public native Observable<Number> merge(Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<2>,,P(d2),P(d356))
      * TE Signature : S(merge,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> merge(Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<2>,,P(d356))
      * TE Signature : S(merge,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> merge(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(merge,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(Subscribable<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->),P(d2))
      * TE Signature : S(merge,P(d358),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d358),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(merge,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(merge,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->),P(d2))
      * TE Signature : S(merge,P(d5),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d5),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(merge,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-6,T2-)>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<UnionOfTAndT2<Number, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-6,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<Number, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-6,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<Number, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-6,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<Number, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(2,T2-,T3-,T4-,T5-,T6-6,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<Number, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(mergeAll,2,,)
      * TE Signature : S(mergeAll,)
      * 
     */
    public native Number mergeAll();
    /** 
      * Std Signature : S(mergeAll,2,,P(d2))
      * TE Signature : S(mergeAll,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Number mergeAll(Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <R> Observable<R> mergeMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mergeMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> mergeMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<R-,2,357<7>>),P(dR-))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d5))------)),P(d3))
      * 
     */
    public native <R> Observable<R> mergeScan(Function2<R, Number, Observable<R>> accumulator, R seed);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<R-,2,357<7>>),P(dR-),P(d2))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d5))------)),P(d3),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> mergeScan(Function2<R, Number, Observable<R>> accumulator, R seed, Number concurrent /* optional */);
    /** 
      * Std Signature : S(min,357<2>,,)
      * TE Signature : S(min,)
      * 
     */
    public native Observable<Number> min();
    /** 
      * Std Signature : S(min,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,7,8>))
      * TE Signature : S(min,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> min(Function2<Number, Number, Number> comparer /* optional */);
    /** 
      * Std Signature : S(multicast,825<2>,,P(d359<2>))
      * TE Signature : S(multicast,P(d359))
      * 
     */
    public native ConnectableObservable<Number> multicast(Subject<Number> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,825<2>,,P(dFR--S(?,4,,)------)<359<2>>))
      * TE Signature : S(multicast,P(dF--S(?,)------)))
      * 
     */
    public native ConnectableObservable<Number> multicast(Function<Subject<Number>> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,357<2>,,P(dFR--S(?,4,,)------)<359<2>>),P(dFP1-,R--S(?,5,,P(d4))------)<357<2>,7<9>>))
      * TE Signature : S(multicast,P(dF--S(?,)------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> multicast(Function<Subject<Number>> SubjectFactory, Function1<Observable<Number>, Observable<Number>> selector /* optional */);
    /** 
      * Std Signature : S(multicast,825<2>,,P(dU(2FR--S(?,7,,)------)<359<4>>,8)))
      * TE Signature : S(multicast,P(dU(-F--S(?,)------),359)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Number> multicast(factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<Number> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(observeOn,357<2>,,P(d356))
      * TE Signature : S(observeOn,P(d356))
      * 
     */
    public native Observable<Number> observeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(observeOn,357<2>,,P(d356),P(d2))
      * TE Signature : S(observeOn,P(d356),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> observeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(pairwise,357<25<2,6>>,,)
      * TE Signature : S(pairwise,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Tuple<Number, Number>> pairwise();
    /** 
      * Std Signature : S(partition,25<357<2>,4>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,27>))
      * TE Signature : S(partition,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Tuple<Observable<Number>, Observable<Number>> partition(Function1<Number, Boolean> predicate);
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
      * Std Signature : S(publish,825<2>,,)
      * TE Signature : S(publish,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Number> publish();
    /** 
      * Std Signature : S(publish,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<2>,7<9>>))
      * TE Signature : S(publish,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> publish(Function1<Observable<Number>, Observable<Number>> selector);
    /** 
      * Std Signature : S(publishBehavior,825<2>,,P(d2))
      * TE Signature : S(publishBehavior,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Number> publishBehavior(Number value);
    /** 
      * Std Signature : S(publishLast,825<2>,,)
      * TE Signature : S(publishLast,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Number> publishLast();
    /** 
      * Std Signature : S(publishReplay,825<2>,,)
      * TE Signature : S(publishReplay,)
      * 
     */
    public native ConnectableObservable<Number> publishReplay();
    /** 
      * Std Signature : S(publishReplay,825<2>,,P(d2))
      * TE Signature : S(publishReplay,P(d2))
      * 
     */
    public native ConnectableObservable<Number> publishReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<2>,,P(d2),P(d2))
      * TE Signature : S(publishReplay,P(d2),P(d2))
      * 
     */
    public native ConnectableObservable<Number> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<2>,,P(d2),P(d2),P(d356))
      * TE Signature : S(publishReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native ConnectableObservable<Number> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(race,357<2>,,)
      * TE Signature : S(race,)
      * 
     */
    public native Observable<Number> race();
    /** 
      * Std Signature : S(race,357<2>,,P(D357<2>))
      * TE Signature : S(race,P(D357))
      * 
     */
    public native Observable<Number> race(Observable<Number>... observables);
    /** 
      * Std Signature : S(race,357<2>,,P(D7<357<2>>))
      * TE Signature : S(race,P(D7))
      * 
     */
    public native Observable<Number> race(Array<Observable<Number>>... observables);
    /** 
      * Std Signature : S(race,357<2>,,P(DU(27<357<4>>,7)))
      * TE Signature : S(race,P(DU(-7,357)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> race(UnionOfArrayOfObservableOfTAndObservableOfT<Number>... observables);
    /** 
      * Std Signature : S(race,357<2>,,P(d7<357<2>>))
      * TE Signature : S(race,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> race(Array<Observable<Number>> observables);
    /** 
      * Std Signature : S(reduce,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,2,10,8>),P(dR-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> reduce(Function3<R, Number, Number, R> accumulator, R seed);
    /** 
      * Std Signature : S(reduce,357<7<2>>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<7<2>,10,11,8>),P(d7<2>))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> reduce(Function3<Array<Number>, Number, Number, Array<Number>> accumulator, Array<Number> seed);
    /** 
      * Std Signature : S(repeat,357<2>,,)
      * TE Signature : S(repeat,)
      * 
     */
    public native Observable<Number> repeat();
    /** 
      * Std Signature : S(repeat,357<2>,,P(d2))
      * TE Signature : S(repeat,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> repeat(Number count /* optional */);
    /** 
      * Std Signature : S(repeatWhen,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,6>))
      * TE Signature : S(repeatWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> repeatWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(retry,357<2>,,)
      * TE Signature : S(retry,)
      * 
     */
    public native Observable<Number> retry();
    /** 
      * Std Signature : S(retry,357<2>,,P(d2))
      * TE Signature : S(retry,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> retry(Number count /* optional */);
    /** 
      * Std Signature : S(retryWhen,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<357<3>,6>))
      * TE Signature : S(retryWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> retryWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(sample,357<2>,,P(d357<3>))
      * TE Signature : S(sample,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> sample(Observable<Object> notifier);
    /** 
      * Std Signature : S(sampleTime,357<2>,,P(d2))
      * TE Signature : S(sampleTime,P(d2))
      * 
     */
    public native Observable<Number> sampleTime(Number period);
    /** 
      * Std Signature : S(sampleTime,357<2>,,P(d2),P(d356))
      * TE Signature : S(sampleTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> sampleTime(Number period, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,2,10,8>))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    public native <R> Observable<R> scan(Function3<R, Number, Number, R> accumulator);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<R-,2,10,8>),P(dR-))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> scan(Function3<R, Number, Number, R> accumulator, R seed /* optional */);
    /** 
      * Std Signature : S(scan,357<7<2>>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<7<2>,10,11,8>),P(d7<2>))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d5),P(d5))------)),P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> scan(Function3<Array<Number>, Number, Number, Array<Number>> accumulator, Array<Number> seed /* optional */);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<2>))
      * TE Signature : S(sequenceEqual,P(d357))
      * 
     */
    public native Observable<Boolean> sequenceEqual(Observable<Number> compareTo);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<2>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,7,27>))
      * TE Signature : S(sequenceEqual,P(d357),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Boolean> sequenceEqual(Observable<Number> compareTo, Function2<Number, Number, Boolean> comparor /* optional */);
    /** 
      * Std Signature : S(share,357<2>,,)
      * TE Signature : S(share,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> share();
    /** 
      * Std Signature : S(shareReplay,357<2>,,)
      * TE Signature : S(shareReplay,)
      * 
     */
    public native Observable<Number> shareReplay();
    /** 
      * Std Signature : S(shareReplay,357<2>,,P(d2))
      * TE Signature : S(shareReplay,P(d2))
      * 
     */
    public native Observable<Number> shareReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<2>,,P(d2),P(d2))
      * TE Signature : S(shareReplay,P(d2),P(d2))
      * 
     */
    public native Observable<Number> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<2>,,P(d2),P(d2),P(d356))
      * TE Signature : S(shareReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(single,357<2>,,)
      * TE Signature : S(single,)
      * 
     */
    public native Observable<Number> single();
    /** 
      * Std Signature : S(single,357<2>,,P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,9,357<8>,27>))
      * TE Signature : S(single,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> single(Function3<Number, Number, Observable<Number>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(skip,357<2>,,P(d2))
      * TE Signature : S(skip,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> skip(Number count);
    /** 
      * Std Signature : S(skipLast,357<2>,,P(d2))
      * TE Signature : S(skipLast,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> skipLast(Number count);
    /** 
      * Std Signature : S(skipUntil,357<2>,,P(d357<3>))
      * TE Signature : S(skipUntil,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> skipUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(skipWhile,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,27>))
      * TE Signature : S(skipWhile,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> skipWhile(Function2<Number, Number, Boolean> predicate);
    /** 
      * Std Signature : S(startWith,357<2>,,)
      * TE Signature : S(startWith,)
      * 
     */
    public native Observable<Number> startWith();
    /** 
      * Std Signature : S(startWith,357<2>,,P(D2))
      * TE Signature : S(startWith,P(D2))
      * 
     */
    public native Observable<Number> startWith(Number... array);
    /** 
      * Std Signature : S(startWith,357<2>,,P(D356))
      * TE Signature : S(startWith,P(D356))
      * 
     */
    public native Observable<Number> startWith(IScheduler... array);
    /** 
      * Std Signature : S(startWith,357<2>,,P(DU(2356,4)))
      * TE Signature : S(startWith,P(DU(-356,2)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(UnionOfISchedulerAndT<Number>... array);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2))
      * TE Signature : S(startWith,P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2))
      * TE Signature : S(startWith,P(d2),P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1, Number v2);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4, Number v5);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4, Number v5, Number v6);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4, Number v5, Number v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4, Number v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, Number v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, Number v2, Number v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, Number v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<2>,,P(d2),P(d356))
      * TE Signature : S(startWith,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> startWith(Number v1, IScheduler scheduler /* optional */);
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
      * Std Signature : S(subscribe,350,,P(d351<2>))
      * TE Signature : S(subscribe,P(d351))
      * 
     */
    public native Subscription subscribe(CompletionObserver<Number> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d352<2>))
      * TE Signature : S(subscribe,P(d352))
      * 
     */
    public native Subscription subscribe(ErrorObserver<Number> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d353<2>))
      * TE Signature : S(subscribe,P(d353))
      * 
     */
    public native Subscription subscribe(NextObserver<Number> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<Number> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<2>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<Number> next /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<Number> next /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d4))------)<2>),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription subscribe(Action1<Number> next /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dU(2351<4>,352<7>,353<7>)))
      * TE Signature : S(subscribe,P(dU(-351,352,353)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Subscription subscribe(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(2FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(2FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(2FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<Number> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribeOn,357<2>,,P(d356))
      * TE Signature : S(subscribeOn,P(d356))
      * 
     */
    public native Observable<Number> subscribeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(subscribeOn,357<2>,,P(d356),P(d2))
      * TE Signature : S(subscribeOn,P(d356),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> subscribeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(switch,2,,)
      * TE Signature : S(switch,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    @JsMethod(name = "switch")
    public native Number switch_();
    /** 
      * Std Signature : S(switchMap,357<R->,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(R-5<R->,16<13>,358<13>)>))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> switchMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(switchMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,U(I-5<I->,16<13>,358<13>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d5))------)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> switchMap(Function2<Number, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(switchMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> switchMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(switchMapTo,P(d16),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(PromiseLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(switchMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> switchMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(switchMapTo,P(d358),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(Subscribable<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(switchMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> switchMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(switchMapTo,P(d5),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(ArrayLike<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
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
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,I-,10,10,R->))
      * TE Signature : S(switchMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <I, R> Observable<R> switchMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<Number, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(take,357<2>,,P(d2))
      * TE Signature : S(take,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> take(Number count);
    /** 
      * Std Signature : S(takeLast,357<2>,,P(d2))
      * TE Signature : S(takeLast,P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> takeLast(Number count);
    /** 
      * Std Signature : S(takeUntil,357<2>,,P(d357<3>))
      * TE Signature : S(takeUntil,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> takeUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(takeWhile,357<2>,,P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,8,27>))
      * TE Signature : S(takeWhile,P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> takeWhile(Function2<Number, Number, Boolean> predicate);
    /** 
      * Std Signature : S(throttle,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,U(-16<7>,358<7>)>))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<Number> throttle(Function1<Number, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(throttle,357<2>,,P(dFP1-,R--S(?,5,,P(d4))------)<2,U(-16<7>,358<7>)>),P(d362))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)),P(d362))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> throttle(Function1<Number, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<2>,,P(d2))
      * TE Signature : S(throttleTime,P(d2))
      * 
     */
    public native Observable<Number> throttleTime(Number duration);
    /** 
      * Std Signature : S(throttleTime,357<2>,,P(d2),P(d356))
      * TE Signature : S(throttleTime,P(d2),P(d356))
      * 
     */
    public native Observable<Number> throttleTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<2>,,P(d2),P(d356),P(d362))
      * TE Signature : S(throttleTime,P(d2),P(d356),P(d362))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> throttleTime(Number duration, IScheduler scheduler /* optional */, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(timeInterval,357<826<2>>,,)
      * TE Signature : S(timeInterval,)
      * 
     */
    public native Observable<TimeInterval<Number>> timeInterval();
    /** 
      * Std Signature : S(timeInterval,357<826<2>>,,P(d356))
      * TE Signature : S(timeInterval,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<TimeInterval<Number>> timeInterval(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<2>,,P(d13))
      * TE Signature : S(timeout,P(d13))
      * 
     */
    public native Observable<Number> timeout(Date due);
    /** 
      * Std Signature : S(timeout,357<2>,,P(d13),P(d356))
      * TE Signature : S(timeout,P(d13),P(d356))
      * 
     */
    public native Observable<Number> timeout(Date due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<2>,,P(d2))
      * TE Signature : S(timeout,P(d2))
      * 
     */
    public native Observable<Number> timeout(Number due);
    /** 
      * Std Signature : S(timeout,357<2>,,P(d2),P(d356))
      * TE Signature : S(timeout,P(d2),P(d356))
      * 
     */
    public native Observable<Number> timeout(Number due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<2>,,P(dU(-13,2)))
      * TE Signature : S(timeout,P(dU(-13,2)))
      * 
     */
    public native Observable<Number> timeout(UnionOfDateAndNumber due);
    /** 
      * Std Signature : S(timeout,357<2>,,P(dU(-13,2)),P(d356))
      * TE Signature : S(timeout,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> timeout(UnionOfDateAndNumber due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeoutWith,357<2>,,P(dU(-13,2)),P(dU(25<4>,16<7>,358<7>)))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)))
      * 
     */
    public native Observable<Number> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number> withObservable);
    /** 
      * Std Signature : S(timeoutWith,357<2>,,P(dU(-13,2)),P(dU(25<4>,16<7>,358<7>)),P(d356))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Number> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number> withObservable, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timestamp,357<827<2>>,,)
      * TE Signature : S(timestamp,)
      * 
     */
    public native Observable<Timestamp<Number>> timestamp();
    /** 
      * Std Signature : S(timestamp,357<827<2>>,,P(d356))
      * TE Signature : S(timestamp,P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Timestamp<Number>> timestamp(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(toArray,357<7<2>>,,)
      * TE Signature : S(toArray,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Array<Number>> toArray();
    /** 
      * Std Signature : S(toPromise,88<2>,,)
      * TE Signature : S(toPromise,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Number> toPromise();
    /** 
      * Std Signature : S(toPromise,88<2>,,P(d3))
      * TE Signature : S(toPromise,P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Promise<Number> toPromise(Object PromiseCtor);
    /** 
      * Std Signature : S(window,357<3<2>>,,P(d357<3>))
      * TE Signature : S(window,P(d357))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> window(Observable<Object> windowBoundaries);
    /** 
      * Std Signature : S(windowCount,357<3<2>>,,P(d2))
      * TE Signature : S(windowCount,P(d2))
      * 
     */
    public native Observable<Observable<Number>> windowCount(Number windowSize);
    /** 
      * Std Signature : S(windowCount,357<3<2>>,,P(d2),P(d2))
      * TE Signature : S(windowCount,P(d2),P(d2))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> windowCount(Number windowSize, Number startWindowEvery /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2))
      * TE Signature : S(windowTime,P(d2))
      * 
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2))
      * 
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan, Number windowCreationInterval);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2),P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan, Number windowCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<3<2>>,,P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d356))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> windowTime(Number windowTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowToggle,357<3<2>>,O-,P(d357<O->),P(dFP1-,R--S(?,5,,P(d4))------)<O-,357<3>>))
      * TE Signature : S(windowToggle,P(d357),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <O> Observable<Observable<Number>> windowToggle(Observable<O> openings, Function1<O, Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(windowWhen,357<3<2>>,,P(dFR--S(?,4,,)------)<357<3>>))
      * TE Signature : S(windowWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Observable<Observable<Number>> windowWhen(Function<Observable<Object>> closingSelector);
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
      * Std Signature : S(withLatestFrom,357<25<2,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(withLatestFrom,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> withLatestFrom(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(PromiseLike<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<2,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(withLatestFrom,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> withLatestFrom(Subscribable<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(Subscribable<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<2,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(withLatestFrom,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> withLatestFrom(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(ArrayLike<T2> v2, Function2<Number, T2, R> project);
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
      * Std Signature : S(withLatestFrom,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(withLatestFrom,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> withLatestFrom(Function1<Number, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<2,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Number, T2>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<24<2,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Number, T2, T3>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,T2-,T3-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Number, T2, T3, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<23<2,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Number, T2, T3, T4>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,T2-,T3-,T4-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Number, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<22<2,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Number, T2, T3, T4, T5>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<2,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Number, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<21<2,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Number, T2, T3, T4, T5, T6>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<2,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Number, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,)
      * TE Signature : S(zip,)
      * 
     */
    public native <R> Observable<R> zip();
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D16<2>))
      * TE Signature : S(zip,P(D16))
      * 
     */
    public native <R> Observable<R> zip(PromiseLike<Number>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D358<2>))
      * TE Signature : S(zip,P(D358))
      * 
     */
    public native <R> Observable<R> zip(Subscribable<Number>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D5<2>))
      * TE Signature : S(zip,P(D5))
      * 
     */
    public native <R> Observable<R> zip(ArrayLike<Number>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(zip,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> zip(Function1<Number, R>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DU(2,R-FP1-,R--S(?,9,,P(d8))------)<4,R->,5<10>,16<10>,358<10>)))
      * TE Signature : S(zip,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number, R>... observables);
    /** 
      * Std Signature : S(zip,357<25<2,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(zip,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> zip(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(zip,P(d16),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(PromiseLike<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<2,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(zip,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> zip(Subscribable<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(zip,P(d358),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(Subscribable<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<2,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(zip,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<Number, T2>> zip(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(zip,P(d5),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(ArrayLike<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(d7<U(25<6>,16<9>,358<9>)>))
      * TE Signature : S(zip,P(d7))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<Number>> array);
    /** 
      * Std Signature : S(zip,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<8>,358<8>)>),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,TOther-,R->))
      * TE Signature : S(zip,P(d7),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <TOther, R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<Number, TOther, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(dFP1-,R--S(?,5,,P(d4))------)<2,R->))
      * TE Signature : S(zip,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <R> Observable<R> zip(Function1<Number, R> project);
    /** 
      * Std Signature : S(zip,357<25<2,T2->>,T2-,P(dU(T2-5<T2->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2> Observable<Tuple<Number, T2>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dFP1-,P2-,R--S(?,6,,P(d4),P(d5))------)<2,T2-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<Number, T2, R> project);
    /** 
      * Std Signature : S(zip,357<24<2,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3> Observable<TupleOf3<Number, T2, T3>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dFP1-,P2-,P3-,R--S(?,7,,P(d4),P(d5),P(d6))------)<2,T2-,T3-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<Number, T2, T3, R> project);
    /** 
      * Std Signature : S(zip,357<23<2,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4> Observable<TupleOf4<Number, T2, T3, T4>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,R--S(?,8,,P(d4),P(d5),P(d6),P(d7))------)<2,T2-,T3-,T4-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<Number, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(zip,357<22<2,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<Number, T2, T3, T4, T5>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,9,,P(d4),P(d5),P(d6),P(d7),P(d8))------)<2,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<Number, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(zip,357<21<2,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<Number, T2, T3, T4, T5, T6>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<6>,358<6>)),P(dU(T3-5<T3->,16<6>,358<6>)),P(dU(T4-5<T4->,16<6>,358<6>)),P(dU(T5-5<T5->,16<6>,358<6>)),P(dU(T6-5<T6->,16<6>,358<6>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,10,,P(d4),P(d5),P(d6),P(d7),P(d8),P(d9))------)<2,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d5),P(d5),P(d5),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<Number, T2, T3, T4, T5, T6, R> project);
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
