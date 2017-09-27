package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: TextTrackCueList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:656987
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:657177
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackCueList")
public class TextTrackCueList
{

    /*
        Constructors
    */
    public TextTrackCueList(){
    }

    @JsOverlay
    public final void setByIndex(int index, TextTrackCue value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final TextTrackCue getByIndex(int index) {
        return (TextTrackCue) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(getCueById,102,,P(d1))
      * TE Signature : S(getCueById,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@657051
     */
    public native TextTrackCue getCueById(String id);
    /** 
      * Std Signature : S(item,102,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@657093
     */
    public native TextTrackCue item(Number index);
}
