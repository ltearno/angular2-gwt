package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".Binary
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:4320
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="Binary")
public class Binary extends AST
{

    /*
        Constructors
    */
    public Binary(ParseSpan span, String operation, AST left, AST right){
        super(null);
    }

    /*
        Properties
    */

    public AST left;

    @JsProperty( name = "left")
    public native AST getLeft();

    @JsProperty( name = "left")
    public native void setLeft( AST value );

    public String operation;

    @JsProperty( name = "operation")
    public native String getOperation();

    @JsProperty( name = "operation")
    public native void setOperation( String value );

    public AST right;

    @JsProperty( name = "right")
    public native AST getRight();

    @JsProperty( name = "right")
    public native void setRight( AST value );
}
