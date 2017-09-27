package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RTCSrtpKeyParam
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:278989
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSrtpKeyParam")
public class RTCSrtpKeyParam
{

    /*
        Properties
    */

    public String keyMethod;

    @JsProperty( name = "keyMethod")
    public native String getKeyMethod();

    @JsProperty( name = "keyMethod")
    public native void setKeyMethod( String value );

    public String keySalt;

    @JsProperty( name = "keySalt")
    public native String getKeySalt();

    @JsProperty( name = "keySalt")
    public native void setKeySalt( String value );

    public String lifetime;

    @JsProperty( name = "lifetime")
    public native String getLifetime();

    @JsProperty( name = "lifetime")
    public native void setLifetime( String value );

    public Number mkiLength;

    @JsProperty( name = "mkiLength")
    public native Number getMkiLength();

    @JsProperty( name = "mkiLength")
    public native void setMkiLength( Number value );

    public Number mkiValue;

    @JsProperty( name = "mkiValue")
    public native Number getMkiValue();

    @JsProperty( name = "mkiValue")
    public native void setMkiValue( Number value );
}
