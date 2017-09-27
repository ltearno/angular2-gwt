package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.ng.core.UnionOfStringAndTypeOfObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state".ActivatedRouteSnapshot
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state.d.ts:3679
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="ActivatedRouteSnapshot")
public class ActivatedRouteSnapshot
{

    /*
        Properties
    */

    /** 
      * The children of this route in the router state tree 
     */
    public Array<ActivatedRouteSnapshot> children;

    @JsProperty( name = "children")
    public native Array<ActivatedRouteSnapshot> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<ActivatedRouteSnapshot> value );

    /** 
      * The component of the route 
     */
    public UnionOfStringAndTypeOfObject component;

    @JsProperty( name = "component")
    public native UnionOfStringAndTypeOfObject getComponent();

    @JsProperty( name = "component")
    public native void setComponent( UnionOfStringAndTypeOfObject value );

    @JsOverlay
    public final void setComponent( String value ) { setComponent(UnionOfStringAndTypeOfObject.ofString( value )); }

    @JsOverlay
    public final void setComponent( Type<Object> value ) { setComponent(UnionOfStringAndTypeOfObject.ofTypeOfObject( value )); }

    /** 
      * The static and resolved data of this route 
     */
    public AnonymousType717 data;

    @JsProperty( name = "data")
    public native AnonymousType717 getData();

    @JsProperty( name = "data")
    public native void setData( AnonymousType717 value );

    /** 
      * The first child of this route in the router state tree 
     */
    public ActivatedRouteSnapshot firstChild;

    @JsProperty( name = "firstChild")
    public native ActivatedRouteSnapshot getFirstChild();

    @JsProperty( name = "firstChild")
    public native void setFirstChild( ActivatedRouteSnapshot value );

    /** 
      * The URL fragment shared by all the routes 
     */
    public String fragment;

    @JsProperty( name = "fragment")
    public native String getFragment();

    @JsProperty( name = "fragment")
    public native void setFragment( String value );

    /** 
      * The outlet name of the route 
     */
    public String outlet;

    @JsProperty( name = "outlet")
    public native String getOutlet();

    @JsProperty( name = "outlet")
    public native void setOutlet( String value );

    public ParamMap paramMap;

    @JsProperty( name = "paramMap")
    public native ParamMap getParamMap();

    @JsProperty( name = "paramMap")
    public native void setParamMap( ParamMap value );

    /** 
      * The matrix parameters scoped to this route 
     */
    public AnonymousType717 params;

    @JsProperty( name = "params")
    public native AnonymousType717 getParams();

    @JsProperty( name = "params")
    public native void setParams( AnonymousType717 value );

    /** 
      * The parent of this route in the router state tree 
     */
    public ActivatedRouteSnapshot parent;

    @JsProperty( name = "parent")
    public native ActivatedRouteSnapshot getParent();

    @JsProperty( name = "parent")
    public native void setParent( ActivatedRouteSnapshot value );

    /** 
      * The path from the root of the router state tree to this route 
     */
    public Array<ActivatedRouteSnapshot> pathFromRoot;

    @JsProperty( name = "pathFromRoot")
    public native Array<ActivatedRouteSnapshot> getPathFromRoot();

    @JsProperty( name = "pathFromRoot")
    public native void setPathFromRoot( Array<ActivatedRouteSnapshot> value );

    public ParamMap queryParamMap;

    @JsProperty( name = "queryParamMap")
    public native ParamMap getQueryParamMap();

    @JsProperty( name = "queryParamMap")
    public native void setQueryParamMap( ParamMap value );

    /** 
      * The query parameters shared by all the routes 
     */
    public AnonymousType717 queryParams;

    @JsProperty( name = "queryParams")
    public native AnonymousType717 getQueryParams();

    @JsProperty( name = "queryParams")
    public native void setQueryParams( AnonymousType717 value );

    /** 
      * The root of the router state 
     */
    public ActivatedRouteSnapshot root;

    @JsProperty( name = "root")
    public native ActivatedRouteSnapshot getRoot();

    @JsProperty( name = "root")
    public native void setRoot( ActivatedRouteSnapshot value );

    /** 
      * The configuration used to match this route 
     */
    public Route routeConfig;

    @JsProperty( name = "routeConfig")
    public native Route getRouteConfig();

    @JsProperty( name = "routeConfig")
    public native void setRouteConfig( Route value );

    /** 
      * The URL segments matched by this route 
     */
    public Array<UrlSegment> url;

    @JsProperty( name = "url")
    public native Array<UrlSegment> getUrl();

    @JsProperty( name = "url")
    public native void setUrl( Array<UrlSegment> value );
}
