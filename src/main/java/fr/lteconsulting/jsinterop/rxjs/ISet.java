package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/rxjs/util/Set".ISet
  * flags: 32768
  * declared in: apis/angular4-api/tsd/rxjs/util/Set.d.ts:53
  * 
 */
@JsType(isNative=true, namespace="rxjs", name="ISet")
public class ISet<T>
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
      * Std Signature : S(add,429,,P(dT-))
      * TE Signature : S(add,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Set.d.ts@85
     */
    public native void add(T value);
    /** 
      * Std Signature : S(clear,429,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Set.d.ts@156
     */
    public native void clear();
    /** 
      * Std Signature : S(has,27,,P(dT-))
      * TE Signature : S(has,P(d3))
      * 
     */
    /** 
      * apis/angular4-api/tsd/rxjs/util/Set.d.ts@110
     */
    public native Boolean has(T value);
}
