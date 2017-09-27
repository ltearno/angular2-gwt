package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/multicast".MulticastOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/multicast.d.ts:641
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MulticastOperator")
public class MulticastOperator<T> extends Operator<T, T>
{

    /*
        Constructors
    */
    public MulticastOperator(Function<Subject<T>> subjectFactory, Function1<Observable<T>, Observable<T>> selector){
    }

    /*
        Properties
    */

    public Object selector;

    @JsProperty( name = "selector")
    public native Object getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( Object value );

    public Object subjectFactory;

    @JsProperty( name = "subjectFactory")
    public native Object getSubjectFactory();

    @JsProperty( name = "subjectFactory")
    public native void setSubjectFactory( Object value );
}
