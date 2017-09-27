package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: DecodeSuccessCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745408
  * 
 */
@JsFunction
public interface DecodeSuccessCallback{
    void call(AudioBuffer decodedData);
}
