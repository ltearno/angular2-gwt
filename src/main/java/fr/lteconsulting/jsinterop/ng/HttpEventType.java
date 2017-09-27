package fr.lteconsulting.jsinterop.ng;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class HttpEventType extends Number {
    public static final HttpEventType Sent = Js.uncheckedCast( 0 );
    public static final HttpEventType UploadProgress = Js.uncheckedCast( 1 );
    public static final HttpEventType ResponseHeader = Js.uncheckedCast( 2 );
    public static final HttpEventType DownloadProgress = Js.uncheckedCast( 3 );
    public static final HttpEventType Response = Js.uncheckedCast( 4 );
    public static final HttpEventType User = Js.uncheckedCast( 5 );
}
