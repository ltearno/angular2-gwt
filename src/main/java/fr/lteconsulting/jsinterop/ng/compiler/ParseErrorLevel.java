package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ParseErrorLevel extends Number {
    public static final ParseErrorLevel WARNING = Js.uncheckedCast( 0 );
    public static final ParseErrorLevel ERROR = Js.uncheckedCast( 1 );
}
