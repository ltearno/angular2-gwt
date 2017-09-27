package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast".SafePropertyRead
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/ast.d.ts:2640
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="SafePropertyRead")
public class SafePropertyRead extends AST
{

    /*
        Constructors
    */
    public SafePropertyRead(ParseSpan span, AST receiver, String name){
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
}
