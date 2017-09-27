package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map".ElementInstructionMap
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map.d.ts:283
  * 
 */
@JsType(isNative=true, namespace="ng", name="ElementInstructionMap")
public class ElementInstructionMap
{

    /*
        Properties
    */

    public Object _map;

    @JsProperty( name = "_map")
    public native Object get_map();

    @JsProperty( name = "_map")
    public native void set_map( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(append,429,,P(d3),P(d7<322>))
      * TE Signature : S(append,P(d3),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map.d.ts@410
     */
    public native void append(Object element, Array<AnimationTimelineInstruction> instructions);
    /** 
      * Std Signature : S(clear,429,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map.d.ts@520
     */
    public native void clear();
    /** 
      * Std Signature : S(consume,7<322>,,P(d3))
      * TE Signature : S(consume,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map.d.ts@351
     */
    public native Array<AnimationTimelineInstruction> consume(Object element);
    /** 
      * Std Signature : S(has,27,,P(d3))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/animations/browser/src/dsl/element_instruction_map.d.ts@488
     */
    public native Boolean has(Object element);
}
