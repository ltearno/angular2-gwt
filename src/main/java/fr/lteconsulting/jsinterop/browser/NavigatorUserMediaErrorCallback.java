package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: NavigatorUserMediaErrorCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745959
  * 
 */
@JsFunction
public interface NavigatorUserMediaErrorCallback{
    void call(MediaStreamError error);
}
