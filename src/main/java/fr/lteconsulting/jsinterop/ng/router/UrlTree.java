package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree".UrlTree
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts:397
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="UrlTree")
public class UrlTree
{

    /*
        Properties
    */

    /** 
      * The fragment of the URL 
     */
    public String fragment;

    @JsProperty( name = "fragment")
    public native String getFragment();

    @JsProperty( name = "fragment")
    public native void setFragment( String value );

    public ParamMap queryParamMap;

    @JsProperty( name = "queryParamMap")
    public native ParamMap getQueryParamMap();

    @JsProperty( name = "queryParamMap")
    public native void setQueryParamMap( ParamMap value );

    /** 
      * The query params of the URL 
     */
    public AnonymousType817 queryParams;

    @JsProperty( name = "queryParams")
    public native AnonymousType817 getQueryParams();

    @JsProperty( name = "queryParams")
    public native void setQueryParams( AnonymousType817 value );

    /** 
      * The root segment group of the URL tree 
     */
    public UrlSegmentGroup root;

    @JsProperty( name = "root")
    public native UrlSegmentGroup getRoot();

    @JsProperty( name = "root")
    public native void setRoot( UrlSegmentGroup value );
}
