package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.core.ModuleWithProviders;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/module".HttpClientXsrfModule
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/module.d.ts:1050

  * `NgModule` which adds XSRF protection support to outgoing requests.
  * 
  * Provided the server supports a cookie-based XSRF protection system, this
  * module can be used directly to configure XSRF protection with the correct
  * cookie and header names.
  * 
  * If no such names are provided, the default is to use `X-XSRF-TOKEN` for
  * the header name and `XSRF-TOKEN` for the cookie name.
 */
@JsType(isNative=true, namespace="ng", name="HttpClientXsrfModule")
public class HttpClientXsrfModule
{

    /*
        Static methods
    */
    /** 
      * Disable the default XSRF protection.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/module.d.ts:1577
     */
    @JsMethod(namespace="ng.HttpClientXsrfModule", name = "disable")
    public static native ModuleWithProviders disable();
    /** 
      * Configure XSRF protection to use the given cookie name or header name,
      * or the default names (as described above) if not provided.
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/module.d.ts:1780
     */
    @JsMethod(namespace="ng.HttpClientXsrfModule", name = "withOptions")
    public static native ModuleWithProviders withOptions(Object options /* optional */);
}
