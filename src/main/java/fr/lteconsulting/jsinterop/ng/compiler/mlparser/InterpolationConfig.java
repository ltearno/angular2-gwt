package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.Tuple;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/interpolation_config".InterpolationConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/interpolation_config.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="InterpolationConfig")
public class InterpolationConfig
{

    /*
        Constructors
    */
    public InterpolationConfig(String start, String end){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/interpolation_config.d.ts:83
     */
    @JsMethod(namespace="ng.compiler.mlparser.InterpolationConfig", name = "fromArray")
    public static native InterpolationConfig fromArray(Tuple<String, String> markers);

    /*
        Properties
    */

    public String end;

    @JsProperty( name = "end")
    public native String getEnd();

    @JsProperty( name = "end")
    public native void setEnd( String value );

    public String start;

    @JsProperty( name = "start")
    public native String getStart();

    @JsProperty( name = "start")
    public native void setStart( String value );
}
