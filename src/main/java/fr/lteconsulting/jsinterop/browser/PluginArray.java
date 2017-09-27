package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: PluginArray
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:549567
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:549772
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PluginArray")
public class PluginArray
{

    /*
        Constructors
    */
    public PluginArray(){
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
      * apis/browser-api/tsd/lib.es6.d.ts@549626
     */
    public native Plugin item(Number index);
    /** 
      * Std Signature : S(namedItem,487,,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@549659
     */
    public native Plugin namedItem(String name);
    /** 
      * Std Signature : S(refresh,289,,)
      * TE Signature : S(refresh,)
      * 
     */
    public native void refresh();
    /** 
      * Std Signature : S(refresh,289,,P(d27))
      * TE Signature : S(refresh,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@549696
     */
    public native void refresh(Boolean reload /* optional */);
}
