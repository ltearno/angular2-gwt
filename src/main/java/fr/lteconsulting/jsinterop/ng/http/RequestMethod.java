package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class RequestMethod extends Number {
    public static final RequestMethod Get = Js.uncheckedCast( 0 );
    public static final RequestMethod Post = Js.uncheckedCast( 1 );
    public static final RequestMethod Put = Js.uncheckedCast( 2 );
    public static final RequestMethod Delete = Js.uncheckedCast( 3 );
    public static final RequestMethod Options = Js.uncheckedCast( 4 );
    public static final RequestMethod Head = Js.uncheckedCast( 5 );
    public static final RequestMethod Patch = Js.uncheckedCast( 6 );
}
