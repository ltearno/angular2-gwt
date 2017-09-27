package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.jsinterop.ng.router.UrlSegmentGroup;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: __type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts:2403

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AnonymousType1431
{

    @JsOverlay
    public final void setByIndex(String index, UrlSegmentGroup value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final UrlSegmentGroup getByIndex(String index) {
        return (UrlSegmentGroup) Js.asPropertyMap(this).get(index);
    }
}
