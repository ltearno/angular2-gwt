package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory".ComponentRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory.d.ts:484

  * Represents an instance of a Component created via a {@link ComponentFactory}.
  * 
  * `ComponentRef` provides access to the Component Instance as well other objects related to this
  * Component Instance and allows you to destroy the Component Instance via the {@link #destroy}
  * method.
 */
@JsType(isNative=true, namespace="ng.core", name="ComponentRef")
public class ComponentRef<C>
{

    /*
        Properties
    */

    /** 
      * The {@link ChangeDetectorRef} of the Component instance.
     */
    public ChangeDetectorRef changeDetectorRef;

    @JsProperty( name = "changeDetectorRef")
    public native ChangeDetectorRef getChangeDetectorRef();

    @JsProperty( name = "changeDetectorRef")
    public native void setChangeDetectorRef( ChangeDetectorRef value );

    /** 
      * The component type.
     */
    public Type<Object> componentType;

    @JsProperty( name = "componentType")
    public native Type<Object> getComponentType();

    @JsProperty( name = "componentType")
    public native void setComponentType( Type<Object> value );

    /** 
      * The {@link ViewRef} of the Host View of this Component instance.
     */
    public ViewRef hostView;

    @JsProperty( name = "hostView")
    public native ViewRef getHostView();

    @JsProperty( name = "hostView")
    public native void setHostView( ViewRef value );

    /** 
      * The injector on which the component instance exists.
     */
    public Injector injector;

    @JsProperty( name = "injector")
    public native Injector getInjector();

    @JsProperty( name = "injector")
    public native void setInjector( Injector value );

    /** 
      * The instance of the Component.
     */
    public C instance;

    @JsProperty( name = "instance")
    public native C getInstance();

    @JsProperty( name = "instance")
    public native void setInstance( C value );

    /** 
      * Location of the Host Element of this Component Instance.
     */
    public ElementRef location;

    @JsProperty( name = "location")
    public native ElementRef getLocation();

    @JsProperty( name = "location")
    public native void setLocation( ElementRef value );

    /** 
      * Allows to register a callback that will be called when the component is destroyed.
     */
    public Action1<Function> onDestroy;

    @JsProperty( name = "onDestroy")
    public native Action1<Function> getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Action1<Function> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory.d.ts@1642
      * Destroys the component instance and all of the data structures associated with it.
     */
    public native void destroy();
}
