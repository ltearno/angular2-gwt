package fr.lteconsulting.jsinterop.ng.router;

import fr.lteconsulting.jsinterop.browser.AnonymousType1431;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree".UrlSegmentGroup
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts:1726
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.router", name="UrlSegmentGroup")
public class UrlSegmentGroup
{

    /*
        Constructors
    */
    public UrlSegmentGroup(Array<UrlSegment> segments, AnonymousType1431 children){
    }

    /*
        Properties
    */

    /** 
      * The list of children of this group 
     */
    public AnonymousType1431 children;

    @JsProperty( name = "children")
    public native AnonymousType1431 getChildren();

    @JsProperty( name = "children")
    public native void setChildren( AnonymousType1431 value );

    /** 
      * Number of child segments 
     */
    public Number numberOfChildren;

    @JsProperty( name = "numberOfChildren")
    public native Number getNumberOfChildren();

    @JsProperty( name = "numberOfChildren")
    public native void setNumberOfChildren( Number value );

    /** 
      * The parent node in the url tree 
     */
    public UrlSegmentGroup parent;

    @JsProperty( name = "parent")
    public native UrlSegmentGroup getParent();

    @JsProperty( name = "parent")
    public native void setParent( UrlSegmentGroup value );

    /** 
      * The URL segments of this group. See {@link UrlSegment} for more information 
     */
    public Array<UrlSegment> segments;

    @JsProperty( name = "segments")
    public native Array<UrlSegment> getSegments();

    @JsProperty( name = "segments")
    public native void setSegments( Array<UrlSegment> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(hasChildren,27,,)
      * TE Signature : S(hasChildren,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/router/src/url_tree.d.ts@2508
      * Whether the segment has child segments 
     */
    public native Boolean hasChildren();
}
