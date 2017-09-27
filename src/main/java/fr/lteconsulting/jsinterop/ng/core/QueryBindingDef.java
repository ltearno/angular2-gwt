package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".QueryBindingDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:8318
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="QueryBindingDef")
public class QueryBindingDef
{

    /*
        Properties
    */

    public QueryBindingType bindingType;

    @JsProperty( name = "bindingType")
    public native QueryBindingType getBindingType();

    @JsProperty( name = "bindingType")
    public native void setBindingType( QueryBindingType value );

    public String propName;

    @JsProperty( name = "propName")
    public native String getPropName();

    @JsProperty( name = "propName")
    public native void setPropName( String value );
}
