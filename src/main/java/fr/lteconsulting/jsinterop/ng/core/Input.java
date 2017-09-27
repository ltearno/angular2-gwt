package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".Input
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:27735
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:28021
  * 1 constructors
  * Type of the Input metadata.
  * Input decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Input")
public class Input
{

    /*
        Constructors
    */
    public Input(String bindingPropertyName){
    }

    /*
        Properties
    */

    /** 
      * Name used when instantiating a component in the template.
     */
    public String bindingPropertyName;

    @JsProperty( name = "bindingPropertyName")
    public native String getBindingPropertyName();

    @JsProperty( name = "bindingPropertyName")
    public native void setBindingPropertyName( String value );
}
