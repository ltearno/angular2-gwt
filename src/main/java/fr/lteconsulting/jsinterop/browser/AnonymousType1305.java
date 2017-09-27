package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.compiler.i18n.Node;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/translation_bundle.d.ts:714

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1305
{

    @JsOverlay
    public final void setByIndex(String index, Array<Node> value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Array<Node> getByIndex(String index) {
        return (Array<Node>) Js.asPropertyMap(this).get(index);
    }
}
