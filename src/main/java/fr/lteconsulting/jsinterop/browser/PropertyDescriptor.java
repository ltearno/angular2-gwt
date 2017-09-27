package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PropertyDescriptor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:2959
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PropertyDescriptor")
public class PropertyDescriptor
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

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );

    public Boolean writable;

    @JsProperty( name = "writable")
    public native Boolean getWritable();

    @JsProperty( name = "writable")
    public native void setWritable( Boolean value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,3,,)
      * TE Signature : S(get,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@3091
     */
    public native Object get();
    /** 
      * Std Signature : S(set,289,,P(d3))
      * TE Signature : S(set,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@3109
     */
    public native void set(Object v);
}
