package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsFunction;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node".Predicate
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts:2400

  * A boolean-valued function over a value, possibly including context information
  * regarding that value's position in an array.
 */
@JsFunction
public interface Predicate<T>{
    Boolean call(T value);
}
