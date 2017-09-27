package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: CSSNamespaceRule
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295077
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:295202
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSNamespaceRule")
public class CSSNamespaceRule extends CSSRule
{

    /*
        Constructors
    */
    public CSSNamespaceRule(){
    }

    /*
        Properties
    */

    public String namespaceURI;

    @JsProperty( name = "namespaceURI")
    public native String getNamespaceURI();

    @JsProperty( name = "namespaceURI")
    public native void setNamespaceURI( String value );

    public String prefix;

    @JsProperty( name = "prefix")
    public native String getPrefix();

    @JsProperty( name = "prefix")
    public native void setPrefix( String value );
}
