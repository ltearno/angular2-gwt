package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeferredPermissionRequest
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324771
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:324940
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeferredPermissionRequest")
public class DeferredPermissionRequest
{

    /*
        Constructors
    */
    public DeferredPermissionRequest(){
    }

    /*
        Properties
    */

    public Number id;

    @JsProperty( name = "id")
    public native Number getId();

    @JsProperty( name = "id")
    public native void setId( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    public String uri;

    @JsProperty( name = "uri")
    public native String getUri();

    @JsProperty( name = "uri")
    public native void setUri( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(allow,289,,)
      * TE Signature : S(allow,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324893
     */
    public native void allow();
    /** 
      * Std Signature : S(deny,289,,)
      * TE Signature : S(deny,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@324912
     */
    public native void deny();
}
