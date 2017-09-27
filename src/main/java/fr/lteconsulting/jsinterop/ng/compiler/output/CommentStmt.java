package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast".CommentStmt
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/output_ast.d.ts:16387
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="CommentStmt")
public class CommentStmt extends Statement
{

    /*
        Constructors
    */
    public CommentStmt(String comment, ParseSourceSpan sourceSpan){
        super(null, null);
    }

    /*
        Properties
    */

    public String comment;

    @JsProperty( name = "comment")
    public native String getComment();

    @JsProperty( name = "comment")
    public native void setComment( String value );
}
