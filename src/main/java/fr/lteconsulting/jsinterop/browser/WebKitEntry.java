package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: WebKitEntry
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701366
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:701572
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitEntry")
public class WebKitEntry
{

    /*
        Constructors
    */
    public WebKitEntry(){
    }

    /*
        Properties
    */

    public WebKitFileSystem filesystem;

    @JsProperty( name = "filesystem")
    public native WebKitFileSystem getFilesystem();

    @JsProperty( name = "filesystem")
    public native void setFilesystem( WebKitFileSystem value );

    public String fullPath;

    @JsProperty( name = "fullPath")
    public native String getFullPath();

    @JsProperty( name = "fullPath")
    public native void setFullPath( String value );

    public Boolean isDirectory;

    @JsProperty( name = "isDirectory")
    public native Boolean getIsDirectory();

    @JsProperty( name = "isDirectory")
    public native void setIsDirectory( Boolean value );

    public Boolean isFile;

    @JsProperty( name = "isFile")
    public native Boolean getIsFile();

    @JsProperty( name = "isFile")
    public native void setIsFile( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );
}
