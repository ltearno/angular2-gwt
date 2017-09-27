package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.Tuple;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/provider.d.ts:292

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1043
{

    @JsOverlay
    public final void setByIndex(String index, Tuple<Number, String> value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Tuple<Number, String> getByIndex(String index) {
        return (Tuple<Number, String>) Js.asPropertyMap(this).get(index);
    }
}
