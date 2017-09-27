package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast".Comment
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/ast.d.ts:2163
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="Comment")
public class Comment extends Node
{

    /*
        Constructors
    */
    public Comment(String value, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}
