package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/response.d.ts:2735
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R>  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R> ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R> ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<R> asHttpResponseOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R> ofHttpResponseOfR(HttpResponse<R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R> ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<R> asHttpUserEventOfR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfRAndHttpSentEventAndHttpUserEventOfR<R> ofHttpUserEventOfR(HttpUserEvent<R> value) {
        return Js.cast( value );
    }
    
}
