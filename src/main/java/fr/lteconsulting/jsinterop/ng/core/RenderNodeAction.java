package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class RenderNodeAction extends Number {
    public static final RenderNodeAction Collect = Js.uncheckedCast( 0 );
    public static final RenderNodeAction AppendChild = Js.uncheckedCast( 1 );
    public static final RenderNodeAction InsertBefore = Js.uncheckedCast( 2 );
    public static final RenderNodeAction RemoveChild = Js.uncheckedCast( 3 );
}
