package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScopedCredentialDescriptor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:280193
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredentialDescriptor")
public class ScopedCredentialDescriptor
{

    /*
        Properties
    */

    public Object id;

    @JsProperty( name = "id")
    public native Object getId();

    @JsProperty( name = "id")
    public native void setId( Object value );

    public Array<String> transports;

    @JsProperty( name = "transports")
    public native Array<String> getTransports();

    @JsProperty( name = "transports")
    public native void setTransports( Array<String> value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
