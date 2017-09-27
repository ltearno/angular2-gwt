package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser".ParseTreeResult
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/parser.d.ts:657
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="ParseTreeResult")
public class ParseTreeResult
{

    /*
        Constructors
    */
    public ParseTreeResult(Array<Node> rootNodes, Array<ParseError> errors){
    }

    /*
        Properties
    */

    public Array<ParseError> errors;

    @JsProperty( name = "errors")
    public native Array<ParseError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ParseError> value );

    public Array<Node> rootNodes;

    @JsProperty( name = "rootNodes")
    public native Array<Node> getRootNodes();

    @JsProperty( name = "rootNodes")
    public native void setRootNodes( Array<Node> value );
}
