package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsFunction;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/forward_ref".ForwardRefFn
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/di/forward_ref.d.ts:234

  * An interface that a function passed into {@link forwardRef} has to implement.
  * 
  * ### Example
  * 
  * {@example core/di/ts/forward_ref/forward_ref_spec.ts region='forward_ref_fn'}
 */
@JsFunction
public interface ForwardRefFn{
    Object call();
}
