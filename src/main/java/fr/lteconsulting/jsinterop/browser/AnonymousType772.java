package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_instruction.d.ts:781

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType772
{

    @JsOverlay
    public final void setByIndex(String index, Boolean value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Boolean getByIndex(String index) {
        return (Boolean) Js.asPropertyMap(this).get(index);
    }
}
