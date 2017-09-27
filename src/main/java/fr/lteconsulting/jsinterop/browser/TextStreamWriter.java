package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: TextStreamWriter
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:777093
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextStreamWriter")
public class TextStreamWriter extends TextStreamBase
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(Write,289,,P(d1))
      * TE Signature : S(Write,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@777210
      * Sends a string to an output stream.
     */
    public native void Write(String s);
    /** 
      * Std Signature : S(WriteBlankLines,289,,P(d2))
      * TE Signature : S(WriteBlankLines,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@777344
      * Sends a specified number of blank lines (newline characters) to an output stream.
     */
    public native void WriteBlankLines(Number intLines);
    /** 
      * Std Signature : S(WriteLine,289,,P(d1))
      * TE Signature : S(WriteLine,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@777481
      * Sends a string followed by a newline character to an output stream.
     */
    public native void WriteLine(String s);
}
