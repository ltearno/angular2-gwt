package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ViewEncapsulation extends Number {
    public static final ViewEncapsulation Emulated = Js.uncheckedCast( 0 );
    public static final ViewEncapsulation Native = Js.uncheckedCast( 1 );
    public static final ViewEncapsulation None = Js.uncheckedCast( 2 );
}
