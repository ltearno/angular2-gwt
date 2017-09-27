package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.ng.core.Renderer2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer".BaseAnimationRenderer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer.d.ts:734
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface BaseAnimationRenderer extends Renderer2
{

    /*
        Properties
    */

    @JsProperty( name = "delegate")
    Renderer2 getDelegate();

    @JsProperty( name = "delegate")
    void setDelegate( Renderer2 value );

    @JsProperty( name = "engine")
    AnimationEngine getEngine();

    @JsProperty( name = "engine")
    void setEngine( AnimationEngine value );

    @JsProperty( name = "namespaceId")
    String getNamespaceId();

    @JsProperty( name = "namespaceId")
    void setNamespaceId( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(disableAnimations,429,,P(d3),P(d27))
      * TE Signature : S(disableAnimations,P(d3),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/animations/src/animation_renderer.d.ts@2200
     */
    void disableAnimations(Object element, Boolean value);
}
