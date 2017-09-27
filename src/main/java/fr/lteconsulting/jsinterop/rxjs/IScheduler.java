package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler".IScheduler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler.d.ts:91
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="IScheduler")
public class IScheduler
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(now,2,,)
      * TE Signature : S(now,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler.d.ts@126
     */
    public native Number now();
    /** 
      * Std Signature : S(schedule,350,T-,P(dFP1--S(?,429,,P(d3))------)<T->))
      * TE Signature : S(schedule,P(dF--S(?,P(d3))------)))
      * 
     */
    public native <T> Subscription schedule(Action1<T> work);
    /** 
      * Std Signature : S(schedule,350,T-,P(dFP1--S(?,429,,P(d3))------)<T->),P(d2))
      * TE Signature : S(schedule,P(dF--S(?,P(d3))------)),P(d2))
      * 
     */
    public native <T> Subscription schedule(Action1<T> work, Number delay /* optional */);
    /** 
      * Std Signature : S(schedule,350,T-,P(dFP1--S(?,429,,P(d3))------)<T->),P(d2),P(dT-))
      * TE Signature : S(schedule,P(dF--S(?,P(d3))------)),P(d2),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler.d.ts@145
     */
    public native <T> Subscription schedule(Action1<T> work, Number delay /* optional */, T state /* optional */);
}
