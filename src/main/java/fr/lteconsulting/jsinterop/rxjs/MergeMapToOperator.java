package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo".MergeMapToOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMapTo.d.ts:658
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MergeMapToOperator")
public class MergeMapToOperator<T, I, R> extends Operator<Observable<T>, R>
{

    /*
        Constructors
    */
    public MergeMapToOperator(ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I> ish, Function4<T, I, Number, Number, R> resultSelector, Number concurrent){
    }

    /*
        Properties
    */

    public Object concurrent;

    @JsProperty( name = "concurrent")
    public native Object getConcurrent();

    @JsProperty( name = "concurrent")
    public native void setConcurrent( Object value );

    public Object ish;

    @JsProperty( name = "ish")
    public native Object getIsh();

    @JsProperty( name = "ish")
    public native void setIsh( Object value );

    public Object resultSelector;

    @JsProperty( name = "resultSelector")
    public native Object getResultSelector();

    @JsProperty( name = "resultSelector")
    public native void setResultSelector( Object value );
}
