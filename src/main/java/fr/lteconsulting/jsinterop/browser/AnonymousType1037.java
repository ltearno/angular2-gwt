package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.core.QueryValueType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:4082

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1037
{

    @JsOverlay
    public final void setByIndex(String index, QueryValueType value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final QueryValueType getByIndex(String index) {
        return (QueryValueType) Js.asPropertyMap(this).get(index);
    }
}
