package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.ng.compiler.ParseError;
import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/ml_parser/icu_ast_expander".ExpansionError
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/ml_parser/icu_ast_expander.d.ts:1022
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="ExpansionError")
public class ExpansionError extends ParseError
{

    /*
        Constructors
    */
    public ExpansionError(ParseSourceSpan span, String errorMsg){
        super(null, null, null);
    }
}
