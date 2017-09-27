package fr.lteconsulting.prebuilt;

import jsinterop.annotations.JsFunction;

/** 

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface Function<R>{
    R call();
}
