package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: RTCSessionDescriptionCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745590
  * 
 */
@JsFunction
public interface RTCSessionDescriptionCallback{
    void call(RTCSessionDescription sdp);
}
