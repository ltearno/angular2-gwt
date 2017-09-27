package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: PermissionRequest
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:548782
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:548909
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PermissionRequest")
public class PermissionRequest extends DeferredPermissionRequest
{

    /*
        Constructors
    */
    public PermissionRequest(){
    }

    /*
        Properties
    */

    public String state;

    @JsProperty( name = "state")
    public native String getState();

    @JsProperty( name = "state")
    public native void setState( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(defer,289,,)
      * TE Signature : S(defer,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@548880
     */
    public native void defer();
}
