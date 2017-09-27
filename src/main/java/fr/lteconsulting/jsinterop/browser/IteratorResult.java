package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IteratorResult
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:217658
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IteratorResult")
public class IteratorResult<T>
{

    /*
        Properties
    */

    public Boolean done;

    @JsProperty( name = "done")
    public native Boolean getDone();

    @JsProperty( name = "done")
    public native void setDone( Boolean value );

    public T value;

    @JsProperty( name = "value")
    public native T getValue();

    @JsProperty( name = "value")
    public native void setValue( T value );
}
