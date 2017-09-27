package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsPackage;
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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface EmbeddedViewRef<C> extends ViewRef
{

    /*
        Properties
    */

    @JsProperty( name = "context")
    C getContext();

    @JsProperty( name = "context")
    void setContext( C value );

    @JsProperty( name = "rootNodes")
    Array<Object> getRootNodes();

    @JsProperty( name = "rootNodes")
    void setRootNodes( Array<Object> value );
}
