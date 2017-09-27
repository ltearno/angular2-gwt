package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MediaStreamError
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522329
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:522482
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamError")
public class MediaStreamError
{

    /*
        Constructors
    */
    public MediaStreamError(){
    }

    /*
        Properties
    */

    public String constraintName;

    @JsProperty( name = "constraintName")
    public native String getConstraintName();

    @JsProperty( name = "constraintName")
    public native void setConstraintName( String value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}
