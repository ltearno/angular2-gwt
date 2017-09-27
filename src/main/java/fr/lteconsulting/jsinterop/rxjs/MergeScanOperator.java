package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeScan".MergeScanOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeScan.d.ts:1598
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MergeScanOperator")
public class MergeScanOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public MergeScanOperator(Function2<R, T, Observable<R>> accumulator, R seed, Number concurrent){
    }

    /*
        Properties
    */

    public Object accumulator;

    @JsProperty( name = "accumulator")
    public native Object getAccumulator();

    @JsProperty( name = "accumulator")
    public native void setAccumulator( Object value );

    public Object concurrent;

    @JsProperty( name = "concurrent")
    public native Object getConcurrent();

    @JsProperty( name = "concurrent")
    public native void setConcurrent( Object value );

    public Object seed;

    @JsProperty( name = "seed")
    public native Object getSeed();

    @JsProperty( name = "seed")
    public native void setSeed( Object value );
}
