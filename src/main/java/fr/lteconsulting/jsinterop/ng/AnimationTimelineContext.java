package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder".AnimationTimelineContext
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts:2573
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationTimelineContext")
public class AnimationTimelineContext
{

    /*
        Constructors
    */
    public AnimationTimelineContext(AnimationDriver _driver, Object element, ElementInstructionMap subInstructions, Array<Object> errors, Array<TimelineBuilder> timelines, TimelineBuilder initialTimeline){
    }

    /*
        Properties
    */

    public Object _driver;

    @JsProperty( name = "_driver")
    public native Object get_driver();

    @JsProperty( name = "_driver")
    public native void set_driver( Object value );

    public Object currentAnimateTimings;

    @JsProperty( name = "currentAnimateTimings")
    public native Object getCurrentAnimateTimings();

    @JsProperty( name = "currentAnimateTimings")
    public native void setCurrentAnimateTimings( Object value );

    public Number currentQueryIndex;

    @JsProperty( name = "currentQueryIndex")
    public native Number getCurrentQueryIndex();

    @JsProperty( name = "currentQueryIndex")
    public native void setCurrentQueryIndex( Number value );

    public Number currentQueryTotal;

    @JsProperty( name = "currentQueryTotal")
    public native Number getCurrentQueryTotal();

    @JsProperty( name = "currentQueryTotal")
    public native void setCurrentQueryTotal( Number value );

    public Number currentStaggerTime;

    @JsProperty( name = "currentStaggerTime")
    public native Number getCurrentStaggerTime();

    @JsProperty( name = "currentStaggerTime")
    public native void setCurrentStaggerTime( Number value );

    public TimelineBuilder currentTimeline;

    @JsProperty( name = "currentTimeline")
    public native TimelineBuilder getCurrentTimeline();

    @JsProperty( name = "currentTimeline")
    public native void setCurrentTimeline( TimelineBuilder value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Array<Object> errors;

    @JsProperty( name = "errors")
    public native Array<Object> getErrors();

    @JsProperty( name = "errors")
    public native void setErrors( Array<Object> value );

    public AnimationOptions options;

    @JsProperty( name = "options")
    public native AnimationOptions getOptions();

    @JsProperty( name = "options")
    public native void setOptions( AnimationOptions value );

    public AnonymousType717 params;

    @JsProperty( name = "params")
    public native AnonymousType717 getParams();

    @JsProperty( name = "params")
    public native void setParams( AnonymousType717 value );

    public AnimationTimelineContext parentContext;

    @JsProperty( name = "parentContext")
    public native AnimationTimelineContext getParentContext();

    @JsProperty( name = "parentContext")
    public native void setParentContext( AnimationTimelineContext value );

    public Ast previousNode;

    @JsProperty( name = "previousNode")
    public native Ast getPreviousNode();

    @JsProperty( name = "previousNode")
    public native void setPreviousNode( Ast value );

    public Number subContextCount;

    @JsProperty( name = "subContextCount")
    public native Number getSubContextCount();

    @JsProperty( name = "subContextCount")
    public native void setSubContextCount( Number value );

    public ElementInstructionMap subInstructions;

    @JsProperty( name = "subInstructions")
    public native ElementInstructionMap getSubInstructions();

    @JsProperty( name = "subInstructions")
    public native void setSubInstructions( ElementInstructionMap value );

    public Array<TimelineBuilder> timelines;

    @JsProperty( name = "timelines")
    public native Array<TimelineBuilder> getTimelines();

    @JsProperty( name = "timelines")
    public native void setTimelines( Array<TimelineBuilder> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_copyOptions,3,,)
      * TE Signature : S(_copyOptions,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3410
     */
    public native Object _copyOptions();
    /** 
      * Std Signature : S(appendInstructionToTimeline,3,,P(d322),P(d2),P(d2))
      * TE Signature : S(appendInstructionToTimeline,P(d322),P(d2),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3619
     */
    public native Object appendInstructionToTimeline(AnimationTimelineInstruction instruction, Number duration, Number delay);
    /** 
      * Std Signature : S(createSubContext,323,,)
      * TE Signature : S(createSubContext,)
      * 
     */
    public native AnimationTimelineContext createSubContext();
    /** 
      * Std Signature : S(createSubContext,323,,P(d284))
      * TE Signature : S(createSubContext,P(d284))
      * 
     */
    public native AnimationTimelineContext createSubContext(AnimationOptions options /* optional */);
    /** 
      * Std Signature : S(createSubContext,323,,P(d284),P(d3))
      * TE Signature : S(createSubContext,P(d284),P(d3))
      * 
     */
    public native AnimationTimelineContext createSubContext(AnimationOptions options /* optional */, Object element /* optional */);
    /** 
      * Std Signature : S(createSubContext,323,,P(d284),P(d3),P(d2))
      * TE Signature : S(createSubContext,P(d284),P(d3),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3438
     */
    public native AnimationTimelineContext createSubContext(AnimationOptions options /* optional */, Object element /* optional */, Number newTime /* optional */);
    /** 
      * Std Signature : S(delayNextStep,429,,P(d2))
      * TE Signature : S(delayNextStep,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3797
     */
    public native void delayNextStep(Number delay);
    /** 
      * Std Signature : S(incrementTime,429,,P(d2))
      * TE Signature : S(incrementTime,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3758
     */
    public native void incrementTime(Number time);
    /** 
      * Std Signature : S(invokeQuery,7<3>,,P(d1),P(d1),P(d2),P(d27),P(d27),P(d7<3>))
      * TE Signature : S(invokeQuery,P(d1),P(d1),P(d2),P(d27),P(d27),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3837
     */
    public native Array<Object> invokeQuery(String selector, String originalSelector, Number limit, Boolean includeSelf, Boolean optional, Array<Object> errors);
    /** 
      * Std Signature : S(transformIntoNewTimeline,321,,)
      * TE Signature : S(transformIntoNewTimeline,)
      * 
     */
    public native TimelineBuilder transformIntoNewTimeline();
    /** 
      * Std Signature : S(transformIntoNewTimeline,321,,P(d2))
      * TE Signature : S(transformIntoNewTimeline,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3554
     */
    public native TimelineBuilder transformIntoNewTimeline(Number newTime /* optional */);
    /** 
      * Std Signature : S(updateOptions,429,,P(d284))
      * TE Signature : S(updateOptions,P(d284))
      * 
     */
    public native void updateOptions(AnimationOptions options);
    /** 
      * Std Signature : S(updateOptions,429,,P(d284),P(d27))
      * TE Signature : S(updateOptions,P(d284),P(d27))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@3327
     */
    public native void updateOptions(AnimationOptions options, Boolean skipIfExists /* optional */);
}
