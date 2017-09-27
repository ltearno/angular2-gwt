package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Promise;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".RendererFactory2
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:4307
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="RendererFactory2")
public class RendererFactory2
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(begin,429,,)
      * TE Signature : S(begin,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4472
     */
    public native void begin();
    /** 
      * Std Signature : S(createRenderer,631,,P(d3),P(d387))
      * TE Signature : S(createRenderer,P(d3),P(d387))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4386
     */
    public native Renderer2 createRenderer(Object hostElement, RendererType2 type);
    /** 
      * Std Signature : S(end,429,,)
      * TE Signature : S(end,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4501
     */
    public native void end();
    /** 
      * Std Signature : S(whenRenderingDone,88<3>,,)
      * TE Signature : S(whenRenderingDone,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts@4528
     */
    public native Promise<Object> whenRenderingDone();
}
