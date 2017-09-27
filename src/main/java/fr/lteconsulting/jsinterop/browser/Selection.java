package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Selection
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:640149
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:641185
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Selection")
public class Selection
{

    /*
        Constructors
    */
    public Selection(){
    }

    /*
        Properties
    */

    public Node anchorNode;

    @JsProperty( name = "anchorNode")
    public native Node getAnchorNode();

    @JsProperty( name = "anchorNode")
    public native void setAnchorNode( Node value );

    public Number anchorOffset;

    @JsProperty( name = "anchorOffset")
    public native Number getAnchorOffset();

    @JsProperty( name = "anchorOffset")
    public native void setAnchorOffset( Number value );

    public Node baseNode;

    @JsProperty( name = "baseNode")
    public native Node getBaseNode();

    @JsProperty( name = "baseNode")
    public native void setBaseNode( Node value );

    public Number baseOffset;

    @JsProperty( name = "baseOffset")
    public native Number getBaseOffset();

    @JsProperty( name = "baseOffset")
    public native void setBaseOffset( Number value );

    public Node extentNode;

    @JsProperty( name = "extentNode")
    public native Node getExtentNode();

    @JsProperty( name = "extentNode")
    public native void setExtentNode( Node value );

    public Number extentOffset;

    @JsProperty( name = "extentOffset")
    public native Number getExtentOffset();

    @JsProperty( name = "extentOffset")
    public native void setExtentOffset( Number value );

    public Node focusNode;

    @JsProperty( name = "focusNode")
    public native Node getFocusNode();

    @JsProperty( name = "focusNode")
    public native void setFocusNode( Node value );

    public Number focusOffset;

    @JsProperty( name = "focusOffset")
    public native Number getFocusOffset();

    @JsProperty( name = "focusOffset")
    public native void setFocusOffset( Number value );

    public Boolean isCollapsed;

    @JsProperty( name = "isCollapsed")
    public native Boolean getIsCollapsed();

    @JsProperty( name = "isCollapsed")
    public native void setIsCollapsed( Boolean value );

    public Number rangeCount;

    @JsProperty( name = "rangeCount")
    public native Number getRangeCount();

    @JsProperty( name = "rangeCount")
    public native void setRangeCount( Number value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addRange,289,,P(d106))
      * TE Signature : S(addRange,P(d106))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640530
     */
    public native void addRange(Range range);
    /** 
      * Std Signature : S(collapse,289,,P(d86),P(d2))
      * TE Signature : S(collapse,P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640564
     */
    public native void collapse(Node parentNode, Number offset);
    /** 
      * Std Signature : S(collapseToEnd,289,,)
      * TE Signature : S(collapseToEnd,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640618
     */
    public native void collapseToEnd();
    /** 
      * Std Signature : S(collapseToStart,289,,)
      * TE Signature : S(collapseToStart,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640645
     */
    public native void collapseToStart();
    /** 
      * Std Signature : S(containsNode,27,,P(d86),P(d27))
      * TE Signature : S(containsNode,P(d86),P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640674
     */
    public native Boolean containsNode(Node node, Boolean partlyContained);
    /** 
      * Std Signature : S(deleteFromDocument,289,,)
      * TE Signature : S(deleteFromDocument,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640739
     */
    public native void deleteFromDocument();
    /** 
      * Std Signature : S(empty,289,,)
      * TE Signature : S(empty,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640771
     */
    public native void empty();
    /** 
      * Std Signature : S(extend,289,,P(d86),P(d2))
      * TE Signature : S(extend,P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640790
     */
    public native void extend(Node newNode, Number offset);
    /** 
      * Std Signature : S(getRangeAt,106,,P(d2))
      * TE Signature : S(getRangeAt,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640839
     */
    public native Range getRangeAt(Number index);
    /** 
      * Std Signature : S(removeAllRanges,289,,)
      * TE Signature : S(removeAllRanges,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640877
     */
    public native void removeAllRanges();
    /** 
      * Std Signature : S(removeRange,289,,P(d106))
      * TE Signature : S(removeRange,P(d106))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640906
     */
    public native void removeRange(Range range);
    /** 
      * Std Signature : S(selectAllChildren,289,,P(d86))
      * TE Signature : S(selectAllChildren,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640943
     */
    public native void selectAllChildren(Node parentNode);
    /** 
      * Std Signature : S(setBaseAndExtent,289,,P(d86),P(d2),P(d86),P(d2))
      * TE Signature : S(setBaseAndExtent,P(d86),P(d2),P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@640990
     */
    public native void setBaseAndExtent(Node baseNode, Number baseOffset, Node extentNode, Number extentOffset);
    /** 
      * Std Signature : S(setPosition,289,,P(d86),P(d2))
      * TE Signature : S(setPosition,P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@641094
     */
    public native void setPosition(Node parentNode, Number offset);
}
