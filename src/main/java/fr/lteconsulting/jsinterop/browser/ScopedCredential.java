package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScopedCredential
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637793
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:637895
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredential")
public class ScopedCredential
{

    /*
        Constructors
    */
    public ScopedCredential(){
    }

    /*
        Properties
    */

    public ArrayBuffer id;

    @JsProperty( name = "id")
    public native ArrayBuffer getId();

    @JsProperty( name = "id")
    public native void setId( ArrayBuffer value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
