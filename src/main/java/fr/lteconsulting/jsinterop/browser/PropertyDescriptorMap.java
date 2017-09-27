package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: PropertyDescriptorMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:3131
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PropertyDescriptorMap")
public class PropertyDescriptorMap
{

    @JsOverlay
    public final void setByIndex(String index, PropertyDescriptor value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final PropertyDescriptor getByIndex(String index) {
        return (PropertyDescriptor) Js.asPropertyMap(this).get(index);
    }
}
