package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler".StylesCompileDependency
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts:175
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="StylesCompileDependency")
public class StylesCompileDependency
{

    /*
        Constructors
    */
    public StylesCompileDependency(String name, String moduleUrl, Action1<Object> setValue){
    }

    /*
        Properties
    */

    public String moduleUrl;

    @JsProperty( name = "moduleUrl")
    public native String getModuleUrl();

    @JsProperty( name = "moduleUrl")
    public native void setModuleUrl( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(setValue,429,,P(d3))
      * TE Signature : S(setValue,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/style_compiler.d.ts@278
     */
    public native void setValue(Object value);
}
