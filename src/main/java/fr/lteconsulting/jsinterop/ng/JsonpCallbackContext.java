package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp".JsonpCallbackContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/http/src/jsonp.d.ts:470

  * DI token/abstract type representing a map of JSONP callbacks.
  * 
  * In the browser, this should always be the `window` object.
 */
@JsType(isNative=true, namespace="ng", name="JsonpCallbackContext")
public class JsonpCallbackContext
{

    @JsOverlay
    public final void setByIndex(String index, Action1<Object> value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Action1<Object> getByIndex(String index) {
        return (Action1<Object>) Js.asPropertyMap(this).get(index);
    }
}
