package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AssertionOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:255746
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AssertionOptions")
public class AssertionOptions
{

    /*
        Properties
    */

    public Array<ScopedCredentialDescriptor> allowList;

    @JsProperty( name = "allowList")
    public native Array<ScopedCredentialDescriptor> getAllowList();

    @JsProperty( name = "allowList")
    public native void setAllowList( Array<ScopedCredentialDescriptor> value );

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
