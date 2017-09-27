package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/QueueScheduler".QueueScheduler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/scheduler/QueueScheduler.d.ts:50
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="QueueScheduler")
public class QueueScheduler extends AsyncScheduler
{

    /*
        Constructors
    */
    public QueueScheduler(Object SchedulerAction, Function<Number> now){
        super(null, null);
    }
}
