package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: IntersectionObserverCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:746189
  * 
 */
@JsFunction
public interface IntersectionObserverCallback{
    void call(Array<IntersectionObserverEntry> entries, IntersectionObserver observer);
}
