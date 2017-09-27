package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StorageEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:648618
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:648790
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StorageEvent")
public class StorageEvent extends Event
{

    /*
        Constructors
    */
    public StorageEvent(String type, StorageEventInit eventInitDict){
        super(null, null);
    }

    /*
        Properties
    */

    public String key;

    @JsProperty( name = "key")
    public native String getKey();

    @JsProperty( name = "key")
    public native void setKey( String value );

    public String newValue;

    @JsProperty( name = "newValue")
    public native String getNewValue();

    @JsProperty( name = "newValue")
    public native void setNewValue( String value );

    public String oldValue;

    @JsProperty( name = "oldValue")
    public native String getOldValue();

    @JsProperty( name = "oldValue")
    public native void setOldValue( String value );

    public Storage storageArea;

    @JsProperty( name = "storageArea")
    public native Storage getStorageArea();

    @JsProperty( name = "storageArea")
    public native void setStorageArea( Storage value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}
