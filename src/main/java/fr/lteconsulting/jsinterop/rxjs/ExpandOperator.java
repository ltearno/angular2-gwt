package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand".ExpandOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/expand.d.ts:667
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="ExpandOperator")
public class ExpandOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public ExpandOperator(Function2<T, Number, Observable<R>> project, Number concurrent, IScheduler scheduler){
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

    public Object scheduler;

    @JsProperty( name = "scheduler")
    public native Object getScheduler();

    @JsProperty( name = "scheduler")
    public native void setScheduler( Object value );
}
