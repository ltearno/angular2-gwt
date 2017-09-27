package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType776;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_trigger".AnimationTrigger
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_trigger.d.ts:544
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="AnimationTrigger")
public class AnimationTrigger
{

    /*
        Constructors
    */
    public AnimationTrigger(String name, TriggerAst ast){
    }

    /*
        Properties
    */

    public TriggerAst ast;

    @JsProperty( name = "ast")
    public native TriggerAst getAst();

    @JsProperty( name = "ast")
    public native void setAst( TriggerAst value );

    public Boolean containsQueries;

    @JsProperty( name = "containsQueries")
    public native Boolean getContainsQueries();

    @JsProperty( name = "containsQueries")
    public native void setContainsQueries( Boolean value );

    public AnimationTransitionFactory fallbackTransition;

    @JsProperty( name = "fallbackTransition")
    public native AnimationTransitionFactory getFallbackTransition();

    @JsProperty( name = "fallbackTransition")
    public native void setFallbackTransition( AnimationTransitionFactory value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public AnonymousType776 states;

    @JsProperty( name = "states")
    public native AnonymousType776 getStates();

    @JsProperty( name = "states")
    public native void setStates( AnonymousType776 value );

    public Array<AnimationTransitionFactory> transitionFactories;

    @JsProperty( name = "transitionFactories")
    public native Array<AnimationTransitionFactory> getTransitionFactories();

    @JsProperty( name = "transitionFactories")
    public native void setTransitionFactories( Array<AnimationTransitionFactory> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(matchStyles,290,,P(d3),P(dC(----3----)),P(d7<3>))
      * TE Signature : S(matchStyles,P(d3),P(dC(----3----)),P(d7))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_trigger.d.ts@1043
     */
    public native ThetaStyleData matchStyles(Object currentState, AnonymousType717 params, Array<Object> errors);
    /** 
      * Std Signature : S(matchTransition,1192,,P(d3),P(d3))
      * TE Signature : S(matchTransition,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_trigger.d.ts@952
     */
    public native AnimationTransitionFactory matchTransition(Object currentState, Object nextState);
}
