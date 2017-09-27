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
  * base type: "apis/angular4-api/tsd/rxjs/Observable".Observable
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/Observable.d.ts:685
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/bindCallback.d.ts:119
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/bindNodeCallback.d.ts:131
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/combineLatest.d.ts:122
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/concat.d.ts:101
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/defer.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/dom/ajax.d.ts:115
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/dom/webSocket.d.ts:120
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/empty.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/forkJoin.d.ts:107
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/from.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/fromEvent.d.ts:110
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/fromEventPattern.d.ts:131
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/fromPromise.d.ts:116
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/generate.d.ts:107
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/interval.d.ts:107
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/merge.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/never.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/of.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/onErrorResumeNext.d.ts:134
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/pairs.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/race.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/range.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/timer.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/using.d.ts:98
  * declared in: apis/angular4-api/tsd/rxjs/add/observable/zip.d.ts:92
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/audit.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/auditTime.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/buffer.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/bufferCount.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/bufferTime.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/bufferToggle.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/bufferWhen.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/catch.d.ts:82
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/combineAll.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/combineLatest.d.ts:97
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/concat.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/concatAll.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/concatMap.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/concatMapTo.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/count.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/debounce.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/debounceTime.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/defaultIfEmpty.d.ts:99
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/delay.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/delayWhen.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/dematerialize.d.ts:97
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/distinct.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/distinctUntilChanged.d.ts:111
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/distinctUntilKeyChanged.d.ts:117
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/do.d.ts:76
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/elementAt.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/every.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/exhaust.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/exhaustMap.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/expand.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/filter.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/finally.d.ts:86
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/find.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/findIndex.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/first.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/groupBy.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/ignoreElements.d.ts:99
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/isEmpty.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/last.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/let.d.ts:82
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/map.d.ts:77
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/mapTo.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/materialize.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/max.d.ts:77
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/merge.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/mergeAll.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/mergeMap.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/mergeMapTo.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/mergeScan.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/min.d.ts:77
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/multicast.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/observeOn.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/onErrorResumeNext.d.ts:105
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/pairwise.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/partition.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/pluck.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/publish.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/publishBehavior.d.ts:101
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/publishLast.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/publishReplay.d.ts:97
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/race.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/reduce.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/repeat.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/repeatWhen.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/retry.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/retryWhen.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/sample.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/sampleTime.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/scan.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/sequenceEqual.d.ts:97
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/share.d.ts:81
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/shareReplay.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/single.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/skip.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/skipLast.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/skipUntil.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/skipWhile.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/startWith.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/subscribeOn.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/switch.d.ts:84
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/switchMap.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/switchMapTo.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/take.d.ts:79
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/takeLast.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/takeUntil.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/takeWhile.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/throttle.d.ts:87
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/throttleTime.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/timeInterval.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/timeout.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/timeoutWith.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/timestamp.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/toArray.d.ts:85
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/toPromise.d.ts:89
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/window.d.ts:83
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/windowCount.d.ts:93
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/windowTime.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/windowToggle.d.ts:95
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/windowWhen.d.ts:91
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/withLatestFrom.d.ts:99
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/zip.d.ts:82
  * declared in: apis/angular4-api/tsd/rxjs/add/operator/zipAll.d.ts:83
  * 1 constructors
  * A representation of any set of values over any amount of time. This is the most basic building block
  * of RxJS.
 */
@JsType(isNative=true, namespace="rxjs", name="Observable")
public class ObservableImpl<T> implements Observable<T>
{

    /*
        Constructors
    */
    public ObservableImpl(Function1<Subscriber<T>, TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid> subscribe){
    }

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

    public Operator<Object, T> operator;

    @JsProperty( name = "operator")
    public native Operator<Object, T> getOperator();

    @JsProperty( name = "operator")
    public native void setOperator( Operator<Object, T> value );

    public Observable<Object> source;

    @JsProperty( name = "source")
    public native Observable<Object> getSource();

