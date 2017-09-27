package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: TreeWalker
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:659714
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:660086
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TreeWalker")
public class TreeWalker
{

    /*
        Constructors
    */
    public TreeWalker(){
    }

    /*
        Properties
    */

    public Node currentNode;

    @JsProperty( name = "currentNode")
    public native Node getCurrentNode();

    @JsProperty( name = "currentNode")
    public native void setCurrentNode( Node value );

    public Boolean expandEntityReferences;

    @JsProperty( name = "expandEntityReferences")
    public native Boolean getExpandEntityReferences();

    @JsProperty( name = "expandEntityReferences")
    public native void setExpandEntityReferences( Boolean value );

    public NodeFilter filter;

    @JsProperty( name = "filter")
    public native NodeFilter getFilter();

    @JsProperty( name = "filter")
    public native void setFilter( NodeFilter value );

    public Node root;

    @JsProperty( name = "root")
    public native Node getRoot();

    @JsProperty( name = "root")
    public native void setRoot( Node value );

    public Number whatToShow;

    @JsProperty( name = "whatToShow")
    public native Number getWhatToShow();

    @JsProperty( name = "whatToShow")
    public native void setWhatToShow( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(firstChild,86,,)
      * TE Signature : S(firstChild,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659903
     */
    public native Node firstChild();
    /** 
      * Std Signature : S(lastChild,86,,)
      * TE Signature : S(lastChild,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659927
     */
    public native Node lastChild();
    /** 
      * Std Signature : S(nextNode,86,,)
      * TE Signature : S(nextNode,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659950
     */
    public native Node nextNode();
    /** 
      * Std Signature : S(nextSibling,86,,)
      * TE Signature : S(nextSibling,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659972
     */
    public native Node nextSibling();
    /** 
      * Std Signature : S(parentNode,86,,)
      * TE Signature : S(parentNode,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@659997
     */
    public native Node parentNode();
    /** 
      * Std Signature : S(previousNode,86,,)
      * TE Signature : S(previousNode,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@660021
     */
    public native Node previousNode();
    /** 
      * Std Signature : S(previousSibling,86,,)
      * TE Signature : S(previousSibling,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@660047
     */
    public native Node previousSibling();
}
