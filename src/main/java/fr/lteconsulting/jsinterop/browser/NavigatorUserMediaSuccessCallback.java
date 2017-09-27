package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: NavigatorUserMediaSuccessCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745878
  * 
 */
@JsFunction
public interface NavigatorUserMediaSuccessCallback{
    void call(MediaStream stream);
}
