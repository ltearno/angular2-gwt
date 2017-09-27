package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: ErrorEventHandler
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:744742
  * 
 */
@JsFunction
public interface ErrorEventHandler{
    void call(String message, String filename /* optional */, Number lineno /* optional */, Number colno /* optional */, Error error /* optional */);
}
