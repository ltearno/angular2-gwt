package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location".PlatformLocation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts:250

  * This class should not be used directly by an application developer. Instead, use
  * {@link Location}.
  * 
  * `PlatformLocation` encapsulates all calls to DOM apis, which allows the Router to be platform
  * agnostic.
  * This means that we can have different implementation of `PlatformLocation` for the different
  * platforms that angular supports. For example, `@angular/platform-browser` provides an
  * implementation specific to the browser environment, while `@angular/platform-webworker` provides
  * one suitable for use with web workers.
  * 
  * The `PlatformLocation` class is used directly by all implementations of {@link LocationStrategy}
  * when they need to interact with the DOM apis like pushState, popState, etc...
  * 
  * {@link LocationStrategy} in turn is used by the {@link Location} service which is used directly
  * by the {@link Router} in order to navigate between routes. Since all interactions between {@link
  * Router} /
  * {@link Location} / {@link LocationStrategy} and DOM apis flow through the `PlatformLocation`
  * class they are all platform independent.
 */
@JsType(isNative=true, namespace="ng.common", name="PlatformLocation")
public class PlatformLocation
{

    /*
        Properties
    */

    public String hash;

    @JsProperty( name = "hash")
    public native String getHash();

    @JsProperty( name = "hash")
    public native void setHash( String value );

    public Action1<LocationChangeListener> onHashChange;

    @JsProperty( name = "onHashChange")
    public native Action1<LocationChangeListener> getOnHashChange();

    @JsProperty( name = "onHashChange")
    public native void setOnHashChange( Action1<LocationChangeListener> value );

    public Action1<LocationChangeListener> onPopState;

    @JsProperty( name = "onPopState")
    public native Action1<LocationChangeListener> getOnPopState();

    @JsProperty( name = "onPopState")
    public native void setOnPopState( Action1<LocationChangeListener> value );

    public String pathname;

    @JsProperty( name = "pathname")
    public native String getPathname();

    @JsProperty( name = "pathname")
    public native void setPathname( String value );

    public String search;

    @JsProperty( name = "search")
    public native String getSearch();

    @JsProperty( name = "search")
    public native void setSearch( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(back,429,,)
      * TE Signature : S(back,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts@1860
     */
    public native void back();
    /** 
      * Std Signature : S(forward,429,,)
      * TE Signature : S(forward,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts@1830
     */
    public native void forward();
    /** 
      * Std Signature : S(getBaseHrefFromDOM,1,,)
      * TE Signature : S(getBaseHrefFromDOM,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts@1410
     */
    public native String getBaseHrefFromDOM();
    /** 
      * Std Signature : S(pushState,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(pushState,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts@1760
     */
    public native void pushState(Object state, String title, String url);
    /** 
      * Std Signature : S(replaceState,429,,P(d3),P(d1),P(d1))
      * TE Signature : S(replaceState,P(d3),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/platform_location.d.ts@1687
     */
    public native void replaceState(Object state, String title, String url);
}
