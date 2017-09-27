package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSStream
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513693
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513805
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSStream")
public class MSStream
{

    /*
        Constructors
    */
    public MSStream(){
    }

    /*
        Properties
    */

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(msClose,289,,)
      * TE Signature : S(msClose,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@513747
     */
    public native void msClose();
    /** 
      * Std Signature : S(msDetachStream,3,,)
      * TE Signature : S(msDetachStream,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@513768
     */
    public native Object msDetachStream();
}
