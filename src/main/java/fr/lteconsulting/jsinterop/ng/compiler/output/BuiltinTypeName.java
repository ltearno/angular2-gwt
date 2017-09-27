package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BuiltinTypeName extends Number {
    public static final BuiltinTypeName Dynamic = Js.uncheckedCast( 0 );
    public static final BuiltinTypeName Bool = Js.uncheckedCast( 1 );
    public static final BuiltinTypeName String = Js.uncheckedCast( 2 );
    public static final BuiltinTypeName Int = Js.uncheckedCast( 3 );
    public static final BuiltinTypeName Number = Js.uncheckedCast( 4 );
    public static final BuiltinTypeName Function = Js.uncheckedCast( 5 );
    public static final BuiltinTypeName Inferred = Js.uncheckedCast( 6 );
}
