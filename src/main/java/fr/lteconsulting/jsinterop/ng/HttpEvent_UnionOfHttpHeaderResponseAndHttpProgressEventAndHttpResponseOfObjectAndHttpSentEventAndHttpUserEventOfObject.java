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
public interface HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject  {
    @JsOverlay
    default HttpHeaderResponse asHttpHeaderResponse() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject ofHttpHeaderResponse(HttpHeaderResponse value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpProgressEvent asHttpProgressEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject ofHttpProgressEvent(HttpProgressEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpResponse<Object> asHttpResponseOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject ofHttpResponseOfObject(HttpResponse<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpSentEvent asHttpSentEvent() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject ofHttpSentEvent(HttpSentEvent value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HttpUserEvent<Object> asHttpUserEventOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  HttpEvent_UnionOfHttpHeaderResponseAndHttpProgressEventAndHttpResponseOfObjectAndHttpSentEventAndHttpUserEventOfObject ofHttpUserEventOfObject(HttpUserEvent<Object> value) {
        return Js.cast( value );
    }
    
}
