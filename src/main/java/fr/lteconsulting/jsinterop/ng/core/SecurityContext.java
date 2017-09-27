package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class SecurityContext extends Number {
    public static final SecurityContext NONE = Js.uncheckedCast( 0 );
    public static final SecurityContext HTML = Js.uncheckedCast( 1 );
    public static final SecurityContext STYLE = Js.uncheckedCast( 2 );
    public static final SecurityContext SCRIPT = Js.uncheckedCast( 3 );
    public static final SecurityContext URL = Js.uncheckedCast( 4 );
    public static final SecurityContext RESOURCE_URL = Js.uncheckedCast( 5 );
}
