package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.ng.core.UnionOfStringAndTypeOfObject;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state".ActivatedRoute
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router_state.d.ts:1541
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="ActivatedRoute")
public class ActivatedRoute
{

    /*
        Properties
    */

    /** 
      * The children of this route in the router state tree 
     */
    public Array<ActivatedRoute> children;

    @JsProperty( name = "children")
    public native Array<ActivatedRoute> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<ActivatedRoute> value );

    /** 
      * The component of the route. It's a constant 
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
      * An observable of the static and resolved data of this route. 
     */
    public Observable<AnonymousType717> data;

    @JsProperty( name = "data")
    public native Observable<AnonymousType717> getData();

    @JsProperty( name = "data")
    public native void setData( Observable<AnonymousType717> value );

    /** 
      * The first child of this route in the router state tree 
     */
    public ActivatedRoute firstChild;

    @JsProperty( name = "firstChild")
    public native ActivatedRoute getFirstChild();

    @JsProperty( name = "firstChild")
    public native void setFirstChild( ActivatedRoute value );

    /** 
      * An observable of the URL fragment shared by all the routes 
     */
    public Observable<String> fragment;

    @JsProperty( name = "fragment")
    public native Observable<String> getFragment();

    @JsProperty( name = "fragment")
    public native void setFragment( Observable<String> value );

    /** 
      * The outlet name of the route. It's a constant 
     */
    public String outlet;

    @JsProperty( name = "outlet")
    public native String getOutlet();

    @JsProperty( name = "outlet")
    public native void setOutlet( String value );

    public Observable<ParamMap> paramMap;

    @JsProperty( name = "paramMap")
    public native Observable<ParamMap> getParamMap();

    @JsProperty( name = "paramMap")
    public native void setParamMap( Observable<ParamMap> value );

    /** 
      * An observable of the matrix parameters scoped to this route 
     */
    public Observable<AnonymousType717> params;

    @JsProperty( name = "params")
    public native Observable<AnonymousType717> getParams();

    @JsProperty( name = "params")
    public native void setParams( Observable<AnonymousType717> value );

    /** 
      * The parent of this route in the router state tree 
     */
    public ActivatedRoute parent;

    @JsProperty( name = "parent")
    public native ActivatedRoute getParent();

    @JsProperty( name = "parent")
    public native void setParent( ActivatedRoute value );

    /** 
      * The path from the root of the router state tree to this route 
     */
    public Array<ActivatedRoute> pathFromRoot;

    @JsProperty( name = "pathFromRoot")
    public native Array<ActivatedRoute> getPathFromRoot();

    @JsProperty( name = "pathFromRoot")
    public native void setPathFromRoot( Array<ActivatedRoute> value );

    public Observable<ParamMap> queryParamMap;

    @JsProperty( name = "queryParamMap")
    public native Observable<ParamMap> getQueryParamMap();

    @JsProperty( name = "queryParamMap")
    public native void setQueryParamMap( Observable<ParamMap> value );

    /** 
      * An observable of the query parameters shared by all the routes 
     */
    public Observable<AnonymousType717> queryParams;

    @JsProperty( name = "queryParams")
    public native Observable<AnonymousType717> getQueryParams();

    @JsProperty( name = "queryParams")
    public native void setQueryParams( Observable<AnonymousType717> value );

    /** 
      * The root of the router state 
     */
    public ActivatedRoute root;

    @JsProperty( name = "root")
    public native ActivatedRoute getRoot();

    @JsProperty( name = "root")
    public native void setRoot( ActivatedRoute value );

    /** 
      * The configuration used to match this route 
     */
    public Route routeConfig;

    @JsProperty( name = "routeConfig")
    public native Route getRouteConfig();

    @JsProperty( name = "routeConfig")
    public native void setRouteConfig( Route value );

    /** 
      * The current snapshot of this route 
     */
    public ActivatedRouteSnapshot snapshot;

    @JsProperty( name = "snapshot")
    public native ActivatedRouteSnapshot getSnapshot();

    @JsProperty( name = "snapshot")
    public native void setSnapshot( ActivatedRouteSnapshot value );

    /** 
      * An observable of the URL segments matched by this route 
     */
    public Observable<Array<UrlSegment>> url;

    @JsProperty( name = "url")
    public native Observable<Array<UrlSegment>> getUrl();

    @JsProperty( name = "url")
    public native void setUrl( Observable<Array<UrlSegment>> value );
}
