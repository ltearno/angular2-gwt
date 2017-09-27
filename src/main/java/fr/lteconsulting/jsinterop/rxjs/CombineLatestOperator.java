package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest".CombineLatestOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/combineLatest.d.ts:2770
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="CombineLatestOperator")
public class CombineLatestOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public CombineLatestOperator(Function1<Object, R> project){
    }

    /*
        Properties
    */

    public Object project;

    @JsProperty( name = "project")
    public native Object getProject();

    @JsProperty( name = "project")
    public native void setProject( Object value );
}
