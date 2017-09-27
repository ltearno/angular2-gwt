package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ProviderDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:7726
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ProviderDef")
public class ProviderDef
{

    /*
        Properties
    */

    public Array<DepDef> deps;

    @JsProperty( name = "deps")
    public native Array<DepDef> getDeps();

    @JsProperty( name = "deps")
    public native void setDeps( Array<DepDef> value );

    public Object token;

    @JsProperty( name = "token")
    public native Object getToken();

    @JsProperty( name = "token")
    public native void setToken( Object value );

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}
