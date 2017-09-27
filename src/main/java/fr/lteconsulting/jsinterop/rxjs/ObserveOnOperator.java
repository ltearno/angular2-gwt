package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/observeOn".ObserveOnOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/observeOn.d.ts:3415
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ObserveOnOperator")
public class ObserveOnOperator<T> extends Operator<T, T>
{

    /*
        Constructors
    */
    public ObserveOnOperator(IScheduler scheduler, Number delay){
    }

    /*
        Properties
    */

    public Object delay;

    @JsProperty( name = "delay")
    public native Object getDelay();

    @JsProperty( name = "delay")
    public native void setDelay( Object value );

    public Object scheduler;

    @JsProperty( name = "scheduler")
    public native Object getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( Object value );
}
