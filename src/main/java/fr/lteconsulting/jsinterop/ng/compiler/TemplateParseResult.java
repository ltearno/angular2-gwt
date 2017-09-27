package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser".TemplateParseResult
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_parser.d.ts:1528
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="TemplateParseResult")
public class TemplateParseResult
{

    /*
        Constructors
    */
    public TemplateParseResult(Array<TemplateAst> templateAst, Array<CompilePipeSummary> usedPipes, Array<ParseError> errors){
    }

    /*
        Properties
    */

    public Array<ParseError> errors;

    @JsProperty( name = "errors")
    public native Array<ParseError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ParseError> value );

    public Array<TemplateAst> templateAst;

    @JsProperty( name = "templateAst")
    public native Array<TemplateAst> getTemplateAst();

    @JsProperty( name = "templateAst")
    public native void setTemplateAst( Array<TemplateAst> value );

    public Array<CompilePipeSummary> usedPipes;

    @JsProperty( name = "usedPipes")
    public native Array<CompilePipeSummary> getUsedPipes();

    @JsProperty( name = "usedPipes")
    public native void setUsedPipes( Array<CompilePipeSummary> value );
}
