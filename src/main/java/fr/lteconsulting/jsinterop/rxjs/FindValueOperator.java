package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function3;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/find".FindValueOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/find.d.ts:409
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="FindValueOperator")
public class FindValueOperator<T> extends Operator<T, T>
{

    /*
        Constructors
    */
    public FindValueOperator(Function3<T, Number, Observable<T>, Boolean> predicate, Observable<T> source, Boolean yieldIndex){
    }

    /*
        Properties
    */

    public Object predicate;

    @JsProperty( name = "predicate")
    public native Object getPredicate();

    @JsProperty( name = "predicate")
    public native void setPredicate( Object value );

    public Object source;

    @JsProperty( name = "source")
    public native Object getSource();

    @JsProperty( name = "source")
    public native void setSource( Object value );

    public Object thisArg;

    @JsProperty( name = "thisArg")
    public native Object getThisArg();

    @JsProperty( name = "thisArg")
    public native void setThisArg( Object value );

    public Object yieldIndex;

    @JsProperty( name = "yieldIndex")
    public native Object getYieldIndex();

    @JsProperty( name = "yieldIndex")
    public native void setYieldIndex( Object value );
}
