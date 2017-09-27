package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".TemplateBinding
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:5874
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="TemplateBinding")
public class TemplateBinding
{

    /*
        Constructors
    */
    public TemplateBinding(ParseSpan span, String key, Boolean keyIsVar, String name, ASTWithSource expression){
    }

    /*
        Properties
    */

    public ASTWithSource expression;

    @JsProperty( name = "expression")
    public native ASTWithSource getExpression();

    @JsProperty( name = "expression")
    public native void setExpression( ASTWithSource value );

    public String key;

    @JsProperty( name = "key")
    public native String getKey();

    @JsProperty( name = "key")
    public native void setKey( String value );

    public Boolean keyIsVar;

    @JsProperty( name = "keyIsVar")
    public native Boolean getKeyIsVar();

    @JsProperty( name = "keyIsVar")
    public native void setKeyIsVar( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public ParseSpan span;

    @JsProperty( name = "span")
    public native ParseSpan getSpan();

    @JsProperty( name = "span")
    public native void setSpan( ParseSpan value );
}
