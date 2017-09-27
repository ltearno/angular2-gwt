package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/util/Immediate".ImmediateDefinition
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/util/Immediate.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ImmediateDefinition")
public class ImmediateDefinition
{

    /*
        Constructors
    */
    public ImmediateDefinition(Object root){
    }

    /*
        Properties
    */

    public Boolean currentlyRunningATask;

    @JsProperty( name = "currentlyRunningATask")
    public native Boolean getCurrentlyRunningATask();

    @JsProperty( name = "currentlyRunningATask")
    public native void setCurrentlyRunningATask( Boolean value );

    public Number nextHandle;

    @JsProperty( name = "nextHandle")
    public native Number getNextHandle();

    @JsProperty( name = "nextHandle")
    public native void setNextHandle( Number value );

    public Object root;

    @JsProperty( name = "root")
    public native Object getRoot();

    @JsProperty( name = "root")
    public native void setRoot( Object value );

    public Object tasksByHandle;

    @JsProperty( name = "tasksByHandle")
    public native Object getTasksByHandle();

    @JsProperty( name = "tasksByHandle")
    public native void setTasksByHandle( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addFromSetImmediateArguments,2,,P(d7<3>))
      * TE Signature : S(addFromSetImmediateArguments,P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@506
     */
    public native Number addFromSetImmediateArguments(Array<Object> args);
    /** 
      * Std Signature : S(canUseMessageChannel,27,,)
      * TE Signature : S(canUseMessageChannel,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@332
     */
    public native Boolean canUseMessageChannel();
    /** 
      * Std Signature : S(canUsePostMessage,27,,)
      * TE Signature : S(canUsePostMessage,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@408
     */
    public native Boolean canUsePostMessage();
    /** 
      * Std Signature : S(canUseProcessNextTick,27,,)
      * TE Signature : S(canUseProcessNextTick,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@294
     */
    public native Boolean canUseProcessNextTick();
    /** 
      * Std Signature : S(canUseReadyStateChange,27,,)
      * TE Signature : S(canUseReadyStateChange,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@369
     */
    public native Boolean canUseReadyStateChange();
    /** 
      * Std Signature : S(clearImmediate,429,,P(d2))
      * TE Signature : S(clearImmediate,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@127
     */
    public native void clearImmediate(Number handle);
    /** 
      * Std Signature : S(createMessageChannelSetImmediate,FR--S(?,3,,)------)<3>,,)
      * TE Signature : S(createMessageChannelSetImmediate,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@698
     */
    public native Function<Object> createMessageChannelSetImmediate();
    /** 
      * Std Signature : S(createPostMessageSetImmediate,FR--S(?,3,,)------)<3>,,)
      * TE Signature : S(createPostMessageSetImmediate,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@613
     */
    public native Function<Object> createPostMessageSetImmediate();
    /** 
      * Std Signature : S(createProcessNextTickSetImmediate,FR--S(?,3,,)------)<3>,,)
      * TE Signature : S(createProcessNextTickSetImmediate,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@561
     */
    public native Function<Object> createProcessNextTickSetImmediate();
    /** 
      * Std Signature : S(createReadyStateChangeSetImmediate,FR--S(?,3,,)------)<3>,,)
      * TE Signature : S(createReadyStateChangeSetImmediate,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@749
     */
    public native Function<Object> createReadyStateChangeSetImmediate();
    /** 
      * Std Signature : S(createSetTimeoutSetImmediate,FR--S(?,3,,)------)<3>,,)
      * TE Signature : S(createSetTimeoutSetImmediate,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@802
     */
    public native Function<Object> createSetTimeoutSetImmediate();
    /** 
      * Std Signature : S(identify,3,,P(d3))
      * TE Signature : S(identify,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@157
     */
    public native Object identify(Object o);
    /** 
      * Std Signature : S(partiallyApplied,F--S(?,429,,)------),,P(d3))
      * TE Signature : S(partiallyApplied,P(d3))
      * 
     */
    public native Action partiallyApplied(Object handler);
    /** 
      * Std Signature : S(partiallyApplied,F--S(?,429,,)------),,P(d3),P(D3))
      * TE Signature : S(partiallyApplied,P(d3),P(D3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@442
     */
    public native Action partiallyApplied(Object handler, Object... args);
    /** 
      * Std Signature : S(runIfPresent,429,,P(d3))
      * TE Signature : S(runIfPresent,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@661
     */
    public native void runIfPresent(Object handle);
    /** 
      * Std Signature : S(setImmediate,2,,P(dF--S(?,429,,)------)))
      * TE Signature : S(setImmediate,P(dF--S(?,)------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Immediate.d.ts@79
     */
    public native Number setImmediate(Action cb);
}
