package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBOpenDBRequestEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:494031
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBOpenDBRequestEventMap")
public class IDBOpenDBRequestEventMap extends IDBRequestEventMap
{

    /*
        Properties
    */

    public Event blocked;

    @JsProperty( name = "blocked")
    public native Event getBlocked();

    @JsProperty( name = "blocked")
    public native void setBlocked( Event value );

    public IDBVersionChangeEvent upgradeneeded;

    @JsProperty( name = "upgradeneeded")
    public native IDBVersionChangeEvent getUpgradeneeded();

    @JsProperty( name = "upgradeneeded")
    public native void setUpgradeneeded( IDBVersionChangeEvent value );
}
