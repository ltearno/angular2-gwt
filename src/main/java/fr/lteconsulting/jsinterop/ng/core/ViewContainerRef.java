package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref".ViewContainerRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts:511

  * Represents a container where one or more Views can be attached.
  * 
  * The container can contain two kinds of Views. Host Views, created by instantiating a
  * {@link Component} via {@link #createComponent}, and Embedded Views, created by instantiating an
  * {@link TemplateRef Embedded Template} via {@link #createEmbeddedView}.
  * 
  * The location of the View Container within the containing View is specified by the Anchor
  * `element`. Each View Container can have only one Anchor Element and each Anchor Element can only
  * have a single View Container.
  * 
  * Root elements of Views attached to this container become siblings of the Anchor Element in
  * the Rendered View.
  * 
  * To access a `ViewContainerRef` of an Element, you can either place a {@link Directive} injected
  * with `ViewContainerRef` on the Element, or you obtain it via a {@link ViewChild} query.
 */
@JsType(isNative=true, namespace="ng.core", name="ViewContainerRef")
public class ViewContainerRef
{

    /*
        Properties
    */

    /** 
      * Anchor element that specifies the location of this container in the containing View.
      * <!-- TODO: rename to anchorElement -->
     */
    public ElementRef element;

    @JsProperty( name = "element")
    public native ElementRef getElement();

    @JsProperty( name = "element")
    public native void setElement( ElementRef value );

    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    /** 
      * Returns the number of Views currently attached to this container.
     */
    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public Injector parentInjector;

    @JsProperty( name = "parentInjector")
    public native Injector getParentInjector();

    @JsProperty( name = "parentInjector")
    public native void setParentInjector( Injector value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clear,429,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@1803
      * Destroys all Views in this container.
     */
    public native void clear();
    /** 
      * Std Signature : S(createComponent,382<C->,C-,P(d373<C->))
      * TE Signature : S(createComponent,P(d373))
      * 
     */
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory);
    /** 
      * Std Signature : S(createComponent,382<C->,C-,P(d373<C->),P(d2))
      * TE Signature : S(createComponent,P(d373),P(d2))
      * 
     */
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory, Number index /* optional */);
    /** 
      * Std Signature : S(createComponent,382<C->,C-,P(d373<C->),P(d2),P(d335))
      * TE Signature : S(createComponent,P(d373),P(d2),P(d335))
      * 
     */
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory, Number index /* optional */, Injector injector /* optional */);
    /** 
      * Std Signature : S(createComponent,382<C->,C-,P(d373<C->),P(d2),P(d335),P(d7<2<3>>))
      * TE Signature : S(createComponent,P(d373),P(d2),P(d335),P(d7))
      * 
     */
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory, Number index /* optional */, Injector injector /* optional */, Array<Array<Object>> projectableNodes /* optional */);
    /** 
      * Std Signature : S(createComponent,382<C->,C-,P(d373<C->),P(d2),P(d335),P(d7<2<3>>),P(d371<3>))
      * TE Signature : S(createComponent,P(d373),P(d2),P(d335),P(d7),P(d371))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@3220
      * Instantiates a single {@link Component} and inserts its Host View into this container at the
      * specified `index`.
      * 
      * The component is instantiated using its {@link ComponentFactory} which can be
      * obtained via {@link ComponentFactoryResolver#resolveComponentFactory}.
      * 
      * If `index` is not specified, the new View will be inserted as the last View in the container.
      * 
      * You can optionally specify the {@link Injector} that will be used as parent for the Component.
      * 
      * Returns the {@link ComponentRef} of the Host View created for the newly instantiated Component.
     */
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory, Number index /* optional */, Injector injector /* optional */, Array<Array<Object>> projectableNodes /* optional */, NgModuleRef<Object> ngModule /* optional */);
    /** 
      * Std Signature : S(createEmbeddedView,1205<C->,C-,P(d390<C->))
      * TE Signature : S(createEmbeddedView,P(d390))
      * 
     */
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef);
    /** 
      * Std Signature : S(createEmbeddedView,1205<C->,C-,P(d390<C->),P(dC-))
      * TE Signature : S(createEmbeddedView,P(d390),P(d3))
      * 
     */
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef, C context /* optional */);
    /** 
      * Std Signature : S(createEmbeddedView,1205<C->,C-,P(d390<C->),P(dC-),P(d2))
      * TE Signature : S(createEmbeddedView,P(d390),P(d3),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@2467
      * Instantiates an Embedded View based on the {@link TemplateRef `templateRef`} and inserts it
      * into this container at the specified `index`.
      * 
      * If `index` is not specified, the new View will be inserted as the last View in the container.
      * 
      * Returns the {@link ViewRef} for the newly created View.
     */
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef, C context /* optional */, Number index /* optional */);
    /** 
      * Std Signature : S(detach,374,,)
      * TE Signature : S(detach,)
      * 
     */
    public native ViewRef detach();
    /** 
      * Std Signature : S(detach,374,,P(d2))
      * TE Signature : S(detach,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@4606
      * Use along with {@link #insert} to move a View within the current container.
      * 
      * If the `index` param is omitted, the last {@link ViewRef} is detached.
     */
    public native ViewRef detach(Number index /* optional */);
    /** 
      * Std Signature : S(get,374,,P(d2))
      * TE Signature : S(get,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@1945
      * Returns the {@link ViewRef} for the View located in this container at the specified index.
     */
    public native ViewRef get(Number index);
    /** 
      * Std Signature : S(indexOf,2,,P(d374))
      * TE Signature : S(indexOf,P(d374))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@4148
      * Returns the index of the View, specified via {@link ViewRef}, within the current container or
      * `-1` if this container doesn't contain the View.
     */
    public native Number indexOf(ViewRef viewRef);
    /** 
      * Std Signature : S(insert,374,,P(d374))
      * TE Signature : S(insert,P(d374))
      * 
     */
    public native ViewRef insert(ViewRef viewRef);
    /** 
      * Std Signature : S(insert,374,,P(d374),P(d2))
      * TE Signature : S(insert,P(d374),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@3678
      * Inserts a View identified by a {@link ViewRef} into the container at the specified `index`.
      * 
      * If `index` is not specified, the new View will be inserted as the last View in the container.
      * 
      * Returns the inserted {@link ViewRef}.
     */
    public native ViewRef insert(ViewRef viewRef, Number index /* optional */);
    /** 
      * Std Signature : S(move,374,,P(d374),P(d2))
      * TE Signature : S(move,P(d374),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@3907
      * Moves a View identified by a {@link ViewRef} into the container at the specified `index`.
      * 
      * Returns the inserted {@link ViewRef}.
     */
    public native ViewRef move(ViewRef viewRef, Number currentIndex);
    /** 
      * Std Signature : S(remove,429,,)
      * TE Signature : S(remove,)
      * 
     */
    public native void remove();
    /** 
      * Std Signature : S(remove,429,,P(d2))
      * TE Signature : S(remove,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_container_ref.d.ts@4379
      * Destroys a View attached to this container at the specified `index`.
      * 
      * If `index` is not specified, the last View in the container will be removed.
     */
    public native void remove(Number index /* optional */);
}
