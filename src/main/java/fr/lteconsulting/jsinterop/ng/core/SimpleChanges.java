package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/lifecycle_hooks".SimpleChanges
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/lifecycle_hooks.d.ts:276

  * A `changes` object whose keys are property names and
  * values are instances of {@link SimpleChange}. See {@link OnChanges}
 */
@JsType(isNative=true, namespace="ng.core", name="SimpleChanges")
public class SimpleChanges
{

    @JsOverlay
    public final void setByIndex(String index, SimpleChange value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final SimpleChange getByIndex(String index) {
        return (SimpleChange) Js.asPropertyMap(this).get(index);
    }
}
