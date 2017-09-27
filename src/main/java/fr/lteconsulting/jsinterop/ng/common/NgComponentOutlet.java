package fr.lteconsulting.jsinterop.ng.common;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.Injector;
import fr.lteconsulting.jsinterop.ng.core.NgModuleFactory;
import fr.lteconsulting.jsinterop.ng.core.OnChanges;
import fr.lteconsulting.jsinterop.ng.core.OnDestroy;
import fr.lteconsulting.jsinterop.ng.core.SimpleChanges;
import fr.lteconsulting.jsinterop.ng.core.Type;
import fr.lteconsulting.jsinterop.ng.core.ViewContainerRef;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_component_outlet".NgComponentOutlet
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/common/src/directives/ng_component_outlet.d.ts:322
  * 1 constructors
  * Instantiates a single {@link Component} type and inserts its Host View into current View.
  * `NgComponentOutlet` provides a declarative approach for dynamic component creation.
  * 
  * `NgComponentOutlet` requires a component type, if a falsy value is set the view will clear and
  * any existing component will get destroyed.
  * 
  * ### Fine tune control
  * 
  * You can control the component creation process by using the following optional attributes:
  * 
  * * `ngComponentOutletInjector`: Optional custom {@link Injector} that will be used as parent for
  * the Component. Defaults to the injector of the current view container.
  * 
  * * `ngComponentOutletContent`: Optional list of projectable nodes to insert into the content
  * section of the component, if exists.
  * 
  * * `ngComponentOutletNgModuleFactory`: Optional module factory to allow dynamically loading other
  * module, then load a component from that module.
  * 
  * ### Syntax
  * 
  * Simple
  * ```
  * <ng-container *ngComponentOutlet="componentTypeExpression"></ng-container>
  * ```
  * 
  * Customized injector/content
  * ```
  * <ng-container *ngComponentOutlet="componentTypeExpression;
  *                                    injector: injectorExpression;
  *                                    content: contentNodesExpression;">
  * </ng-container>
  * ```
  * 
  * Customized ngModuleFactory
  * ```
  * <ng-container *ngComponentOutlet="componentTypeExpression;
  *                                    ngModuleFactory: moduleFactory;">
  * </ng-container>
  * ```
  * ## Example
  * 
  * {@example common/ngComponentOutlet/ts/module.ts region='SimpleExample'}
  * 
  * A more complete example with additional options:
  * 
  * {@example common/ngComponentOutlet/ts/module.ts region='CompleteExample'}
  * 
  * A more complete example with ngModuleFactory:
  * 
  * {@example common/ngComponentOutlet/ts/module.ts region='NgModuleFactoryExample'}
 */
@JsType(isNative=true, namespace="ng.common", name="NgComponentOutlet")
public class NgComponentOutlet implements OnChanges, OnDestroy
{

    /*
        Constructors
    */
    public NgComponentOutlet(ViewContainerRef _viewContainerRef){
    }

    /*
        Properties
    */

    public Object _componentRef;

    @JsProperty( name = "_componentRef")
    public native Object get_componentRef();

    @JsProperty( name = "_componentRef")
    public native void set_componentRef( Object value );

    public Object _moduleRef;

    @JsProperty( name = "_moduleRef")
    public native Object get_moduleRef();

    @JsProperty( name = "_moduleRef")
    public native void set_moduleRef( Object value );

    public Object _viewContainerRef;

    @JsProperty( name = "_viewContainerRef")
    public native Object get_viewContainerRef();

    @JsProperty( name = "_viewContainerRef")
    public native void set_viewContainerRef( Object value );

    public Type<Object> ngComponentOutlet;

    @JsProperty( name = "ngComponentOutlet")
    public native Type<Object> getNgComponentOutlet();

    @JsProperty( name = "ngComponentOutlet")
    public native void setNgComponentOutlet( Type<Object> value );

    public Array<Array<Object>> ngComponentOutletContent;

    @JsProperty( name = "ngComponentOutletContent")
    public native Array<Array<Object>> getNgComponentOutletContent();

    @JsProperty( name = "ngComponentOutletContent")
    public native void setNgComponentOutletContent( Array<Array<Object>> value );

    public Injector ngComponentOutletInjector;

    @JsProperty( name = "ngComponentOutletInjector")
    public native Injector getNgComponentOutletInjector();

    @JsProperty( name = "ngComponentOutletInjector")
    public native void setNgComponentOutletInjector( Injector value );

    public NgModuleFactory<Object> ngComponentOutletNgModuleFactory;

    @JsProperty( name = "ngComponentOutletNgModuleFactory")
    public native NgModuleFactory<Object> getNgComponentOutletNgModuleFactory();

    @JsProperty( name = "ngComponentOutletNgModuleFactory")
    public native void setNgComponentOutletNgModuleFactory( NgModuleFactory<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(ngOnChanges,429,,P(d346))
      * TE Signature : S(ngOnChanges,P(d346))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnChanges(SimpleChanges changes);
    /** 
      * Std Signature : S(ngOnDestroy,429,,)
      * TE Signature : S(ngOnDestroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void ngOnDestroy();
}
