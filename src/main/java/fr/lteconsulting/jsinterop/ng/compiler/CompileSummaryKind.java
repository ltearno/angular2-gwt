package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class CompileSummaryKind extends Number {
    public static final CompileSummaryKind Pipe = Js.uncheckedCast( 0 );
    public static final CompileSummaryKind Directive = Js.uncheckedCast( 1 );
    public static final CompileSummaryKind NgModule = Js.uncheckedCast( 2 );
    public static final CompileSummaryKind Injectable = Js.uncheckedCast( 3 );
}
