package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ElementDefinitionOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:744162
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ElementDefinitionOptions")
public class ElementDefinitionOptions
{

    /*
        Properties
    */

    @JsProperty(name="extends")
    public String extends_;

    @JsProperty( name = "extends")
    public native String getExtends_();

    @JsProperty( name = "extends")
    public native void setExtends_( String value );
}
