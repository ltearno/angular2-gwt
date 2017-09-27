package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ObjectURLOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271614
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ObjectURLOptions")
public class ObjectURLOptions
{

    /*
        Properties
    */

    public Boolean oneTimeOnly;

    @JsProperty( name = "oneTimeOnly")
    public native Boolean getOneTimeOnly();

    @JsProperty( name = "oneTimeOnly")
    public native void setOneTimeOnly( Boolean value );
}
