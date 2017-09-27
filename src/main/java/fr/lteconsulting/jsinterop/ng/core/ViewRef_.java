package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/refs".ViewRef_
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/refs.d.ts:1463
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="ViewRef_")
public class ViewRef_ implements EmbeddedViewRef<Object>, InternalViewRef
{

    /*
        Constructors
    */
    public ViewRef_(ViewData _view){
    }

    /*
        Properties
    */

    public Object _appRef;

    @JsProperty( name = "_appRef")
    public native Object get_appRef();

    @JsProperty( name = "_appRef")
    public native void set_appRef( Object value );

    public Object _viewContainerRef;

    @JsProperty( name = "_viewContainerRef")
    public native Object get_viewContainerRef();

    @JsProperty( name = "_viewContainerRef")
    public native void set_viewContainerRef( Object value );

    public Object context;

    @JsProperty( name = "context")
    public native Object getContext();

    @JsProperty( name = "context")
    public native void setContext( Object value );

    public Boolean destroyed;

    @JsProperty( name = "destroyed")
    public native Boolean getDestroyed();

    @JsProperty( name = "destroyed")
    public native void setDestroyed( Boolean value );

    public Function1<Function, Object> onDestroy;

    @JsProperty( name = "onDestroy")
    public native Function1<Function, Object> getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Function1<Function, Object> value );

    public Array<Object> rootNodes;

    @JsProperty( name = "rootNodes")
    public native Array<Object> getRootNodes();

    @JsProperty( name = "rootNodes")
    public native void setRootNodes( Array<Object> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(attachToAppRef,429,,P(d375))
      * TE Signature : S(attachToAppRef,P(d375))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void attachToAppRef(ApplicationRef appRef);
    /** 
      * Std Signature : S(attachToViewContainerRef,429,,P(d408))
      * TE Signature : S(attachToViewContainerRef,P(d408))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/refs.d.ts@1991
     */
    public native void attachToViewContainerRef(ViewContainerRef vcRef);
    /** 
      * Std Signature : S(checkNoChanges,429,,)
      * TE Signature : S(checkNoChanges,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void checkNoChanges();
    /** 
      * Std Signature : S(destroy,429,,)
      * TE Signature : S(destroy,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void destroy();
    /** 
      * Std Signature : S(detach,429,,)
      * TE Signature : S(detach,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void detach();
    /** 
      * Std Signature : S(detachFromAppRef,429,,)
      * TE Signature : S(detachFromAppRef,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void detachFromAppRef();
    /** 
      * Std Signature : S(detectChanges,429,,)
      * TE Signature : S(detectChanges,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void detectChanges();
    /** 
      * Std Signature : S(markForCheck,429,,)
      * TE Signature : S(markForCheck,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void markForCheck();
    /** 
      * Std Signature : S(reattach,429,,)
      * TE Signature : S(reattach,)
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void reattach();
}
