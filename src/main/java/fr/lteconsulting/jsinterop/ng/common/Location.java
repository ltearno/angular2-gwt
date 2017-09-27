package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location".Location
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts:167
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.common", name="Location")
public class Location
{

    /*
        Constructors
    */
    public Location(LocationStrategy platformStrategy){
    }

    /*
        Static methods
    */
    /** 
      * Given a string of url parameters, prepend with '?' if needed, otherwise return parameters as
      * is.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts:2911
     */
    @JsMethod(namespace="ng.common.Location", name = "normalizeQueryParams")
    public static native String normalizeQueryParams(String params);
    /** 
      * Given 2 parts of a url, join them with a slash if needed.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts:3049
     */
    @JsMethod(namespace="ng.common.Location", name = "joinWithSlash")
    public static native String joinWithSlash(String start, String end);
    /** 
      * If url has a trailing slash, remove it, otherwise return url as is. This
      * method looks for the first occurence of either #, ?, or the end of the
      * line as `/` characters after any of these should not be replaced.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts:3358
     */
    @JsMethod(namespace="ng.common.Location", name = "stripTrailingSlash")
    public static native String stripTrailingSlash(String url);

    /*
        Methods
    */
    /** 
      * Std Signature : S(back,429,,)
      * TE Signature : S(back,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@2556
      * Navigates back in the platform's history.
     */
    public native void back();
    /** 
      * Std Signature : S(forward,429,,)
      * TE Signature : S(forward,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@2470
      * Navigates forward in the platform's history.
     */
    public native void forward();
    /** 
      * Std Signature : S(go,429,,P(d1))
      * TE Signature : S(go,P(d1))
      * 
     */
    public native void go(String path);
    /** 
      * Std Signature : S(go,429,,P(d1),P(d1))
      * TE Signature : S(go,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@2146
      * Changes the browsers URL to the normalized version of the given URL, and pushes a
      * new item onto the platform's history.
     */
    public native void go(String path, String query /* optional */);
    /** 
      * Std Signature : S(isCurrentPathEqualTo,27,,P(d1))
      * TE Signature : S(isCurrentPathEqualTo,P(d1))
      * 
     */
    public native Boolean isCurrentPathEqualTo(String path);
    /** 
      * Std Signature : S(isCurrentPathEqualTo,27,,P(d1),P(d1))
      * TE Signature : S(isCurrentPathEqualTo,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@1354
      * Normalizes the given path and compares to the current normalized path.
     */
    public native Boolean isCurrentPathEqualTo(String path, String query /* optional */);
    /** 
      * Std Signature : S(normalize,1,,P(d1))
      * TE Signature : S(normalize,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@1553
      * Given a string representing a URL, returns the normalized URL path without leading or
      * trailing slashes.
     */
    public native String normalize(String url);
    /** 
      * Std Signature : S(path,1,,)
      * TE Signature : S(path,)
      * 
     */
    public native String path();
    /** 
      * Std Signature : S(path,1,,P(d27))
      * TE Signature : S(path,P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@1219
      * Returns the normalized URL path.
     */
    public native String path(Boolean includeHash /* optional */);
    /** 
      * Std Signature : S(prepareExternalUrl,1,,P(d1))
      * TE Signature : S(prepareExternalUrl,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@1951
      * Given a string representing a URL, returns the platform-specific external URL path.
      * If the given URL doesn't begin with a leading slash (`'/'`), this method adds one
      * before normalizing. This method will also add a hash if `HashLocationStrategy` is
      * used, or the `APP_BASE_HREF` if the `PathLocationStrategy` is in use.
     */
    public native String prepareExternalUrl(String url);
    /** 
      * Std Signature : S(replaceState,429,,P(d1))
      * TE Signature : S(replaceState,P(d1))
      * 
     */
    public native void replaceState(String path);
    /** 
      * Std Signature : S(replaceState,429,,P(d1),P(d1))
      * TE Signature : S(replaceState,P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@2348
      * Changes the browsers URL to the normalized version of the given URL, and replaces
      * the top item on the platform's history stack.
     */
    public native void replaceState(String path, String query /* optional */);
    /** 
      * Std Signature : S(subscribe,3,,P(dFP1--S(?,429,,P(d3))------)<422>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object subscribe(Action1<PopStateEvent> onNext);
    /** 
      * Std Signature : S(subscribe,3,,P(dFP1--S(?,429,,P(d3))------)<422>),P(dFP1--S(?,429,,P(d3))------)<3>))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)))
      * 
     */
    public native Object subscribe(Action1<PopStateEvent> onNext, Action1<Object> onThrow /* optional */);
    /** 
      * Std Signature : S(subscribe,3,,P(dFP1--S(?,429,,P(d3))------)<422>),P(dFP1--S(?,429,,P(d3))------)<3>),P(dF--S(?,429,,)------)))
      * TE Signature : S(subscribe,P(dF--S(?,P(d3))------)),P(dF--S(?,P(d3))------)),P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location.d.ts@2644
      * Subscribe to the platform's `popState` events.
     */
    public native Object subscribe(Action1<PopStateEvent> onNext, Action1<Object> onThrow /* optional */, Action onReturn /* optional */);
}
