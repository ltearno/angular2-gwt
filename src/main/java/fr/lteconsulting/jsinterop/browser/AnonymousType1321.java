package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.core.SecurityContext;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/schema/dom_security_schema.d.ts:384

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1321
{

    @JsOverlay
    public final void setByIndex(String index, SecurityContext value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final SecurityContext getByIndex(String index) {
        return (SecurityContext) Js.asPropertyMap(this).get(index);
    }
}
