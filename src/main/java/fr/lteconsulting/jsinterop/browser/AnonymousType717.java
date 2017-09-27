package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:1471

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType717
{

    @JsOverlay
    public final void setByIndex(String index, Object value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Object getByIndex(String index) {
        return (Object) Js.asPropertyMap(this).get(index);
    }
}
