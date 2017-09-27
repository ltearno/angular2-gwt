package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ViewFlags extends Number {
    public static final ViewFlags None = Js.uncheckedCast( 0 );
    public static final ViewFlags OnPush = Js.uncheckedCast( 2 );
}
