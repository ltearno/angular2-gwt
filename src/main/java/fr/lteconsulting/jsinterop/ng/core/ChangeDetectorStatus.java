package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ChangeDetectorStatus extends Number {
    public static final ChangeDetectorStatus CheckOnce = Js.uncheckedCast( 0 );
    public static final ChangeDetectorStatus Checked = Js.uncheckedCast( 1 );
    public static final ChangeDetectorStatus CheckAlways = Js.uncheckedCast( 2 );
    public static final ChangeDetectorStatus Detached = Js.uncheckedCast( 3 );
    public static final ChangeDetectorStatus Errored = Js.uncheckedCast( 4 );
    public static final ChangeDetectorStatus Destroyed = Js.uncheckedCast( 5 );
}
