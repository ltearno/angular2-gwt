package fr.lteconsulting.jsinterop.ng;

import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder".AnimationFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder.d.ts:1840

  * An instance of `AnimationFactory` is returned from {@link AnimationBuilder#build
  * AnimationBuilder.build}.
 */
@JsType(isNative=true, namespace="ng", name="AnimationFactory")
public class AnimationFactory
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,325,,P(d3))
      * TE Signature : S(create,P(d3))
      * 
     */
    public native AnimationPlayer create(Object element);
    /** 
      * Std Signature : S(create,325,,P(d3),P(d284))
      * TE Signature : S(create,P(d3),P(d284))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder.d.ts@2069
     */
    public native AnimationPlayer create(Object element, AnimationOptions options /* optional */);
}
