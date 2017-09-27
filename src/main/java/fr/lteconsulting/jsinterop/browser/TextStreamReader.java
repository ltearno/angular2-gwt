package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TextStreamReader
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:777510
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextStreamReader")
public class TextStreamReader extends TextStreamBase
{

    /*
        Properties
    */

    /** 
      * Indicates whether the stream pointer position is at the end of a line.
     */
    public Boolean AtEndOfLine;

    @JsProperty( name = "AtEndOfLine")
    public native Boolean getAtEndOfLine();

    @JsProperty( name = "AtEndOfLine")
    public native void setAtEndOfLine( Boolean value );

    /** 
      * Indicates whether the stream pointer position is at the end of a stream.
     */
    public Boolean AtEndOfStream;

    @JsProperty( name = "AtEndOfStream")
    public native Boolean getAtEndOfStream();

    @JsProperty( name = "AtEndOfStream")
    public native void setAtEndOfStream( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(Read,1,,P(d2))
      * TE Signature : S(Read,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@777850
      * Returns a specified number of characters from an input stream, starting at the current pointer position.
      * Does not return until the ENTER key is pressed.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String Read(Number characters);
    /** 
      * Std Signature : S(ReadAll,1,,)
      * TE Signature : S(ReadAll,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@778056
      * Returns all characters from an input stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String ReadAll();
    /** 
      * Std Signature : S(ReadLine,1,,)
      * TE Signature : S(ReadLine,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@778350
      * Returns an entire line from an input stream.
      * Although this method extracts the newline character, it does not add it to the returned string.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native String ReadLine();
    /** 
      * Std Signature : S(Skip,289,,P(d2))
      * TE Signature : S(Skip,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@778686
      * Skips a specified number of characters when reading from an input text stream.
      * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
     */
    public native void Skip(Number characters);
    /** 
      * Std Signature : S(SkipLine,289,,)
      * TE Signature : S(SkipLine,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@778890
      * Skips the next line when reading from an input text stream.
      * Can only be used on a stream in reading mode, not writing or appending mode.
     */
    public native void SkipLine();
}
