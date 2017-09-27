package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable".GenerateBaseOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable.d.ts:350
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="GenerateBaseOptions")
public class GenerateBaseOptions<S>
{

    /*
        Properties
    */

    /** 
      * Initial state.
     */
    public S initialState;

    @JsProperty( name = "initialState")
    public native S getInitialState();

    @JsProperty( name = "initialState")
    public native void setInitialState( S value );

    /** 
      * IScheduler to use for generation process.
      * By default, a generator starts immediately.
     */
    public IScheduler scheduler;

    @JsProperty( name = "scheduler")
    public native IScheduler getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( IScheduler value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(condition,27,,P(dS-))
      * TE Signature : S(condition,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable.d.ts@218
      * Condition function that accepts state and returns boolean.
      * When it returns false, the generator stops.
      * If not specified, a generator never stops.
     */
    public native Boolean condition(S state);
    /** 
      * Std Signature : S(iterate,S3,,P(dS-))
      * TE Signature : S(iterate,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/GenerateObservable.d.ts@278
      * Iterate function that accepts state and returns new state.
     */
    public native S iterate(S state);
}
