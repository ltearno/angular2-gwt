package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/util/MapPolyfill".MapPolyfill
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts:0
  * base type: "apis/angular4-api/tsd/rxjs/util/MapPolyfill".MapPolyfill
  * flags: 16384
  * declared in: apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="MapPolyfill")
public class MapPolyfill
{

    /*
        Properties
    */

    public Object _keys;

    @JsProperty( name = "_keys")
    public native Object get_keys();

    @JsProperty( name = "_keys")
    public native void set_keys( Object value );

    public Object _values;

    @JsProperty( name = "_values")
    public native Object get_values();

    @JsProperty( name = "_values")
    public native void set_values( Object value );

    public Number size;

    @JsProperty( name = "size")
    public native Number getSize();

    @JsProperty( name = "size")
    public native void setSize( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clear,429,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts@189
     */
    public native void clear();
    /** 
      * Std Signature : S(delete,27,,P(d3))
      * TE Signature : S(delete,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts@158
     */
    public native Boolean delete(Object key);
    /** 
      * Std Signature : S(forEach,429,,P(d205))
      * TE Signature : S(forEach,P(d205))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts@208
     */
    public native void forEach(Function cb);
    /** 
      * Std Signature : S(get,3,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts@97
     */
    public native Object get(Object key);
    /** 
      * Std Signature : S(set,1258,,P(d3),P(d3))
      * TE Signature : S(set,P(d3),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/MapPolyfill.d.ts@121
     */
    public native MapPolyfill set(Object key, Object value);
}
