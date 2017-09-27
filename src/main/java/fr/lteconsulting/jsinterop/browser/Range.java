package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Range
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:566076
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:567346
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Range")
public class Range
{

    /*
        Constructors
    */
    public Range(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="Range", name="END_TO_END")
    public static Number END_TO_END;

    @JsProperty(namespace="Range", name="END_TO_START")
    public static Number END_TO_START;

    @JsProperty(namespace="Range", name="START_TO_END")
    public static Number START_TO_END;

    @JsProperty(namespace="Range", name="START_TO_START")
    public static Number START_TO_START;

    /*
        Properties
    */

    public Boolean collapsed;

    @JsProperty( name = "collapsed")
    public native Boolean getCollapsed();

    @JsProperty( name = "collapsed")
    public native void setCollapsed( Boolean value );

    public Node commonAncestorContainer;

    @JsProperty( name = "commonAncestorContainer")
    public native Node getCommonAncestorContainer();

    @JsProperty( name = "commonAncestorContainer")
    public native void setCommonAncestorContainer( Node value );

    public Node endContainer;

    @JsProperty( name = "endContainer")
    public native Node getEndContainer();

    @JsProperty( name = "endContainer")
    public native void setEndContainer( Node value );

    public Number endOffset;

    @JsProperty( name = "endOffset")
    public native Number getEndOffset();

    @JsProperty( name = "endOffset")
    public native void setEndOffset( Number value );

    public Node startContainer;

    @JsProperty( name = "startContainer")
    public native Node getStartContainer();

    @JsProperty( name = "startContainer")
    public native void setStartContainer( Node value );

    public Number startOffset;

    @JsProperty( name = "startOffset")
    public native Number getStartOffset();

    @JsProperty( name = "startOffset")
    public native void setStartOffset( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(cloneContents,389,,)
      * TE Signature : S(cloneContents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566311
     */
    public native DocumentFragment cloneContents();
    /** 
      * Std Signature : S(cloneRange,106,,)
      * TE Signature : S(cloneRange,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566350
     */
    public native Range cloneRange();
    /** 
      * Std Signature : S(collapse,289,,P(d27))
      * TE Signature : S(collapse,P(d27))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566375
     */
    public native void collapse(Boolean toStart);
    /** 
      * Std Signature : S(compareBoundaryPoints,2,,P(d2),P(d106))
      * TE Signature : S(compareBoundaryPoints,P(d2),P(d106))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566413
     */
    public native Number compareBoundaryPoints(Number how, Range sourceRange);
    /** 
      * Std Signature : S(createContextualFragment,389,,P(d1))
      * TE Signature : S(createContextualFragment,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566481
     */
    public native DocumentFragment createContextualFragment(String fragment);
    /** 
      * Std Signature : S(deleteContents,289,,)
      * TE Signature : S(deleteContents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566547
     */
    public native void deleteContents();
    /** 
      * Std Signature : S(detach,289,,)
      * TE Signature : S(detach,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566575
     */
    public native void detach();
    /** 
      * Std Signature : S(expand,27,,P(d1))
      * TE Signature : S(expand,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566595
     */
    public native Boolean expand(String Unit);
    /** 
      * Std Signature : S(extractContents,389,,)
      * TE Signature : S(extractContents,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566630
     */
    public native DocumentFragment extractContents();
    /** 
      * Std Signature : S(getBoundingClientRect,375,,)
      * TE Signature : S(getBoundingClientRect,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566671
     */
    public native ClientRect getBoundingClientRect();
    /** 
      * Std Signature : S(getClientRects,376,,)
      * TE Signature : S(getClientRects,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566712
     */
    public native ClientRectList getClientRects();
    /** 
      * Std Signature : S(insertNode,289,,P(d86))
      * TE Signature : S(insertNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566750
     */
    public native void insertNode(Node newNode);
    /** 
      * Std Signature : S(selectNode,289,,P(d86))
      * TE Signature : S(selectNode,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566787
     */
    public native void selectNode(Node refNode);
    /** 
      * Std Signature : S(selectNodeContents,289,,P(d86))
      * TE Signature : S(selectNodeContents,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566824
     */
    public native void selectNodeContents(Node refNode);
    /** 
      * Std Signature : S(setEnd,289,,P(d86),P(d2))
      * TE Signature : S(setEnd,P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566869
     */
    public native void setEnd(Node refNode, Number offset);
    /** 
      * Std Signature : S(setEndAfter,289,,P(d86))
      * TE Signature : S(setEndAfter,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566918
     */
    public native void setEndAfter(Node refNode);
    /** 
      * Std Signature : S(setEndBefore,289,,P(d86))
      * TE Signature : S(setEndBefore,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566956
     */
    public native void setEndBefore(Node refNode);
    /** 
      * Std Signature : S(setStart,289,,P(d86),P(d2))
      * TE Signature : S(setStart,P(d86),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@566995
     */
    public native void setStart(Node refNode, Number offset);
    /** 
      * Std Signature : S(setStartAfter,289,,P(d86))
      * TE Signature : S(setStartAfter,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567046
     */
    public native void setStartAfter(Node refNode);
    /** 
      * Std Signature : S(setStartBefore,289,,P(d86))
      * TE Signature : S(setStartBefore,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567086
     */
    public native void setStartBefore(Node refNode);
    /** 
      * Std Signature : S(surroundContents,289,,P(d86))
      * TE Signature : S(surroundContents,P(d86))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@567127
     */
    public native void surroundContents(Node newParent);
}
