package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref".InternalViewRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts:2267
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="InternalViewRef")
public class InternalViewRefImpl implements InternalViewRef
{

    /*
        Properties
    */

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(attachToAppRef,429,,P(d375))
      * TE Signature : S(attachToAppRef,P(d375))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts@2353
     */
    public native void attachToAppRef(ApplicationRef appRef);
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
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts@2323
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
