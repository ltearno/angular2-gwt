package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MutationObserverInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:271245
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationObserverInit")
public class MutationObserverInit
{

    /*
        Properties
    */

    public Array<String> attributeFilter;

    @JsProperty( name = "attributeFilter")
    public native Array<String> getAttributeFilter();

    @JsProperty( name = "attributeFilter")
    public native void setAttributeFilter( Array<String> value );

    public Boolean attributeOldValue;

    @JsProperty( name = "attributeOldValue")
    public native Boolean getAttributeOldValue();

    @JsProperty( name = "attributeOldValue")
    public native void setAttributeOldValue( Boolean value );

    public Boolean attributes;

    @JsProperty( name = "attributes")
    public native Boolean getAttributes();

    @JsProperty( name = "attributes")
    public native void setAttributes( Boolean value );

    public Boolean characterData;

    @JsProperty( name = "characterData")
    public native Boolean getCharacterData();

    @JsProperty( name = "characterData")
    public native void setCharacterData( Boolean value );

    public Boolean characterDataOldValue;

    @JsProperty( name = "characterDataOldValue")
    public native Boolean getCharacterDataOldValue();

    @JsProperty( name = "characterDataOldValue")
    public native void setCharacterDataOldValue( Boolean value );

    public Boolean childList;

    @JsProperty( name = "childList")
    public native Boolean getChildList();

    @JsProperty( name = "childList")
    public native void setChildList( Boolean value );

    public Boolean subtree;

    @JsProperty( name = "subtree")
    public native Boolean getSubtree();

    @JsProperty( name = "subtree")
    public native void setSubtree( Boolean value );
}
