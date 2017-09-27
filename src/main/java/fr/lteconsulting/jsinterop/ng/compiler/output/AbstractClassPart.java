package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".AbstractClassPart
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:14670
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="AbstractClassPart")
public class AbstractClassPart
{

    /*
        Constructors
    */
    public AbstractClassPart(Type type, Array<StmtModifier> modifiers){
    }

    /*
        Properties
    */

    public Array<StmtModifier> modifiers;

    @JsProperty( name = "modifiers")
    public native Array<StmtModifier> getModifiers();

    @JsProperty( name = "modifiers")
    public native void setModifiers( Array<StmtModifier> value );

    public Type type;

    @JsProperty( name = "type")
    public native Type getType();

    @JsProperty( name = "type")
    public native void setType( Type value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasModifier,27,,P(d455))
      * TE Signature : S(hasModifier,P(d455))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@14859
     */
    public native Boolean hasModifier(StmtModifier modifier);
}
