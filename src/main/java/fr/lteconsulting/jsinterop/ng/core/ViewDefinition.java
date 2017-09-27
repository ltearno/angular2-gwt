package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ViewDefinition
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:1659
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ViewDefinition")
public class ViewDefinition extends Definition<ViewDefinitionFactory>
{

    /*
        Properties
    */

    public Number bindingCount;

    @JsProperty( name = "bindingCount")
    public native Number getBindingCount();

    @JsProperty( name = "bindingCount")
    public native void setBindingCount( Number value );

    public ViewFlags flags;

    @JsProperty( name = "flags")
    public native ViewFlags getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( ViewFlags value );

    public NodeDef lastRenderRootNode;

    @JsProperty( name = "lastRenderRootNode")
    public native NodeDef getLastRenderRootNode();

    @JsProperty( name = "lastRenderRootNode")
    public native void setLastRenderRootNode( NodeDef value );

    /** 
      * aggregated NodeFlags for all nodes *
     */
    public NodeFlags nodeFlags;

    @JsProperty( name = "nodeFlags")
    public native NodeFlags getNodeFlags();

    @JsProperty( name = "nodeFlags")
    public native void setNodeFlags( NodeFlags value );

    /** 
      * Binary or of all query ids that are matched by one of the nodes.
      * This includes query ids from templates as well.
      * Used as a bloom filter.
     */
    public Number nodeMatchedQueries;

    @JsProperty( name = "nodeMatchedQueries")
    public native Number getNodeMatchedQueries();

    @JsProperty( name = "nodeMatchedQueries")
    public native void setNodeMatchedQueries( Number value );

    /** 
      * Order: Depth first.
      * Especially providers are before elements / anchors.
     */
    public Array<NodeDef> nodes;

    @JsProperty( name = "nodes")
    public native Array<NodeDef> getNodes();

    @JsProperty( name = "nodes")
    public native void setNodes( Array<NodeDef> value );

    public Number outputCount;

    @JsProperty( name = "outputCount")
    public native Number getOutputCount();

    @JsProperty( name = "outputCount")
    public native void setOutputCount( Number value );

    public NodeFlags rootNodeFlags;

    @JsProperty( name = "rootNodeFlags")
    public native NodeFlags getRootNodeFlags();

    @JsProperty( name = "rootNodeFlags")
    public native void setRootNodeFlags( NodeFlags value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(handleEvent,27,,P(d392),P(d2),P(d1),P(d3))
      * TE Signature : S(handleEvent,P(d392),P(d2),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@2977
     */
    public native Boolean handleEvent(ViewData view, Number nodeIndex, String eventName, Object event);
    /** 
      * Std Signature : S(updateDirectives,429,,P(d393),P(d392))
      * TE Signature : S(updateDirectives,P(d393),P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@2511
     */
    public native void updateDirectives(NodeCheckFn check, ViewData view);
    /** 
      * Std Signature : S(updateRenderer,429,,P(d393),P(d392))
      * TE Signature : S(updateRenderer,P(d393),P(d392))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@2511
     */
    public native void updateRenderer(NodeCheckFn check, ViewData view);
}
