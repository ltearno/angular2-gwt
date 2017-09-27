package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router".NavigationExtras
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/router.d.ts:824
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="NavigationExtras")
public class NavigationExtras
{

    /*
        Properties
    */

    /** 
      * Sets the hash fragment for the URL.
      * 
      * ```
      * // Navigate to /results#top
      * this.router.navigate(['/results'], { fragment: 'top' });
      * ```
     */
    public String fragment;

    @JsProperty( name = "fragment")
    public native String getFragment();

    @JsProperty( name = "fragment")
    public native void setFragment( String value );

    /** 
      * Preserves the fragment for the next navigation
      * 
      * ```
      * // Preserve fragment from /results#top to /view#top
      * this.router.navigate(['/view'], { preserveFragment: true });
      * ```
     */
    public Boolean preserveFragment;

    @JsProperty( name = "preserveFragment")
    public native Boolean getPreserveFragment();

    @JsProperty( name = "preserveFragment")
    public native void setPreserveFragment( Boolean value );

    /** 
      * Preserves the query parameters for the next navigation.
      * 
      * deprecated, use `queryParamsHandling` instead
      * 
      * ```
      * // Preserve query params from /results?page=1 to /view?page=1
      * this.router.navigate(['/view'], { preserveQueryParams: true });
      * ```
     */
    public Boolean preserveQueryParams;

    @JsProperty( name = "preserveQueryParams")
    public native Boolean getPreserveQueryParams();

    @JsProperty( name = "preserveQueryParams")
    public native void setPreserveQueryParams( Boolean value );

    /** 
      * Sets query parameters to the URL.
      * 
      * ```
      * // Navigate to /results?page=1
      * this.router.navigate(['/results'], { queryParams: { page: 1 } });
      * ```
     */
    public AnonymousType717 queryParams;

    @JsProperty( name = "queryParams")
    public native AnonymousType717 getQueryParams();

    @JsProperty( name = "queryParams")
    public native void setQueryParams( AnonymousType717 value );

    /** 
      * config strategy to handle the query parameters for the next navigation.
      * 
      * ```
      * // from /results?page=1 to /view?page=1&page=2
      * this.router.navigate(['/view'], { queryParams: { page: 2 },  queryParamsHandling: "merge" });
      * ```
     */
    public String queryParamsHandling;

    @JsProperty( name = "queryParamsHandling")
    public native String getQueryParamsHandling();

    @JsProperty( name = "queryParamsHandling")
    public native void setQueryParamsHandling( String value );

    /** 
      * Enables relative navigation from the current ActivatedRoute.
      * 
      * Configuration:
      * 
      * ```
      * [{
      *    path: 'parent',
      *    component: ParentComponent,
      *    children: [{
      *      path: 'list',
      *      component: ListComponent
      *    },{
      *      path: 'child',
      *      component: ChildComponent
      *    }]
      * }]
      * ```
      * 
      * Navigate to list route from child route:
      * 
      * ```
      *   
     */
    public ActivatedRoute relativeTo;

    @JsProperty( name = "relativeTo")
    public native ActivatedRoute getRelativeTo();

    @JsProperty( name = "relativeTo")
    public native void setRelativeTo( ActivatedRoute value );

    /** 
      * Navigates while replacing the current state in history.
      * 
      * ```
      * // Navigate to /view
      * this.router.navigate(['/view'], { replaceUrl: true });
      * ```
     */
    public Boolean replaceUrl;

    @JsProperty( name = "replaceUrl")
    public native Boolean getReplaceUrl();

    @JsProperty( name = "replaceUrl")
    public native void setReplaceUrl( Boolean value );

    /** 
      * Navigates without pushing a new state into history.
      * 
      * ```
      * // Navigate silently to /view
      * this.router.navigate(['/view'], { skipLocationChange: true });
      * ```
     */
    public Boolean skipLocationChange;

    @JsProperty( name = "skipLocationChange")
    public native Boolean getSkipLocationChange();

    @JsProperty( name = "skipLocationChange")
    public native void setSkipLocationChange( Boolean value );
}
