package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ArgumentType extends Number {
    public static final ArgumentType Inline = Js.uncheckedCast( 0 );
    public static final ArgumentType Dynamic = Js.uncheckedCast( 1 );
}
