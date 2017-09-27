package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".RootRenderer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:3349

  * Injectable service that provides a low-level interface for modifying the UI.
  * 
  * Use this service to bypass Angular's templating and make custom UI changes that can't be
  * expressed declaratively. For example if you need to set a property or an attribute whose name is
  * not statically known, use {@link Renderer#setElementProperty} or {@link
  * Renderer#setElementAttribute}
  * respectively.
  * 
  * If you are implementing a custom renderer, you must implement this interface.
  * 
  * The default Renderer implementation is `DomRenderer`. Also available is `WebWorkerRenderer`.
 */
@JsType(isNative=true, namespace="ng.core", name="RootRenderer")
public class RootRenderer
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(renderComponent,424,,P(d386))
      * TE Signature : S(renderComponent,P(d386))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4040
     */
    public native Renderer renderComponent(RenderComponentType componentType);
}
