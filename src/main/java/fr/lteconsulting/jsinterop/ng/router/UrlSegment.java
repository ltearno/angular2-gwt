package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree".UrlSegment
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts:2660
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="UrlSegment")
public class UrlSegment
{

    /*
        Constructors
    */
    public UrlSegment(String path, AnonymousType817 parameters){
    }

    /*
        Properties
    */

    public ParamMap parameterMap;

    @JsProperty( name = "parameterMap")
    public native ParamMap getParameterMap();

    @JsProperty( name = "parameterMap")
    public native void setParameterMap( ParamMap value );

    /** 
      * The matrix parameters associated with a segment 
     */
    public AnonymousType817 parameters;

    @JsProperty( name = "parameters")
    public native AnonymousType817 getParameters();

    @JsProperty( name = "parameters")
    public native void setParameters( AnonymousType817 value );

    /** 
      * The path part of a URL segment 
     */
    public String path;

    @JsProperty( name = "path")
    public native String getPath();

    @JsProperty( name = "path")
    public native void setPath( String value );
}
