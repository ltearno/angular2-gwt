package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Location
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:499856
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:500209
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Location")
public class Location
{

    /*
        Constructors
    */
    public Location(){
    }

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(assign,289,,P(d1))
      * TE Signature : S(assign,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500070
     */
    public native void assign(String url);
    /** 
      * Std Signature : S(reload,289,,)
      * TE Signature : S(reload,)
      * 
     */
    public native void reload();
    /** 
      * Std Signature : S(reload,289,,P(d27))
      * TE Signature : S(reload,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500101
     */
    public native void reload(Boolean forcedReload /* optional */);
    /** 
      * Std Signature : S(replace,289,,P(d1))
      * TE Signature : S(replace,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@500143
     */
    public native void replace(String url);
}
