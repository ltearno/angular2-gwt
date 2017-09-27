package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType772;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node".DebugElement
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts:991
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="DebugElement")
public class DebugElement extends DebugNode
{

    /*
        Constructors
    */
    public DebugElement(Object nativeNode, Object parent, DebugContext _debugContext){
        super(null, null, null);
    }

    /*
        Properties
    */

    public AnonymousType817 attributes;

    @JsProperty( name = "attributes")
    public native AnonymousType817 getAttributes();

    @JsProperty( name = "attributes")
    public native void setAttributes( AnonymousType817 value );

    public Array<DebugNode> childNodes;

    @JsProperty( name = "childNodes")
    public native Array<DebugNode> getChildNodes();

    @JsProperty( name = "childNodes")
    public native void setChildNodes( Array<DebugNode> value );

    public Array<DebugElement> children;

    @JsProperty( name = "children")
    public native Array<DebugElement> getChildren();

    @JsProperty( name = "children")
    public native void setChildren( Array<DebugElement> value );

    public AnonymousType772 classes;

    @JsProperty( name = "classes")
    public native AnonymousType772 getClasses();

    @JsProperty( name = "classes")
    public native void setClasses( AnonymousType772 value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public Object nativeElement;

    @JsProperty( name = "nativeElement")
    public native Object getNativeElement();

    @JsProperty( name = "nativeElement")
    public native void setNativeElement( Object value );

    public AnonymousType717 properties;

    @JsProperty( name = "properties")
    public native AnonymousType717 getProperties();

    @JsProperty( name = "properties")
    public native void setProperties( AnonymousType717 value );

    public AnonymousType817 styles;

    @JsProperty( name = "styles")
    public native AnonymousType817 getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( AnonymousType817 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addChild,429,,P(d413))
      * TE Signature : S(addChild,P(d413))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1498
     */
    public native void addChild(DebugNode child);
    /** 
      * Std Signature : S(insertBefore,429,,P(d413),P(d413))
      * TE Signature : S(insertBefore,P(d413),P(d413))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1652
     */
    public native void insertBefore(DebugNode refChild, DebugNode newChild);
    /** 
      * Std Signature : S(insertChildrenAfter,429,,P(d413),P(d7<413>))
      * TE Signature : S(insertChildrenAfter,P(d413),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1577
     */
    public native void insertChildrenAfter(DebugNode child, Array<DebugNode> newChildren);
    /** 
      * Std Signature : S(query,813,,P(dFT--S(?,27,,P(dT-))------)<813>))
      * TE Signature : S(query,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1718
     */
    public native DebugElement query(Predicate<DebugElement> predicate);
    /** 
      * Std Signature : S(queryAll,7<813>,,P(dFT--S(?,27,,P(dT-))------)<813>))
      * TE Signature : S(queryAll,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1779
     */
    public native Array<DebugElement> queryAll(Predicate<DebugElement> predicate);
    /** 
      * Std Signature : S(queryAllNodes,7<413>,,P(dFT--S(?,27,,P(dT-))------)<413>))
      * TE Signature : S(queryAllNodes,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1845
     */
    public native Array<DebugNode> queryAllNodes(Predicate<DebugNode> predicate);
    /** 
      * Std Signature : S(removeChild,429,,P(d413))
      * TE Signature : S(removeChild,P(d413))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1536
     */
    public native void removeChild(DebugNode child);
    /** 
      * Std Signature : S(triggerEventHandler,429,,P(d1),P(d3))
      * TE Signature : S(triggerEventHandler,P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/debug/debug_node.d.ts@1949
     */
    public native void triggerEventHandler(String eventName, Object eventObj);
}
