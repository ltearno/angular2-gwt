package fr.lteconsulting.jsinterop.ng;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class AnimationTransitionInstructionType extends Number {
    public static final AnimationTransitionInstructionType TransitionAnimation = Js.uncheckedCast( 0 );
    public static final AnimationTransitionInstructionType TimelineAnimation = Js.uncheckedCast( 1 );
}
