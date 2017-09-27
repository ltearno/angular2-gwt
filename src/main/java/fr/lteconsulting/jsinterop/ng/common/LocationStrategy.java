package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy".LocationStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts:312

  * `LocationStrategy` is responsible for representing and reading route state
  * from the browser's URL. Angular provides two strategies:
  * {@link HashLocationStrategy} and {@link PathLocationStrategy}.
  * 
  * This is used under the hood of the {@link Location} service.
  * 
  * Applications should use the {@link Router} or {@link Location} services to
  * interact with application route state.
  * 
  * For instance, {@link HashLocationStrategy} produces URLs like
  * `http://example.com#/foo`, and {@link PathLocationStrategy} produces
  * `http://example.com/foo` as an equivalent URL.
  * 
  * See these two classes for more.
 */
@JsType(isNative=true, namespace="ng.common", name="LocationStrategy")
public class LocationStrategy
{

    /*
        Properties
    */

    public Action1<LocationChangeListener> onPopState;

    @JsProperty( name = "onPopState")
    public native Action1<LocationChangeListener> getOnPopState();

    @JsProperty( name = "onPopState")
    public native void setOnPopState( Action1<LocationChangeListener> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(back,429,,)
      * TE Signature : S(back,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1334
     */
    public native void back();
    /** 
      * Std Signature : S(forward,429,,)
      * TE Signature : S(forward,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1304
     */
    public native void forward();
    /** 
      * Std Signature : S(getBaseHref,1,,)
      * TE Signature : S(getBaseHref,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1420
     */
    public native String getBaseHref();
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1010
     */
    public native String path(Boolean includeHash /* optional */);
    /** 
      * Std Signature : S(prepareExternalUrl,1,,P(d1))
      * TE Signature : S(prepareExternalUrl,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1060
     */
    public native String prepareExternalUrl(String internal);
    /** 
      * Std Signature : S(pushState,429,,P(d3),P(d1),P(d1),P(d1))
      * TE Signature : S(pushState,P(d3),P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1119
     */
    public native void pushState(Object state, String title, String url, String queryParams);
    /** 
      * Std Signature : S(replaceState,429,,P(d3),P(d1),P(d1),P(d1))
      * TE Signature : S(replaceState,P(d3),P(d1),P(d1),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/location/location_strategy.d.ts@1210
     */
    public native void replaceState(Object state, String title, String url, String queryParams);
}
