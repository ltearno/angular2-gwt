package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.AnimationStateStyles;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts:741

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType776
{

    @JsOverlay
    public final void setByIndex(String index, AnimationStateStyles value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final AnimationStateStyles getByIndex(String index) {
        return (AnimationStateStyles) Js.asPropertyMap(this).get(index);
    }
}
