package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ReadyState extends Number {
    public static final ReadyState Unsent = Js.uncheckedCast( 0 );
    public static final ReadyState Open = Js.uncheckedCast( 1 );
    public static final ReadyState HeadersReceived = Js.uncheckedCast( 2 );
    public static final ReadyState Loading = Js.uncheckedCast( 3 );
    public static final ReadyState Done = Js.uncheckedCast( 4 );
    public static final ReadyState Cancelled = Js.uncheckedCast( 5 );
}
