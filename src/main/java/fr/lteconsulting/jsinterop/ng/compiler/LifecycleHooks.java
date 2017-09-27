package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class LifecycleHooks extends Number {
    public static final LifecycleHooks OnInit = Js.uncheckedCast( 0 );
    public static final LifecycleHooks OnDestroy = Js.uncheckedCast( 1 );
    public static final LifecycleHooks DoCheck = Js.uncheckedCast( 2 );
    public static final LifecycleHooks OnChanges = Js.uncheckedCast( 3 );
    public static final LifecycleHooks AfterContentInit = Js.uncheckedCast( 4 );
    public static final LifecycleHooks AfterContentChecked = Js.uncheckedCast( 5 );
    public static final LifecycleHooks AfterViewInit = Js.uncheckedCast( 6 );
    public static final LifecycleHooks AfterViewChecked = Js.uncheckedCast( 7 );
}
