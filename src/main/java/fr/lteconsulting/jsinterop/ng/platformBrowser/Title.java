package fr.lteconsulting.jsinterop.ng.platformBrowser;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/title".Title
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/title.d.ts:0
  * 1 constructors
  * A service that can be used to get and set the title of a current HTML document.
  * 
  * Since an Angular application can't be bootstrapped on the entire HTML document (`<html>` tag)
  * it is not possible to bind to the `text` property of the `HTMLTitleElement` elements
  * (representing the `<title>` tag). Instead, this service can be used to set and get the current
  * title value.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="Title")
public class Title
{

    /*
        Constructors
    */
    public Title(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(getTitle,1,,)
      * TE Signature : S(getTitle,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/title.d.ts@584
      * Get the title of the current HTML document.
     */
    public native String getTitle();
    /** 
      * Std Signature : S(setTitle,429,,P(d1))
      * TE Signature : S(setTitle,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/title.d.ts@698
      * Set the title of the current HTML document.
     */
    public native void setTitle(String newTitle);
}
