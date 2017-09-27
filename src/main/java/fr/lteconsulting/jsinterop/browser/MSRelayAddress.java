package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSRelayAddress
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:265055
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSRelayAddress")
public class MSRelayAddress
{

    /*
        Properties
    */

    public Number port;

    @JsProperty( name = "port")
    public native Number getPort();

    @JsProperty( name = "port")
    public native void setPort( Number value );

    public String relayAddress;

    @JsProperty( name = "relayAddress")
    public native String getRelayAddress();

    @JsProperty( name = "relayAddress")
    public native void setRelayAddress( String value );
}
