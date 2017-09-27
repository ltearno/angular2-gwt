package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CacheQueryOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:255912
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CacheQueryOptions")
public class CacheQueryOptions
{

    /*
        Properties
    */

    public String cacheName;

    @JsProperty( name = "cacheName")
    public native String getCacheName();

    @JsProperty( name = "cacheName")
    public native void setCacheName( String value );

    public Boolean ignoreMethod;

    @JsProperty( name = "ignoreMethod")
    public native Boolean getIgnoreMethod();

    @JsProperty( name = "ignoreMethod")
    public native void setIgnoreMethod( Boolean value );

    public Boolean ignoreSearch;

    @JsProperty( name = "ignoreSearch")
    public native Boolean getIgnoreSearch();

    @JsProperty( name = "ignoreSearch")
    public native void setIgnoreSearch( Boolean value );

    public Boolean ignoreVary;

    @JsProperty( name = "ignoreVary")
    public native Boolean getIgnoreVary();

    @JsProperty( name = "ignoreVary")
    public native void setIgnoreVary( Boolean value );
}
