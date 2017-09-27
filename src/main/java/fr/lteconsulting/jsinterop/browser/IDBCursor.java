package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBCursor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:489935
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:490393
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBCursor")
public class IDBCursor
{

    /*
        Constructors
    */
    public IDBCursor(){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="IDBCursor", name="NEXT")
    public static String NEXT;

    @JsProperty(namespace="IDBCursor", name="NEXT_NO_DUPLICATE")
    public static String NEXT_NO_DUPLICATE;

    @JsProperty(namespace="IDBCursor", name="PREV")
    public static String PREV;

    @JsProperty(namespace="IDBCursor", name="PREV_NO_DUPLICATE")
    public static String PREV_NO_DUPLICATE;

    /*
        Properties
    */

    public String direction;

    @JsProperty( name = "direction")
    public native String getDirection();

    @JsProperty( name = "direction")
    public native void setDirection( String value );

    public UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key;

    @JsProperty( name = "key")
    public native UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString getKey();

    @JsProperty( name = "key")
    public native void setKey( UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString value );

    @JsOverlay
    public final void setKey( Date value ) { setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString.ofDate( value )); }

    @JsOverlay
    public final void setKey( IDBArrayKey value ) { setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString.ofIDBArrayKey( value )); }

    @JsOverlay
    public final void setKey( IDBKeyRange value ) { setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString.ofIDBKeyRange( value )); }

    @JsOverlay
    public final void setKey( Number value ) { setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString.ofNumber( value )); }

    @JsOverlay
    public final void setKey( String value ) { setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString.ofString( value )); }

    public Object primaryKey;

    @JsProperty( name = "primaryKey")
    public native Object getPrimaryKey();

    @JsProperty( name = "primaryKey")
    public native void setPrimaryKey( Object value );

    public UnionOfIDBIndexAndIDBObjectStore source;

    @JsProperty( name = "source")
    public native UnionOfIDBIndexAndIDBObjectStore getSource();

    @JsProperty( name = "source")
    public native void setSource( UnionOfIDBIndexAndIDBObjectStore value );

    @JsOverlay
    public final void setSource( IDBIndex value ) { setSource(UnionOfIDBIndexAndIDBObjectStore.ofIDBIndex( value )); }

    @JsOverlay
    public final void setSource( IDBObjectStore value ) { setSource(UnionOfIDBIndexAndIDBObjectStore.ofIDBObjectStore( value )); }

    /*
        Methods
    */
    /** 
      * Std Signature : S(advance,289,,P(d2))
      * TE Signature : S(advance,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@490100
     */
    public native void advance(Number count);
    /** 
      * Std Signature : S(continue,289,,)
      * TE Signature : S(continue,)
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_();
    /** 
      * Std Signature : S(continue,289,,P(d1))
      * TE Signature : S(continue,P(d1))
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_(String key /* optional */);
    /** 
      * Std Signature : S(continue,289,,P(d13))
      * TE Signature : S(continue,P(d13))
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_(Date key /* optional */);
    /** 
      * Std Signature : S(continue,289,,P(d141))
      * TE Signature : S(continue,P(d141))
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_(IDBArrayKey key /* optional */);
    /** 
      * Std Signature : S(continue,289,,P(d142))
      * TE Signature : S(continue,P(d142))
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_(IDBKeyRange key /* optional */);
    /** 
      * Std Signature : S(continue,289,,P(d2))
      * TE Signature : S(continue,P(d2))
      * 
     */
    @JsMethod(name = "continue")
    public native void continue_(Number key /* optional */);
    /** 
      * Std Signature : S(continue,289,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(continue,P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@490134
     */
    @JsMethod(name = "continue")
    public native void continue_(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * Std Signature : S(delete,466,,)
      * TE Signature : S(delete,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@490187
     */
    public native IDBRequest delete();
    /** 
      * Std Signature : S(update,466,,P(d3))
      * TE Signature : S(update,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@490213
     */
    public native IDBRequest update(Object value);
}
