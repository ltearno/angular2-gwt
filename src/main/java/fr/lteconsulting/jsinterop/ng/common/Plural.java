package fr.lteconsulting.jsinterop.ng.common;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class Plural extends Number {
    public static final Plural Zero = Js.uncheckedCast( 0 );
    public static final Plural One = Js.uncheckedCast( 1 );
    public static final Plural Two = Js.uncheckedCast( 2 );
    public static final Plural Few = Js.uncheckedCast( 3 );
    public static final Plural Many = Js.uncheckedCast( 4 );
    public static final Plural Other = Js.uncheckedCast( 5 );
}
