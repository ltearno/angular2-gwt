package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/backend".HttpHandler
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/backend.d.ts:329

  * Transforms an `HttpRequest` into a stream of `HttpEvent`s, one of which will likely be a
  * `HttpResponse`.
  * 
  * `HttpHandler` is injectable. When injected, the handler instance dispatches requests to the
  * first interceptor in the chain, which dispatches to the second, etc, eventually reaching the
  * `HttpBackend`.
  * 
  * In an `HttpInterceptor`, the `HttpHandler` parameter is the next interceptor in the chain.
 */
@JsType(isNative=true, namespace="ng", name="HttpHandler")
public class HttpHandler
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(handle,357<U(-843,844,845<3>,846,847<8>)>,,P(d430<3>))
      * TE Signature : S(handle,P(d430))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/backend.d.ts@826
     */
    public native Observable<HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject> handle(HttpRequest<Object> req);
}
