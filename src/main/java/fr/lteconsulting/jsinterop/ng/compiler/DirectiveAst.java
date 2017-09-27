package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".DirectiveAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:6088
  * 1 constructors
  * A directive declared on an element.
 */
@JsType(isNative=true, namespace="ng.compiler", name="DirectiveAst")
public class DirectiveAst extends TemplateAst
{

    /*
        Constructors
    */
    public DirectiveAst(CompileDirectiveSummary directive, Array<BoundDirectivePropertyAst> inputs, Array<BoundElementPropertyAst> hostProperties, Array<BoundEventAst> hostEvents, Number contentQueryStartId, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Number contentQueryStartId;

    @JsProperty( name = "contentQueryStartId")
    public native Number getContentQueryStartId();

    @JsProperty( name = "contentQueryStartId")
    public native void setContentQueryStartId( Number value );

    public CompileDirectiveSummary directive;

    @JsProperty( name = "directive")
    public native CompileDirectiveSummary getDirective();

    @JsProperty( name = "directive")
    public native void setDirective( CompileDirectiveSummary value );

    public Array<BoundEventAst> hostEvents;

    @JsProperty( name = "hostEvents")
    public native Array<BoundEventAst> getHostEvents();

    @JsProperty( name = "hostEvents")
    public native void setHostEvents( Array<BoundEventAst> value );

    public Array<BoundElementPropertyAst> hostProperties;

    @JsProperty( name = "hostProperties")
    public native Array<BoundElementPropertyAst> getHostProperties();

    @JsProperty( name = "hostProperties")
    public native void setHostProperties( Array<BoundElementPropertyAst> value );

    public Array<BoundDirectivePropertyAst> inputs;

    @JsProperty( name = "inputs")
    public native Array<BoundDirectivePropertyAst> getInputs();

    @JsProperty( name = "inputs")
    public native void setInputs( Array<BoundDirectivePropertyAst> value );
}
