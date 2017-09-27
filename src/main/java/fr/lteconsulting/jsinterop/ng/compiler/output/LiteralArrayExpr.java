package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".LiteralArrayExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:10571
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="LiteralArrayExpr")
public class LiteralArrayExpr extends Expression
{

    /*
        Constructors
    */
    public LiteralArrayExpr(Array<Expression> entries, Type type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<Expression> entries;

    @JsProperty( name = "entries")
    public native Array<Expression> getEntries();

    @JsProperty( name = "entries")
    public native void setEntries( Array<Expression> value );
}
