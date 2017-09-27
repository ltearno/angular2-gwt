package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BuiltinMethod extends Number {
    public static final BuiltinMethod ConcatArray = Js.uncheckedCast( 0 );
    public static final BuiltinMethod SubscribeObservable = Js.uncheckedCast( 1 );
    public static final BuiltinMethod Bind = Js.uncheckedCast( 2 );
}
