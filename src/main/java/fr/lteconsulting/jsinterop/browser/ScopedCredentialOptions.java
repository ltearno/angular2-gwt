package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScopedCredentialOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:280295
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredentialOptions")
public class ScopedCredentialOptions
{

    /*
        Properties
    */

    public Array<ScopedCredentialDescriptor> excludeList;

    @JsProperty( name = "excludeList")
    public native Array<ScopedCredentialDescriptor> getExcludeList();

    @JsProperty( name = "excludeList")
    public native void setExcludeList( Array<ScopedCredentialDescriptor> value );

    public WebAuthnExtensions extensions;

    @JsProperty( name = "extensions")
    public native WebAuthnExtensions getExtensions();

    @JsProperty( name = "extensions")
    public native void setExtensions( WebAuthnExtensions value );

    public String rpId;

    @JsProperty( name = "rpId")
    public native String getRpId();

    @JsProperty( name = "rpId")
    public native void setRpId( String value );

    public Number timeoutSeconds;

    @JsProperty( name = "timeoutSeconds")
    public native Number getTimeoutSeconds();

    @JsProperty( name = "timeoutSeconds")
    public native void setTimeoutSeconds( Number value );
}
