package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: NamedNodeMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529106
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529550
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NamedNodeMap")
public class NamedNodeMap
{

    /*
        Constructors
    */
    public NamedNodeMap(){
    }

    @JsOverlay
    public final void setByIndex(int index, Attr value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final Attr getByIndex(int index) {
        return (Attr) Js.asArrayLike(this).getAt(index);
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
      * Std Signature : S(getNamedItem,43,,P(d1))
      * TE Signature : S(getNamedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529166
     */
    public native Attr getNamedItem(String name);
    /** 
      * Std Signature : S(getNamedItemNS,43,,P(d1),P(d1))
      * TE Signature : S(getNamedItemNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529204
     */
    public native Attr getNamedItemNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(item,43,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529285
     */
    public native Attr item(Number index);
    /** 
      * Std Signature : S(removeNamedItem,43,,P(d1))
      * TE Signature : S(removeNamedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529316
     */
    public native Attr removeNamedItem(String name);
    /** 
      * Std Signature : S(removeNamedItemNS,43,,P(d1),P(d1))
      * TE Signature : S(removeNamedItemNS,P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529357
     */
    public native Attr removeNamedItemNS(String namespaceURI, String localName);
    /** 
      * Std Signature : S(setNamedItem,43,,P(d43))
      * TE Signature : S(setNamedItem,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529441
     */
    public native Attr setNamedItem(Attr arg);
    /** 
      * Std Signature : S(setNamedItemNS,43,,P(d43))
      * TE Signature : S(setNamedItemNS,P(d43))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@529476
     */
    public native Attr setNamedItemNS(Attr arg);
}
