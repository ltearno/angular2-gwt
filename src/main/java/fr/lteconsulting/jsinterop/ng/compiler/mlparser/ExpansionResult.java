package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/icu_ast_expander".ExpansionResult
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/icu_ast_expander.d.ts:830
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="ExpansionResult")
public class ExpansionResult
{

    /*
        Constructors
    */
    public ExpansionResult(Array<Node> nodes, Boolean expanded, Array<ParseError> errors){
    }

    /*
        Properties
    */

    public Array<ParseError> errors;

    @JsProperty( name = "errors")
    public native Array<ParseError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ParseError> value );

    public Boolean expanded;

    @JsProperty( name = "expanded")
    public native Boolean getExpanded();

    @JsProperty( name = "expanded")
    public native void setExpanded( Boolean value );

    public Array<Node> nodes;

    @JsProperty( name = "nodes")
    public native Array<Node> getNodes();

    @JsProperty( name = "nodes")
    public native void setNodes( Array<Node> value );
}
