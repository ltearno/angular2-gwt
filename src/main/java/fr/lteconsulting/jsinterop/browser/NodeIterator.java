package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: NodeIterator
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535137
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:535383
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NodeIterator")
public class NodeIterator
{

    /*
        Constructors
    */
    public NodeIterator(){
    }

    /*
        Properties
    */

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
      * Std Signature : S(detach,289,,)
      * TE Signature : S(detach,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@535305
     */
    public native void detach();
    /** 
      * Std Signature : S(nextNode,86,,)
      * TE Signature : S(nextNode,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@535325
     */
    public native Node nextNode();
    /** 
      * Std Signature : S(previousNode,86,,)
      * TE Signature : S(previousNode,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@535347
     */
    public native Node previousNode();
}
