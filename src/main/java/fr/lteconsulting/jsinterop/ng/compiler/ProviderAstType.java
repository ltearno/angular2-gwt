package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ProviderAstType extends Number {
    public static final ProviderAstType PublicService = Js.uncheckedCast( 0 );
    public static final ProviderAstType PrivateService = Js.uncheckedCast( 1 );
    public static final ProviderAstType Component = Js.uncheckedCast( 2 );
    public static final ProviderAstType Directive = Js.uncheckedCast( 3 );
    public static final ProviderAstType Builtin = Js.uncheckedCast( 4 );
}
