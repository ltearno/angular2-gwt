package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".ReadVarExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:4863
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="ReadVarExpr")
public class ReadVarExpr extends Expression
{

    /*
        Constructors
    */
    public ReadVarExpr(PropertyKey_UnionOfNumberAndString name, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public BuiltinVar builtin;

    @JsProperty( name = "builtin")
    public native BuiltinVar getBuiltin();

    @JsProperty( name = "builtin")
    public native void setBuiltin( BuiltinVar value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(set,463,,P(d449))
      * TE Signature : S(set,P(d449))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts@5148
     */
    public native WriteVarExpr set(Expression value);
}
