package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/pure_expression.d.ts:447

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1045
{

    @JsOverlay
    public final void setByIndex(String index, Number value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Number getByIndex(String index) {
        return (Number) Js.asPropertyMap(this).get(index);
    }
}
