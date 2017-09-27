package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.AST;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".BoundTextAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:1235
  * 1 constructors
  * A bound expression within the text of a template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="BoundTextAst")
public class BoundTextAst extends TemplateAst
{

    /*
        Constructors
    */
    public BoundTextAst(AST value, Number ngContentIndex, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Number ngContentIndex;

    @JsProperty( name = "ngContentIndex")
    public native Number getNgContentIndex();

    @JsProperty( name = "ngContentIndex")
    public native void setNgContentIndex( Number value );

    public AST value;

    @JsProperty( name = "value")
    public native AST getValue();

    @JsProperty( name = "value")
    public native void setValue( AST value );
}