    @JsProperty( name = "source")
    public native void setSource( Observable<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_catch,357<U(T-,R-R-,T-)>,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<3,357<T->,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(_catch,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/catch.d.ts@1901
     */
    public native <R> Observable<UnionOfRAndT<T, R>> _catch(Function2<Object, Observable<T>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
    /** 
      * Std Signature : S(_do,357<T->,,P(d351<T->))
      * TE Signature : S(_do,P(d351))
      * 
     */
    public native Observable<T> _do(CompletionObserver<T> observer);
    /** 
      * Std Signature : S(_do,357<T->,,P(d352<T->))
      * TE Signature : S(_do,P(d352))
      * 
     */
    public native Observable<T> _do(ErrorObserver<T> observer);
    /** 
      * Std Signature : S(_do,357<T->,,P(d353<T->))
      * TE Signature : S(_do,P(d353))
      * 
     */
    public native Observable<T> _do(NextObserver<T> observer);
    /** 
      * Std Signature : S(_do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<T> _do(Action1<T> next);
    /** 
      * Std Signature : S(_do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<T> _do(Action1<T> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(_do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(_do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/do.d.ts@91
     */
    public native Observable<T> _do(Action1<T> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(_do,357<T->,,P(dU(T-351<T->,352<5>,353<5>)))
      * TE Signature : S(_do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/do.d.ts@230
      * VERSION 1
     */
    public native Observable<T> _do(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observer);
    /** 
      * Std Signature : S(_finally,357<T->,,P(dF--S(?,429,,)------)))
      * TE Signature : S(_finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/finally.d.ts@432
     */
    public native Observable<T> _finally(Action callback);
    /** 
      * Std Signature : S(_subscribe,U(-348,205,349),,P(d354<3>))
      * TE Signature : S(_subscribe,P(d354))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2902
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid _subscribe(Subscriber<Object> subscriber);
    /** 
      * Std Signature : S(_switch,T-,,)
      * TE Signature : S(_switch,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switch.d.ts@1934
     */
    public native T _switch();
    /** 
      * Std Signature : S(_trySubscribe,U(-348,205,349),,P(d354<T->))
      * TE Signature : S(_trySubscribe,P(d354))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2406
     */
    public native TeardownLogic_UnionOfAnonymousSubscriptionAndFunctionAndVoid _trySubscribe(Subscriber<T> sink);
    /** 
      * Std Signature : S(audit,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,U(-16<3>,358<9>)>))
      * TE Signature : S(audit,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/audit.d.ts@1926
     */
    public native Observable<T> audit(Function1<T, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> durationSelector);
    /** 
      * Std Signature : S(auditTime,357<T->,,P(d2))
      * TE Signature : S(auditTime,P(d2))
      * 
     */
    public native Observable<T> auditTime(Number duration);
    /** 
      * Std Signature : S(auditTime,357<T->,,P(d2),P(d356))
      * TE Signature : S(auditTime,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/auditTime.d.ts@2095
     */
    public native Observable<T> auditTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(buffer,357<7<T->>,,P(d357<3>))
      * TE Signature : S(buffer,P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/buffer.d.ts@1245
     */
    public native Observable<Array<T>> buffer(Observable<Object> closingNotifier);
    /** 
      * Std Signature : S(bufferCount,357<7<T->>,,P(d2))
      * TE Signature : S(bufferCount,P(d2))
      * 
     */
    public native Observable<Array<T>> bufferCount(Number bufferSize);
    /** 
      * Std Signature : S(bufferCount,357<7<T->>,,P(d2),P(d2))
      * TE Signature : S(bufferCount,P(d2),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferCount.d.ts@1773
     */
    public native Observable<Array<T>> bufferCount(Number bufferSize, Number startBufferEvery /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2))
      * TE Signature : S(bufferTime,P(d2))
      * 
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2))
      * 
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2),P(d2),P(d2))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferTime.d.ts@369
      * VERSION 2
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, Number maxBufferSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2),P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferTime.d.ts@212
      * VERSION 1
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan, Number bufferCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferTime,357<7<T->>,,P(d2),P(d356))
      * TE Signature : S(bufferTime,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferTime.d.ts@87
     */
    public native Observable<Array<T>> bufferTime(Number bufferTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(bufferToggle,357<7<T->>,O-,P(d16<O->),P(dFP1-,R--S(?,4,,P(d3))------)<O-,U(-16<3>,358<9>)>))
      * TE Signature : S(bufferToggle,P(d16),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<T>> bufferToggle(PromiseLike<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<T->>,O-,P(d358<O->),P(dFP1-,R--S(?,4,,P(d3))------)<O-,U(-16<3>,358<9>)>))
      * TE Signature : S(bufferToggle,P(d358),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <O> Observable<Array<T>> bufferToggle(Subscribable<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferToggle,357<7<T->>,O-,P(dU(O-16<O->,358<5>)),P(dFP1-,R--S(?,4,,P(d3))------)<O-,U(-16<3>,358<9>)>))
      * TE Signature : S(bufferToggle,P(dU(-16,358)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferToggle.d.ts@1754
     */
    public native <O> Observable<Array<T>> bufferToggle(SubscribableOrPromise_UnionOfPromiseLikeOfOAndSubscribableOfO<O> openings, Function1<O, SubscribableOrPromise_UnionOfPromiseLikeOfObjectAndSubscribableOfObject> closingSelector);
    /** 
      * Std Signature : S(bufferWhen,357<7<T->>,,P(dFR--S(?,3,,)------)<357<3>>))
      * TE Signature : S(bufferWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/bufferWhen.d.ts@1412
     */
    public native Observable<Array<T>> bufferWhen(Function<Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(catch,357<U(T-,R-R-,T-)>,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<3,357<T->,U(R-5<R->,16<14>,358<14>)>))
      * TE Signature : S(catch,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/catch.d.ts@1901
     */
    @JsMethod(name = "catch")
    public native <R> Observable<UnionOfRAndT<T, R>> catch_(Function2<Object, Observable<T>, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> selector);
    /** 
      * Std Signature : S(combineAll,357<R->,R-,)
      * TE Signature : S(combineAll,)
      * 
     */
    public native <R> Observable<R> combineAll();
    /** 
      * Std Signature : S(combineAll,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<3,R->))
      * TE Signature : S(combineAll,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineAll.d.ts@1972
     */
    public native <R> Observable<R> combineAll(Function1<Object, R> project /* optional */);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,)
      * TE Signature : S(combineLatest,)
      * 
     */
    public native <R> Observable<R> combineLatest();
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D16<T->))
      * TE Signature : S(combineLatest,P(D16))
      * 
     */
    public native <R> Observable<R> combineLatest(PromiseLike<T>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D358<T->))
      * TE Signature : S(combineLatest,P(D358))
      * 
     */
    public native <R> Observable<R> combineLatest(Subscribable<T>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(D5<T->))
      * TE Signature : S(combineLatest,P(D5))
      * 
     */
    public native <R> Observable<R> combineLatest(ArrayLike<T>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(combineLatest,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> combineLatest(Function1<T, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(DU(T-,R-FP1-,R--S(?,7,,P(d6))------)<T-,R->,5<8>,16<8>,358<8>)))
      * TE Signature : S(combineLatest,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@2327
      * VERSION 11
     */
    public native <R> Observable<R> combineLatest(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R>... observables);
    /** 
      * Std Signature : S(combineLatest,357<25<T-,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(combineLatest,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> combineLatest(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(combineLatest,P(d16),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(PromiseLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<T-,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(combineLatest,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> combineLatest(Subscribable<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(combineLatest,P(d358),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(Subscribable<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<T-,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(combineLatest,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> combineLatest(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(combineLatest,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> combineLatest(ArrayLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<7<T->>,R-,P(d7<U(T-5<T->,16<7>,358<7>)>))
      * TE Signature : S(combineLatest,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@2482
      * VERSION 12
     */
    public native <R> Observable<Array<T>> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T>> array);
    /** 
      * Std Signature : S(combineLatest,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<7>,358<7>)>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,TOther-,R->))
      * TE Signature : S(combineLatest,P(d7),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@2599
      * VERSION 13
     */
    public native <TOther, R> Observable<R> combineLatest(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<T, TOther, R> project);
    /** 
      * Std Signature : S(combineLatest,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(combineLatest,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@253
     */
    public native <R> Observable<R> combineLatest(Function1<T, R> project);
    /** 
      * Std Signature : S(combineLatest,357<25<T-,T2->>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@1432
      * VERSION 6
     */
    public native <T2> Observable<Tuple<T, T2>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@357
      * VERSION 1
     */
    public native <T2, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(combineLatest,357<24<T-,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@1545
      * VERSION 7
     */
    public native <T2, T3> Observable<TupleOf3<T, T2, T3>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,T2-,T3-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@498
      * VERSION 2
     */
    public native <T2, T3, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<T, T2, T3, R> project);
    /** 
      * Std Signature : S(combineLatest,357<23<T-,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@1691
      * VERSION 8
     */
    public native <T2, T3, T4> Observable<TupleOf4<T, T2, T3, T4>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,T2-,T3-,T4-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@676
      * VERSION 3
     */
    public native <T2, T3, T4, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<T, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(combineLatest,357<22<T-,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@1870
      * VERSION 9
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<T, T2, T3, T4, T5>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,8,,P(d3),P(d4),P(d5),P(d6),P(d7))------)<T-,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@891
      * VERSION 4
     */
    public native <T2, T3, T4, T5, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<T, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(combineLatest,357<21<T-,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@2082
      * VERSION 10
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<T, T2, T3, T4, T5, T6>> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(combineLatest,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,9,,P(d3),P(d4),P(d5),P(d6),P(d7),P(d8))------)<T-,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(combineLatest,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts@1143
      * VERSION 5
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> combineLatest(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<T, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(concat,357<T->,,)
      * TE Signature : S(concat,)
      * 
     */
    public native Observable<T> concat();
    /** 
      * Std Signature : S(concat,357<T->,,P(D16<T->))
      * TE Signature : S(concat,P(D16))
      * 
     */
    public native Observable<T> concat(PromiseLike<T>... observables);
    /** 
      * Std Signature : S(concat,357<T->,,P(D356))
      * TE Signature : S(concat,P(D356))
      * 
     */
    public native Observable<T> concat(IScheduler... observables);
    /** 
      * Std Signature : S(concat,357<T->,,P(D358<T->))
      * TE Signature : S(concat,P(D358))
      * 
     */
    public native Observable<T> concat(Subscribable<T>... observables);
    /** 
      * Std Signature : S(concat,357<T->,,P(D5<T->))
      * TE Signature : S(concat,P(D5))
      * 
     */
    public native Observable<T> concat(ArrayLike<T>... observables);
    /** 
      * Std Signature : S(concat,357<T->,,P(DU(T-5<T->,356,16<5>,358<5>)))
      * TE Signature : S(concat,P(DU(-5,356,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@1184
      * VERSION 6
     */
    public native Observable<T> concat(UnionOfArrayLikeOfTAndISchedulerAndPromiseLikeOfTAndSubscribableOfT<T>... observables);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(concat,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(concat,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<T->,,P(d356))
      * TE Signature : S(concat,P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@104
     */
    public native Observable<T> concat(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(concat,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(Subscribable<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(concat,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(concat,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(concat,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)))
      * TE Signature : S(concat,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@199
      * VERSION 1
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@328
      * VERSION 2
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@491
      * VERSION 3
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@688
      * VERSION 4
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(concat,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(d356))
      * TE Signature : S(concat,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concat.d.ts@919
      * VERSION 5
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> concat(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(concatAll,T-,,)
      * TE Signature : S(concatAll,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concatAll.d.ts@90
     */
    public native T concatAll();
    /** 
      * Std Signature : S(concatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concatMap.d.ts@61
     */
    public native <R> Observable<R> concatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(concatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(concatMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concatMap.d.ts@196
      * VERSION 1
     */
    public native <I, R> Observable<R> concatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(concatMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> concatMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(concatMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(concatMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> concatMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(concatMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(concatMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> concatMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(concatMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> concatMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(concatMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)))
      * TE Signature : S(concatMapTo,P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concatMapTo.d.ts@61
     */
    public native <R> Observable<R> concatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(concatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(concatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/concatMapTo.d.ts@172
      * VERSION 1
     */
    public native <I, R> Observable<R> concatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(count,357<2>,,)
      * TE Signature : S(count,)
      * 
     */
    public native Observable<Number> count();
    /** 
      * Std Signature : S(count,357<2>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(count,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/count.d.ts@2094
     */
    public native Observable<Number> count(Function3<T, Number, Observable<T>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(debounce,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,U(-16<2>,358<9>)>))
      * TE Signature : S(debounce,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/debounce.d.ts@2167
     */
    public native Observable<T> debounce(Function1<T, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(debounceTime,357<T->,,P(d2))
      * TE Signature : S(debounceTime,P(d2))
      * 
     */
    public native Observable<T> debounceTime(Number dueTime);
    /** 
      * Std Signature : S(debounceTime,357<T->,,P(d2),P(d356))
      * TE Signature : S(debounceTime,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/debounceTime.d.ts@2243
     */
    public native Observable<T> debounceTime(Number dueTime, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(defaultIfEmpty,357<T->,,)
      * TE Signature : S(defaultIfEmpty,)
      * 
     */
    public native Observable<T> defaultIfEmpty();
    /** 
      * Std Signature : S(defaultIfEmpty,357<T->,,P(dT-))
      * TE Signature : S(defaultIfEmpty,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/defaultIfEmpty.d.ts@44
     */
    public native Observable<T> defaultIfEmpty(T defaultValue /* optional */);
    /** 
      * Std Signature : S(delay,357<T->,,P(d13))
      * TE Signature : S(delay,P(d13))
      * 
     */
    public native Observable<T> delay(Date delay);
    /** 
      * Std Signature : S(delay,357<T->,,P(d13),P(d356))
      * TE Signature : S(delay,P(d13),P(d356))
      * 
     */
    public native Observable<T> delay(Date delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<T->,,P(d2))
      * TE Signature : S(delay,P(d2))
      * 
     */
    public native Observable<T> delay(Number delay);
    /** 
      * Std Signature : S(delay,357<T->,,P(d2),P(d356))
      * TE Signature : S(delay,P(d2),P(d356))
      * 
     */
    public native Observable<T> delay(Number delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delay,357<T->,,P(dU(-13,2)))
      * TE Signature : S(delay,P(dU(-13,2)))
      * 
     */
    public native Observable<T> delay(UnionOfDateAndNumber delay);
    /** 
      * Std Signature : S(delay,357<T->,,P(dU(-13,2)),P(d356))
      * TE Signature : S(delay,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/delay.d.ts@1788
     */
    public native Observable<T> delay(UnionOfDateAndNumber delay, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(delayWhen,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,357<3>>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<T> delayWhen(Function1<T, Observable<Object>> delayDurationSelector);
    /** 
      * Std Signature : S(delayWhen,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,357<3>>),P(d357<3>))
      * TE Signature : S(delayWhen,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/delayWhen.d.ts@2267
     */
    public native Observable<T> delayWhen(Function1<T, Observable<Object>> delayDurationSelector, Observable<Object> subscriptionDelay /* optional */);
    /** 
      * Std Signature : S(dematerialize,357<3>,,)
      * TE Signature : S(dematerialize,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/dematerialize.d.ts@1629
     */
    public native Observable<Object> dematerialize();
    /** 
      * Std Signature : S(distinct,357<T->,K-,)
      * TE Signature : S(distinct,)
      * 
     */
    public native <K> Observable<T> distinct();
    /** 
      * Std Signature : S(distinct,357<T->,K-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K> Observable<T> distinct(Function1<T, K> keySelector /* optional */);
    /** 
      * Std Signature : S(distinct,357<T->,K-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->),P(d357<3>))
      * TE Signature : S(distinct,P(dF--S(?,P(d3))------)),P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/distinct.d.ts@2330
     */
    public native <K> Observable<T> distinct(Function1<T, K> keySelector /* optional */, Observable<Object> flushes /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<T->,,)
      * TE Signature : S(distinctUntilChanged,)
      * 
     */
    public native Observable<T> distinctUntilChanged();
    /** 
      * Std Signature : S(distinctUntilChanged,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,6,27>))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/distinctUntilChanged.d.ts@44
     */
    public native Observable<T> distinctUntilChanged(Function2<T, T, Boolean> compare /* optional */);
    /** 
      * Std Signature : S(distinctUntilChanged,357<T->,K-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<K-,6,27>),P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->))
      * TE Signature : S(distinctUntilChanged,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/distinctUntilChanged.d.ts@164
      * VERSION 1
     */
    public native <K> Observable<T> distinctUntilChanged(Function2<K, K, Boolean> compare, Function1<T, K> keySelector);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<T->,,P(d1))
      * TE Signature : S(distinctUntilKeyChanged,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/distinctUntilKeyChanged.d.ts@44
     */
    public native Observable<T> distinctUntilKeyChanged(String key);
    /** 
      * Std Signature : S(distinctUntilKeyChanged,357<T->,K-,P(d1),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<K-,6,27>))
      * TE Signature : S(distinctUntilKeyChanged,P(d1),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/distinctUntilKeyChanged.d.ts@145
      * VERSION 1
     */
    public native <K> Observable<T> distinctUntilKeyChanged(String key, Function2<K, K, Boolean> compare);
    /** 
      * Std Signature : S(do,357<T->,,P(d351<T->))
      * TE Signature : S(do,P(d351))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(CompletionObserver<T> observer);
    /** 
      * Std Signature : S(do,357<T->,,P(d352<T->))
      * TE Signature : S(do,P(d352))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(ErrorObserver<T> observer);
    /** 
      * Std Signature : S(do,357<T->,,P(d353<T->))
      * TE Signature : S(do,P(d353))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(NextObserver<T> observer);
    /** 
      * Std Signature : S(do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(Action1<T> next);
    /** 
      * Std Signature : S(do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(Action1<T> next, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(do,357<T->,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(do,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/do.d.ts@91
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(Action1<T> next, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(do,357<T->,,P(dU(T-351<T->,352<5>,353<5>)))
      * TE Signature : S(do,P(dU(-351,352,353)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/do.d.ts@230
      * VERSION 1
     */
    @JsMethod(name = "do")
    public native Observable<T> do_(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observer);
    /** 
      * Std Signature : S(elementAt,357<T->,,P(d2))
      * TE Signature : S(elementAt,P(d2))
      * 
     */
    public native Observable<T> elementAt(Number index);
    /** 
      * Std Signature : S(elementAt,357<T->,,P(d2),P(dT-))
      * TE Signature : S(elementAt,P(d2),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/elementAt.d.ts@1748
     */
    public native Observable<T> elementAt(Number index, T defaultValue /* optional */);
    /** 
      * Std Signature : S(every,357<27>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(every,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/every.d.ts@741
     */
    public native Observable<Boolean> every(Function3<T, Number, Observable<T>, Boolean> predicate);
    /** 
      * Std Signature : S(exhaust,357<T->,,)
      * TE Signature : S(exhaust,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/exhaust.d.ts@1645
     */
    public native Observable<T> exhaust();
    /** 
      * Std Signature : S(exhaustMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/exhaustMap.d.ts@61
     */
    public native <R> Observable<R> exhaustMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(exhaustMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(exhaustMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/exhaustMap.d.ts@197
      * VERSION 1
     */
    public native <I, R> Observable<R> exhaustMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(expand,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,357<6>>))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native Observable<T> expand(Function2<T, Number, Observable<T>> project);
    /** 
      * Std Signature : S(expand,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,357<6>>),P(d2))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d4))------)),P(d2))
      * 
     */
    public native Observable<T> expand(Function2<T, Number, Observable<T>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(expand,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,357<6>>),P(d2),P(d356))
      * TE Signature : S(expand,P(dF--S(?,P(d3),P(d4))------)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts@327
     */
    public native Observable<T> expand(Function2<T, Number, Observable<T>> project, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(filter,357<S->,S-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,27>))
      * TE Signature : S(filter,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/filter.d.ts@44
     */
    public native <S> Observable<S> filter(Function2<T, Number, Boolean> predicate);
    /** 
      * Std Signature : S(finally,357<T->,,P(dF--S(?,429,,)------)))
      * TE Signature : S(finally,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/finally.d.ts@432
     */
    @JsMethod(name = "finally")
    public native Observable<T> finally_(Action callback);
    /** 
      * Std Signature : S(find,357<S->,S-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,27>))
      * TE Signature : S(find,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/find.d.ts@128
     */
    public native <S> Observable<S> find(Function2<T, Number, Boolean> predicate);
    /** 
      * Std Signature : S(findIndex,357<2>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(findIndex,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/findIndex.d.ts@1444
     */
    public native Observable<Number> findIndex(Function3<T, Number, Observable<T>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/first.d.ts@44
     */
    public native <S> Observable<S> first(Function3<T, Number, Observable<T>, Boolean> predicate);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(d349))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d349))
      * 
     */
    public native <S> Observable<S> first(Function3<T, Number, Observable<T>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(first,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(d349),P(dS-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d349),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/first.d.ts@433
      * VERSION 2
     */
    public native <S> Observable<S> first(Function3<T, Number, Observable<T>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,R->))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <R> Observable<R> first(Function3<T, Number, Observable<T>, Boolean> predicate, Function2<T, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(first,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,R->),P(dR-))
      * TE Signature : S(first,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(dF--S(?,P(d3),P(d4))------)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/first.d.ts@774
      * VERSION 4
     */
    public native <R> Observable<R> first(Function3<T, Number, Observable<T>, Boolean> predicate, Function2<T, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <R> Observable<R> flatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(flatMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap.d.ts@301
     */
    public native <R> Observable<R> flatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> flatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(flatMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap.d.ts@456
      * VERSION 1
     */
    public native <I, R> Observable<R> flatMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)))
      * 
     */
    public native <R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(flatMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)),P(d2))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo.d.ts@301
     */
    public native <R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(flatMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(flatMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo.d.ts@432
      * VERSION 1
     */
    public native <I, R> Observable<R> flatMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Promise<Void> forEach(Action1<T> next);
    /** 
      * Std Signature : S(forEach,88<349>,,P(dFP1--S(?,429,,P(d3))------)<T->),P(d3))
      * TE Signature : S(forEach,P(dF--S(?,P(d3))------)),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2818
     */
    public native Promise<Void> forEach(Action1<T> next, Object PromiseCtor /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,T->>,K-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts@174
     */
    public native <K> Observable<GroupedObservable<K, T>> groupBy(Function1<T, K> keySelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,T->>,K-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->),P(d349),P(dFP1-,R--S(?,4,,P(d3))------)<361<K-,T->,357<3>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(d349),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts@301
      * VERSION 1
     */
    public native <K> Observable<GroupedObservable<K, T>> groupBy(Function1<T, K> keySelector, Void elementSelector, Function1<GroupedObservable<K, T>, Observable<Object>> durationSelector);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->),P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<T, K> keySelector, Function1<T, R> elementSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->),P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->),P(dFP1-,R--S(?,4,,P(d3))------)<361<K-,R->,357<3>>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts@524
      * VERSION 2
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<T, K> keySelector, Function1<T, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */);
    /** 
      * Std Signature : S(groupBy,357<361<K-,R->>,K-,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,K->),P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->),P(dFP1-,R--S(?,4,,P(d3))------)<361<K-,R->,357<3>>),P(dFR--S(?,3,,)------)<359<R->>))
      * TE Signature : S(groupBy,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/groupBy.d.ts@763
      * VERSION 3
     */
    public native <K, R> Observable<GroupedObservable<K, R>> groupBy(Function1<T, K> keySelector, Function1<T, R> elementSelector /* optional */, Function1<GroupedObservable<K, R>, Observable<Object>> durationSelector /* optional */, Function<Subject<R>> subjectSelector /* optional */);
    /** 
      * Std Signature : S(ignoreElements,357<T->,,)
      * TE Signature : S(ignoreElements,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/ignoreElements.d.ts@401
     */
    public native Observable<T> ignoreElements();
    /** 
      * Std Signature : S(isEmpty,357<27>,,)
      * TE Signature : S(isEmpty,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/isEmpty.d.ts@309
     */
    public native Observable<Boolean> isEmpty();
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/last.d.ts@44
     */
    public native <S> Observable<S> last(Function3<T, Number, Observable<T>, Boolean> predicate);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(d349))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d349))
      * 
     */
    public native <S> Observable<S> last(Function3<T, Number, Observable<T>, Boolean> predicate, Void resultSelector);
    /** 
      * Std Signature : S(last,357<S->,S-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(d349),P(dS-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d349),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/last.d.ts@431
      * VERSION 2
     */
    public native <S> Observable<S> last(Function3<T, Number, Observable<T>, Boolean> predicate, Void resultSelector, S defaultValue /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,R->))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <R> Observable<R> last(Function3<T, Number, Observable<T>, Boolean> predicate, Function2<T, Number, R> resultSelector /* optional */);
    /** 
      * Std Signature : S(last,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,R->),P(dR-))
      * TE Signature : S(last,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(dF--S(?,P(d3),P(d4))------)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/last.d.ts@770
      * VERSION 4
     */
    public native <R> Observable<R> last(Function3<T, Number, Observable<T>, Boolean> predicate, Function2<T, Number, R> resultSelector /* optional */, R defaultValue /* optional */);
    /** 
      * Std Signature : S(let,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<357<T->,6<R->>))
      * TE Signature : S(let,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/let.d.ts@130
     */
    public native <R> Observable<R> let(Function1<Observable<T>, Observable<R>> func);
    /** 
      * Std Signature : S(letBind,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<357<T->,6<R->>))
      * TE Signature : S(letBind,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/let.d.ts@130
     */
    public native <R> Observable<R> letBind(Function1<Observable<T>, Observable<R>> func);
    /** 
      * Std Signature : S(lift,357<R->,R-,P(d355<T-,R->))
      * TE Signature : S(lift,P(d355))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2153
      * Creates a new Observable, with this Observable as the source, and the passed
      * operator defined as the new observable's operator.
     */
    public native <R> Observable<R> lift(Operator<T, R> operator);
    /** 
      * Std Signature : S(map,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,R->))
      * TE Signature : S(map,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/map.d.ts@1592
     */
    public native <R> Observable<R> map(Function2<T, Number, R> project);
    /** 
      * Std Signature : S(mapTo,357<R->,R-,P(dR-))
      * TE Signature : S(mapTo,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mapTo.d.ts@1028
     */
    public native <R> Observable<R> mapTo(R value);
    /** 
      * Std Signature : S(materialize,357<708<T->>,,)
      * TE Signature : S(materialize,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/materialize.d.ts@2075
     */
    public native Observable<Notification<T>> materialize();
    /** 
      * Std Signature : S(max,357<T->,,)
      * TE Signature : S(max,)
      * 
     */
    public native Observable<T> max();
    /** 
      * Std Signature : S(max,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,6,2>))
      * TE Signature : S(max,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/max.d.ts@1213
     */
    public native Observable<T> max(Function2<T, T, Number> comparer /* optional */);
    /** 
      * Std Signature : S(merge,357<T->,,)
      * TE Signature : S(merge,)
      * 
     */
    public native Observable<T> merge();
    /** 
      * Std Signature : S(merge,357<T->,,P(D16<T->))
      * TE Signature : S(merge,P(D16))
      * 
     */
    public native Observable<T> merge(PromiseLike<T>... observables);
    /** 
      * Std Signature : S(merge,357<T->,,P(D2))
      * TE Signature : S(merge,P(D2))
      * 
     */
    public native Observable<T> merge(Number... observables);
    /** 
      * Std Signature : S(merge,357<T->,,P(D356))
      * TE Signature : S(merge,P(D356))
      * 
     */
    public native Observable<T> merge(IScheduler... observables);
    /** 
      * Std Signature : S(merge,357<T->,,P(D358<T->))
      * TE Signature : S(merge,P(D358))
      * 
     */
    public native Observable<T> merge(Subscribable<T>... observables);
    /** 
      * Std Signature : S(merge,357<T->,,P(D5<T->))
      * TE Signature : S(merge,P(D5))
      * 
     */
    public native Observable<T> merge(ArrayLike<T>... observables);
    /** 
      * Std Signature : S(merge,357<T->,,P(DU(T-5<T->,356,2,16<5>,358<5>)))
      * TE Signature : S(merge,P(DU(-5,356,2,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@2378
      * VERSION 12
     */
    public native Observable<T> merge(UnionOfArrayLikeOfTAndISchedulerAndNumberAndPromiseLikeOfTAndSubscribableOfT<T>... observables);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->))
      * TE Signature : S(merge,P(d16))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->),P(d2))
      * TE Signature : S(merge,P(d16),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d16),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(PromiseLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d16<T2->),P(d356))
      * TE Signature : S(merge,P(d16),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(PromiseLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<T->,,P(d2))
      * TE Signature : S(merge,P(d2))
      * 
     */
    public native Observable<T> merge(Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<T->,,P(d2),P(d356))
      * TE Signature : S(merge,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@198
      * VERSION 1
     */
    public native Observable<T> merge(Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<T->,,P(d356))
      * TE Signature : S(merge,P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@104
     */
    public native Observable<T> merge(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->))
      * TE Signature : S(merge,P(d358))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(Subscribable<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->),P(d2))
      * TE Signature : S(merge,P(d358),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d358),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(Subscribable<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d358<T2->),P(d356))
      * TE Signature : S(merge,P(d358),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(Subscribable<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->))
      * TE Signature : S(merge,P(d5))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->),P(d2))
      * TE Signature : S(merge,P(d5),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->),P(d2),P(d356))
      * TE Signature : S(merge,P(d5),P(d2),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ArrayLike<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(d5<T2->),P(d356))
      * TE Signature : S(merge,P(d5),P(d356))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ArrayLike<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)))
      * TE Signature : S(merge,P(dU(-5,16,358)))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@441
      * VERSION 3
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-T-,T2-)>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@313
      * VERSION 2
     */
    public native <T2> Observable<UnionOfTAndT2<T, T2>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@752
      * VERSION 5
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-T-,T2-,T3-)>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@590
      * VERSION 4
     */
    public native <T2, T3> Observable<UnionOfTAndT2AndT3<T, T2, T3>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@1131
      * VERSION 7
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-T-,T2-,T3-,T4-)>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@935
      * VERSION 6
     */
    public native <T2, T3, T4> Observable<UnionOfTAndT2AndT3AndT4<T, T2, T3, T4>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@1578
      * VERSION 9
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-T-,T2-,T3-,T4-,T5-)>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@1348
      * VERSION 8
     */
    public native <T2, T3, T4, T5> Observable<UnionOfTAndT2AndT3AndT4AndT5<T, T2, T3, T4, T5>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(d2))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2))
      * 
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(d2),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@2093
      * VERSION 11
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Number concurrent /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(merge,357<U(T-,T2-,T3-,T4-,T5-,T6-T-,T2-,T3-,T4-,T5-,T6-)>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(d356))
      * TE Signature : S(merge,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/merge.d.ts@1829
      * VERSION 10
     */
    public native <T2, T3, T4, T5, T6> Observable<UnionOfTAndT2AndT3AndT4AndT5AndT6<T, T2, T3, T4, T5, T6>> merge(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(mergeAll,T-,,)
      * TE Signature : S(mergeAll,)
      * 
     */
    public native T mergeAll();
    /** 
      * Std Signature : S(mergeAll,T-,,P(d2))
      * TE Signature : S(mergeAll,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeAll.d.ts@272
     */
    public native T mergeAll(Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <R> Observable<R> mergeMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(mergeMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap.d.ts@301
     */
    public native <R> Observable<R> mergeMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(mergeMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap.d.ts@456
      * VERSION 1
     */
    public native <I, R> Observable<R> mergeMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
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
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)))
      * 
     */
    public native <R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)),P(d2))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo.d.ts@301
     */
    public native <R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(mergeMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->),P(d2))
      * TE Signature : S(mergeMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo.d.ts@432
      * VERSION 1
     */
    public native <I, R> Observable<R> mergeMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector, Number concurrent /* optional */);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<R-,T-,357<6>>),P(dR-))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d4))------)),P(d3))
      * 
     */
    public native <R> Observable<R> mergeScan(Function2<R, T, Observable<R>> accumulator, R seed);
    /** 
      * Std Signature : S(mergeScan,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<R-,T-,357<6>>),P(dR-),P(d2))
      * TE Signature : S(mergeScan,P(dF--S(?,P(d3),P(d4))------)),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeScan.d.ts@1442
     */
    public native <R> Observable<R> mergeScan(Function2<R, T, Observable<R>> accumulator, R seed, Number concurrent /* optional */);
    /** 
      * Std Signature : S(min,357<T->,,)
      * TE Signature : S(min,)
      * 
     */
    public native Observable<T> min();
    /** 
      * Std Signature : S(min,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,6,2>))
      * TE Signature : S(min,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/min.d.ts@1218
     */
    public native Observable<T> min(Function2<T, T, Number> comparer /* optional */);
    /** 
      * Std Signature : S(multicast,825<T->,,P(d359<T->))
      * TE Signature : S(multicast,P(d359))
      * 
     */
    public native ConnectableObservable<T> multicast(Subject<T> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,825<T->,,P(dFR--S(?,3,,)------)<359<T->>))
      * TE Signature : S(multicast,P(dF--S(?,)------)))
      * 
     */
    public native ConnectableObservable<T> multicast(Function<Subject<T>> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(multicast,357<T->,,P(dFR--S(?,3,,)------)<359<T->>),P(dFP1-,R--S(?,4,,P(d3))------)<357<T->,6<T->>))
      * TE Signature : S(multicast,P(dF--S(?,)------)),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/multicast.d.ts@381
      * VERSION 1
     */
    public native Observable<T> multicast(Function<Subject<T>> SubjectFactory, Function1<Observable<T>, Observable<T>> selector /* optional */);
    /** 
      * Std Signature : S(multicast,825<T->,,P(dU(T-FR--S(?,5,,)------)<359<T->>,6)))
      * TE Signature : S(multicast,P(dU(-F--S(?,)------),359)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/multicast.d.ts@243
     */
    public native ConnectableObservable<T> multicast(factoryOrValue_UnionOfFunctionOfSubjectOfTAndSubjectOfT<T> subjectOrSubjectFactory);
    /** 
      * Std Signature : S(observeOn,357<T->,,P(d356))
      * TE Signature : S(observeOn,P(d356))
      * 
     */
    public native Observable<T> observeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(observeOn,357<T->,,P(d356),P(d2))
      * TE Signature : S(observeOn,P(d356),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/observeOn.d.ts@3303
     */
    public native Observable<T> observeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(pairwise,357<25<T-,5>>,,)
      * TE Signature : S(pairwise,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/pairwise.d.ts@1395
     */
    public native Observable<Tuple<T, T>> pairwise();
    /** 
      * Std Signature : S(partition,25<357<T->,3>,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,27>))
      * TE Signature : S(partition,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/partition.d.ts@2150
     */
    public native Tuple<Observable<T>, Observable<T>> partition(Function1<T, Boolean> predicate);
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/pluck.d.ts@1061
     */
    public native <R> Observable<R> pluck(String... properties);
    /** 
      * Std Signature : S(publish,825<T->,,)
      * TE Signature : S(publish,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/publish.d.ts@121
     */
    public native ConnectableObservable<T> publish();
    /** 
      * Std Signature : S(publish,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<357<T->,6<T->>))
      * TE Signature : S(publish,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/publish.d.ts@204
      * VERSION 1
     */
    public native Observable<T> publish(Function1<Observable<T>, Observable<T>> selector);
    /** 
      * Std Signature : S(publishBehavior,825<T->,,P(dT-))
      * TE Signature : S(publishBehavior,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/publishBehavior.d.ts@231
     */
    public native ConnectableObservable<T> publishBehavior(T value);
    /** 
      * Std Signature : S(publishLast,825<T->,,)
      * TE Signature : S(publishLast,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/publishLast.d.ts@211
     */
    public native ConnectableObservable<T> publishLast();
    /** 
      * Std Signature : S(publishReplay,825<T->,,)
      * TE Signature : S(publishReplay,)
      * 
     */
    public native ConnectableObservable<T> publishReplay();
    /** 
      * Std Signature : S(publishReplay,825<T->,,P(d2))
      * TE Signature : S(publishReplay,P(d2))
      * 
     */
    public native ConnectableObservable<T> publishReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<T->,,P(d2),P(d2))
      * TE Signature : S(publishReplay,P(d2),P(d2))
      * 
     */
    public native ConnectableObservable<T> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(publishReplay,825<T->,,P(d2),P(d2),P(d356))
      * TE Signature : S(publishReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/publishReplay.d.ts@318
     */
    public native ConnectableObservable<T> publishReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(race,357<T->,,)
      * TE Signature : S(race,)
      * 
     */
    public native Observable<T> race();
    /** 
      * Std Signature : S(race,357<T->,,P(D357<T->))
      * TE Signature : S(race,P(D357))
      * 
     */
    public native Observable<T> race(Observable<T>... observables);
    /** 
      * Std Signature : S(race,357<T->,,P(D7<357<T->>))
      * TE Signature : S(race,P(D7))
      * 
     */
    public native Observable<T> race(Array<Observable<T>>... observables);
    /** 
      * Std Signature : S(race,357<T->,,P(DU(T-7<357<T->>,5)))
      * TE Signature : S(race,P(DU(-7,357)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/race.d.ts@496
      * VERSION 2
     */
    public native Observable<T> race(UnionOfArrayOfObservableOfTAndObservableOfT<T>... observables);
    /** 
      * Std Signature : S(race,357<T->,,P(d7<357<T->>))
      * TE Signature : S(race,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/race.d.ts@285
     */
    public native Observable<T> race(Array<Observable<T>> observables);
    /** 
      * Std Signature : S(reduce,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<R-,T-,2,7>),P(dR-))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/reduce.d.ts@403
      * VERSION 2
     */
    public native <R> Observable<R> reduce(Function3<R, T, Number, R> accumulator, R seed);
    /** 
      * Std Signature : S(reduce,357<7<T->>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<7<T->,9,2,7>),P(d7<T->))
      * TE Signature : S(reduce,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/reduce.d.ts@262
      * VERSION 1
     */
    public native Observable<Array<T>> reduce(Function3<Array<T>, T, Number, Array<T>> accumulator, Array<T> seed);
    /** 
      * Std Signature : S(repeat,357<T->,,)
      * TE Signature : S(repeat,)
      * 
     */
    public native Observable<T> repeat();
    /** 
      * Std Signature : S(repeat,357<T->,,P(d2))
      * TE Signature : S(repeat,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/repeat.d.ts@519
     */
    public native Observable<T> repeat(Number count /* optional */);
    /** 
      * Std Signature : S(repeatWhen,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<357<3>,5>))
      * TE Signature : S(repeatWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/repeatWhen.d.ts@811
     */
    public native Observable<T> repeatWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(retry,357<T->,,)
      * TE Signature : S(retry,)
      * 
     */
    public native Observable<T> retry();
    /** 
      * Std Signature : S(retry,357<T->,,P(d2))
      * TE Signature : S(retry,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/retry.d.ts@968
     */
    public native Observable<T> retry(Number count /* optional */);
    /** 
      * Std Signature : S(retryWhen,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<357<3>,5>))
      * TE Signature : S(retryWhen,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/retryWhen.d.ts@826
     */
    public native Observable<T> retryWhen(Function1<Observable<Object>, Observable<Object>> notifier);
    /** 
      * Std Signature : S(sample,357<T->,,P(d357<3>))
      * TE Signature : S(sample,P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/sample.d.ts@1418
     */
    public native Observable<T> sample(Observable<Object> notifier);
    /** 
      * Std Signature : S(sampleTime,357<T->,,P(d2))
      * TE Signature : S(sampleTime,P(d2))
      * 
     */
    public native Observable<T> sampleTime(Number period);
    /** 
      * Std Signature : S(sampleTime,357<T->,,P(d2),P(d356))
      * TE Signature : S(sampleTime,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/sampleTime.d.ts@1640
     */
    public native Observable<T> sampleTime(Number period, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<R-,T-,2,7>))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    public native <R> Observable<R> scan(Function3<R, T, Number, R> accumulator);
    /** 
      * Std Signature : S(scan,357<R->,R-,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<R-,T-,2,7>),P(dR-))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/scan.d.ts@316
      * VERSION 2
     */
    public native <R> Observable<R> scan(Function3<R, T, Number, R> accumulator, R seed /* optional */);
    /** 
      * Std Signature : S(scan,357<7<T->>,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<7<T->,9,2,7>),P(d7<T->))
      * TE Signature : S(scan,P(dF--S(?,P(d3),P(d4),P(d4))------)),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/scan.d.ts@176
      * VERSION 1
     */
    public native Observable<Array<T>> scan(Function3<Array<T>, T, Number, Array<T>> accumulator, Array<T> seed /* optional */);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<T->))
      * TE Signature : S(sequenceEqual,P(d357))
      * 
     */
    public native Observable<Boolean> sequenceEqual(Observable<T> compareTo);
    /** 
      * Std Signature : S(sequenceEqual,357<27>,,P(d357<T->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,6,27>))
      * TE Signature : S(sequenceEqual,P(d357),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/sequenceEqual.d.ts@2286
     */
    public native Observable<Boolean> sequenceEqual(Observable<T> compareTo, Function2<T, T, Boolean> comparor /* optional */);
    /** 
      * Std Signature : S(share,357<T->,,)
      * TE Signature : S(share,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/share.d.ts@645
     */
    public native Observable<T> share();
    /** 
      * Std Signature : S(shareReplay,357<T->,,)
      * TE Signature : S(shareReplay,)
      * 
     */
    public native Observable<T> shareReplay();
    /** 
      * Std Signature : S(shareReplay,357<T->,,P(d2))
      * TE Signature : S(shareReplay,P(d2))
      * 
     */
    public native Observable<T> shareReplay(Number bufferSize /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<T->,,P(d2),P(d2))
      * TE Signature : S(shareReplay,P(d2),P(d2))
      * 
     */
    public native Observable<T> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */);
    /** 
      * Std Signature : S(shareReplay,357<T->,,P(d2),P(d2),P(d356))
      * TE Signature : S(shareReplay,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/shareReplay.d.ts@139
     */
    public native Observable<T> shareReplay(Number bufferSize /* optional */, Number windowTime /* optional */, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(single,357<T->,,)
      * TE Signature : S(single,)
      * 
     */
    public native Observable<T> single();
    /** 
      * Std Signature : S(single,357<T->,,P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,2,357<7>,27>))
      * TE Signature : S(single,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/single.d.ts@855
     */
    public native Observable<T> single(Function3<T, Number, Observable<T>, Boolean> predicate /* optional */);
    /** 
      * Std Signature : S(skip,357<T->,,P(d2))
      * TE Signature : S(skip,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/skip.d.ts@427
     */
    public native Observable<T> skip(Number count);
    /** 
      * Std Signature : S(skipLast,357<T->,,P(d2))
      * TE Signature : S(skipLast,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/skipLast.d.ts@1152
     */
    public native Observable<T> skipLast(Number count);
    /** 
      * Std Signature : S(skipUntil,357<T->,,P(d357<3>))
      * TE Signature : S(skipUntil,P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/skipUntil.d.ts@601
     */
    public native Observable<T> skipUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(skipWhile,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,27>))
      * TE Signature : S(skipWhile,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/skipWhile.d.ts@596
     */
    public native Observable<T> skipWhile(Function2<T, Number, Boolean> predicate);
    /** 
      * Std Signature : S(startWith,357<T->,,)
      * TE Signature : S(startWith,)
      * 
     */
    public native Observable<T> startWith();
    /** 
      * Std Signature : S(startWith,357<T->,,P(DT-))
      * TE Signature : S(startWith,P(D3))
      * 
     */
    public native Observable<T> startWith(T... array);
    /** 
      * Std Signature : S(startWith,357<T->,,P(D356))
      * TE Signature : S(startWith,P(D356))
      * 
     */
    public native Observable<T> startWith(IScheduler... array);
    /** 
      * Std Signature : S(startWith,357<T->,,P(DU(T-356,T-)))
      * TE Signature : S(startWith,P(DU(-356,3)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@822
      * VERSION 6
     */
    public native Observable<T> startWith(UnionOfISchedulerAndT<T>... array);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-))
      * TE Signature : S(startWith,P(d3))
      * 
     */
    public native Observable<T> startWith(T v1);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-))
      * TE Signature : S(startWith,P(d3),P(d3))
      * 
     */
    public native Observable<T> startWith(T v1, T v2);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<T> startWith(T v1, T v2, T v3);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-),P(dT-))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4, T v5);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-),P(dT-),P(dT-))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3))
      * 
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4, T v5, T v6);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-),P(dT-),P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@682
      * VERSION 5
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4, T v5, T v6, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-),P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@549
      * VERSION 4
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4, T v5, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@423
      * VERSION 3
     */
    public native Observable<T> startWith(T v1, T v2, T v3, T v4, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@304
      * VERSION 2
     */
    public native Observable<T> startWith(T v1, T v2, T v3, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@192
      * VERSION 1
     */
    public native Observable<T> startWith(T v1, T v2, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(startWith,357<T->,,P(dT-),P(d356))
      * TE Signature : S(startWith,P(d3),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/startWith.d.ts@87
     */
    public native Observable<T> startWith(T v1, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,)
      * TE Signature : S(subscribe,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2207
     */
    public native Subscription subscribe();
    /** 
      * Std Signature : S(subscribe,350,,P(d351<T->))
      * TE Signature : S(subscribe,P(d351))
      * 
     */
    public native Subscription subscribe(CompletionObserver<T> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<T->),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d351<T->),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d351),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(CompletionObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d352<T->))
      * TE Signature : S(subscribe,P(d352))
      * 
     */
    public native Subscription subscribe(ErrorObserver<T> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<T->),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d352<T->),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d352),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(ErrorObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(d353<T->))
      * TE Signature : S(subscribe,P(d353))
      * 
     */
    public native Subscription subscribe(NextObserver<T> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<T->),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(d353<T->),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(d353),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    public native AnonymousSubscription subscribe(NextObserver<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<T> next /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Subscription subscribe(Action1<T> next /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dFP1--S(?,429,,P(d3))------)<T->),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2297
      * VERSION 2
     */
    public native Subscription subscribe(Action1<T> next /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribe,350,,P(dU(T-351<T->,352<5>,353<5>)))
      * TE Signature : S(subscribe,P(dU(-351,352,353)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/Observable.d.ts@2238
      * VERSION 1
     */
    public native Subscription subscribe(PartialObserver_UnionOfCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observer);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */, Action1<Object> error /* optional */);
    /** 
      * Std Signature : S(subscribe,348,,P(dU(T-FP1--S(?,429,,P(d7))------)<4>,351<9>,352<9>,353<9>)),P(dFP1--S(?,429,,P(d4))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dU(-F--S(?,P(d3))------),351,352,353)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native AnonymousSubscription subscribe(UnionOfAction1OfTAndCompletionObserverOfTAndErrorObserverOfTAndNextObserverOfT<T> observerOrNext /* optional */, Action1<Object> error /* optional */, Action complete /* optional */);
    /** 
      * Std Signature : S(subscribeOn,357<T->,,P(d356))
      * TE Signature : S(subscribeOn,P(d356))
      * 
     */
    public native Observable<T> subscribeOn(IScheduler scheduler);
    /** 
      * Std Signature : S(subscribeOn,357<T->,,P(d356),P(d2))
      * TE Signature : S(subscribeOn,P(d356),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/subscribeOn.d.ts@490
     */
    public native Observable<T> subscribeOn(IScheduler scheduler, Number delay /* optional */);
    /** 
      * Std Signature : S(switch,T-,,)
      * TE Signature : S(switch,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switch.d.ts@1934
     */
    @JsMethod(name = "switch")
    public native T switch_();
    /** 
      * Std Signature : S(switchMap,357<R->,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(R-5<R->,16<12>,358<12>)>))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switchMap.d.ts@61
     */
    public native <R> Observable<R> switchMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R>> project);
    /** 
      * Std Signature : S(switchMap,357<R->,I-,R-,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,U(I-5<I->,16<12>,358<12>)>),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(switchMap,P(dF--S(?,P(d3),P(d4))------)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switchMap.d.ts@196
      * VERSION 1
     */
    public native <I, R> Observable<R> switchMap(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d16<R->))
      * TE Signature : S(switchMapTo,P(d16))
      * 
     */
    public native <R> Observable<R> switchMapTo(PromiseLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d16<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(switchMapTo,P(d16),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(PromiseLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d358<R->))
      * TE Signature : S(switchMapTo,P(d358))
      * 
     */
    public native <R> Observable<R> switchMapTo(Subscribable<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d358<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(switchMapTo,P(d358),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(Subscribable<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(d5<R->))
      * TE Signature : S(switchMapTo,P(d5))
      * 
     */
    public native <R> Observable<R> switchMapTo(ArrayLike<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(d5<I->),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(switchMapTo,P(d5),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    public native <I, R> Observable<R> switchMapTo(ArrayLike<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(switchMapTo,357<R->,R-,P(dU(R-5<R->,16<5>,358<5>)))
      * TE Signature : S(switchMapTo,P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switchMapTo.d.ts@61
     */
    public native <R> Observable<R> switchMapTo(ObservableInput_UnionOfArrayLikeOfRAndPromiseLikeOfRAndSubscribableOfR<R> observable);
    /** 
      * Std Signature : S(switchMapTo,357<R->,I-,R-,P(dU(I-5<I->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,I-,2,10,R->))
      * TE Signature : S(switchMapTo,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/switchMapTo.d.ts@172
      * VERSION 1
     */
    public native <I, R> Observable<R> switchMapTo(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> observable, Function4<T, I, Number, Number, R> resultSelector);
    /** 
      * Std Signature : S(take,357<T->,,P(d2))
      * TE Signature : S(take,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/take.d.ts@1328
     */
    public native Observable<T> take(Number count);
    /** 
      * Std Signature : S(takeLast,357<T->,,P(d2))
      * TE Signature : S(takeLast,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/takeLast.d.ts@1623
     */
    public native Observable<T> takeLast(Number count);
    /** 
      * Std Signature : S(takeUntil,357<T->,,P(d357<3>))
      * TE Signature : S(takeUntil,P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/takeUntil.d.ts@1362
     */
    public native Observable<T> takeUntil(Observable<Object> notifier);
    /** 
      * Std Signature : S(takeWhile,357<T->,,P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,2,27>))
      * TE Signature : S(takeWhile,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/takeWhile.d.ts@1695
     */
    public native Observable<T> takeWhile(Function2<T, Number, Boolean> predicate);
    /** 
      * Std Signature : S(throttle,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,U(-16<2>,358<9>)>))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Observable<T> throttle(Function1<T, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector);
    /** 
      * Std Signature : S(throttle,357<T->,,P(dFP1-,R--S(?,4,,P(d3))------)<T-,U(-16<2>,358<9>)>),P(d362))
      * TE Signature : S(throttle,P(dF--S(?,P(d3))------)),P(d362))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/throttle.d.ts@2090
     */
    public native Observable<T> throttle(Function1<T, SubscribableOrPromise_UnionOfPromiseLikeOfNumberAndSubscribableOfNumber> durationSelector, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<T->,,P(d2))
      * TE Signature : S(throttleTime,P(d2))
      * 
     */
    public native Observable<T> throttleTime(Number duration);
    /** 
      * Std Signature : S(throttleTime,357<T->,,P(d2),P(d356))
      * TE Signature : S(throttleTime,P(d2),P(d356))
      * 
     */
    public native Observable<T> throttleTime(Number duration, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(throttleTime,357<T->,,P(d2),P(d356),P(d362))
      * TE Signature : S(throttleTime,P(d2),P(d356),P(d362))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/throttleTime.d.ts@1914
     */
    public native Observable<T> throttleTime(Number duration, IScheduler scheduler /* optional */, ThrottleConfig config /* optional */);
    /** 
      * Std Signature : S(timeInterval,357<826<T->>,,)
      * TE Signature : S(timeInterval,)
      * 
     */
    public native Observable<TimeInterval<T>> timeInterval();
    /** 
      * Std Signature : S(timeInterval,357<826<T->>,,P(d356))
      * TE Signature : S(timeInterval,P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timeInterval.d.ts@237
     */
    public native Observable<TimeInterval<T>> timeInterval(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<T->,,P(d13))
      * TE Signature : S(timeout,P(d13))
      * 
     */
    public native Observable<T> timeout(Date due);
    /** 
      * Std Signature : S(timeout,357<T->,,P(d13),P(d356))
      * TE Signature : S(timeout,P(d13),P(d356))
      * 
     */
    public native Observable<T> timeout(Date due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<T->,,P(d2))
      * TE Signature : S(timeout,P(d2))
      * 
     */
    public native Observable<T> timeout(Number due);
    /** 
      * Std Signature : S(timeout,357<T->,,P(d2),P(d356))
      * TE Signature : S(timeout,P(d2),P(d356))
      * 
     */
    public native Observable<T> timeout(Number due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeout,357<T->,,P(dU(-13,2)))
      * TE Signature : S(timeout,P(dU(-13,2)))
      * 
     */
    public native Observable<T> timeout(UnionOfDateAndNumber due);
    /** 
      * Std Signature : S(timeout,357<T->,,P(dU(-13,2)),P(d356))
      * TE Signature : S(timeout,P(dU(-13,2)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timeout.d.ts@3401
     */
    public native Observable<T> timeout(UnionOfDateAndNumber due, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timeoutWith,357<T->,,P(dU(-13,2)),P(dU(T-5<T->,16<5>,358<5>)))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)))
      * 
     */
    public native Observable<T> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T> withObservable);
    /** 
      * Std Signature : S(timeoutWith,357<T->,,P(dU(-13,2)),P(dU(T-5<T->,16<5>,358<5>)),P(d356))
      * TE Signature : S(timeoutWith,P(dU(-13,2)),P(dU(-5,16,358)),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timeoutWith.d.ts@104
     */
    public native Observable<T> timeoutWith(UnionOfDateAndNumber due, ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T> withObservable, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(timestamp,357<827<T->>,,)
      * TE Signature : S(timestamp,)
      * 
     */
    public native Observable<Timestamp<T>> timestamp();
    /** 
      * Std Signature : S(timestamp,357<827<T->>,,P(d356))
      * TE Signature : S(timestamp,P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timestamp.d.ts@231
     */
    public native Observable<Timestamp<T>> timestamp(IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(toArray,357<7<T->>,,)
      * TE Signature : S(toArray,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/toArray.d.ts@157
     */
    public native Observable<Array<T>> toArray();
    /** 
      * Std Signature : S(toPromise,88<T->,,)
      * TE Signature : S(toPromise,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/toPromise.d.ts@44
     */
    public native Promise<T> toPromise();
    /** 
      * Std Signature : S(toPromise,88<T->,,P(d3))
      * TE Signature : S(toPromise,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/toPromise.d.ts@115
      * VERSION 1
     */
    public native Promise<T> toPromise(Object PromiseCtor);
    /** 
      * Std Signature : S(window,357<2<T->>,,P(d357<3>))
      * TE Signature : S(window,P(d357))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/window.d.ts@1524
     */
    public native Observable<Observable<T>> window(Observable<Object> windowBoundaries);
    /** 
      * Std Signature : S(windowCount,357<2<T->>,,P(d2))
      * TE Signature : S(windowCount,P(d2))
      * 
     */
    public native Observable<Observable<T>> windowCount(Number windowSize);
    /** 
      * Std Signature : S(windowCount,357<2<T->>,,P(d2),P(d2))
      * TE Signature : S(windowCount,P(d2),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowCount.d.ts@2219
     */
    public native Observable<Observable<T>> windowCount(Number windowSize, Number startWindowEvery /* optional */);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2))
      * TE Signature : S(windowTime,P(d2))
      * 
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2))
      * 
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan, Number windowCreationInterval);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2),P(d2),P(d2))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2))
      * 
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2),P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowTime.d.ts@3369
      * VERSION 2
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan, Number windowCreationInterval, Number maxWindowSize, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2),P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowTime.d.ts@3202
      * VERSION 1
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan, Number windowCreationInterval, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowTime,357<2<T->>,,P(d2),P(d356))
      * TE Signature : S(windowTime,P(d2),P(d356))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowTime.d.ts@3067
     */
    public native Observable<Observable<T>> windowTime(Number windowTimeSpan, IScheduler scheduler /* optional */);
    /** 
      * Std Signature : S(windowToggle,357<2<T->>,O-,P(d357<O->),P(dFP1-,R--S(?,4,,P(d3))------)<O-,357<3>>))
      * TE Signature : S(windowToggle,P(d357),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowToggle.d.ts@1752
     */
    public native <O> Observable<Observable<T>> windowToggle(Observable<O> openings, Function1<O, Observable<Object>> closingSelector);
    /** 
      * Std Signature : S(windowWhen,357<2<T->>,,P(dFR--S(?,3,,)------)<357<3>>))
      * TE Signature : S(windowWhen,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/windowWhen.d.ts@1721
     */
    public native Observable<Observable<T>> windowWhen(Function<Observable<Object>> closingSelector);
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
      * Std Signature : S(withLatestFrom,357<R->,R-,P(DFP1-,R--S(?,4,,P(d3))------)<3,R->))
      * TE Signature : S(withLatestFrom,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> withLatestFrom(Function1<Object, R>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(DU(R-FP1-,R--S(?,6,,P(d5))------)<3,R->,5<7>,16<7>,358<7>)))
      * TE Signature : S(withLatestFrom,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@2146
      * VERSION 11
     */
    public native <R> Observable<R> withLatestFrom(UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R>... observables);
    /** 
      * Std Signature : S(withLatestFrom,357<25<T-,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(withLatestFrom,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> withLatestFrom(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d16),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(PromiseLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<T-,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(withLatestFrom,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> withLatestFrom(Subscribable<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d358),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(Subscribable<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<T-,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(withLatestFrom,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> withLatestFrom(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(withLatestFrom,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> withLatestFrom(ArrayLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(d7<U(-5<3>,16<6>,358<6>)>))
      * TE Signature : S(withLatestFrom,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@2306
      * VERSION 12
     */
    public native <R> Observable<R> withLatestFrom(Array<ObservableInput_UnionOfArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject> array);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(d7<U(-5<3>,16<6>,358<6>)>),P(dFP1-,R--S(?,4,,P(d3))------)<3,R->))
      * TE Signature : S(withLatestFrom,P(d7),P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@2419
      * VERSION 13
     */
    public native <R> Observable<R> withLatestFrom(Array<ObservableInput_UnionOfArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject> array, Function1<Object, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(withLatestFrom,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@61
     */
    public native <R> Observable<R> withLatestFrom(Function1<T, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<25<T-,T2->>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@1246
      * VERSION 6
     */
    public native <T2> Observable<Tuple<T, T2>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@166
      * VERSION 1
     */
    public native <T2, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<24<T-,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@1360
      * VERSION 7
     */
    public native <T2, T3> Observable<TupleOf3<T, T2, T3>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,T2-,T3-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@308
      * VERSION 2
     */
    public native <T2, T3, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<T, T2, T3, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<23<T-,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@1507
      * VERSION 8
     */
    public native <T2, T3, T4> Observable<TupleOf4<T, T2, T3, T4>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,T2-,T3-,T4-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@487
      * VERSION 3
     */
    public native <T2, T3, T4, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<T, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<22<T-,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@1687
      * VERSION 9
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<T, T2, T3, T4, T5>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,8,,P(d3),P(d4),P(d5),P(d6),P(d7))------)<T-,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@703
      * VERSION 4
     */
    public native <T2, T3, T4, T5, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<T, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(withLatestFrom,357<21<T-,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@1900
      * VERSION 10
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<T, T2, T3, T4, T5, T6>> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(withLatestFrom,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,9,,P(d3),P(d4),P(d5),P(d6),P(d7),P(d8))------)<T-,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(withLatestFrom,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/withLatestFrom.d.ts@956
      * VERSION 5
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> withLatestFrom(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<T, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,)
      * TE Signature : S(zip,)
      * 
     */
    public native <R> Observable<R> zip();
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D16<T->))
      * TE Signature : S(zip,P(D16))
      * 
     */
    public native <R> Observable<R> zip(PromiseLike<T>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D358<T->))
      * TE Signature : S(zip,P(D358))
      * 
     */
    public native <R> Observable<R> zip(Subscribable<T>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(D5<T->))
      * TE Signature : S(zip,P(D5))
      * 
     */
    public native <R> Observable<R> zip(ArrayLike<T>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(zip,P(DF--S(?,P(d3))------)))
      * 
     */
    public native <R> Observable<R> zip(Function1<T, R>... observables);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(DU(T-,R-FP1-,R--S(?,7,,P(d6))------)<T-,R->,5<8>,16<8>,358<8>)))
      * TE Signature : S(zip,P(DU(-F--S(?,P(d3))------),5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@2164
      * VERSION 11
     */
    public native <R> Observable<R> zip(UnionOfFunction1OfTAndRAndArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T, R>... observables);
    /** 
      * Std Signature : S(zip,357<25<T-,T2->>,T2-,P(d16<T2->))
      * TE Signature : S(zip,P(d16))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> zip(PromiseLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d16<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(zip,P(d16),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(PromiseLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<T-,T2->>,T2-,P(d358<T2->))
      * TE Signature : S(zip,P(d358))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> zip(Subscribable<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d358<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(zip,P(d358),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(Subscribable<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(zip,357<25<T-,T2->>,T2-,P(d5<T2->))
      * TE Signature : S(zip,P(d5))
      * 
     */
    public native <T2> Observable<Tuple<T, T2>> zip(ArrayLike<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(d5<T2->),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(zip,P(d5),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native <T2, R> Observable<R> zip(ArrayLike<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(d7<U(T-5<T->,16<7>,358<7>)>))
      * TE Signature : S(zip,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@2314
      * VERSION 12
     */
    public native <R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTAndPromiseLikeOfTAndSubscribableOfT<T>> array);
    /** 
      * Std Signature : S(zip,357<R->,TOther-,R-,P(d7<U(TOther-5<TOther->,16<7>,358<7>)>),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,TOther-,R->))
      * TE Signature : S(zip,P(d7),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@2424
      * VERSION 13
     */
    public native <TOther, R> Observable<R> zip(Array<ObservableInput_UnionOfArrayLikeOfTOtherAndPromiseLikeOfTOtherAndSubscribableOfTOther<TOther>> array, Function2<T, TOther, R> project);
    /** 
      * Std Signature : S(zip,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<T-,R->))
      * TE Signature : S(zip,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@145
     */
    public native <R> Observable<R> zip(Function1<T, R> project);
    /** 
      * Std Signature : S(zip,357<25<T-,T2->>,T2-,P(dU(T2-5<T2->,16<5>,358<5>)))
      * TE Signature : S(zip,P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1294
      * VERSION 6
     */
    public native <T2> Observable<Tuple<T, T2>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2);
    /** 
      * Std Signature : S(zip,357<R->,T2-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<T-,T2-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@244
      * VERSION 1
     */
    public native <T2, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, Function2<T, T2, R> project);
    /** 
      * Std Signature : S(zip,357<24<T-,T2-,T3->>,T2-,T3-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1402
      * VERSION 7
     */
    public native <T2, T3> Observable<TupleOf3<T, T2, T3>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dFP1-,P2-,P3-,R--S(?,6,,P(d3),P(d4),P(d5))------)<T-,T2-,T3-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@380
      * VERSION 2
     */
    public native <T2, T3, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, Function3<T, T2, T3, R> project);
    /** 
      * Std Signature : S(zip,357<23<T-,T2-,T3-,T4->>,T2-,T3-,T4-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1543
      * VERSION 8
     */
    public native <T2, T3, T4> Observable<TupleOf4<T, T2, T3, T4>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,R--S(?,7,,P(d3),P(d4),P(d5),P(d6))------)<T-,T2-,T3-,T4-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@553
      * VERSION 3
     */
    public native <T2, T3, T4, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, Function4<T, T2, T3, T4, R> project);
    /** 
      * Std Signature : S(zip,357<22<T-,T2-,T3-,T4-,T5->>,T2-,T3-,T4-,T5-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1717
      * VERSION 9
     */
    public native <T2, T3, T4, T5> Observable<TupleOf5<T, T2, T3, T4, T5>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,R--S(?,8,,P(d3),P(d4),P(d5),P(d6),P(d7))------)<T-,T2-,T3-,T4-,T5-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@763
      * VERSION 4
     */
    public native <T2, T3, T4, T5, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, Function5<T, T2, T3, T4, T5, R> project);
    /** 
      * Std Signature : S(zip,357<21<T-,T2-,T3-,T4-,T5-,T6->>,T2-,T3-,T4-,T5-,T6-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1924
      * VERSION 10
     */
    public native <T2, T3, T4, T5, T6> Observable<TupleOf6<T, T2, T3, T4, T5, T6>> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6);
    /** 
      * Std Signature : S(zip,357<R->,T2-,T3-,T4-,T5-,T6-,R-,P(dU(T2-5<T2->,16<5>,358<5>)),P(dU(T3-5<T3->,16<5>,358<5>)),P(dU(T4-5<T4->,16<5>,358<5>)),P(dU(T5-5<T5->,16<5>,358<5>)),P(dU(T6-5<T6->,16<5>,358<5>)),P(dFP1-,P2-,P3-,P4-,P5-,P6-,R--S(?,9,,P(d3),P(d4),P(d5),P(d6),P(d7),P(d8))------)<T-,T2-,T3-,T4-,T5-,T6-,R->))
      * TE Signature : S(zip,P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dU(-5,16,358)),P(dF--S(?,P(d3),P(d4),P(d4),P(d4),P(d4),P(d4))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zip.d.ts@1010
      * VERSION 5
     */
    public native <T2, T3, T4, T5, T6, R> Observable<R> zip(ObservableInput_UnionOfArrayLikeOfT2AndPromiseLikeOfT2AndSubscribableOfT2<T2> v2, ObservableInput_UnionOfArrayLikeOfT3AndPromiseLikeOfT3AndSubscribableOfT3<T3> v3, ObservableInput_UnionOfArrayLikeOfT4AndPromiseLikeOfT4AndSubscribableOfT4<T4> v4, ObservableInput_UnionOfArrayLikeOfT5AndPromiseLikeOfT5AndSubscribableOfT5<T5> v5, ObservableInput_UnionOfArrayLikeOfT6AndPromiseLikeOfT6AndSubscribableOfT6<T6> v6, Function6<T, T2, T3, T4, T5, T6, R> project);
    /** 
      * Std Signature : S(zipAll,357<R->,R-,)
      * TE Signature : S(zipAll,)
      * 
     */
    public native <R> Observable<R> zipAll();
    /** 
      * Std Signature : S(zipAll,357<R->,R-,P(dFP1-,R--S(?,4,,P(d3))------)<3,R->))
      * TE Signature : S(zipAll,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/zipAll.d.ts@170
     */
    public native <R> Observable<R> zipAll(Function1<Object, R> project /* optional */);
}
