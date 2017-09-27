package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBObjectStoreParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259380
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBObjectStoreParameters")
public class IDBObjectStoreParameters
{

    /*
        Properties
    */

    public Boolean autoIncrement;

    @JsProperty( name = "autoIncrement")
    public native Boolean getAutoIncrement();

    @JsProperty( name = "autoIncrement")
    public native void setAutoIncrement( Boolean value );

    public String keyPath;

    @JsProperty( name = "keyPath")
    public native String getKeyPath();

    @JsProperty( name = "keyPath")
    public native void setKeyPath( String value );
}
