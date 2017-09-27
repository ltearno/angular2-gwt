package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Blob;
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
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<Blob> asHttpResponseOfBlob() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob ofHttpResponseOfBlob(HttpResponse<Blob> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<Blob> asHttpUserEventOfBlob() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfBlobAndHttpSentEventAndHttpUserEventOfBlob ofHttpUserEventOfBlob(HttpUserEvent<Blob> value) {
        return Js.cast( value );
    }
    
}
