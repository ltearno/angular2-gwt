package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser".TemplateBindingParseResult
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/expression_parser/parser.d.ts:417
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.expression.parse", name="TemplateBindingParseResult")
public class TemplateBindingParseResult
{

    /*
        Constructors
    */
    public TemplateBindingParseResult(Array<TemplateBinding> templateBindings, Array<String> warnings, Array<ParserError> errors){
    }

    /*
        Properties
    */

    public Array<ParserError> errors;

    @JsProperty( name = "errors")
    public native Array<ParserError> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<ParserError> value );

    public Array<TemplateBinding> templateBindings;

    @JsProperty( name = "templateBindings")
    public native Array<TemplateBinding> getTemplateBindings();

    @JsProperty( name = "templateBindings")
    public native void setTemplateBindings( Array<TemplateBinding> value );

    public Array<String> warnings;

    @JsProperty( name = "warnings")
    public native Array<String> getWarnings();

    @JsProperty( name = "warnings")
    public native void setWarnings( Array<String> value );
}
