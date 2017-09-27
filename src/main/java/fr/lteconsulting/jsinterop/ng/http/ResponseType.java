package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ResponseType extends Number {
    public static final ResponseType Basic = Js.uncheckedCast( 0 );
    public static final ResponseType Cors = Js.uncheckedCast( 1 );
    public static final ResponseType Default = Js.uncheckedCast( 2 );
    public static final ResponseType Error = Js.uncheckedCast( 3 );
    public static final ResponseType Opaque = Js.uncheckedCast( 4 );
}
