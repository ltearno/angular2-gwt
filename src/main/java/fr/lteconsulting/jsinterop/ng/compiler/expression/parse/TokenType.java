package fr.lteconsulting.jsinterop.ng.compiler.expression.parse;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class TokenType extends Number {
    public static final TokenType Character = Js.uncheckedCast( 0 );
    public static final TokenType Identifier = Js.uncheckedCast( 1 );
    public static final TokenType Keyword = Js.uncheckedCast( 2 );
    public static final TokenType String = Js.uncheckedCast( 3 );
    public static final TokenType Operator = Js.uncheckedCast( 4 );
    public static final TokenType Number = Js.uncheckedCast( 5 );
    public static final TokenType Error = Js.uncheckedCast( 6 );
}
