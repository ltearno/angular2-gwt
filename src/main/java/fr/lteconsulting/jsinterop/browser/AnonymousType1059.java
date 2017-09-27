package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/reflection/platform_reflection_capabilities.d.ts:602

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1059
{

    @JsOverlay
    public final void setByIndex(String index, Array<Object> value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Array<Object> getByIndex(String index) {
        return (Array<Object>) Js.asPropertyMap(this).get(index);
    }
}
