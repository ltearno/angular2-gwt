package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".Type
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:303
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="Type")
public class Type
{

    /*
        Constructors
    */
    public Type(Array<TypeModifier> modifiers){
    }

    /*
        Properties
    */

    public Array<TypeModifier> modifiers;

    @JsProperty( name = "modifiers")
    public native Array<TypeModifier> getModifiers();

    @JsProperty( name = "modifiers")
    public native void setModifiers( Array<TypeModifier> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasModifier,27,,P(d487))
      * TE Signature : S(hasModifier,P(d487))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@500
     */
    public native Boolean hasModifier(TypeModifier modifier);
    /** 
      * Std Signature : S(visitType,3,,P(d445),P(d3))
      * TE Signature : S(visitType,P(d445),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@435
     */
    public native Object visitType(TypeVisitor visitor, Object context);
}
