package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBEnvironment
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:731482
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBEnvironment")
public class IDBEnvironmentImpl implements IDBEnvironment
{

    /*
        Properties
    */

    public IDBFactory indexedDB;

    @JsProperty( name = "indexedDB")
    public native IDBFactory getIndexedDB();

    @JsProperty( name = "indexedDB")
    public native void setIndexedDB( IDBFactory value );
}
