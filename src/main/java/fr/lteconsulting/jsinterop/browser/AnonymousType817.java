package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:9655

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType817
{

    @JsOverlay
    public final void setByIndex(String index, String value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final String getByIndex(String index) {
        return (String) Js.asPropertyMap(this).get(index);
    }
}
