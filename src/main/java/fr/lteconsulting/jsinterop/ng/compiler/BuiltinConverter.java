package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.output.Expression;
import jsinterop.annotations.JsFunction;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter".BuiltinConverter
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/compiler_util/expression_converter.d.ts:972
  * 
 */
@JsFunction
public interface BuiltinConverter{
    Expression call(Array<Expression> args);
}
