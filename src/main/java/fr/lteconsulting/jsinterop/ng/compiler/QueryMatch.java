package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".QueryMatch
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:8465
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="QueryMatch")
public class QueryMatch
{

    /*
        Properties
    */

    public Number queryId;

    @JsProperty( name = "queryId")
    public native Number getQueryId();

    @JsProperty( name = "queryId")
    public native void setQueryId( Number value );

    public CompileTokenMetadata value;

    @JsProperty( name = "value")
    public native CompileTokenMetadata getValue();

    @JsProperty( name = "value")
    public native void setValue( CompileTokenMetadata value );
}
