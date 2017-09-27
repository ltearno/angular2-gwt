package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/sequenceEqual".SequenceEqualOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/sequenceEqual.d.ts:2431
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="SequenceEqualOperator")
public class SequenceEqualOperator<T> extends Operator<T, Boolean>
{

    /*
        Constructors
    */
    public SequenceEqualOperator(Observable<T> compareTo, Function2<T, T, Boolean> comparor){
    }

    /*
        Properties
    */

    public Object compareTo;

    @JsProperty( name = "compareTo")
    public native Object getCompareTo();

    @JsProperty( name = "compareTo")
    public native void setCompareTo( Object value );

    public Object comparor;

    @JsProperty( name = "comparor")
    public native Object getComparor();

    @JsProperty( name = "comparor")
    public native void setComparor( Object value );
}
