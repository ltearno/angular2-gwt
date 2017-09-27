package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class PropertyBindingType extends Number {
    public static final PropertyBindingType Property = Js.uncheckedCast( 0 );
    public static final PropertyBindingType Attribute = Js.uncheckedCast( 1 );
    public static final PropertyBindingType Class = Js.uncheckedCast( 2 );
    public static final PropertyBindingType Style = Js.uncheckedCast( 3 );
    public static final PropertyBindingType Animation = Js.uncheckedCast( 4 );
}
