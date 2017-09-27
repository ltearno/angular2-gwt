package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/interceptor".HttpInterceptor
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/interceptor.d.ts:418

  * Intercepts `HttpRequest` and handles them.
  * 
  * Most interceptors will transform the outgoing request before passing it to the
  * next interceptor in the chain, by calling `next.handle(transformedReq)`.
  * 
  * In rare cases, interceptors may wish to completely handle a request themselves,
  * and not delegate to the remainder of the chain. This behavior is allowed.
 */
@JsType(isNative=true, namespace="ng", name="HttpInterceptor")
public class HttpInterceptor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(intercept,357<U(-843,844,845<3>,846,847<8>)>,,P(d430<3>),P(d431))
      * TE Signature : S(intercept,P(d430),P(d431))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/interceptor.d.ts@1670
      * Intercept an outgoing `HttpRequest` and optionally transform it or the
      * response.
      * 
      * Typically an interceptor will transform the outgoing request before returning
      * `next.handle(transformedReq)`. An interceptor may choose to transform the
      * response event stream as well, by applying additional Rx operators on the stream
      * returned by `next.handle()`.
      * 
      * More rarely, an interceptor may choose to completely handle the request itself,
      * and compose a new event stream instead of invoking `next.handle()`. This is
      * acceptable behavior, but keep in mind further interceptors will be skipped entirely.
      * 
      * It is also rare but valid for an interceptor to return multiple responses on the
      * event stream for a single request.
     */
    public native Observable<HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject> intercept(HttpRequest<Object> req, HttpHandler next);
}
