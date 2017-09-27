package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder".AnimationBuilder
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder.d.ts:340

  * AnimationBuilder is an injectable service that is available when the {@link
  * BrowserAnimationsModule BrowserAnimationsModule} or {@link NoopAnimationsModule
  * NoopAnimationsModule} modules are used within an application.
  * 
  * The purpose if this service is to produce an animation sequence programmatically within an
  * angular component or directive.
  * 
  * Programmatic animations are first built and then a player is created when the build animation is
  * attached to an element.
  * 
  * ```ts
  * // remember to include the BrowserAnimationsModule module for this to work...
  * import {AnimationBuilder} from '@angular/animations';
  * 
  * class MyCmp {
  *    constructor(private _builder: AnimationBuilder) {}
  * 
  *    makeAnimation(element: any) {
  *      // first build the animation
  *      const myAnimation = this._builder.build([
  *        style({ width: 0 }),
  *        animate(1000, style({ width: '100px' }))
  *      ]);
  * 
  *      // then create a player from it
  *      const player = myAnimation.create(element);
  * 
  *      player.play();
  *    }
  * }
  * ```
  * 
  * When an animation is built an instance of {@link AnimationFactory AnimationFactory} will be
  * returned. Using that an {@link AnimationPlayer AnimationPlayer} can be created which can then be
  * used to start the animation.
 */
@JsType(isNative=true, namespace="ng", name="AnimationBuilder")
public class AnimationBuilder
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(build,1189,,P(d285))
      * TE Signature : S(build,P(d285))
      * 
     */
    public native AnimationFactory build(AnimationMetadata animation);
    /** 
      * Std Signature : S(build,1189,,P(d7<285>))
      * TE Signature : S(build,P(d7))
      * 
     */
    public native AnimationFactory build(Array<AnimationMetadata> animation);
    /** 
      * Std Signature : S(build,1189,,P(dU(-285,7<2>)))
      * TE Signature : S(build,P(dU(-285,7)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/src/animation_builder.d.ts@1753
     */
    public native AnimationFactory build(UnionOfAnimationMetadataAndArrayOfAnimationMetadata animation);
}
