package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class ViewState extends Number {
    public static final ViewState BeforeFirstCheck = Js.uncheckedCast( 1 );
    public static final ViewState FirstCheck = Js.uncheckedCast( 2 );
    public static final ViewState Attached = Js.uncheckedCast( 4 );
    public static final ViewState ChecksEnabled = Js.uncheckedCast( 8 );
    public static final ViewState IsProjectedView = Js.uncheckedCast( 16 );
    public static final ViewState CheckProjectedView = Js.uncheckedCast( 32 );
    public static final ViewState CheckProjectedViews = Js.uncheckedCast( 64 );
    public static final ViewState Destroyed = Js.uncheckedCast( 128 );
    public static final ViewState CatDetectChanges = Js.uncheckedCast( 12 );
    public static final ViewState CatInit = Js.uncheckedCast( 13 );
}
