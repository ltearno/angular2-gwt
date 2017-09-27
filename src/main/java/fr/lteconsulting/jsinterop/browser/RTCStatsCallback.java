package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: RTCStatsCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745748
  * 
 */
@JsFunction
public interface RTCStatsCallback{
    void call(RTCStatsReport report);
}
