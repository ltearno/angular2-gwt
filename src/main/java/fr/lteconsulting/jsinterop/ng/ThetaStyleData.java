package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata".ThetaStyleData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_metadata.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="ng", name="ThetaStyleData")
public class ThetaStyleData
{

    @JsOverlay
    public final void setByIndex(String index, PropertyKey_UnionOfNumberAndString value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final PropertyKey_UnionOfNumberAndString getByIndex(String index) {
        return (PropertyKey_UnionOfNumberAndString) Js.asPropertyMap(this).get(index);
    }
}
