package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ClassMethod
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:15072
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ClassMethod")
public class ClassMethod extends AbstractClassPart
{

    /*
        Constructors
    */
    public ClassMethod(String name, Array<FnParam> params, Array<Statement> body, Type type, Array<StmtModifier> modifiers){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Statement> body;

    @JsProperty( name = "body")
    public native Array<Statement> getBody();

    @JsProperty( name = "body")
    public native void setBody( Array<Statement> value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Array<FnParam> params;

    @JsProperty( name = "params")
    public native Array<FnParam> getParams();

    @JsProperty( name = "params")
    public native void setParams( Array<FnParam> value );
}
