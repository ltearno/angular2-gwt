package fr.lteconsulting.prebuilt;

import jsinterop.annotations.JsFunction;

/** 

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface Function2<P1, P2, R>{
    R call(P1 p1, P2 p2);
}
