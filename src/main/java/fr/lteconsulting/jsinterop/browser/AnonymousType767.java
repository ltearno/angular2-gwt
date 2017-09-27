package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts:3142

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType767
{

    @JsOverlay
    public final void setByIndex(String index, AnonymousType768 value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final AnonymousType768 getByIndex(String index) {
        return (AnonymousType768) Js.asPropertyMap(this).get(index);
    }
}
