package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class CheckType extends Number {
    public static final CheckType CheckAndUpdate = Js.uncheckedCast( 0 );
    public static final CheckType CheckNoChanges = Js.uncheckedCast( 1 );
}
