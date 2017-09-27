package fr.lteconsulting.jsinterop.ng.http;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ContentType extends Number {
    public static final ContentType NONE = Js.uncheckedCast( 0 );
    public static final ContentType JSON = Js.uncheckedCast( 1 );
    public static final ContentType FORM = Js.uncheckedCast( 2 );
    public static final ContentType FORM_DATA = Js.uncheckedCast( 3 );
    public static final ContentType TEXT = Js.uncheckedCast( 4 );
    public static final ContentType BLOB = Js.uncheckedCast( 5 );
    public static final ContentType ARRAY_BUFFER = Js.uncheckedCast( 6 );
}
