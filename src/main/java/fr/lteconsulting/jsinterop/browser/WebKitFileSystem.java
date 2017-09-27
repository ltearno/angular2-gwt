package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitFileSystem
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701876
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701989
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitFileSystem")
public class WebKitFileSystem
{

    /*
        Constructors
    */
    public WebKitFileSystem(){
    }

    /*
        Properties
    */

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public WebKitDirectoryEntry root;

    @JsProperty( name = "root")
    public native WebKitDirectoryEntry getRoot();

    @JsProperty( name = "root")
    public native void setRoot( WebKitDirectoryEntry value );
}
