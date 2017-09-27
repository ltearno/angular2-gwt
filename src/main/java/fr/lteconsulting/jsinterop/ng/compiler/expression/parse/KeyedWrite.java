package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".KeyedWrite
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:3027
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="KeyedWrite")
public class KeyedWrite extends AST
{

    /*
        Constructors
    */
    public KeyedWrite(ParseSpan span, AST obj, AST key, AST value){
        super(null);
    }

    /*
        Properties
    */

    public AST key;

    @JsProperty( name = "key")
    public native AST getKey();

    @JsProperty( name = "key")
    public native void setKey( AST value );

    public AST obj;

    @JsProperty( name = "obj")
    public native AST getObj();

    @JsProperty( name = "obj")
    public native void setObj( AST value );

    public AST value;

    @JsProperty( name = "value")
    public native AST getValue();

    @JsProperty( name = "value")
    public native void setValue( AST value );
}
