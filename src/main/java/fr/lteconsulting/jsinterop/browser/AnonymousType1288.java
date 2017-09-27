package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/message_bundle.d.ts:773

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1288
{

    @JsOverlay
    public final void setByIndex(String index, Array<String> value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Array<String> getByIndex(String index) {
        return (Array<String>) Js.asPropertyMap(this).get(index);
    }
}
