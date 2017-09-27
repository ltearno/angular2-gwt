package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class PreparsedElementType extends Number {
    public static final PreparsedElementType NG_CONTENT = Js.uncheckedCast( 0 );
    public static final PreparsedElementType STYLE = Js.uncheckedCast( 1 );
    public static final PreparsedElementType STYLESHEET = Js.uncheckedCast( 2 );
    public static final PreparsedElementType SCRIPT = Js.uncheckedCast( 3 );
    public static final PreparsedElementType OTHER = Js.uncheckedCast( 4 );
}
