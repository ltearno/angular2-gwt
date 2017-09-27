package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class OutputType extends Number {
    public static final OutputType ElementOutput = Js.uncheckedCast( 0 );
    public static final OutputType DirectiveOutput = Js.uncheckedCast( 1 );
}
