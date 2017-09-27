package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.StateValue;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/render/transition_animation_engine.d.ts:3077

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType793
{

    @JsOverlay
    public final void setByIndex(String index, StateValue value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final StateValue getByIndex(String index) {
        return (StateValue) Js.asPropertyMap(this).get(index);
    }
}
