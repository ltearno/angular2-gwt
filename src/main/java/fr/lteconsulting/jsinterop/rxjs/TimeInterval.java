package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timeInterval".TimeInterval
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timeInterval.d.ts:351
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="TimeInterval")
public class TimeInterval<T>
{

    /*
        Constructors
    */
    public TimeInterval(T value, Number interval){
    }

    /*
        Properties
    */

    public Number interval;

    @JsProperty( name = "interval")
    public native Number getInterval();

    @JsProperty( name = "interval")
    public native void setInterval( Number value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );
}
