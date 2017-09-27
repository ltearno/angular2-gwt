package fr.lteconsulting.prebuilt;

import jsinterop.annotations.JsFunction;

/** 

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsFunction
public interface Action3<P1, P2, P3>{
    void call(P1 p1, P2 p2, P3 p3);
}
