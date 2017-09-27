package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".TriggerAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:1279
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="TriggerAst")
public class TriggerAst extends Ast
{

    /*
        Constructors
    */
    public TriggerAst(String name, Array<StateAst> states, Array<TransitionAst> transitions){
    }

    /*
        Properties
    */

    public Number depCount;

    @JsProperty( name = "depCount")
    public native Number getDepCount();

    @JsProperty( name = "depCount")
    public native void setDepCount( Number value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Number queryCount;

    @JsProperty( name = "queryCount")
    public native Number getQueryCount();

    @JsProperty( name = "queryCount")
    public native void setQueryCount( Number value );

    public Array<StateAst> states;

    @JsProperty( name = "states")
    public native Array<StateAst> getStates();

    @JsProperty( name = "states")
    public native void setStates( Array<StateAst> value );

    public Array<TransitionAst> transitions;

    @JsProperty( name = "transitions")
    public native Array<TransitionAst> getTransitions();

    @JsProperty( name = "transitions")
    public native void setTransitions( Array<TransitionAst> value );
}
