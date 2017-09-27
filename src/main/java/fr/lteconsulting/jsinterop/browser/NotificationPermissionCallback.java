package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsFunction;

/** 
  * base type: NotificationPermissionCallback
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:746112
  * 
 */
@JsFunction
public interface NotificationPermissionCallback{
    void call(String permission);
}
