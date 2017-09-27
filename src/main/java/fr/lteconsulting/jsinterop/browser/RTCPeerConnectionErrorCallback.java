package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: RTCPeerConnectionErrorCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745674
  * 
 */
@JsFunction
public interface RTCPeerConnectionErrorCallback{
    void call(DOMError error);
}
