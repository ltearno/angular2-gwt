package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: DecodeErrorCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745482
  * 
 */
@JsFunction
public interface DecodeErrorCallback{
    void call(DOMException error);
}
