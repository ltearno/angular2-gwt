package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler".Scheduler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler.d.ts:244
  * 1 constructors
  * An execution context and a data structure to order tasks and schedule their
  * execution. Provides a notion of (potentially virtual) time, through the
  * `now()` getter method.
  * 
  * Each unit of work in a Scheduler is called an {@link Action}.
  * 
  * ```ts
  * class Scheduler {
  *    now(): number;
  *    schedule(work, delay?, state?): Subscription;
  * }
  * ```
 */
@JsType(isNative=true, namespace="rxjs", name="Scheduler")
public class Scheduler extends IScheduler
{

    /*
        Constructors
    */
    public Scheduler(Object SchedulerAction, Function<Number> now){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Scheduler.d.ts:740
     */
    @JsMethod(namespace="rxjs.Scheduler", name = "now")
    public static native Number _now();

    /*
        Properties
    */

    public Object SchedulerAction;

    @JsProperty( name = "SchedulerAction")
    public native Object getSchedulerAction();

    @JsProperty( name = "SchedulerAction")
    public native void setSchedulerAction( Object value );
}
