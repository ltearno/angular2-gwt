package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.AST;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".BoundDirectivePropertyAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:5672
  * 1 constructors
  * A directive property with a bound value (e.g. `*ngIf="condition").
 */
@JsType(isNative=true, namespace="ng.compiler", name="BoundDirectivePropertyAst")
public class BoundDirectivePropertyAst extends TemplateAst
{

    /*
        Constructors
    */
    public BoundDirectivePropertyAst(String directiveName, String templateName, AST value, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public String directiveName;

    @JsProperty( name = "directiveName")
    public native String getDirectiveName();

    @JsProperty( name = "directiveName")
    public native void setDirectiveName( String value );

    public String templateName;

    @JsProperty( name = "templateName")
    public native String getTemplateName();

    @JsProperty( name = "templateName")
    public native void setTemplateName( String value );

    public AST value;

    @JsProperty( name = "value")
    public native AST getValue();

    @JsProperty( name = "value")
    public native void setValue( AST value );
}
