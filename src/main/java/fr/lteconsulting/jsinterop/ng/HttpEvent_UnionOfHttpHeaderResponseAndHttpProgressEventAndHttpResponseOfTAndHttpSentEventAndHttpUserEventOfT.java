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
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T>  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T> ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T> ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<T> asHttpResponseOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T> ofHttpResponseOfT(HttpResponse<T> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T> ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<T> asHttpUserEventOfT() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T> HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfTAndHttpSentEventAndHttpUserEventOfT<T> ofHttpUserEventOfT(HttpUserEvent<T> value) {
        return Js.cast( value );
    }
    
}
