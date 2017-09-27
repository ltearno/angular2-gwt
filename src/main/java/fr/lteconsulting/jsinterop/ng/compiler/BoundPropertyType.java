package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BoundPropertyType extends Number {
    public static final BoundPropertyType DEFAULT = Js.uncheckedCast( 0 );
    public static final BoundPropertyType LITERAL_ATTR = Js.uncheckedCast( 1 );
    public static final BoundPropertyType ANIMATION = Js.uncheckedCast( 2 );
}
