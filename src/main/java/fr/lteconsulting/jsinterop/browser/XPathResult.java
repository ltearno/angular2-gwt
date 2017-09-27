package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: XPathResult
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:720251
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:721035
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XPathResult")
public class XPathResult
{

    /*
        Constructors
    */
    public XPathResult(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="XPathResult", name="ANY_TYPE")
    public static Number ANY_TYPE;

    @JsProperty(namespace="XPathResult", name="ANY_UNORDERED_NODE_TYPE")
    public static Number ANY_UNORDERED_NODE_TYPE;

    @JsProperty(namespace="XPathResult", name="BOOLEAN_TYPE")
    public static Number BOOLEAN_TYPE;

    @JsProperty(namespace="XPathResult", name="FIRST_ORDERED_NODE_TYPE")
    public static Number FIRST_ORDERED_NODE_TYPE;

    @JsProperty(namespace="XPathResult", name="NUMBER_TYPE")
    public static Number NUMBER_TYPE;

    @JsProperty(namespace="XPathResult", name="ORDERED_NODE_ITERATOR_TYPE")
    public static Number ORDERED_NODE_ITERATOR_TYPE;

    @JsProperty(namespace="XPathResult", name="ORDERED_NODE_SNAPSHOT_TYPE")
    public static Number ORDERED_NODE_SNAPSHOT_TYPE;

    @JsProperty(namespace="XPathResult", name="STRING_TYPE")
    public static Number STRING_TYPE;

    @JsProperty(namespace="XPathResult", name="UNORDERED_NODE_ITERATOR_TYPE")
    public static Number UNORDERED_NODE_ITERATOR_TYPE;

    @JsProperty(namespace="XPathResult", name="UNORDERED_NODE_SNAPSHOT_TYPE")
    public static Number UNORDERED_NODE_SNAPSHOT_TYPE;

    /*
        Properties
    */

    public Boolean booleanValue;

    @JsProperty( name = "booleanValue")
    public native Boolean getBooleanValue();

    @JsProperty( name = "booleanValue")
    public native void setBooleanValue( Boolean value );

    public Boolean invalidIteratorState;

    @JsProperty( name = "invalidIteratorState")
    public native Boolean getInvalidIteratorState();

    @JsProperty( name = "invalidIteratorState")
    public native void setInvalidIteratorState( Boolean value );

    public Number numberValue;

    @JsProperty( name = "numberValue")
    public native Number getNumberValue();

    @JsProperty( name = "numberValue")
    public native void setNumberValue( Number value );

    public Number resultType;

    @JsProperty( name = "resultType")
    public native Number getResultType();

    @JsProperty( name = "resultType")
    public native void setResultType( Number value );

    public Node singleNodeValue;

    @JsProperty( name = "singleNodeValue")
    public native Node getSingleNodeValue();

    @JsProperty( name = "singleNodeValue")
    public native void setSingleNodeValue( Node value );

    public Number snapshotLength;

    @JsProperty( name = "snapshotLength")
    public native Number getSnapshotLength();

    @JsProperty( name = "snapshotLength")
    public native void setSnapshotLength( Number value );

    public String stringValue;

    @JsProperty( name = "stringValue")
    public native String getStringValue();

    @JsProperty( name = "stringValue")
    public native void setStringValue( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(iterateNext,86,,)
      * TE Signature : S(iterateNext,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@720535
     */
    public native Node iterateNext();
    /** 
      * Std Signature : S(snapshotItem,86,,P(d2))
      * TE Signature : S(snapshotItem,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@720560
     */
    public native Node snapshotItem(Number index);
}
