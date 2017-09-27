package fr.lteconsulting.jsinterop.ng;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class AnimationMetadataType extends Number {
    public static final AnimationMetadataType State = Js.uncheckedCast( 0 );
    public static final AnimationMetadataType Transition = Js.uncheckedCast( 1 );
    public static final AnimationMetadataType Sequence = Js.uncheckedCast( 2 );
    public static final AnimationMetadataType Group = Js.uncheckedCast( 3 );
    public static final AnimationMetadataType Animate = Js.uncheckedCast( 4 );
    public static final AnimationMetadataType Keyframes = Js.uncheckedCast( 5 );
    public static final AnimationMetadataType Style = Js.uncheckedCast( 6 );
    public static final AnimationMetadataType Trigger = Js.uncheckedCast( 7 );
    public static final AnimationMetadataType Reference = Js.uncheckedCast( 8 );
    public static final AnimationMetadataType AnimateChild = Js.uncheckedCast( 9 );
    public static final AnimationMetadataType AnimateRef = Js.uncheckedCast( 10 );
    public static final AnimationMetadataType Query = Js.uncheckedCast( 11 );
    public static final AnimationMetadataType Stagger = Js.uncheckedCast( 12 );
}
