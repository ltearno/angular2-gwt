package fr.lteconsulting.jsinterop.ng.compiler.output;

import fr.lteconsulting.jsinterop.ng.compiler.ParseSourceSpan;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter".EmitterVisitorContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts:618
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.output", name="EmitterVisitorContext")
public class EmitterVisitorContext
{

    /*
        Constructors
    */
    public EmitterVisitorContext(Number _indent){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts:689
     */
    @JsMethod(namespace="ng.compiler.output.EmitterVisitorContext", name = "createRoot")
    public static native EmitterVisitorContext createRoot();

    /*
        Properties
    */

    public Object _classes;

    @JsProperty( name = "_classes")
    public native Object get_classes();

    @JsProperty( name = "_classes")
    public native void set_classes( Object value );

    public Object _currentLine;

    @JsProperty( name = "_currentLine")
    public native Object get_currentLine();

    @JsProperty( name = "_currentLine")
    public native void set_currentLine( Object value );

    public Object _indent;

    @JsProperty( name = "_indent")
    public native Object get_indent();

    @JsProperty( name = "_indent")
    public native void set_indent( Object value );

    public Object _lines;

    @JsProperty( name = "_lines")
    public native Object get_lines();

    @JsProperty( name = "_lines")
    public native void set_lines( Object value );

    public Object _preambleLineCount;

    @JsProperty( name = "_preambleLineCount")
    public native Object get_preambleLineCount();

    @JsProperty( name = "_preambleLineCount")
    public native void set_preambleLineCount( Object value );

    public ClassStmt currentClass;

    @JsProperty( name = "currentClass")
    public native ClassStmt getCurrentClass();

    @JsProperty( name = "currentClass")
    public native void setCurrentClass( ClassStmt value );

    public Object sourceLines;

    @JsProperty( name = "sourceLines")
    public native Object getSourceLines();

    @JsProperty( name = "sourceLines")
    public native void setSourceLines( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(decIndent,429,,)
      * TE Signature : S(decIndent,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1211
     */
    public native void decIndent();
    /** 
      * Std Signature : S(incIndent,429,,)
      * TE Signature : S(incIndent,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1188
     */
    public native void incIndent();
    /** 
      * Std Signature : S(lineIsEmpty,27,,)
      * TE Signature : S(lineIsEmpty,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@985
     */
    public native Boolean lineIsEmpty();
    /** 
      * Std Signature : S(lineLength,2,,)
      * TE Signature : S(lineLength,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1013
     */
    public native Number lineLength();
    /** 
      * Std Signature : S(popClass,457,,)
      * TE Signature : S(popClass,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1275
     */
    public native ClassStmt popClass();
    /** 
      * Std Signature : S(print,429,,P(d3),P(d1))
      * TE Signature : S(print,P(d3),P(d1))
      * 
     */
    public native void print(Object from, String part);
    /** 
      * Std Signature : S(print,429,,P(d3),P(d1),P(d27))
      * TE Signature : S(print,P(d3),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1039
     */
    public native void print(Object from, String part, Boolean newLine /* optional */);
    /** 
      * Std Signature : S(println,429,,)
      * TE Signature : S(println,)
      * 
     */
    public native void println();
    /** 
      * Std Signature : S(println,429,,P(d3))
      * TE Signature : S(println,P(d3))
      * 
     */
    public native void println(Object from /* optional */);
    /** 
      * Std Signature : S(println,429,,P(d3),P(d1))
      * TE Signature : S(println,P(d3),P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@880
     */
    public native void println(Object from /* optional */, String lastPart /* optional */);
    /** 
      * Std Signature : S(pushClass,429,,P(d457))
      * TE Signature : S(pushClass,P(d457))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1234
     */
    public native void pushClass(ClassStmt clazz);
    /** 
      * Std Signature : S(removeEmptyLastLine,429,,)
      * TE Signature : S(removeEmptyLastLine,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1155
     */
    public native void removeEmptyLastLine();
    /** 
      * Std Signature : S(setPreambleLineCount,2,,P(d2))
      * TE Signature : S(setPreambleLineCount,P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1489
     */
    public native Number setPreambleLineCount(Number count);
    /** 
      * Std Signature : S(spanOf,441,,P(d2),P(d2))
      * TE Signature : S(spanOf,P(d2),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1538
     */
    public native ParseSourceSpan spanOf(Number line, Number column);
    /** 
      * Std Signature : S(toSource,1,,)
      * TE Signature : S(toSource,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1351
     */
    public native String toSource();
    /** 
      * Std Signature : S(toSourceMapGenerator,1231,,P(d1),P(d1))
      * TE Signature : S(toSourceMapGenerator,P(d1),P(d1))
      * 
     */
    public native SourceMapGenerator toSourceMapGenerator(String sourceFilePath, String genFilePath);
    /** 
      * Std Signature : S(toSourceMapGenerator,1231,,P(d1),P(d1),P(d2))
      * TE Signature : S(toSourceMapGenerator,P(d1),P(d1),P(d2))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/output/abstract_emitter.d.ts@1375
     */
    public native SourceMapGenerator toSourceMapGenerator(String sourceFilePath, String genFilePath, Number startsAtLine /* optional */);
}
