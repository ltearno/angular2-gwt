package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/map".MapOperator
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/operator/map.d.ts:1718
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="MapOperator")
public class MapOperator<T, R> extends Operator<T, R>
{

    /*
        Constructors
    */
    public MapOperator(Function2<T, Number, R> project){
    }

    /*
        Properties
    */

    public Object project;

    @JsProperty( name = "project")
    public native Object getProject();

    @JsProperty( name = "project")
    public native void setProject( Object value );

    public Object thisArg;

    @JsProperty( name = "thisArg")
    public native Object getThisArg();

    @JsProperty( name = "thisArg")
    public native void setThisArg( Object value );
}
