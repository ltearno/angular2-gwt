package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Map;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder".TimelineBuilder
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts:3973
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TimelineBuilder")
public class TimelineBuilder
{

    /*
        Constructors
    */
    public TimelineBuilder(Object element, Number startTime, Map<Object, ThetaStyleData> _elementTimelineStylesLookup){
    }

    /*
        Properties
    */

    public Object _backFill;

    @JsProperty( name = "_backFill")
    public native Object get_backFill();

    @JsProperty( name = "_backFill")
    public native void set_backFill( Object value );

    public Object _currentEmptyStepKeyframe;

    @JsProperty( name = "_currentEmptyStepKeyframe")
    public native Object get_currentEmptyStepKeyframe();

    @JsProperty( name = "_currentEmptyStepKeyframe")
    public native void set_currentEmptyStepKeyframe( Object value );

    public Object _currentKeyframe;

    @JsProperty( name = "_currentKeyframe")
    public native Object get_currentKeyframe();

    @JsProperty( name = "_currentKeyframe")
    public native void set_currentKeyframe( Object value );

    public Object _elementTimelineStylesLookup;

    @JsProperty( name = "_elementTimelineStylesLookup")
    public native Object get_elementTimelineStylesLookup();

    @JsProperty( name = "_elementTimelineStylesLookup")
    public native void set_elementTimelineStylesLookup( Object value );

    public Object _globalTimelineStyles;

    @JsProperty( name = "_globalTimelineStyles")
    public native Object get_globalTimelineStyles();

    @JsProperty( name = "_globalTimelineStyles")
    public native void set_globalTimelineStyles( Object value );

    public Object _keyframes;

    @JsProperty( name = "_keyframes")
    public native Object get_keyframes();

    @JsProperty( name = "_keyframes")
    public native void set_keyframes( Object value );

    public Object _localTimelineStyles;

    @JsProperty( name = "_localTimelineStyles")
    public native Object get_localTimelineStyles();

    @JsProperty( name = "_localTimelineStyles")
    public native void set_localTimelineStyles( Object value );

    public Object _pendingStyles;

    @JsProperty( name = "_pendingStyles")
    public native Object get_pendingStyles();

    @JsProperty( name = "_pendingStyles")
    public native void set_pendingStyles( Object value );

    public Object _previousKeyframe;

    @JsProperty( name = "_previousKeyframe")
    public native Object get_previousKeyframe();

    @JsProperty( name = "_previousKeyframe")
    public native void set_previousKeyframe( Object value );

    public Object _styleSummary;

    @JsProperty( name = "_styleSummary")
    public native Object get_styleSummary();

    @JsProperty( name = "_styleSummary")
    public native void set_styleSummary( Object value );

    public Number currentTime;

    @JsProperty( name = "currentTime")
    public native Number getCurrentTime();

    @JsProperty( name = "currentTime")
    public native void setCurrentTime( Number value );

    public Number duration;

    @JsProperty( name = "duration")
    public native Number getDuration();

    @JsProperty( name = "duration")
    public native void setDuration( Number value );

    public String easing;

    @JsProperty( name = "easing")
    public native String getEasing();

    @JsProperty( name = "easing")
    public native void setEasing( String value );

    public Object element;

    @JsProperty( name = "element")
    public native Object getElement();

    @JsProperty( name = "element")
    public native void setElement( Object value );

    public Array<String> properties;

    @JsProperty( name = "properties")
    public native Array<String> getProperties();

    @JsProperty( name = "properties")
    public native void setProperties( Array<String> value );

    public Number startTime;

    @JsProperty( name = "startTime")
    public native Number getStartTime();

    @JsProperty( name = "startTime")
    public native void setStartTime( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_loadKeyframe,3,,)
      * TE Signature : S(_loadKeyframe,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4737
     */
    public native Object _loadKeyframe();
    /** 
      * Std Signature : S(_updateStyle,3,,P(d3),P(d3))
      * TE Signature : S(_updateStyle,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4829
     */
    public native Object _updateStyle(Object prop, Object value);
    /** 
      * Std Signature : S(allowOnlyTimelineStyles,27,,)
      * TE Signature : S(allowOnlyTimelineStyles,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4868
     */
    public native Boolean allowOnlyTimelineStyles();
    /** 
      * Std Signature : S(applyEmptyStep,429,,P(d1))
      * TE Signature : S(applyEmptyStep,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4908
     */
    public native void applyEmptyStep(String easing);
    /** 
      * Std Signature : S(applyStylesToKeyframe,429,,)
      * TE Signature : S(applyStylesToKeyframe,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@5076
     */
    public native void applyStylesToKeyframe();
    /** 
      * Std Signature : S(buildKeyframes,322,,)
      * TE Signature : S(buildKeyframes,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@5296
     */
    public native AnimationTimelineInstruction buildKeyframes();
    /** 
      * Std Signature : S(containsAnimation,27,,)
      * TE Signature : S(containsAnimation,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4523
     */
    public native Boolean containsAnimation();
    /** 
      * Std Signature : S(delayNextStep,429,,P(d2))
      * TE Signature : S(delayNextStep,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4634
     */
    public native void delayNextStep(Number delay);
    /** 
      * Std Signature : S(fork,321,,P(d3))
      * TE Signature : S(fork,P(d3))
      * 
     */
    public native TimelineBuilder fork(Object element);
    /** 
      * Std Signature : S(fork,321,,P(d3),P(d2))
      * TE Signature : S(fork,P(d3),P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4674
     */
    public native TimelineBuilder fork(Object element, Number currentTime /* optional */);
    /** 
      * Std Signature : S(forwardFrame,429,,)
      * TE Signature : S(forwardFrame,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4766
     */
    public native void forwardFrame();
    /** 
      * Std Signature : S(forwardTime,429,,P(d2))
      * TE Signature : S(forwardTime,P(d2))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4792
     */
    public native void forwardTime(Number time);
    /** 
      * Std Signature : S(getCurrentStyleProperties,7<1>,,)
      * TE Signature : S(getCurrentStyleProperties,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4557
     */
    public native Array<String> getCurrentStyleProperties();
    /** 
      * Std Signature : S(getFinalKeyframe,290,,)
      * TE Signature : S(getFinalKeyframe,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@5146
     */
    public native ThetaStyleData getFinalKeyframe();
    /** 
      * Std Signature : S(mergeTimelineCollectedStyles,429,,P(d321))
      * TE Signature : S(mergeTimelineCollectedStyles,P(d321))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@5229
     */
    public native void mergeTimelineCollectedStyles(TimelineBuilder timeline);
    /** 
      * Std Signature : S(setStyles,429,,P(d7<U(-1,290)>),P(d1),P(d7<3>))
      * TE Signature : S(setStyles,P(d7),P(d1),P(d7))
      * 
     */
    public native void setStyles(Array<UnionOfStringAndThetaStyleData> input, String easing, Array<Object> errors);
    /** 
      * Std Signature : S(setStyles,429,,P(d7<U(-1,290)>),P(d1),P(d7<3>),P(d284))
      * TE Signature : S(setStyles,P(d7),P(d1),P(d7),P(d284))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@4957
     */
    public native void setStyles(Array<UnionOfStringAndThetaStyleData> input, String easing, Array<Object> errors, AnimationOptions options /* optional */);
    /** 
      * Std Signature : S(snapshotCurrentStyles,429,,)
      * TE Signature : S(snapshotCurrentStyles,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_timeline_builder.d.ts@5111
     */
    public native void snapshotCurrentStyles();
}
