package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer".ProviderElementContext
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts:996
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ProviderElementContext")
public class ProviderElementContext
{

    /*
        Constructors
    */
    public ProviderElementContext(ProviderViewContext viewContext, ProviderElementContext _parent, Boolean _isViewRoot, Array<DirectiveAst> _directiveAsts, Array<AttrAst> attrs, Array<ReferenceAst> refs, Boolean isTemplate, Number contentQueryStartId, ParseSourceSpan _sourceSpan){
    }

    /*
        Properties
    */

    public Object _allProviders;

    @JsProperty( name = "_allProviders")
    public native Object get_allProviders();

    @JsProperty( name = "_allProviders")
    public native void set_allProviders( Object value );

    public Object _attrs;

    @JsProperty( name = "_attrs")
    public native Object get_attrs();

    @JsProperty( name = "_attrs")
    public native void set_attrs( Object value );

    public Object _contentQueries;

    @JsProperty( name = "_contentQueries")
    public native Object get_contentQueries();

    @JsProperty( name = "_contentQueries")
    public native void set_contentQueries( Object value );

    public Object _directiveAsts;

    @JsProperty( name = "_directiveAsts")
    public native Object get_directiveAsts();

    @JsProperty( name = "_directiveAsts")
    public native void set_directiveAsts( Object value );

    public Object _hasViewContainer;

    @JsProperty( name = "_hasViewContainer")
    public native Object get_hasViewContainer();

    @JsProperty( name = "_hasViewContainer")
    public native void set_hasViewContainer( Object value );

    public Object _isViewRoot;

    @JsProperty( name = "_isViewRoot")
    public native Object get_isViewRoot();

    @JsProperty( name = "_isViewRoot")
    public native void set_isViewRoot( Object value );

    public Object _parent;

    @JsProperty( name = "_parent")
    public native Object get_parent();

    @JsProperty( name = "_parent")
    public native void set_parent( Object value );

    public Object _queriedTokens;

    @JsProperty( name = "_queriedTokens")
    public native Object get_queriedTokens();

    @JsProperty( name = "_queriedTokens")
    public native void set_queriedTokens( Object value );

    public Object _seenProviders;

    @JsProperty( name = "_seenProviders")
    public native Object get_seenProviders();

    @JsProperty( name = "_seenProviders")
    public native void set_seenProviders( Object value );

    public Object _sourceSpan;

    @JsProperty( name = "_sourceSpan")
    public native Object get_sourceSpan();

    @JsProperty( name = "_sourceSpan")
    public native void set_sourceSpan( Object value );

    public Object _transformedProviders;

    @JsProperty( name = "_transformedProviders")
    public native Object get_transformedProviders();

    @JsProperty( name = "_transformedProviders")
    public native void set_transformedProviders( Object value );

    public Array<QueryMatch> queryMatches;

    @JsProperty( name = "queryMatches")
    public native Array<QueryMatch> getQueryMatches();

    @JsProperty( name = "queryMatches")
    public native void setQueryMatches( Array<QueryMatch> value );

    public Array<ProviderAst> transformProviders;

    @JsProperty( name = "transformProviders")
    public native Array<ProviderAst> getTransformProviders();

    @JsProperty( name = "transformProviders")
    public native void setTransformProviders( Array<ProviderAst> value );

    public Array<DirectiveAst> transformedDirectiveAsts;

    @JsProperty( name = "transformedDirectiveAsts")
    public native Array<DirectiveAst> getTransformedDirectiveAsts();

    @JsProperty( name = "transformedDirectiveAsts")
    public native void setTransformedDirectiveAsts( Array<DirectiveAst> value );

    public Boolean transformedHasViewContainer;

    @JsProperty( name = "transformedHasViewContainer")
    public native Boolean getTransformedHasViewContainer();

    @JsProperty( name = "transformedHasViewContainer")
    public native void setTransformedHasViewContainer( Boolean value );

    public ProviderViewContext viewContext;

    @JsProperty( name = "viewContext")
    public native ProviderViewContext getViewContext();

    @JsProperty( name = "viewContext")
    public native void setViewContext( ProviderViewContext value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addQueryReadsTo,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_addQueryReadsTo,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@1861
     */
    public native Object _addQueryReadsTo(Object token, Object defaultValue, Object queryReadTokens);
    /** 
      * Std Signature : S(_getDependency,3,,P(d3),P(d3))
      * TE Signature : S(_getDependency,P(d3),P(d3))
      * 
     */
    public native Object _getDependency(Object requestingProviderType, Object dep);
    /** 
      * Std Signature : S(_getDependency,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getDependency,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@2111
     */
    public native Object _getDependency(Object requestingProviderType, Object dep, Object eager /* optional */);
    /** 
      * Std Signature : S(_getLocalDependency,3,,P(d3),P(d3))
      * TE Signature : S(_getLocalDependency,P(d3),P(d3))
      * 
     */
    public native Object _getLocalDependency(Object requestingProviderType, Object dep);
    /** 
      * Std Signature : S(_getLocalDependency,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getLocalDependency,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@2041
     */
    public native Object _getLocalDependency(Object requestingProviderType, Object dep, Object eager /* optional */);
    /** 
      * Std Signature : S(_getOrCreateLocalProvider,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_getOrCreateLocalProvider,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@1964
     */
    public native Object _getOrCreateLocalProvider(Object requestingProviderType, Object token, Object eager);
    /** 
      * Std Signature : S(_getQueriesFor,3,,P(d3))
      * TE Signature : S(_getQueriesFor,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@1929
     */
    public native Object _getQueriesFor(Object token);
    /** 
      * Std Signature : S(afterElement,429,,)
      * TE Signature : S(afterElement,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/compiler/src/provider_analyzer.d.ts@1640
     */
    public native void afterElement();
}
