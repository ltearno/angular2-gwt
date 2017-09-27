package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: ITextWriter
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:776476
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ITextWriter")
public class ITextWriter
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(Close,289,,)
      * TE Signature : S(Close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@776566
     */
    public native void Close();
    /** 
      * Std Signature : S(Write,289,,P(d1))
      * TE Signature : S(Write,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@776506
     */
    public native void Write(String s);
    /** 
      * Std Signature : S(WriteLine,289,,P(d1))
      * TE Signature : S(WriteLine,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@776534
     */
    public native void WriteLine(String s);
}
