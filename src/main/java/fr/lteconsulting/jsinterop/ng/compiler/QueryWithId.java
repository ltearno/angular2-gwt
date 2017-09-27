package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer".QueryWithId
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts:679
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="QueryWithId")
public class QueryWithId
{

    /*
        Properties
    */

    public CompileQueryMetadata meta;

    @JsProperty( name = "meta")
    public native CompileQueryMetadata getMeta();

    @JsProperty( name = "meta")
    public native void setMeta( CompileQueryMetadata value );

    public Number queryId;

    @JsProperty( name = "queryId")
    public native Number getQueryId();

    @JsProperty( name = "queryId")
    public native void setQueryId( Number value );
}
