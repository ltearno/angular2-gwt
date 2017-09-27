package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.BindingPipe;
import fr.lteconsulting.jsinterop.ng.compiler.expression.parse.RecursiveAstVisitor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser".PipeCollector
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/template_parser/binding_parser.d.ts:4010
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="PipeCollector")
public class PipeCollector extends RecursiveAstVisitor
{

    /*
        Properties
    */

    public Map<String, BindingPipe> pipes;

    @JsProperty( name = "pipes")
    public native Map<String, BindingPipe> getPipes();

    @JsProperty( name = "pipes")
    public native void setPipes( Map<String, BindingPipe> value );
}
