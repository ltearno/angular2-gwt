package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: MutationCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:745308
  * 
 */
@JsFunction
public interface MutationCallback{
    void call(Array<MutationRecord> mutations, MutationObserver observer);
}
