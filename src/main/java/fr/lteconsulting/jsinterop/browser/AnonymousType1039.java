package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.core.NodeDef;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:7318

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1039
{

    @JsOverlay
    public final void setByIndex(String index, NodeDef value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final NodeDef getByIndex(String index) {
        return (NodeDef) Js.asPropertyMap(this).get(index);
    }
}
