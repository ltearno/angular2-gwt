package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".Statement
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:13178
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="Statement")
public class Statement
{

    /*
        Constructors
    */
    public Statement(Array<StmtModifier> modifiers, ParseSourceSpan sourceSpan){
    }

    /*
        Properties
    */

    public Array<StmtModifier> modifiers;

    @JsProperty( name = "modifiers")
    public native Array<StmtModifier> getModifiers();

    @JsProperty( name = "modifiers")
    public native void setModifiers( Array<StmtModifier> value );

    public ParseSourceSpan sourceSpan;

    @JsProperty( name = "sourceSpan")
    public native ParseSourceSpan getSourceSpan();

    @JsProperty( name = "sourceSpan")
    public native void setSourceSpan( ParseSourceSpan value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasModifier,27,,P(d455))
      * TE Signature : S(hasModifier,P(d455))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@13460
     */
    public native Boolean hasModifier(StmtModifier modifier);
    /** 
      * Std Signature : S(visitStatement,3,,P(d451),P(d3))
      * TE Signature : S(visitStatement,P(d451),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@13385
     */
    public native Object visitStatement(StatementVisitor visitor, Object context);
}
