package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBIndexParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259298
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBIndexParameters")
public class IDBIndexParameters
{

    /*
        Properties
    */

    public Boolean multiEntry;

    @JsProperty( name = "multiEntry")
    public native Boolean getMultiEntry();

    @JsProperty( name = "multiEntry")
    public native void setMultiEntry( Boolean value );

    public Boolean unique;

    @JsProperty( name = "unique")
    public native Boolean getUnique();

    @JsProperty( name = "unique")
    public native void setUnique( Boolean value );
}
