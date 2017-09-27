package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class MissingTranslationStrategy extends Number {
    public static final MissingTranslationStrategy Error = Js.uncheckedCast( 0 );
    public static final MissingTranslationStrategy Warning = Js.uncheckedCast( 1 );
    public static final MissingTranslationStrategy Ignore = Js.uncheckedCast( 2 );
}
