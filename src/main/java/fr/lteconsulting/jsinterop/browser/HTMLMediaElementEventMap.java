package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLMediaElementEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:438077
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMediaElementEventMap")
public class HTMLMediaElementEventMap extends HTMLElementEventMap
{

    /*
        Properties
    */

    public MediaEncryptedEvent encrypted;

    @JsProperty( name = "encrypted")
    public native MediaEncryptedEvent getEncrypted();

    @JsProperty( name = "encrypted")
    public native void setEncrypted( MediaEncryptedEvent value );

    public MSMediaKeyNeededEvent msneedkey;

    @JsProperty( name = "msneedkey")
    public native MSMediaKeyNeededEvent getMsneedkey();

    @JsProperty( name = "msneedkey")
    public native void setMsneedkey( MSMediaKeyNeededEvent value );
}
