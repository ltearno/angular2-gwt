package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function3;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/reduce".ReduceOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/reduce.d.ts:538
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ReduceOperator")
public class ReduceOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public ReduceOperator(Function3<R, T, Number, R> accumulator, R seed, Boolean hasSeed){
    }

    /*
        Properties
    */

    public Object accumulator;

    @JsProperty( name = "accumulator")
    public native Object getAccumulator();

    @JsProperty( name = "accumulator")
    public native void setAccumulator( Object value );

    public Object hasSeed;

    @JsProperty( name = "hasSeed")
    public native Object getHasSeed();

    @JsProperty( name = "hasSeed")
    public native void setHasSeed( Object value );

    public Object seed;

    @JsProperty( name = "seed")
    public native Object getSeed();

    @JsProperty( name = "seed")
    public native void setSeed( Object value );
}
