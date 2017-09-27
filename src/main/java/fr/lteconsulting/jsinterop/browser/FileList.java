package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: FileList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:374654
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:374778
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FileList")
public class FileList
{

    /*
        Constructors
    */
    public FileList(){
    }

    @JsOverlay
    public final void setByIndex(int index, File value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final File getByIndex(int index) {
        return (File) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,57,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@374710
     */
    public native File item(Number index);
}
