package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class StmtModifier extends Number {
    public static final StmtModifier Final = Js.uncheckedCast( 0 );
    public static final StmtModifier Private = Js.uncheckedCast( 1 );
    public static final StmtModifier Exported = Js.uncheckedCast( 2 );
}
