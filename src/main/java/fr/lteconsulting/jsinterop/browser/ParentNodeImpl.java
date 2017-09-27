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
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ParentNode")
public class ParentNodeImpl implements ParentNode
{

    /*
        Properties
    */

    public Number childElementCount;

    @JsProperty( name = "childElementCount")
    public native Number getChildElementCount();

    @JsProperty( name = "childElementCount")
    public native void setChildElementCount( Number value );

    public HTMLCollection children;

    @JsProperty( name = "children")
    public native HTMLCollection getChildren();

    @JsProperty( name = "children")
    public native void setChildren( HTMLCollection value );

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
}
