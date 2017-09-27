package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.prebuilt.Action;
import jsinterop.annotations.JsFunction;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".NodeLogger
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:1028

  * Function to call console.error at the right source location. This is an indirection
  * via another function as browser will log the location that actually called
  * `console.error`.
 */
@JsFunction
public interface NodeLogger{
    Action call();
}
