package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/ts_emitter".TypeScriptEmitter
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/ts_emitter.d.ts:219
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="TypeScriptEmitter")
public class TypeScriptEmitter extends OutputEmitter
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(emitStatementsAndContext,3,,P(d1),P(d1),P(d7<488>))
      * TE Signature : S(emitStatementsAndContext,P(d1),P(d1),P(d7))
      * 
     */
    public native Object emitStatementsAndContext(String srcFilePath, String genFilePath, Array<Statement> stmts);
    /** 
      * Std Signature : S(emitStatementsAndContext,3,,P(d1),P(d1),P(d7<488>),P(d1))
      * TE Signature : S(emitStatementsAndContext,P(d1),P(d1),P(d7),P(d1))
      * 
     */
    public native Object emitStatementsAndContext(String srcFilePath, String genFilePath, Array<Statement> stmts, String preamble /* optional */);
    /** 
      * Std Signature : S(emitStatementsAndContext,3,,P(d1),P(d1),P(d7<488>),P(d1),P(d27))
      * TE Signature : S(emitStatementsAndContext,P(d1),P(d1),P(d7),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/ts_emitter.d.ts@290
     */
    public native Object emitStatementsAndContext(String srcFilePath, String genFilePath, Array<Statement> stmts, String preamble /* optional */, Boolean emitSourceMaps /* optional */);
}
