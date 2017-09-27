package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast".ElementAst
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/template_parser/template_ast.d.ts:3900
  * 1 constructors
  * An element declaration in a template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="ElementAst")
public class ElementAst extends TemplateAst
{

    /*
        Constructors
    */
    public ElementAst(String name, Array<AttrAst> attrs, Array<BoundElementPropertyAst> inputs, Array<BoundEventAst> outputs, Array<ReferenceAst> references, Array<DirectiveAst> directives, Array<ProviderAst> providers, Boolean hasViewContainer, Array<QueryMatch> queryMatches, Array<TemplateAst> children, Number ngContentIndex, ParseSourceSpan sourceSpan, ParseSourceSpan endSourceSpan){
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

    public ParseSourceSpan endSourceSpan;

    @JsProperty( name = "endSourceSpan")
    public native ParseSourceSpan getEndSourceSpan();

    @JsProperty( name = "endSourceSpan")
    public native void setEndSourceSpan( ParseSourceSpan value );

    public Boolean hasViewContainer;

    @JsProperty( name = "hasViewContainer")
    public native Boolean getHasViewContainer();

    @JsProperty( name = "hasViewContainer")
    public native void setHasViewContainer( Boolean value );

    public Array<BoundElementPropertyAst> inputs;

    @JsProperty( name = "inputs")
    public native Array<BoundElementPropertyAst> getInputs();

    @JsProperty( name = "inputs")
    public native void setInputs( Array<BoundElementPropertyAst> value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

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
}
