package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSCredentialSpec
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:262425
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSCredentialSpec")
public class MSCredentialSpec
{

    /*
        Properties
    */

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
