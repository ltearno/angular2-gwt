package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ProviderData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:11197

  * Data for an instantiated NodeType.Provider.
  * 
  * Attention: Adding fields to this is performance sensitive!
 */
@JsType(isNative=true, namespace="ng.core", name="ProviderData")
public class ProviderData
{

    /*
        Properties
    */

    public Object instance;

    @JsProperty( name = "instance")
    public native Object getInstance();

    @JsProperty( name = "instance")
    public native void setInstance( Object value );
}
