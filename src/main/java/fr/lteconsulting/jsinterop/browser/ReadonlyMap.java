package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ReadonlyMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:215530
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadonlyMap")
public class ReadonlyMap<K, V>
{

    /*
        Properties
    */

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(forEach,289,,P(dFP1-,P2-,P3--S(?,289,,P(d3),P(d4),P(d5))------)<V-,K-,38>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215566
     */
    public native void forEach(Action3<V, K, ReadonlyMap<K, V>> callbackfn);
    /** 
      * Std Signature : S(get,V-,,P(dK-))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215664
     */
    public native V get(K key);
    /** 
      * Std Signature : S(has,27,,P(dK-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@215694
     */
    public native Boolean has(K key);
}
