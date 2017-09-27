package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaEncryptedEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:267978
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaEncryptedEventInit")
public class MediaEncryptedEventInit extends EventInit
{

    /*
        Properties
    */

    public ArrayBuffer initData;

    @JsProperty( name = "initData")
    public native ArrayBuffer getInitData();

    @JsProperty( name = "initData")
    public native void setInitData( ArrayBuffer value );

    public String initDataType;

    @JsProperty( name = "initDataType")
    public native String getInitDataType();

    @JsProperty( name = "initDataType")
    public native void setInitDataType( String value );
}
