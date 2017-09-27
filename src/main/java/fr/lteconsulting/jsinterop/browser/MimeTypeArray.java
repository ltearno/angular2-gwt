package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: MimeTypeArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:526151
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:526321
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MimeTypeArray")
public class MimeTypeArray
{

    /*
        Constructors
    */
    public MimeTypeArray(){
    }

    @JsOverlay
    public final void setByIndex(int index, Plugin value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Plugin getByIndex(int index) {
        return (Plugin) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,487,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@526212
     */
    public native Plugin item(Number index);
    /** 
      * Std Signature : S(namedItem,487,,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@526245
     */
    public native Plugin namedItem(String type);
}
