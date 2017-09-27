package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_handling_strategy".UrlHandlingStrategy
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_handling_strategy.d.ts:240
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="UrlHandlingStrategy")
public class UrlHandlingStrategy
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(extract,678,,P(d678))
      * TE Signature : S(extract,P(d678))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_handling_strategy.d.ts@910
      * Extracts the part of the URL that should be handled by the router.
      * The rest of the URL will remain untouched.
     */
    public native UrlTree extract(UrlTree url);
    /** 
      * Std Signature : S(merge,678,,P(d678),P(d678))
      * TE Signature : S(merge,P(d678),P(d678))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_handling_strategy.d.ts@1028
      * Merges the URL fragment with the rest of the URL.
     */
    public native UrlTree merge(UrlTree newUrlPart, UrlTree rawUrl);
    /** 
      * Std Signature : S(shouldProcessUrl,27,,P(d678))
      * TE Signature : S(shouldProcessUrl,P(d678))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_handling_strategy.d.ts@716
      * Tells the router if this URL should be processed.
      * 
      * When it returns true, the router will execute the regular navigation.
      * When it returns false, the router will set the router state to an empty state.
      * As a result, all the active components will be destroyed.
     */
    public native Boolean shouldProcessUrl(UrlTree url);
}
