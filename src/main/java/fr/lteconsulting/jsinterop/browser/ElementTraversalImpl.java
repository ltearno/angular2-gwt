package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ElementTraversal
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:729271
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ElementTraversal")
public class ElementTraversalImpl implements ElementTraversal
{

    /*
        Properties
    */

    public Number childElementCount;

    @JsProperty( name = "childElementCount")
    public native Number getChildElementCount();

    @JsProperty( name = "childElementCount")
    public native void setChildElementCount( Number value );

    public Element firstElementChild;

    @JsProperty( name = "firstElementChild")
    public native Element getFirstElementChild();

    @JsProperty( name = "firstElementChild")
    public native void setFirstElementChild( Element value );

    public Element lastElementChild;

    @JsProperty( name = "lastElementChild")
    public native Element getLastElementChild();

    @JsProperty( name = "lastElementChild")
    public native void setLastElementChild( Element value );

    public Element nextElementSibling;

    @JsProperty( name = "nextElementSibling")
    public native Element getNextElementSibling();

    @JsProperty( name = "nextElementSibling")
    public native void setNextElementSibling( Element value );

    public Element previousElementSibling;

    @JsProperty( name = "previousElementSibling")
    public native Element getPreviousElementSibling();

    @JsProperty( name = "previousElementSibling")
    public native void setPreviousElementSibling( Element value );
}
