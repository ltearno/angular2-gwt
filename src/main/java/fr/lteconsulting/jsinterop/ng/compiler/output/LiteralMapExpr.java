package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".LiteralMapExpr
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:10992
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="LiteralMapExpr")
public class LiteralMapExpr extends Expression
{

    /*
        Constructors
    */
    public LiteralMapExpr(Array<LiteralMapEntry> entries, MapType type, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public Array<LiteralMapEntry> entries;

    @JsProperty( name = "entries")
    public native Array<LiteralMapEntry> getEntries();

    @JsProperty( name = "entries")
    public native void setEntries( Array<LiteralMapEntry> value );

    public Type valueType;

    @JsProperty( name = "valueType")
    public native Type getValueType();

    @JsProperty( name = "valueType")
    public native void setValueType( Type value );
}
