package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: ClientRectList
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315380
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:315522
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClientRectList")
public class ClientRectList
{

    /*
        Constructors
    */
    public ClientRectList(){
    }

    @JsOverlay
    public final void setByIndex(int index, ClientRect value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final ClientRect getByIndex(int index) {
        return (ClientRect) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(item,375,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@315442
     */
    public native ClientRect item(Number index);
}
