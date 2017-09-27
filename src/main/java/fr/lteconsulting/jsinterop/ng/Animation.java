package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.UnionOfArrayOfThetaStyleDataAndThetaStyleData;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation".Animation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation.d.ts:499
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="Animation")
public class Animation
{

    /*
        Constructors
    */
    public Animation(AnimationDriver _driver, UnionOfAnimationMetadataAndArrayOfAnimationMetadata input){
    }

    /*
        Properties
    */

    public Object _animationAst;

    @JsProperty( name = "_animationAst")
    public native Object get_animationAst();

    @JsProperty( name = "_animationAst")
    public native void set_animationAst( Object value );

    public Object _driver;

    @JsProperty( name = "_driver")
    public native Object get_driver();

    @JsProperty( name = "_driver")
    public native void set_driver( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d290),P(d290),P(d284))
      * TE Signature : S(buildTimelines,P(d3),P(d290),P(d290),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, ThetaStyleData startingStyles, ThetaStyleData destinationStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d290),P(d290),P(d284),P(d291))
      * TE Signature : S(buildTimelines,P(d3),P(d290),P(d290),P(d284),P(d291))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, ThetaStyleData startingStyles, ThetaStyleData destinationStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d290),P(d7<290>),P(d284))
      * TE Signature : S(buildTimelines,P(d3),P(d290),P(d7),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, ThetaStyleData startingStyles, Array<ThetaStyleData> destinationStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d290),P(d7<290>),P(d284),P(d291))
      * TE Signature : S(buildTimelines,P(d3),P(d290),P(d7),P(d284),P(d291))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, ThetaStyleData startingStyles, Array<ThetaStyleData> destinationStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d7<290>),P(d290),P(d284))
      * TE Signature : S(buildTimelines,P(d3),P(d7),P(d290),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, Array<ThetaStyleData> startingStyles, ThetaStyleData destinationStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d7<290>),P(d290),P(d284),P(d291))
      * TE Signature : S(buildTimelines,P(d3),P(d7),P(d290),P(d284),P(d291))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, Array<ThetaStyleData> startingStyles, ThetaStyleData destinationStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d7<290>),P(d7<290>),P(d284))
      * TE Signature : S(buildTimelines,P(d3),P(d7),P(d7),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, Array<ThetaStyleData> startingStyles, Array<ThetaStyleData> destinationStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(d7<290>),P(d7<290>),P(d284),P(d291))
      * TE Signature : S(buildTimelines,P(d3),P(d7),P(d7),P(d284),P(d291))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, Array<ThetaStyleData> startingStyles, Array<ThetaStyleData> destinationStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(dU(-7<290>,4)),P(dU(-7<290>,4)),P(d284))
      * TE Signature : S(buildTimelines,P(d3),P(dU(-7,290)),P(dU(-7,290)),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, UnionOfArrayOfThetaStyleDataAndThetaStyleData startingStyles, UnionOfArrayOfThetaStyleDataAndThetaStyleData destinationStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildTimelines,7<322>,,P(d3),P(dU(-7<290>,4)),P(dU(-7<290>,4)),P(d284),P(d291))
      * TE Signature : S(buildTimelines,P(d3),P(dU(-7,290)),P(dU(-7,290)),P(d284),P(d291))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation.d.ts@676
     */
    public native Array<AnimationTimelineInstruction> buildTimelines(Object element, UnionOfArrayOfThetaStyleDataAndThetaStyleData startingStyles, UnionOfArrayOfThetaStyleDataAndThetaStyleData destinationStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
}
