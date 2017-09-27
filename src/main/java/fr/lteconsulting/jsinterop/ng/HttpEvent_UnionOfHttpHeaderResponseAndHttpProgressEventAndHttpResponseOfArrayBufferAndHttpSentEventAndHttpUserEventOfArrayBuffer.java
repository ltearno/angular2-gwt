package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.ArrayBuffer;
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
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<ArrayBuffer> asHttpResponseOfArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer ofHttpResponseOfArrayBuffer(HttpResponse<ArrayBuffer> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<ArrayBuffer> asHttpUserEventOfArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfArrayBufferAndHttpSentEventAndHttpUserEventOfArrayBuffer ofHttpUserEventOfArrayBuffer(HttpUserEvent<ArrayBuffer> value) {
        return Js.cast( value );
    }
    
}
