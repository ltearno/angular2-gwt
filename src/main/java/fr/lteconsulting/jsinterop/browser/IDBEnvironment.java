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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface IDBEnvironment
{

    /*
        Properties
    */

    @JsProperty( name = "indexedDB")
    IDBFactory getIndexedDB();

    @JsProperty( name = "indexedDB")
    void setIndexedDB( IDBFactory value );
}
