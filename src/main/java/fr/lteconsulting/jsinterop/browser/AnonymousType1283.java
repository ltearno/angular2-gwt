package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.compiler.i18n.Message;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_ast.d.ts:914

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1283
{

    @JsOverlay
    public final void setByIndex(String index, Message value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Message getByIndex(String index) {
        return (Message) Js.asPropertyMap(this).get(index);
    }
}
