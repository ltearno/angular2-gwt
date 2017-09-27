package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Function;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref".EmbeddedViewRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/view_ref.d.ts:632

  * Represents an Angular View.
  * 
  * <!-- TODO: move the next two paragraphs to the dev guide -->
  * A View is a fundamental building block of the application UI. It is the smallest grouping of
  * Elements which are created and destroyed together.
  * 
  * Properties of elements in a View can change, but the structure (number and order) of elements in
  * a View cannot. Changing the structure of Elements can only be done by inserting, moving or
  * removing nested Views via a {@link ViewContainerRef}. Each View can contain many View Containers.
  * <!-- /TODO -->
  * 
  * ### Example
  * 
  * Given this template...
  * 
  * ```
  * Count: {{items.length}}
  * <ul>
  *    <li *ngFor="let  item of items">{{item}}</li>
  * </ul>
  * ```
  * 
  * We have two {@link TemplateRef}s:
  * 
  * Outer {@link TemplateRef}:
  * ```
  * Count: {{items.length}}
  * <ul>
  *    <ng-template ngFor let-item [ngForOf]="items"></ng-template>
  * </ul>
  * ```
  * 
  * Inner {@link TemplateRef}:
  * ```
  *    <li>{{item}}</li>
  * ```
  * 
  * Notice that the original template is broken down into two separate {@link TemplateRef}s.
  * 
  * The outer/inner {@link TemplateRef}s are then assembled into views like so:
  * 
  * ```
  * <!-- ViewRef: outer-0 -->
  * Count: 2
  * <ul>
  *    <ng-template view-container-ref></ng-template>
  *    <!-- ViewRef: inner-1 --><li>first</li><!-- /ViewRef: inner-1 -->
  *    <!-- ViewRef: inner-2 --><li>second</li><!-- /ViewRef: inner-2 -->
  * </ul>
  * <!-- /ViewRef: outer-0 -->
  * ```
 */
@JsType(isNative=true, namespace="ng.core", name="EmbeddedViewRef")
public class EmbeddedViewRefImpl<C> implements EmbeddedViewRef<C>
{

    /*
        Properties
    */

    public C context;

    @JsProperty( name = "context")
    public native C getContext();

    @JsProperty( name = "context")
    public native void setContext( C value );

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
