package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeAll".MergeAllOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeAll.d.ts:452
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MergeAllOperator")
public class MergeAllOperator<T> extends Operator<Observable<T>, T>
{

    /*
        Constructors
    */
    public MergeAllOperator(Number concurrent){
    }

    /*
        Properties
    */

    public Object concurrent;

    @JsProperty( name = "concurrent")
    public native Object getConcurrent();

    @JsProperty( name = "concurrent")
    public native void setConcurrent( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(call,3,,P(d377<T->),P(d3))
      * TE Signature : S(call,P(d377),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/mergeAll.d.ts@599
     */
    public native Object call(Observer<T> observer, Object source);
}
