package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".VariableAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:3544
  * 1 constructors
  * A variable declaration on a <ng-template> (e.g. `var-someName="someLocalName"`).
 */
@JsType(isNative=true, namespace="ng.compiler", name="VariableAst")
public class VariableAst extends TemplateAst
{

    /*
        Constructors
    */
    public VariableAst(String name, String value, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}
