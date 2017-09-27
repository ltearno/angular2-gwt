package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class DepFlags extends Number {
    public static final DepFlags None = Js.uncheckedCast( 0 );
    public static final DepFlags SkipSelf = Js.uncheckedCast( 1 );
    public static final DepFlags Optional = Js.uncheckedCast( 2 );
    public static final DepFlags Value = Js.uncheckedCast( 8 );
}
