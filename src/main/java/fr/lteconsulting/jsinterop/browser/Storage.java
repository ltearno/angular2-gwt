package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: Storage
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:648263
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:648561
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Storage")
public class Storage
{

    /*
        Constructors
    */
    public Storage(){
    }

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    @JsOverlay
    public final void setByIndex(String index, Object value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final Object getByIndex(String index) {
        return (Object) Js.asPropertyMap(this).get(index);
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
      * Std Signature : S(clear,289,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648318
     */
    public native void clear();
    /** 
      * Std Signature : S(getItem,1,,P(d1))
      * TE Signature : S(getItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648337
     */
    public native String getItem(String key);
    /** 
      * Std Signature : S(key,1,,P(d2))
      * TE Signature : S(key,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648378
     */
    public native String key(Number index);
    /** 
      * Std Signature : S(removeItem,289,,P(d1))
      * TE Signature : S(removeItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648417
     */
    public native void removeItem(String key);
    /** 
      * Std Signature : S(setItem,289,,P(d1),P(d1))
      * TE Signature : S(setItem,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@648452
     */
    public native void setItem(String key, String data);
}
