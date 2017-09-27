package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Set;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host".SharedStylesHost
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts:245
  * 
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="SharedStylesHost")
public class SharedStylesHost
{

    /*
        Properties
    */

    public Action1<Set<String>> onStylesAdded;

    @JsProperty( name = "onStylesAdded")
    public native Action1<Set<String>> getOnStylesAdded();

    @JsProperty( name = "onStylesAdded")
    public native void setOnStylesAdded( Action1<Set<String>> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addStyles,429,,P(d7<1>))
      * TE Signature : S(addStyles,P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts@290
     */
    public native void addStyles(Array<String> styles);
    /** 
      * Std Signature : S(getAllStyles,7<1>,,)
      * TE Signature : S(getAllStyles,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/shared_styles_host.d.ts@378
     */
    public native Array<String> getAllStyles();
}
