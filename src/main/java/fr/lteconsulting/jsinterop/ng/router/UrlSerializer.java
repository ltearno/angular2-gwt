package fr.lteconsulting.jsinterop.ng.router;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree".UrlSerializer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts:4091
  * 
 */
@JsType(isNative=true, namespace="ng.router", name="UrlSerializer")
public class UrlSerializer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(parse,678,,P(d1))
      * TE Signature : S(parse,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts@4504
      * Parse a url into a {@link UrlTree} 
     */
    public native UrlTree parse(String url);
    /** 
      * Std Signature : S(serialize,1,,P(d678))
      * TE Signature : S(serialize,P(d678))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts@4595
      * Converts a {@link UrlTree} into a url 
     */
    public native String serialize(UrlTree tree);
}
