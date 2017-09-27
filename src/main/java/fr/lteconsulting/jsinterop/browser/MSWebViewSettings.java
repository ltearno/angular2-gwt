package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSWebViewSettings
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:516043
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:516156
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSWebViewSettings")
public class MSWebViewSettings
{

    /*
        Constructors
    */
    public MSWebViewSettings(){
    }

    /*
        Properties
    */

    public Boolean isIndexedDBEnabled;

    @JsProperty( name = "isIndexedDBEnabled")
    public native Boolean getIsIndexedDBEnabled();

    @JsProperty( name = "isIndexedDBEnabled")
    public native void setIsIndexedDBEnabled( Boolean value );

    public Boolean isJavaScriptEnabled;

    @JsProperty( name = "isJavaScriptEnabled")
    public native Boolean getIsJavaScriptEnabled();

    @JsProperty( name = "isJavaScriptEnabled")
    public native void setIsJavaScriptEnabled( Boolean value );
}
