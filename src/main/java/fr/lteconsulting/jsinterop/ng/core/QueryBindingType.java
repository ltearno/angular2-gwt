package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class QueryBindingType extends Number {
    public static final QueryBindingType First = Js.uncheckedCast( 0 );
    public static final QueryBindingType All = Js.uncheckedCast( 1 );
}
