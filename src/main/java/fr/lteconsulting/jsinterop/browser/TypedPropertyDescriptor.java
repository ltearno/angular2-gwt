package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TypedPropertyDescriptor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:60595
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TypedPropertyDescriptor")
public class TypedPropertyDescriptor<T>
{

    /*
        Properties
    */

    public Boolean configurable;

    @JsProperty( name = "configurable")
    public native Boolean getConfigurable();

    @JsProperty( name = "configurable")
    public native void setConfigurable( Boolean value );

    public Boolean enumerable;

    @JsProperty( name = "enumerable")
    public native Boolean getEnumerable();

    @JsProperty( name = "enumerable")
    public native void setEnumerable( Boolean value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );

    public Boolean writable;

    @JsProperty( name = "writable")
    public native Boolean getWritable();

    @JsProperty( name = "writable")
    public native void setWritable( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,T3,,)
      * TE Signature : S(get,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@60739
     */
    public native T get();
    /** 
      * Std Signature : S(set,289,,P(dT3))
      * TE Signature : S(set,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@60758
     */
    public native void set(T value);
}
