package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.UnionOfAnimationMetadataAndArrayOfAnimationMetadata;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder".AnimationAstBuilderVisitor
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts:1022
  * 
 */
@JsType(isNative=true, namespace="ng", name="AnimationAstBuilderVisitor")
public class AnimationAstBuilderVisitor extends AnimationDslVisitor
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(_makeStyleAst,3,,P(d3),P(d3))
      * TE Signature : S(_makeStyleAst,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1957
     */
    public native Object _makeStyleAst(Object metadata, Object context);
    /** 
      * Std Signature : S(_resetContextStyleTimingState,3,,P(d3))
      * TE Signature : S(_resetContextStyleTimingState,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1190
     */
    public native Object _resetContextStyleTimingState(Object context);
    /** 
      * Std Signature : S(_validateStyleAst,3,,P(d3),P(d3))
      * TE Signature : S(_validateStyleAst,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2003
     */
    public native Object _validateStyleAst(Object ast, Object context);
    /** 
      * Std Signature : S(build,296,,P(d285),P(d7<3>))
      * TE Signature : S(build,P(d285),P(d7))
      * 
     */
    public native Ast build(AnimationMetadata metadata, Array<Object> errors);
    /** 
      * Std Signature : S(build,296,,P(d7<285>),P(d7<3>))
      * TE Signature : S(build,P(d7),P(d7))
      * 
     */
    public native Ast build(Array<AnimationMetadata> metadata, Array<Object> errors);
    /** 
      * Std Signature : S(build,296,,P(dU(-285,7<2>)),P(d7<3>))
      * TE Signature : S(build,P(dU(-285,7)),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1108
     */
    public native Ast build(UnionOfAnimationMetadataAndArrayOfAnimationMetadata metadata, Array<Object> errors);
    /** 
      * Std Signature : S(visitAnimate,304,,P(d314),P(d320))
      * TE Signature : S(visitAnimate,P(d314),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1757
     */
    public native AnimateAst visitAnimate(AnimationAnimateMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitAnimateChild,306,,P(d315),P(d320))
      * TE Signature : S(visitAnimateChild,P(d315),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2274
     */
    public native AnimateChildAst visitAnimateChild(AnimationAnimateChildMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitAnimateRef,307,,P(d316),P(d320))
      * TE Signature : S(visitAnimateRef,P(d316),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2392
     */
    public native AnimateRefAst visitAnimateRef(AnimationAnimateRefMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitGroup,301,,P(d313),P(d320))
      * TE Signature : S(visitGroup,P(d313),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1660
     */
    public native GroupAst visitGroup(AnimationGroupMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitKeyframes,303,,P(d282),P(d320))
      * TE Signature : S(visitKeyframes,P(d282),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2048
     */
    public native KeyframesAst visitKeyframes(AnimationKeyframesSequenceMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitQuery,308,,P(d317),P(d320))
      * TE Signature : S(visitQuery,P(d317),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2504
     */
    public native QueryAst visitQuery(AnimationQueryMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitReference,305,,P(d287),P(d320))
      * TE Signature : S(visitReference,P(d287),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2165
     */
    public native ReferenceAst visitReference(AnimationReferenceMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitSequence,300,,P(d312),P(d320))
      * TE Signature : S(visitSequence,P(d312),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1554
     */
    public native SequenceAst visitSequence(AnimationSequenceMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitStagger,309,,P(d318),P(d320))
      * TE Signature : S(visitStagger,P(d318),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@2601
     */
    public native StaggerAst visitStagger(AnimationStaggerMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitState,298,,P(d310),P(d320))
      * TE Signature : S(visitState,P(d310),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1345
     */
    public native StateAst visitState(AnimationStateMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitStyle,295,,P(d283),P(d320))
      * TE Signature : S(visitStyle,P(d283),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1860
     */
    public native StyleAst visitStyle(AnimationStyleMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitTransition,299,,P(d311),P(d320))
      * TE Signature : S(visitTransition,P(d311),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1442
     */
    public native TransitionAst visitTransition(AnimationTransitionMetadata metadata, AnimationAstBuilderContext context);
    /** 
      * Std Signature : S(visitTrigger,297,,P(d293),P(d320))
      * TE Signature : S(visitTrigger,P(d293),P(d320))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast_builder.d.ts@1242
     */
    public native TriggerAst visitTrigger(AnimationTriggerMetadata metadata, AnimationAstBuilderContext context);
}
