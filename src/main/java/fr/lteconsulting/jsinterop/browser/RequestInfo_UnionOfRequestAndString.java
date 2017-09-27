package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: apis/browser-api/tsd/lib.es6.d.ts:775695
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface RequestInfo_UnionOfRequestAndString  {
    @JsOverlay
    default Request asRequest() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  RequestInfo_UnionOfRequestAndString ofRequest(Request value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  RequestInfo_UnionOfRequestAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
