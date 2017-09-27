package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".CommaExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:11284
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="CommaExpr")
public class CommaExpr extends Expression
{

    /*
        Constructors
    */
    public CommaExpr(Array<Expression> parts, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Expression> parts;

    @JsProperty( name = "parts")
    public native Array<Expression> getParts();

    @JsProperty( name = "parts")
    public native void setParts( Array<Expression> value );
}
