package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ResponseContentType extends Number {
    public static final ResponseContentType Text = Js.uncheckedCast( 0 );
    public static final ResponseContentType Json = Js.uncheckedCast( 1 );
    public static final ResponseContentType ArrayBuffer = Js.uncheckedCast( 2 );
    public static final ResponseContentType Blob = Js.uncheckedCast( 3 );
}
