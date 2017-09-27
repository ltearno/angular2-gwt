package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class TagContentType extends Number {
    public static final TagContentType RAW_TEXT = Js.uncheckedCast( 0 );
    public static final TagContentType ESCAPABLE_RAW_TEXT = Js.uncheckedCast( 1 );
    public static final TagContentType PARSABLE_DATA = Js.uncheckedCast( 2 );
}
