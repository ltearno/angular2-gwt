package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class NumberFormatStyle extends Number {
    public static final NumberFormatStyle Decimal = Js.uncheckedCast( 0 );
    public static final NumberFormatStyle Percent = Js.uncheckedCast( 1 );
    public static final NumberFormatStyle Currency = Js.uncheckedCast( 2 );
}
