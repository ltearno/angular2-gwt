package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".Output
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:29477
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:29685
  * 1 constructors
  * Type of the Output metadata.
  * Output decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Output")
public class Output
{

    /*
        Constructors
    */
    public Output(String bindingPropertyName){
    }

    /*
        Properties
    */

    public String bindingPropertyName;

    @JsProperty( name = "bindingPropertyName")
    public native String getBindingPropertyName();

    @JsProperty( name = "bindingPropertyName")
    public native void setBindingPropertyName( String value );
}
