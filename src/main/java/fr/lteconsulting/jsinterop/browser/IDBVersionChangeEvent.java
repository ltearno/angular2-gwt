package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBVersionChangeEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:496543
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:496680
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBVersionChangeEvent")
public class IDBVersionChangeEvent extends Event
{

    /*
        Constructors
    */
    public IDBVersionChangeEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Number newVersion;

    @JsProperty( name = "newVersion")
    public native Number getNewVersion();

    @JsProperty( name = "newVersion")
    public native void setNewVersion( Number value );

    public Number oldVersion;

    @JsProperty( name = "oldVersion")
    public native Number getOldVersion();

    @JsProperty( name = "oldVersion")
    public native void setOldVersion( Number value );
}
