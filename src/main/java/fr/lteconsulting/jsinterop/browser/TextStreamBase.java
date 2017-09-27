package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextStreamBase
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:776582
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextStreamBase")
public class TextStreamBase
{

    /*
        Properties
    */

    /** 
      * The column number of the current character position in an input stream.
     */
    public Number Column;

    @JsProperty( name = "Column")
    public native Number getColumn();

    @JsProperty( name = "Column")
    public native void setColumn( Number value );

    /** 
      * The current line number in an input stream.
     */
    public Number Line;

    @JsProperty( name = "Line")
    public native Number getLine();

    @JsProperty( name = "Line")
    public native void setLine( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(Close,289,,)
      * TE Signature : S(Close,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@777077
      * Closes a text stream.
      * It is not necessary to close standard streams; they close automatically when the process ends. If 
      * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
     */
    public native void Close();
}
