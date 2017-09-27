package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: DataTransferItemList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324417
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324675
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DataTransferItemList")
public class DataTransferItemList
{

    /*
        Constructors
    */
    public DataTransferItemList(){
    }

    @JsOverlay
    public final void setByIndex(int index, DataTransferItem value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final DataTransferItem getByIndex(int index) {
        return (DataTransferItem) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(add,399,,P(d57))
      * TE Signature : S(add,P(d57))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324485
     */
    public native DataTransferItem add(File data);
    /** 
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324531
     */
    public native void clear();
    /** 
      * Std Signature : S(item,399,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324550
     */
    public native DataTransferItem item(Number index);
    /** 
      * Std Signature : S(remove,289,,P(d2))
      * TE Signature : S(remove,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324593
     */
    public native void remove(Number index);
}
