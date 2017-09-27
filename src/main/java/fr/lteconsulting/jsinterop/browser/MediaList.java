package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: MediaList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:519812
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:520074
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaList")
public class MediaList
{

    /*
        Constructors
    */
    public MediaList(){
    }

    @JsOverlay
    public final void setByIndex(int index, String value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final String getByIndex(int index) {
        return (String) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public String mediaText;

    @JsProperty( name = "mediaText")
    public native String getMediaText();

    @JsProperty( name = "mediaText")
    public native void setMediaText( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(appendMedium,289,,P(d1))
      * TE Signature : S(appendMedium,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519892
     */
    public native void appendMedium(String newMedium);
    /** 
      * Std Signature : S(deleteMedium,289,,P(d1))
      * TE Signature : S(deleteMedium,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519935
     */
    public native void deleteMedium(String oldMedium);
    /** 
      * Std Signature : S(item,1,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@519978
     */
    public native String item(Number index);
}
