package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".TextAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:905
  * 1 constructors
  * A segment of text within the template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="TextAst")
public class TextAst extends TemplateAst
{

    /*
        Constructors
    */
    public TextAst(String value, Number ngContentIndex, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Number ngContentIndex;

    @JsProperty( name = "ngContentIndex")
    public native Number getNgContentIndex();

    @JsProperty( name = "ngContentIndex")
    public native void setNgContentIndex( Number value );

    public String value;

    @JsProperty( name = "value")
    public native String getValue();

    @JsProperty( name = "value")
    public native void setValue( String value );
}
