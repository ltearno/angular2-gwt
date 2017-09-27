package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timestamp".Timestamp
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/timestamp.d.ts:339
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="Timestamp")
public class Timestamp<T>
{

    /*
        Constructors
    */
    public Timestamp(T value, Number timestamp){
    }

    /*
        Properties
    */

    public Number timestamp;

    @JsProperty( name = "timestamp")
    public native Number getTimestamp();

    @JsProperty( name = "timestamp")
    public native void setTimestamp( Number value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );
}
