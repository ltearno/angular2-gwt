package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType776;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory".AnimationTransitionFactory
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts:543
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationTransitionFactory")
public class AnimationTransitionFactory
{

    /*
        Constructors
    */
    public AnimationTransitionFactory(String _triggerName, TransitionAst ast, AnonymousType776 _stateStyles){
    }

    /*
        Properties
    */

    public Object _stateStyles;

    @JsProperty( name = "_stateStyles")
    public native Object get_stateStyles();

    @JsProperty( name = "_stateStyles")
    public native void set_stateStyles( Object value );

    public Object _triggerName;

    @JsProperty( name = "_triggerName")
    public native Object get_triggerName();

    @JsProperty( name = "_triggerName")
    public native void set_triggerName( Object value );

    public TransitionAst ast;

    @JsProperty( name = "ast")
    public native TransitionAst getAst();

    @JsProperty( name = "ast")
    public native void setAst( TransitionAst value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(build,795,,P(d289),P(d3),P(d3),P(d3))
      * TE Signature : S(build,P(d289),P(d3),P(d3),P(d3))
      * 
     */
    public native AnimationTransitionInstruction build(AnimationDriver driver, Object element, Object currentState, Object nextState);
    /** 
      * Std Signature : S(build,795,,P(d289),P(d3),P(d3),P(d3),P(d284))
      * TE Signature : S(build,P(d289),P(d3),P(d3),P(d3),P(d284))
      * 
     */
    public native AnimationTransitionInstruction build(AnimationDriver driver, Object element, Object currentState, Object nextState, AnimationOptions currentOptions /* optional */);
    /** 
      * Std Signature : S(build,795,,P(d289),P(d3),P(d3),P(d3),P(d284),P(d284))
      * TE Signature : S(build,P(d289),P(d3),P(d3),P(d3),P(d284),P(d284))
      * 
     */
    public native AnimationTransitionInstruction build(AnimationDriver driver, Object element, Object currentState, Object nextState, AnimationOptions currentOptions /* optional */, AnimationOptions nextOptions /* optional */);
    /** 
      * Std Signature : S(build,795,,P(d289),P(d3),P(d3),P(d3),P(d284),P(d284),P(d291))
      * TE Signature : S(build,P(d289),P(d3),P(d3),P(d3),P(d284),P(d284),P(d291))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts@970
     */
    public native AnimationTransitionInstruction build(AnimationDriver driver, Object element, Object currentState, Object nextState, AnimationOptions currentOptions /* optional */, AnimationOptions nextOptions /* optional */, ElementInstructionMap subInstructions /* optional */);
    /** 
      * Std Signature : S(buildStyles,290,,P(d1),P(dC(----3----)),P(d7<3>))
      * TE Signature : S(buildStyles,P(d1),P(dC(----3----)),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts@862
     */
    public native ThetaStyleData buildStyles(String stateName, AnonymousType717 params, Array<Object> errors);
    /** 
      * Std Signature : S(match,27,,P(d3),P(d3))
      * TE Signature : S(match,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_transition_factory.d.ts@807
     */
    public native Boolean match(Object currentState, Object nextState);
}
