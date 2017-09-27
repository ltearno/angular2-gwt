package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/template_ref".TemplateRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/template_ref.d.ts:292

  * Represents an Embedded Template that can be used to instantiate Embedded Views.
  * 
  * You can access a `TemplateRef`, in two ways. Via a directive placed on a `<ng-template>` element
  * (or directive prefixed with `*`) and have the `TemplateRef` for this Embedded View injected into
  * the constructor of the directive using the `TemplateRef` Token. Alternatively you can query for
  * the `TemplateRef` from a Component or a Directive via {@link Query}.
  * 
  * To instantiate Embedded Views based on a Template, use
  * {@link ViewContainerRef#createEmbeddedView}, which will create the View and attach it to the
  * View Container.
 */
@JsType(isNative=true, namespace="ng.core", name="TemplateRef")
public class TemplateRef<C>
{

    /*
        Properties
    */

    /** 
      * The location in the View where the Embedded View logically belongs to.
      * 
      * The data-binding and injection contexts of Embedded Views created from this `TemplateRef`
      * inherit from the contexts of this location.
      * 
      * Typically new Embedded Views are attached to the View Container of this location, but in
      * advanced use-cases, the View can be attached to a different container while keeping the
      * data-binding and injection context from the original location.
     */
    public ElementRef elementRef;

    @JsProperty( name = "elementRef")
    public native ElementRef getElementRef();

    @JsProperty( name = "elementRef")
    public native void setElementRef( ElementRef value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(createEmbeddedView,1205<C->,,P(dC-))
      * TE Signature : S(createEmbeddedView,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/template_ref.d.ts@1566
     */
    public native EmbeddedViewRef<C> createEmbeddedView(C context);
}
