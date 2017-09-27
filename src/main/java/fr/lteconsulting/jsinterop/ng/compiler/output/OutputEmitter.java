package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter".OutputEmitter
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts:443
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="OutputEmitter")
public class OutputEmitter
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(emitStatements,1,,P(d1),P(d1),P(d7<488>))
      * TE Signature : S(emitStatements,P(d1),P(d1),P(d7))
      * 
     */
    public native String emitStatements(String srcFilePath, String genFilePath, Array<Statement> stmts);
    /** 
      * Std Signature : S(emitStatements,1,,P(d1),P(d1),P(d7<488>),P(d1))
      * TE Signature : S(emitStatements,P(d1),P(d1),P(d7),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@494
     */
    public native String emitStatements(String srcFilePath, String genFilePath, Array<Statement> stmts, String preamble /* optional */);
}
