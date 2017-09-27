package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.prebuilt.Action2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/util/FastMap".FastMap
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/util/FastMap.d.ts:0
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="FastMap")
public class FastMap
{

    /*
        Properties
    */

    public Object values;

    @JsProperty( name = "values")
    public native Object getValues();

    @JsProperty( name = "values")
    public native void setValues( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(clear,429,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/FastMap.d.ts@229
     */
    public native void clear();
    /** 
      * Std Signature : S(delete,27,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/FastMap.d.ts@55
     */
    public native Boolean delete(String key);
    /** 
      * Std Signature : S(forEach,429,,P(dFP1-,P2--S(?,429,,P(d3),P(d4))------)<3,6>))
      * TE Signature : S(forEach,P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/FastMap.d.ts@159
     */
    public native void forEach(Action2<Object, Object> cb);
    /** 
      * Std Signature : S(get,3,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/FastMap.d.ts@132
     */
    public native Object get(String key);
    /** 
      * Std Signature : S(set,1257,,P(d1),P(d3))
      * TE Signature : S(set,P(d1),P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/FastMap.d.ts@89
     */
    public native FastMap set(String key, Object value);
}
