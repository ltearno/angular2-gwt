package fr.lteconsulting.jsinterop.ng.compiler.output;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class BinaryOperator extends Number {
    public static final BinaryOperator Equals = Js.uncheckedCast( 0 );
    public static final BinaryOperator NotEquals = Js.uncheckedCast( 1 );
    public static final BinaryOperator Identical = Js.uncheckedCast( 2 );
    public static final BinaryOperator NotIdentical = Js.uncheckedCast( 3 );
    public static final BinaryOperator Minus = Js.uncheckedCast( 4 );
    public static final BinaryOperator Plus = Js.uncheckedCast( 5 );
    public static final BinaryOperator Divide = Js.uncheckedCast( 6 );
    public static final BinaryOperator Multiply = Js.uncheckedCast( 7 );
    public static final BinaryOperator Modulo = Js.uncheckedCast( 8 );
    public static final BinaryOperator And = Js.uncheckedCast( 9 );
    public static final BinaryOperator Or = Js.uncheckedCast( 10 );
    public static final BinaryOperator Lower = Js.uncheckedCast( 11 );
    public static final BinaryOperator LowerEquals = Js.uncheckedCast( 12 );
    public static final BinaryOperator Bigger = Js.uncheckedCast( 13 );
    public static final BinaryOperator BiggerEquals = Js.uncheckedCast( 14 );
}
