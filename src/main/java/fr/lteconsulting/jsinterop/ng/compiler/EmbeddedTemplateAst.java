package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".EmbeddedTemplateAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:4844
  * 1 constructors
  * A `<ng-template>` element included in an Angular template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="EmbeddedTemplateAst")
public class EmbeddedTemplateAst extends TemplateAst
{

    /*
        Constructors
    */
    public EmbeddedTemplateAst(Array<AttrAst> attrs, Array<BoundEventAst> outputs, Array<ReferenceAst> references, Array<VariableAst> variables, Array<DirectiveAst> directives, Array<ProviderAst> providers, Boolean hasViewContainer, Array<QueryMatch> queryMatches, Array<TemplateAst> children, Number ngContentIndex, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Array<AttrAst> attrs;

    @JsProperty( name = "attrs")
    public native Array<AttrAst> getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( Array<AttrAst> value );

    public Array<TemplateAst> children;

    @JsProperty( name = "children")
    public native Array<TemplateAst> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<TemplateAst> value );

    public Array<DirectiveAst> directives;

    @JsProperty( name = "directives")
    public native Array<DirectiveAst> getDirectives();

    @JsProperty( name = "directives")
    public native void setDirectives( Array<DirectiveAst> value );

    public Boolean hasViewContainer;

    @JsProperty( name = "hasViewContainer")
    public native Boolean getHasViewContainer();

    @JsProperty( name = "hasViewContainer")
    public native void setHasViewContainer( Boolean value );

    public Number ngContentIndex;

    @JsProperty( name = "ngContentIndex")
    public native Number getNgContentIndex();

    @JsProperty( name = "ngContentIndex")
    public native void setNgContentIndex( Number value );

    public Array<BoundEventAst> outputs;

    @JsProperty( name = "outputs")
    public native Array<BoundEventAst> getOutputs();

    @JsProperty( name = "outputs")
    public native void setOutputs( Array<BoundEventAst> value );

    public Array<ProviderAst> providers;

    @JsProperty( name = "providers")
    public native Array<ProviderAst> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<ProviderAst> value );

    public Array<QueryMatch> queryMatches;

    @JsProperty( name = "queryMatches")
    public native Array<QueryMatch> getQueryMatches();

    @JsProperty( name = "queryMatches")
    public native void setQueryMatches( Array<QueryMatch> value );

    public Array<ReferenceAst> references;

    @JsProperty( name = "references")
    public native Array<ReferenceAst> getReferences();

    @JsProperty( name = "references")
    public native void setReferences( Array<ReferenceAst> value );

    public Array<VariableAst> variables;

    @JsProperty( name = "variables")
    public native Array<VariableAst> getVariables();

    @JsProperty( name = "variables")
    public native void setVariables( Array<VariableAst> value );
}
