package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DataTransfer
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:323714
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324038
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransfer")
public class DataTransfer
{

    /*
        Constructors
    */
    public DataTransfer(){
    }

    /*
        Properties
    */

    public String dropEffect;

    @JsProperty( name = "dropEffect")
    public native String getDropEffect();

    @JsProperty( name = "dropEffect")
    public native void setDropEffect( String value );

    public String effectAllowed;

    @JsProperty( name = "effectAllowed")
    public native String getEffectAllowed();

    @JsProperty( name = "effectAllowed")
    public native void setEffectAllowed( String value );

    public FileList files;

    @JsProperty( name = "files")
    public native FileList getFiles();

    @JsProperty( name = "files")
    public native void setFiles( FileList value );

    public DataTransferItemList items;

    @JsProperty( name = "items")
    public native DataTransferItemList getItems();

    @JsProperty( name = "items")
    public native void setItems( DataTransferItemList value );

    public Array<String> types;

    @JsProperty( name = "types")
    public native Array<String> getTypes();

    @JsProperty( name = "types")
    public native void setTypes( Array<String> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clearData,27,,)
      * TE Signature : S(clearData,)
      * 
     */
    public native Boolean clearData();
    /** 
      * Std Signature : S(clearData,27,,P(d1))
      * TE Signature : S(clearData,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323898
     */
    public native Boolean clearData(String format /* optional */);
    /** 
      * Std Signature : S(getData,1,,P(d1))
      * TE Signature : S(getData,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323939
     */
    public native String getData(String format);
    /** 
      * Std Signature : S(setData,27,,P(d1),P(d1))
      * TE Signature : S(setData,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@323976
     */
    public native Boolean setData(String format, String data);
}
