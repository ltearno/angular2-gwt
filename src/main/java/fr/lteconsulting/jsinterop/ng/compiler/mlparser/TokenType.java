package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class TokenType extends Number {
    public static final TokenType TAG_OPEN_START = Js.uncheckedCast( 0 );
    public static final TokenType TAG_OPEN_END = Js.uncheckedCast( 1 );
    public static final TokenType TAG_OPEN_END_VOID = Js.uncheckedCast( 2 );
    public static final TokenType TAG_CLOSE = Js.uncheckedCast( 3 );
    public static final TokenType TEXT = Js.uncheckedCast( 4 );
    public static final TokenType ESCAPABLE_RAW_TEXT = Js.uncheckedCast( 5 );
    public static final TokenType RAW_TEXT = Js.uncheckedCast( 6 );
    public static final TokenType COMMENT_START = Js.uncheckedCast( 7 );
    public static final TokenType COMMENT_END = Js.uncheckedCast( 8 );
    public static final TokenType CDATA_START = Js.uncheckedCast( 9 );
    public static final TokenType CDATA_END = Js.uncheckedCast( 10 );
    public static final TokenType ATTR_NAME = Js.uncheckedCast( 11 );
    public static final TokenType ATTR_VALUE = Js.uncheckedCast( 12 );
    public static final TokenType DOC_TYPE = Js.uncheckedCast( 13 );
    public static final TokenType EXPANSION_FORM_START = Js.uncheckedCast( 14 );
    public static final TokenType EXPANSION_CASE_VALUE = Js.uncheckedCast( 15 );
    public static final TokenType EXPANSION_CASE_EXP_START = Js.uncheckedCast( 16 );
    public static final TokenType EXPANSION_CASE_EXP_END = Js.uncheckedCast( 17 );
    public static final TokenType EXPANSION_FORM_END = Js.uncheckedCast( 18 );
    public static final TokenType EOF = Js.uncheckedCast( 19 );
}
