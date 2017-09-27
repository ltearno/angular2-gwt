package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.rxjs.Observable;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref".ApplicationRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts:6170

  * A reference to an Angular application running on a page.
 */
@JsType(isNative=true, namespace="ng.core", name="ApplicationRef")
public class ApplicationRef
{

    /*
        Properties
    */

    /** 
      * Get a list of component types registered to this application.
      * This list is populated even before the component is created.
     */
    public Array<Type<Object>> componentTypes;

    @JsProperty( name = "componentTypes")
    public native Array<Type<Object>> getComponentTypes();

    @JsProperty( name = "componentTypes")
    public native void setComponentTypes( Array<Type<Object>> value );

    /** 
      * Get a list of components registered to this application.
     */
    public Array<ComponentRef<Object>> components;

    @JsProperty( name = "components")
    public native Array<ComponentRef<Object>> getComponents();

    @JsProperty( name = "components")
    public native void setComponents( Array<ComponentRef<Object>> value );

    /** 
      * Returns an Observable that indicates when the application is stable or unstable.
     */
    public Observable<Boolean> isStable;

    @JsProperty( name = "isStable")
    public native Observable<Boolean> getIsStable();

    @JsProperty( name = "isStable")
    public native void setIsStable( Observable<Boolean> value );

    /** 
      * Returns the number of attached views.
     */
    public Number viewCount;

    @JsProperty( name = "viewCount")
    public native Number getViewCount();

    @JsProperty( name = "viewCount")
    public native void setViewCount( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(attachView,429,,P(d374))
      * TE Signature : S(attachView,P(d374))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@8234
      * Attaches a view so that it will be dirty checked.
      * The view will be automatically detached when it is destroyed.
      * This will throw if the view is already attached to a ViewContainer.
     */
    public native void attachView(ViewRef view);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(d329<C->))
      * TE Signature : S(bootstrap,P(d329))
      * 
     */
    public native <C> ComponentRef<C> bootstrap(Type<C> componentFactory);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(d329<C->),P(d3))
      * TE Signature : S(bootstrap,P(d329),P(d3))
      * 
     */
    public native <C> ComponentRef<C> bootstrap(Type<C> componentFactory, Object rootSelectorOrNode /* optional */);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(d373<C->))
      * TE Signature : S(bootstrap,P(d373))
      * 
     */
    public native <C> ComponentRef<C> bootstrap(ComponentFactory<C> componentFactory);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(d373<C->),P(d3))
      * TE Signature : S(bootstrap,P(d373),P(d3))
      * 
     */
    public native <C> ComponentRef<C> bootstrap(ComponentFactory<C> componentFactory, Object rootSelectorOrNode /* optional */);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(dU(C-373<C->,329<5>)))
      * TE Signature : S(bootstrap,P(dU(-373,329)))
      * 
     */
    public native <C> ComponentRef<C> bootstrap(UnionOfComponentFactoryOfCAndTypeOfC<C> componentFactory);
    /** 
      * Std Signature : S(bootstrap,382<C->,C-,P(dU(C-373<C->,329<5>)),P(d3))
      * TE Signature : S(bootstrap,P(dU(-373,329)),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@6931
      * Bootstrap a new component at the root level of the application.
      * 
      * ### Bootstrap process
      * 
      * When bootstrapping a new root component into an application, Angular mounts the
      * specified application component onto DOM elements identified by the [componentType]'s
      * selector and kicks off automatic change detection to finish initializing the component.
      * 
      * Optionally, a component can be mounted onto a DOM element that does not match the
      * [componentType]'s selector.
      * 
      * ### Example
      * {@example core/ts/platform/platform.ts region='longform'}
     */
    public native <C> ComponentRef<C> bootstrap(UnionOfComponentFactoryOfCAndTypeOfC<C> componentFactory, Object rootSelectorOrNode /* optional */);
    /** 
      * Std Signature : S(detachView,429,,P(d374))
      * TE Signature : S(detachView,P(d374))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@8346
      * Detaches a view from dirty checking again.
     */
    public native void detachView(ViewRef view);
    /** 
      * Std Signature : S(tick,429,,)
      * TE Signature : S(tick,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/application_ref.d.ts@7651
      * Invoke this method to explicitly process change detection and its side-effects.
      * 
      * In development mode, `tick()` also performs a second change detection cycle to ensure that no
      * further changes are detected. If additional changes are picked up during this second cycle,
      * bindings in the app have side-effects that cannot be resolved in a single change detection
      * pass.
      * In this case, Angular throws an error, since an Angular application can only have one change
      * detection pass during which all change detection must complete.
     */
    public native void tick();
}
