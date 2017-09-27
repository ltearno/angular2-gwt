package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.forms.AbstractControl;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/forms/src/model.d.ts:16388

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1327
{

    @JsOverlay
    public final void setByIndex(String index, AbstractControl value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final AbstractControl getByIndex(String index) {
        return (AbstractControl) Js.asPropertyMap(this).get(index);
    }
}
