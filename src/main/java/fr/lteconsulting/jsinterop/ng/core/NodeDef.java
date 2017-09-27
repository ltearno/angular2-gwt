package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType1037;
import fr.lteconsulting.jsinterop.browser.AnonymousType1038;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NodeDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:3170

  * A node definition in the view.
  * 
  * Note: We use one type for all nodes so that loops that loop over all nodes
  * of a ViewDefinition stay monomorphic!
 */
@JsType(isNative=true, namespace="ng.core", name="NodeDef")
public class NodeDef
{

    /*
        Properties
    */

    public BindingFlags bindingFlags;

    @JsProperty( name = "bindingFlags")
    public native BindingFlags getBindingFlags();

    @JsProperty( name = "bindingFlags")
    public native void setBindingFlags( BindingFlags value );

    public Number bindingIndex;

    @JsProperty( name = "bindingIndex")
    public native Number getBindingIndex();

    @JsProperty( name = "bindingIndex")
    public native void setBindingIndex( Number value );

    public Array<BindingDef> bindings;

    @JsProperty( name = "bindings")
    public native Array<BindingDef> getBindings();

    @JsProperty( name = "bindings")
    public native void setBindings( Array<BindingDef> value );

    /** 
      * number of transitive children 
     */
    public Number childCount;

    @JsProperty( name = "childCount")
    public native Number getChildCount();

    @JsProperty( name = "childCount")
    public native void setChildCount( Number value );

    /** 
      * aggregated NodeFlags for all transitive children (does not include self) *
     */
    public NodeFlags childFlags;

    @JsProperty( name = "childFlags")
    public native NodeFlags getChildFlags();

    @JsProperty( name = "childFlags")
    public native void setChildFlags( NodeFlags value );

    /** 
      * Binary or of all query ids that are matched by one of the children.
      * This includes query ids from templates as well.
      * Used as a bloom filter.
     */
    public Number childMatchedQueries;

    @JsProperty( name = "childMatchedQueries")
    public native Number getChildMatchedQueries();

    @JsProperty( name = "childMatchedQueries")
    public native void setChildMatchedQueries( Number value );

    /** 
      * aggregated NodeFlags for all direct children (does not include self) *
     */
    public NodeFlags directChildFlags;

    @JsProperty( name = "directChildFlags")
    public native NodeFlags getDirectChildFlags();

    @JsProperty( name = "directChildFlags")
    public native void setDirectChildFlags( NodeFlags value );

    public ElementDef element;

    @JsProperty( name = "element")
    public native ElementDef getElement();

    @JsProperty( name = "element")
    public native void setElement( ElementDef value );

    public NodeFlags flags;

    @JsProperty( name = "flags")
    public native NodeFlags getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( NodeFlags value );

    public Number index;

    @JsProperty( name = "index")
    public native Number getIndex();

    @JsProperty( name = "index")
    public native void setIndex( Number value );

    /** 
      * ids and value types of all queries that are matched by this node.
     */
    public AnonymousType1038 matchedQueries;

    @JsProperty( name = "matchedQueries")
    public native AnonymousType1038 getMatchedQueries();

    @JsProperty( name = "matchedQueries")
    public native void setMatchedQueries( AnonymousType1038 value );

    /** 
      * Binary or of all matched query ids of this node. 
     */
    public Number matchedQueryIds;

    @JsProperty( name = "matchedQueryIds")
    public native Number getMatchedQueryIds();

    @JsProperty( name = "matchedQueryIds")
    public native void setMatchedQueryIds( Number value );

    public NgContentDef ngContent;

    @JsProperty( name = "ngContent")
    public native NgContentDef getNgContent();

    @JsProperty( name = "ngContent")
    public native void setNgContent( NgContentDef value );

    /** 
      * this is checked against NgContentDef.index to find matched nodes 
     */
    public Number ngContentIndex;

    @JsProperty( name = "ngContentIndex")
    public native Number getNgContentIndex();

    @JsProperty( name = "ngContentIndex")
    public native void setNgContentIndex( Number value );

    public Number outputIndex;

    @JsProperty( name = "outputIndex")
    public native Number getOutputIndex();

    @JsProperty( name = "outputIndex")
    public native void setOutputIndex( Number value );

    public Array<OutputDef> outputs;

    @JsProperty( name = "outputs")
    public native Array<OutputDef> getOutputs();

    @JsProperty( name = "outputs")
    public native void setOutputs( Array<OutputDef> value );

    public NodeDef parent;

    @JsProperty( name = "parent")
    public native NodeDef getParent();

    @JsProperty( name = "parent")
    public native void setParent( NodeDef value );

    public ProviderDef provider;

    @JsProperty( name = "provider")
    public native ProviderDef getProvider();

    @JsProperty( name = "provider")
    public native void setProvider( ProviderDef value );

    public QueryDef query;

    @JsProperty( name = "query")
    public native QueryDef getQuery();

    @JsProperty( name = "query")
    public native void setQuery( QueryDef value );

    /** 
      * references that the user placed on the element
     */
    public AnonymousType1037 references;

    @JsProperty( name = "references")
    public native AnonymousType1037 getReferences();

    @JsProperty( name = "references")
    public native void setReferences( AnonymousType1037 value );

    public NodeDef renderParent;

    @JsProperty( name = "renderParent")
    public native NodeDef getRenderParent();

    @JsProperty( name = "renderParent")
    public native void setRenderParent( NodeDef value );

    public TextDef text;

    @JsProperty( name = "text")
    public native TextDef getText();

    @JsProperty( name = "text")
    public native void setText( TextDef value );
}
