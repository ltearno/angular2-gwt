package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.base.Js;

/** 
  * Enumeration adapter
  * 
 */
public abstract class NodeFlags extends Number {
    public static final NodeFlags None = Js.uncheckedCast( 0 );
    public static final NodeFlags TypeElement = Js.uncheckedCast( 1 );
    public static final NodeFlags TypeText = Js.uncheckedCast( 2 );
    public static final NodeFlags ProjectedTemplate = Js.uncheckedCast( 4 );
    public static final NodeFlags CatRenderNode = Js.uncheckedCast( 3 );
    public static final NodeFlags TypeNgContent = Js.uncheckedCast( 8 );
    public static final NodeFlags TypePipe = Js.uncheckedCast( 16 );
    public static final NodeFlags TypePureArray = Js.uncheckedCast( 32 );
    public static final NodeFlags TypePureObject = Js.uncheckedCast( 64 );
    public static final NodeFlags TypePurePipe = Js.uncheckedCast( 128 );
    public static final NodeFlags CatPureExpression = Js.uncheckedCast( 224 );
    public static final NodeFlags TypeValueProvider = Js.uncheckedCast( 256 );
    public static final NodeFlags TypeClassProvider = Js.uncheckedCast( 512 );
    public static final NodeFlags TypeFactoryProvider = Js.uncheckedCast( 1024 );
    public static final NodeFlags TypeUseExistingProvider = Js.uncheckedCast( 2048 );
    public static final NodeFlags LazyProvider = Js.uncheckedCast( 4096 );
    public static final NodeFlags PrivateProvider = Js.uncheckedCast( 8192 );
    public static final NodeFlags TypeDirective = Js.uncheckedCast( 16384 );
    public static final NodeFlags Component = Js.uncheckedCast( 32768 );
    public static final NodeFlags CatProviderNoDirective = Js.uncheckedCast( 3840 );
    public static final NodeFlags CatProvider = Js.uncheckedCast( 20224 );
    public static final NodeFlags OnInit = Js.uncheckedCast( 65536 );
    public static final NodeFlags OnDestroy = Js.uncheckedCast( 131072 );
    public static final NodeFlags DoCheck = Js.uncheckedCast( 262144 );
    public static final NodeFlags OnChanges = Js.uncheckedCast( 524288 );
    public static final NodeFlags AfterContentInit = Js.uncheckedCast( 1048576 );
    public static final NodeFlags AfterContentChecked = Js.uncheckedCast( 2097152 );
    public static final NodeFlags AfterViewInit = Js.uncheckedCast( 4194304 );
    public static final NodeFlags AfterViewChecked = Js.uncheckedCast( 8388608 );
    public static final NodeFlags EmbeddedViews = Js.uncheckedCast( 16777216 );
    public static final NodeFlags ComponentView = Js.uncheckedCast( 33554432 );
    public static final NodeFlags TypeContentQuery = Js.uncheckedCast( 67108864 );
    public static final NodeFlags TypeViewQuery = Js.uncheckedCast( 134217728 );
    public static final NodeFlags StaticQuery = Js.uncheckedCast( 268435456 );
    public static final NodeFlags DynamicQuery = Js.uncheckedCast( 536870912 );
    public static final NodeFlags CatQuery = Js.uncheckedCast( 201326592 );
    public static final NodeFlags Types = Js.uncheckedCast( 201347067 );
}
