package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSConnectivity
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262173
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSConnectivity")
public class MSConnectivity
{

    /*
        Properties
    */

    public String iceType;

    @JsProperty( name = "iceType")
    public native String getIceType();

    @JsProperty( name = "iceType")
    public native void setIceType( String value );

    public MSIceWarningFlags iceWarningFlags;

    @JsProperty( name = "iceWarningFlags")
    public native MSIceWarningFlags getIceWarningFlags();

    @JsProperty( name = "iceWarningFlags")
    public native void setIceWarningFlags( MSIceWarningFlags value );

    public MSRelayAddress relayAddress;

    @JsProperty( name = "relayAddress")
    public native MSRelayAddress getRelayAddress();

    @JsProperty( name = "relayAddress")
    public native void setRelayAddress( MSRelayAddress value );
}
