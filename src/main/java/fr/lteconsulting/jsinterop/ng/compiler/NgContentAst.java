package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".NgContentAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:7455
  * 1 constructors
  * Position where content is to be projected (instance of `<ng-content>` in a template).
 */
@JsType(isNative=true, namespace="ng.compiler", name="NgContentAst")
public class NgContentAst extends TemplateAst
{

    /*
        Constructors
    */
    public NgContentAst(Number index, Number ngContentIndex, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    public Number ngContentIndex;

    @JsProperty( name = "ngContentIndex")
    public native Number getNgContentIndex();

    @JsProperty( name = "ngContentIndex")
    public native void setNgContentIndex( Number value );
}
