package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: XMLHttpRequestEventMap
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:717048
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLHttpRequestEventMap")
public class XMLHttpRequestEventMap extends XMLHttpRequestEventTargetEventMap
{

    /*
        Properties
    */

    public Event readystatechange;

    @JsProperty( name = "readystatechange")
    public native Event getReadystatechange();

    @JsProperty( name = "readystatechange")
    public native void setReadystatechange( Event value );
}
