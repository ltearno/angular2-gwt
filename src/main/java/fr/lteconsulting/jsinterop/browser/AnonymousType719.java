package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:5079

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType719
{

    @JsOverlay
    public final void setByIndex(String index, PropertyKey_UnionOfNumberAndString value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final PropertyKey_UnionOfNumberAndString getByIndex(String index) {
        return (PropertyKey_UnionOfNumberAndString) Js.asPropertyMap(this).get(index);
    }
}
