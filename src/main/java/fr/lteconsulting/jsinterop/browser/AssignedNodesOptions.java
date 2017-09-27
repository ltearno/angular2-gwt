package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: AssignedNodesOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:744103
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AssignedNodesOptions")
public class AssignedNodesOptions
{

    /*
        Properties
    */

    public Boolean flatten;

    @JsProperty( name = "flatten")
    public native Boolean getFlatten();

    @JsProperty( name = "flatten")
    public native void setFlatten( Boolean value );
}
