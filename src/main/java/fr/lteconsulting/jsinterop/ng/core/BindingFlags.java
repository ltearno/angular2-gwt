package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BindingFlags extends Number {
    public static final BindingFlags TypeElementAttribute = Js.uncheckedCast( 1 );
    public static final BindingFlags TypeElementClass = Js.uncheckedCast( 2 );
    public static final BindingFlags TypeElementStyle = Js.uncheckedCast( 4 );
    public static final BindingFlags TypeProperty = Js.uncheckedCast( 8 );
    public static final BindingFlags SyntheticProperty = Js.uncheckedCast( 16 );
    public static final BindingFlags SyntheticHostProperty = Js.uncheckedCast( 32 );
    public static final BindingFlags CatSyntheticProperty = Js.uncheckedCast( 48 );
    public static final BindingFlags Types = Js.uncheckedCast( 15 );
}
