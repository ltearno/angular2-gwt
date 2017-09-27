package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: ForEachCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:746042
  * 
 */
@JsFunction
public interface ForEachCallback{
    void call(Object keyId, String status);
}
