package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".PropertyWrite
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:2409
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="PropertyWrite")
public class PropertyWrite extends AST
{

    /*
        Constructors
    */
    public PropertyWrite(ParseSpan span, AST receiver, String name, AST value){
        super(null);
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public AST receiver;

    @JsProperty( name = "receiver")
    public native AST getReceiver();

    @JsProperty( name = "receiver")
    public native void setReceiver( AST value );

    public AST value;

    @JsProperty( name = "value")
    public native AST getValue();

    @JsProperty( name = "value")
    public native void setValue( AST value );
}
