package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ChangeDetectionStrategy extends Number {
    public static final ChangeDetectionStrategy OnPush = Js.uncheckedCast( 0 );
    public static final ChangeDetectionStrategy Default = Js.uncheckedCast( 1 );
}
