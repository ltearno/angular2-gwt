package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di".Attribute
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di.d.ts:2753
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/di.d.ts:2950
  * 1 constructors
  * Type of the Attribute metadata.
  * Attribute decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Attribute")
public class Attribute
{

    /*
        Constructors
    */
    public Attribute(String name){
    }

    /*
        Properties
    */

    public String attributeName;

    @JsProperty( name = "attributeName")
    public native String getAttributeName();

    @JsProperty( name = "attributeName")
    public native void setAttributeName( String value );
}
