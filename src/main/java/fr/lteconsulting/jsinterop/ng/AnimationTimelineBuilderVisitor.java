package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder".AnimationTimelineBuilderVisitor
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts:1017
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationTimelineBuilderVisitor")
public class AnimationTimelineBuilderVisitor extends AstVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(_visitSubInstructions,3,,P(d3),P(d3),P(d3))
      * TE Signature : S(_visitSubInstructions,P(d3),P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1734
     */
    public native Object _visitSubInstructions(Object instructions, Object context, Object options);
    /** 
      * Std Signature : S(buildKeyframes,7<322>,,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284))
      * TE Signature : S(buildKeyframes,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildKeyframes(AnimationDriver driver, Object rootElement, Ast ast, ThetaStyleData startingStyles, ThetaStyleData finalStyles, AnimationOptions options);
    /** 
      * Std Signature : S(buildKeyframes,7<322>,,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284),P(d291))
      * TE Signature : S(buildKeyframes,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284),P(d291))
      * 
     */
    public native Array<AnimationTimelineInstruction> buildKeyframes(AnimationDriver driver, Object rootElement, Ast ast, ThetaStyleData startingStyles, ThetaStyleData finalStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildKeyframes,7<322>,,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284),P(d291),P(d7<3>))
      * TE Signature : S(buildKeyframes,P(d289),P(d3),P(d296),P(d290),P(d290),P(d284),P(d291),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1099
     */
    public native Array<AnimationTimelineInstruction> buildKeyframes(AnimationDriver driver, Object rootElement, Ast ast, ThetaStyleData startingStyles, ThetaStyleData finalStyles, AnimationOptions options, ElementInstructionMap subInstructions /* optional */, Array<Object> errors /* optional */);
    /** 
      * Std Signature : S(visitAnimate,429,,P(d304),P(d323))
      * TE Signature : S(visitAnimate,P(d304),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2115
     */
    public native void visitAnimate(AnimateAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitAnimateChild,3,,P(d306),P(d323))
      * TE Signature : S(visitAnimateChild,P(d306),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1568
     */
    public native Object visitAnimateChild(AnimateChildAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitAnimateRef,3,,P(d307),P(d323))
      * TE Signature : S(visitAnimateRef,P(d307),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1653
     */
    public native Object visitAnimateRef(AnimateRefAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitGroup,429,,P(d301),P(d323))
      * TE Signature : S(visitGroup,P(d301),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1959
     */
    public native void visitGroup(GroupAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitKeyframes,429,,P(d303),P(d323))
      * TE Signature : S(visitKeyframes,P(d303),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2263
     */
    public native void visitKeyframes(KeyframesAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitQuery,429,,P(d308),P(d323))
      * TE Signature : S(visitQuery,P(d308),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2343
     */
    public native void visitQuery(QueryAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitReference,429,,P(d305),P(d323))
      * TE Signature : S(visitReference,P(d305),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1801
     */
    public native void visitReference(ReferenceAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitSequence,429,,P(d300),P(d323))
      * TE Signature : S(visitSequence,P(d300),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1881
     */
    public native void visitSequence(SequenceAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitStagger,429,,P(d309),P(d323))
      * TE Signature : S(visitStagger,P(d309),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2415
     */
    public native void visitStagger(StaggerAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitState,3,,P(d298),P(d323))
      * TE Signature : S(visitState,P(d298),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1416
     */
    public native Object visitState(StateAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitStyle,429,,P(d295),P(d323))
      * TE Signature : S(visitStyle,P(d295),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2191
     */
    public native void visitStyle(StyleAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitTiming,3,,P(d302),P(d323))
      * TE Signature : S(visitTiming,P(d302),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@2031
     */
    public native Object visitTiming(TimingAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitTransition,3,,P(d299),P(d323))
      * TE Signature : S(visitTransition,P(d299),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1487
     */
    public native Object visitTransition(TransitionAst ast, AnimationTimelineContext context);
    /** 
      * Std Signature : S(visitTrigger,3,,P(d297),P(d323))
      * TE Signature : S(visitTrigger,P(d297),P(d323))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@1341
     */
    public native Object visitTrigger(TriggerAst ast, AnimationTimelineContext context);
}
