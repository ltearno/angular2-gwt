package fr.lteconsulting.prebuilt;

import jsinterop.annotations.JsFunction;

/** 

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface Function3<P1, P2, P3, R>{
    R call(P1 p1, P2 p2, P3 p3);
}
