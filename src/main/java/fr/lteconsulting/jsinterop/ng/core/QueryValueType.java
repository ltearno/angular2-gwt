package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class QueryValueType extends Number {
    public static final QueryValueType ElementRef = Js.uncheckedCast( 0 );
    public static final QueryValueType RenderElement = Js.uncheckedCast( 1 );
    public static final QueryValueType TemplateRef = Js.uncheckedCast( 2 );
    public static final QueryValueType ViewContainerRef = Js.uncheckedCast( 3 );
    public static final QueryValueType Provider = Js.uncheckedCast( 4 );
}
