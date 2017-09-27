package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".ASTWithSource
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:5566
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="ASTWithSource")
public class ASTWithSource extends AST
{

    /*
        Constructors
    */
    public ASTWithSource(AST ast, String source, String location, Array<ParserError> errors){
        super(null);
    }

    /*
        Properties
    */

    public AST ast;

    @JsProperty( name = "ast")
    public native AST getAst();

    @JsProperty( name = "ast")
    public native void setAst( AST value );

    public Array<ParserError> errors;

    @JsProperty( name = "errors")
    public native Array<ParserError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ParserError> value );

    public String location;

    @JsProperty( name = "location")
    public native String getLocation();

    @JsProperty( name = "location")
    public native void setLocation( String value );

    public String source;

    @JsProperty( name = "source")
    public native String getSource();

    @JsProperty( name = "source")
    public native void setSource( String value );
}
