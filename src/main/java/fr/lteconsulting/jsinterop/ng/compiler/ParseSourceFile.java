package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util".ParseSourceFile
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/parse_util.d.ts:448
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="ParseSourceFile")
public class ParseSourceFile
{

    /*
        Constructors
    */
    public ParseSourceFile(String content, String url){
    }

    /*
        Properties
    */

    public String content;

    @JsProperty( name = "content")
    public native String getContent();

    @JsProperty( name = "content")
    public native void setContent( String value );

    public String url;

    @JsProperty( name = "url")
    public native String getUrl();

    @JsProperty( name = "url")
    public native void setUrl( String value );
}
