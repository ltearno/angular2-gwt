package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MutationRecord
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:528648
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:529028
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationRecord")
public class MutationRecord
{

    /*
        Constructors
    */
    public MutationRecord(){
    }

    /*
        Properties
    */

    public NodeList addedNodes;

    @JsProperty( name = "addedNodes")
    public native NodeList getAddedNodes();

    @JsProperty( name = "addedNodes")
    public native void setAddedNodes( NodeList value );

    public String attributeName;

    @JsProperty( name = "attributeName")
    public native String getAttributeName();

    @JsProperty( name = "attributeName")
    public native void setAttributeName( String value );

    public String attributeNamespace;

    @JsProperty( name = "attributeNamespace")
    public native String getAttributeNamespace();

    @JsProperty( name = "attributeNamespace")
    public native void setAttributeNamespace( String value );

    public Node nextSibling;

    @JsProperty( name = "nextSibling")
    public native Node getNextSibling();

    @JsProperty( name = "nextSibling")
    public native void setNextSibling( Node value );

    public String oldValue;

    @JsProperty( name = "oldValue")
    public native String getOldValue();

    @JsProperty( name = "oldValue")
    public native void setOldValue( String value );

    public Node previousSibling;

    @JsProperty( name = "previousSibling")
    public native Node getPreviousSibling();

    @JsProperty( name = "previousSibling")
    public native void setPreviousSibling( Node value );

    public NodeList removedNodes;

    @JsProperty( name = "removedNodes")
    public native NodeList getRemovedNodes();

    @JsProperty( name = "removedNodes")
    public native void setRemovedNodes( NodeList value );

    public Node target;

    @JsProperty( name = "target")
    public native Node getTarget();

    @JsProperty( name = "target")
    public native void setTarget( Node value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
