package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: URL
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660482
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660813
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URL")
public class URL
{

    /*
        Constructors
    */
    public URL(String url, String base){
    }

    /*
        Static methods
    */
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:660887
     */
    @JsMethod(namespace="URL", name = "createObjectURL")
    public static native String createObjectURL(Object object, ObjectURLOptions options /* optional */);
    /** 
      * source : apis/browser-api/tsd/lib.es6.d.ts:660957
     */
    @JsMethod(namespace="URL", name = "revokeObjectURL")
    public static native void revokeObjectURL(String url);

    /*
        Properties
    */

    public String hash;

    @JsProperty( name = "hash")
    public native String getHash();

    @JsProperty( name = "hash")
    public native void setHash( String value );

    public String host;

    @JsProperty( name = "host")
    public native String getHost();

    @JsProperty( name = "host")
    public native void setHost( String value );

    public String hostname;

    @JsProperty( name = "hostname")
    public native String getHostname();

    @JsProperty( name = "hostname")
    public native void setHostname( String value );

    public String href;

    @JsProperty( name = "href")
    public native String getHref();

    @JsProperty( name = "href")
    public native void setHref( String value );

    public String origin;

    @JsProperty( name = "origin")
    public native String getOrigin();

    @JsProperty( name = "origin")
    public native void setOrigin( String value );

    public String password;

    @JsProperty( name = "password")
    public native String getPassword();

    @JsProperty( name = "password")
    public native void setPassword( String value );

    public String pathname;

    @JsProperty( name = "pathname")
    public native String getPathname();

    @JsProperty( name = "pathname")
    public native void setPathname( String value );

    public String port;

    @JsProperty( name = "port")
    public native String getPort();

    @JsProperty( name = "port")
    public native void setPort( String value );

    public String protocol;

    @JsProperty( name = "protocol")
    public native String getProtocol();

    @JsProperty( name = "protocol")
    public native void setProtocol( String value );

    public String search;

    @JsProperty( name = "search")
    public native String getSearch();

    @JsProperty( name = "search")
    public native void setSearch( String value );

    public URLSearchParams searchparams;

    @JsProperty( name = "searchparams")
    public native URLSearchParams getSearchparams();

    @JsProperty( name = "searchparams")
    public native void setSearchparams( URLSearchParams value );

    public String username;

    @JsProperty( name = "username")
    public native String getUsername();

    @JsProperty( name = "username")
    public native void setUsername( String value );
}
