package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.core.QueryBindingType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/query.d.ts:212

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1046
{

    @JsOverlay
    public final void setByIndex(String index, QueryBindingType value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final QueryBindingType getByIndex(String index) {
        return (QueryBindingType) Js.asPropertyMap(this).get(index);
    }
}
