package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DataTransferItem
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324110
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324333
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransferItem")
public class DataTransferItem
{

    /*
        Constructors
    */
    public DataTransferItem(){
    }

    /*
        Properties
    */

    public String kind;

    @JsProperty( name = "kind")
    public native String getKind();

    @JsProperty( name = "kind")
    public native void setKind( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getAsFile,57,,)
      * TE Signature : S(getAsFile,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324199
     */
    public native File getAsFile();
    /** 
      * Std Signature : S(getAsString,289,,P(dF--S(?,289,,P(d1))------)))
      * TE Signature : S(getAsString,P(dF--S(?,P(d1))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324229
     */
    public native void getAsString(FunctionStringCallback _callback);
    /** 
      * Std Signature : S(webkitGetAsEntry,3,,)
      * TE Signature : S(webkitGetAsEntry,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324294
     */
    public native Object webkitGetAsEntry();
}
