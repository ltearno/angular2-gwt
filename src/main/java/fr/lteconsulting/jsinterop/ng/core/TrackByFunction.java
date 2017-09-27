package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsFunction;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".TrackByFunction
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:3992

  * An optional function passed into {@link NgForOf} that defines how to track
  * items in an iterable (e.g. fby index or id)
 */
@JsFunction
public interface TrackByFunction<T>{
    Object call(Number index, T item);
}
