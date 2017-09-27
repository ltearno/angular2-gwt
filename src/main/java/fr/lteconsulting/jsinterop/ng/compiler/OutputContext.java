package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import fr.lteconsulting.jsinterop.ng.compiler.output.Statement;
import fr.lteconsulting.jsinterop.ng.compiler.output.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util".OutputContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts:1813
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="OutputContext")
public class OutputContext
{

    /*
        Properties
    */

    public String genFilePath;

    @JsProperty( name = "genFilePath")
    public native String getGenFilePath();

    @JsProperty( name = "genFilePath")
    public native void setGenFilePath( String value );

    public Array<Statement> statements;

    @JsProperty( name = "statements")
    public native Array<Statement> getStatements();

    @JsProperty( name = "statements")
    public native void setStatements( Array<Statement> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(importExpr,449,,P(d3))
      * TE Signature : S(importExpr,P(d3))
      * 
     */
    public native Expression importExpr(Object reference);
    /** 
      * Std Signature : S(importExpr,449,,P(d3),P(d7<447>))
      * TE Signature : S(importExpr,P(d3),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/util.d.ts@1907
     */
    public native Expression importExpr(Object reference, Array<Type> typeParams /* optional */);
}
