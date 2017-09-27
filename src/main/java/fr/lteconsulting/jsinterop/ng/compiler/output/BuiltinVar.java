package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BuiltinVar extends Number {
    public static final BuiltinVar This = Js.uncheckedCast( 0 );
    public static final BuiltinVar Super = Js.uncheckedCast( 1 );
    public static final BuiltinVar CatchError = Js.uncheckedCast( 2 );
    public static final BuiltinVar CatchStack = Js.uncheckedCast( 3 );
}
