package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".GroupAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:2245
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="GroupAst")
public class GroupAst extends Ast
{

    /*
        Constructors
    */
    public GroupAst(Array<Ast> steps){
    }

    /*
        Properties
    */

    public Array<Ast> steps;

    @JsProperty( name = "steps")
    public native Array<Ast> getSteps();

    @JsProperty( name = "steps")
    public native void setSteps( Array<Ast> value );
}
