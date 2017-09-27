package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/compiler/src/style_url_resolver".StyleWithImports
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/compiler/src/style_url_resolver.d.ts:248
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="StyleWithImports")
public class StyleWithImports
{

    /*
        Constructors
    */
    public StyleWithImports(String style, Array<String> styleUrls){
    }

    /*
        Properties
    */

    public String style;

    @JsProperty( name = "style")
    public native String getStyle();

    @JsProperty( name = "style")
    public native void setStyle( String value );

    public Array<String> styleUrls;

    @JsProperty( name = "styleUrls")
    public native Array<String> getStyleUrls();

    @JsProperty( name = "styleUrls")
    public native void setStyleUrls( Array<String> value );
}
