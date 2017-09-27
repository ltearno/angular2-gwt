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
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<String> asHttpResponseOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString ofHttpResponseOfString(HttpResponse<String> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<String> asHttpUserEventOfString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfStringAndHttpSentEventAndHttpUserEventOfString ofHttpUserEventOfString(HttpUserEvent<String> value) {
        return Js.cast( value );
    }
    
}
