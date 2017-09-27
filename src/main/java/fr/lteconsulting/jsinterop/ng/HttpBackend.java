package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/backend".HttpBackend
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/backend.d.ts:895

  * A final `HttpHandler` which will dispatch the request via browser HTTP APIs to a backend.
  * 
  * Interceptors sit between the `HttpClient` interface and the `HttpBackend`.
  * 
  * When injected, `HttpBackend` dispatches requests directly to the backend, without going
  * through the interceptor chain.
 */
@JsType(isNative=true, namespace="ng", name="HttpBackend")
public class HttpBackend extends HttpHandler
{
}
