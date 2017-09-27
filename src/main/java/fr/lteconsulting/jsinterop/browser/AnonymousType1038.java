package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.core.QueryValueType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:4241

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1038
{

    @JsOverlay
    public final void setByIndex(int index, QueryValueType value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final QueryValueType getByIndex(int index) {
        return (QueryValueType) Js.asArrayLike(this).getAt(index);
    }
}
