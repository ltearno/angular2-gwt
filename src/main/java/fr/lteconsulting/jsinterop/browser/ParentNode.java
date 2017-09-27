package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ParentNode
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:743288
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ParentNode
{

    /*
        Properties
    */

    @JsProperty( name = "childElementCount")
    Number getChildElementCount();

    @JsProperty( name = "childElementCount")
    void setChildElementCount( Number value );

    @JsProperty( name = "children")
    HTMLCollection getChildren();

    @JsProperty( name = "children")
    void setChildren( HTMLCollection value );

    @JsProperty( name = "firstElementChild")
    Element getFirstElementChild();

    @JsProperty( name = "firstElementChild")
    void setFirstElementChild( Element value );

    @JsProperty( name = "lastElementChild")
    Element getLastElementChild();

    @JsProperty( name = "lastElementChild")
    void setLastElementChild( Element value );
}
