package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSrtpSdesParameters
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:279136
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSrtpSdesParameters")
public class RTCSrtpSdesParameters
{

    /*
        Properties
    */

    public String cryptoSuite;

    @JsProperty( name = "cryptoSuite")
    public native String getCryptoSuite();

    @JsProperty( name = "cryptoSuite")
    public native void setCryptoSuite( String value );

    public Array<RTCSrtpKeyParam> keyParams;

    @JsProperty( name = "keyParams")
    public native Array<RTCSrtpKeyParam> getKeyParams();

    @JsProperty( name = "keyParams")
    public native void setKeyParams( Array<RTCSrtpKeyParam> value );

    public Array<String> sessionParams;

    @JsProperty( name = "sessionParams")
    public native Array<String> getSessionParams();

    @JsProperty( name = "sessionParams")
    public native void setSessionParams( Array<String> value );

    public Number tag;

    @JsProperty( name = "tag")
    public native Number getTag();

    @JsProperty( name = "tag")
    public native void setTag( Number value );
}
