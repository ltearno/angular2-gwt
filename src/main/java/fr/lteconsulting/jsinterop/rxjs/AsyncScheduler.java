package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncScheduler".AsyncScheduler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncScheduler.d.ts:86
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="AsyncScheduler")
public class AsyncScheduler extends Scheduler
{

    /*
        Constructors
    */
    public AsyncScheduler(Object SchedulerAction, Function<Number> now){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<AsyncAction<Object>> actions;

    @JsProperty( name = "actions")
    public native Array<AsyncAction<Object>> getActions();

    @JsProperty( name = "actions")
    public native void setActions( Array<AsyncAction<Object>> value );

    /** 
      * A flag to indicate whether the Scheduler is currently executing a batch of
      * queued actions.
     */
    public Boolean active;

    @JsProperty( name = "active")
    public native Boolean getActive();

    @JsProperty( name = "active")
    public native void setActive( Boolean value );

    /** 
      * An internal ID used to track the latest asynchronous task such as those
      * coming from `setTimeout`, `setInterval`, `requestAnimationFrame`, and
      * others.
     */
    public Object scheduled;

    @JsProperty( name = "scheduled")
    public native Object getScheduled();

    @JsProperty( name = "scheduled")
    public native void setScheduled( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(flush,429,,P(d712<3>))
      * TE Signature : S(flush,P(d712))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/AsyncScheduler.d.ts@576
     */
    public native void flush(AsyncAction<Object> action);
}
