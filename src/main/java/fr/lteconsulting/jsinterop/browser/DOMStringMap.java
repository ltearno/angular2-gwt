package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: DOMStringMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322762
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:322843
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMStringMap")
public class DOMStringMap
{

    /*
        Constructors
    */
    public DOMStringMap(){
    }

    @JsOverlay
    public final void setByIndex(String index, String value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final String getByIndex(String index) {
        return (String) Js.asPropertyMap(this).get(index);
    }
}
