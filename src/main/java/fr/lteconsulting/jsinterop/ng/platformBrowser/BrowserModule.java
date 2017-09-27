package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.ng.core.ModuleWithProviders;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser".BrowserModule
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser.d.ts:770
  * 1 constructors
  * The ng module for the browser.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="BrowserModule")
public class BrowserModule
{

    /*
        Constructors
    */
    public BrowserModule(BrowserModule parentModule){
    }

    /*
        Static methods
    */
    /** 
      * Configures a browser-based application to transition from a server-rendered app, if
      * one is present on the page. The specified parameters must include an application id,
      * which must match between the client and server applications.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser.d.ts:1209
     */
    @JsMethod(namespace="ng.platformBrowser.BrowserModule", name = "withServerTransition")
    public static native ModuleWithProviders withServerTransition(Object params);
}
