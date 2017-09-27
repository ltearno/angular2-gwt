package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileStylesheetMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:5232
  * 1 constructors
  * Metadata about a stylesheet
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileStylesheetMetadata")
public class CompileStylesheetMetadata
{

    /*
        Constructors
    */
    public CompileStylesheetMetadata(Object __0){
    }

    /*
        Properties
    */

    public String moduleUrl;

    @JsProperty( name = "moduleUrl")
    public native String getModuleUrl();

    @JsProperty( name = "moduleUrl")
    public native void setModuleUrl( String value );

    public Array<String> styleUrls;

    @JsProperty( name = "styleUrls")
    public native Array<String> getStyleUrls();

    @JsProperty( name = "styleUrls")
    public native void setStyleUrls( Array<String> value );

    public Array<String> styles;

    @JsProperty( name = "styles")
    public native Array<String> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<String> value );
}
