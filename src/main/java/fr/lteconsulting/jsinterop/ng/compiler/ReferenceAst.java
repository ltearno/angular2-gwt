package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".ReferenceAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:3166
  * 1 constructors
  * A reference declaration on an element (e.g. `let someName="expression"`).
 */
@JsType(isNative=true, namespace="ng.compiler", name="ReferenceAst")
public class ReferenceAst extends TemplateAst
{

    /*
        Constructors
    */
    public ReferenceAst(String name, CompileTokenMetadata value, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public CompileTokenMetadata value;

    @JsProperty( name = "value")
    public native CompileTokenMetadata getValue();

    @JsProperty( name = "value")
    public native void setValue( CompileTokenMetadata value );
}
