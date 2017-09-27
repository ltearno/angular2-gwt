package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/element_ref".ElementRef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/element_ref.d.ts:0
  * 1 constructors
  * A wrapper around a native element inside of a View.
  * 
  * An `ElementRef` is backed by a render-specific element. In the browser, this is usually a DOM
  * element.
 */
@JsType(isNative=true, namespace="ng.core", name="ElementRef")
public class ElementRef
{

    /*
        Constructors
    */
    public ElementRef(Object nativeElement){
    }

    /*
        Properties
    */

    /** 
      * The underlying native element or `null` if direct access to native elements is not supported
      * (e.g. when the application runs in a web worker).
      * 
      * <div class="callout is-critical">
      *    <header>Use with caution</header>
      *    <p>
      *     Use this API as the last resort when direct access to DOM is needed. Use templating and
      *     data-binding provided by Angular instead. Alternatively you take a look at {@link Renderer}
      *     which provides API that can safely be used even when direct access to native elements is not
      *     supported.
      *    </p>
      *    <p>
      *     Relying on direct DOM access creates tight coupling between your application and rendering
      *     layers which will make it impossible to separate the two and deploy your application into a
      *     web worker.
      *    </p>
      * </div>
     */
    public Object nativeElement;

    @JsProperty( name = "nativeElement")
    public native Object getNativeElement();

    @JsProperty( name = "nativeElement")
    public native void setNativeElement( Object value );
}
