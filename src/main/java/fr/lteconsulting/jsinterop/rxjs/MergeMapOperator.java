package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI;
import fr.lteconsulting.prebuilt.Function2;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap".MergeMapOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeMap.d.ts:706
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MergeMapOperator")
public class MergeMapOperator<T, I, R> extends Operator<T, I>
{

    /*
        Constructors
    */
    public MergeMapOperator(Function2<T, Number, ObservableInput_UnionOfArrayLikeOfIAndPromiseLikeOfIAndSubscribableOfI<I>> project, Function4<T, I, Number, Number, R> resultSelector, Number concurrent){
    }

    /*
        Properties
    */

    public Object concurrent;

    @JsProperty( name = "concurrent")
    public native Object getConcurrent();

    @JsProperty( name = "concurrent")
    public native void setConcurrent( Object value );

    public Object project;

    @JsProperty( name = "project")
    public native Object getProject();

    @JsProperty( name = "project")
    public native void setProject( Object value );

    public Object resultSelector;

    @JsProperty( name = "resultSelector")
    public native Object getResultSelector();

    @JsProperty( name = "resultSelector")
    public native void setResultSelector( Object value );
}
