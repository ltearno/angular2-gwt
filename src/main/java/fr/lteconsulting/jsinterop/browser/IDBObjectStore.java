package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBObjectStore
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:493171
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:493953
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBObjectStore")
public class IDBObjectStore
{

    /*
        Constructors
    */
    public IDBObjectStore(){
    }

    /*
        Properties
    */

    public Boolean autoIncrement;

    @JsProperty( name = "autoIncrement")
    public native Boolean getAutoIncrement();

    @JsProperty( name = "autoIncrement")
    public native void setAutoIncrement( Boolean value );

    public DOMStringList indexNames;

    @JsProperty( name = "indexNames")
    public native DOMStringList getIndexNames();

    @JsProperty( name = "indexNames")
    public native void setIndexNames( DOMStringList value );

    public UnionOfArrayOfStringAndString keyPath;

    @JsProperty( name = "keyPath")
    public native UnionOfArrayOfStringAndString getKeyPath();

    @JsProperty( name = "keyPath")
    public native void setKeyPath( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setKeyPath( Array<String> value ) { setKeyPath(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setKeyPath( String value ) { setKeyPath(UnionOfArrayOfStringAndString.ofString( value )); }

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public IDBTransaction transaction;

    @JsProperty( name = "transaction")
    public native IDBTransaction getTransaction();

    @JsProperty( name = "transaction")
    public native void setTransaction( IDBTransaction value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(add,466,,P(d3))
      * TE Signature : S(add,P(d3))
      * 
     */
    public native IDBRequest add(Object value);
    /** 
      * Std Signature : S(add,466,,P(d3),P(d1))
      * TE Signature : S(add,P(d3),P(d1))
      * 
     */
    public native IDBRequest add(Object value, String key /* optional */);
    /** 
      * Std Signature : S(add,466,,P(d3),P(d13))
      * TE Signature : S(add,P(d3),P(d13))
      * 
     */
    public native IDBRequest add(Object value, Date key /* optional */);
    /** 
      * Std Signature : S(add,466,,P(d3),P(d141))
      * TE Signature : S(add,P(d3),P(d141))
      * 
     */
    public native IDBRequest add(Object value, IDBArrayKey key /* optional */);
    /** 
      * Std Signature : S(add,466,,P(d3),P(d142))
      * TE Signature : S(add,P(d3),P(d142))
      * 
     */
    public native IDBRequest add(Object value, IDBKeyRange key /* optional */);
    /** 
      * Std Signature : S(add,466,,P(d3),P(d2))
      * TE Signature : S(add,P(d3),P(d2))
      * 
     */
    public native IDBRequest add(Object value, Number key /* optional */);
    /** 
      * Std Signature : S(add,466,,P(d3),P(dU(-13,141,142,2,1)))
      * TE Signature : S(add,P(d3),P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493373
     */
    public native IDBRequest add(Object value, UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * Std Signature : S(clear,466,,)
      * TE Signature : S(clear,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493439
     */
    public native IDBRequest clear();
    /** 
      * Std Signature : S(count,466,,)
      * TE Signature : S(count,)
      * 
     */
    public native IDBRequest count();
    /** 
      * Std Signature : S(count,466,,P(d1))
      * TE Signature : S(count,P(d1))
      * 
     */
    public native IDBRequest count(String key /* optional */);
    /** 
      * Std Signature : S(count,466,,P(d13))
      * TE Signature : S(count,P(d13))
      * 
     */
    public native IDBRequest count(Date key /* optional */);
    /** 
      * Std Signature : S(count,466,,P(d141))
      * TE Signature : S(count,P(d141))
      * 
     */
    public native IDBRequest count(IDBArrayKey key /* optional */);
    /** 
      * Std Signature : S(count,466,,P(d142))
      * TE Signature : S(count,P(d142))
      * 
     */
    public native IDBRequest count(IDBKeyRange key /* optional */);
    /** 
      * Std Signature : S(count,466,,P(d2))
      * TE Signature : S(count,P(d2))
      * 
     */
    public native IDBRequest count(Number key /* optional */);
    /** 
      * Std Signature : S(count,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(count,P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493464
     */
    public native IDBRequest count(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(d1))
      * TE Signature : S(createIndex,P(d1),P(d1))
      * 
     */
    public native IDBIndex createIndex(String name, String keyPath);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(d1),P(d143))
      * TE Signature : S(createIndex,P(d1),P(d1),P(d143))
      * 
     */
    public native IDBIndex createIndex(String name, String keyPath, IDBIndexParameters optionalParameters /* optional */);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(d7<1>))
      * TE Signature : S(createIndex,P(d1),P(d7))
      * 
     */
    public native IDBIndex createIndex(String name, Array<String> keyPath);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(d7<1>),P(d143))
      * TE Signature : S(createIndex,P(d1),P(d7),P(d143))
      * 
     */
    public native IDBIndex createIndex(String name, Array<String> keyPath, IDBIndexParameters optionalParameters /* optional */);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(dU(-7<1>,4)))
      * TE Signature : S(createIndex,P(d1),P(dU(-7,1)))
      * 
     */
    public native IDBIndex createIndex(String name, UnionOfArrayOfStringAndString keyPath);
    /** 
      * Std Signature : S(createIndex,354,,P(d1),P(dU(-7<1>,4)),P(d143))
      * TE Signature : S(createIndex,P(d1),P(dU(-7,1)),P(d143))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493520
     */
    public native IDBIndex createIndex(String name, UnionOfArrayOfStringAndString keyPath, IDBIndexParameters optionalParameters /* optional */);
    /** 
      * Std Signature : S(delete,466,,P(d1))
      * TE Signature : S(delete,P(d1))
      * 
     */
    public native IDBRequest delete(String key);
    /** 
      * Std Signature : S(delete,466,,P(d13))
      * TE Signature : S(delete,P(d13))
      * 
     */
    public native IDBRequest delete(Date key);
    /** 
      * Std Signature : S(delete,466,,P(d141))
      * TE Signature : S(delete,P(d141))
      * 
     */
    public native IDBRequest delete(IDBArrayKey key);
    /** 
      * Std Signature : S(delete,466,,P(d142))
      * TE Signature : S(delete,P(d142))
      * 
     */
    public native IDBRequest delete(IDBKeyRange key);
    /** 
      * Std Signature : S(delete,466,,P(d2))
      * TE Signature : S(delete,P(d2))
      * 
     */
    public native IDBRequest delete(Number key);
    /** 
      * Std Signature : S(delete,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(delete,P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493630
     */
    public native IDBRequest delete(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
    /** 
      * Std Signature : S(deleteIndex,289,,P(d1))
      * TE Signature : S(deleteIndex,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493686
     */
    public native void deleteIndex(String indexName);
    /** 
      * Std Signature : S(get,466,,P(d3))
      * TE Signature : S(get,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493728
     */
    public native IDBRequest get(Object key);
    /** 
      * Std Signature : S(index,354,,P(d1))
      * TE Signature : S(index,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493759
     */
    public native IDBIndex index(String name);
    /** 
      * Std Signature : S(openCursor,466,,)
      * TE Signature : S(openCursor,)
      * 
     */
    public native IDBRequest openCursor();
    /** 
      * Std Signature : S(openCursor,466,,P(d1))
      * TE Signature : S(openCursor,P(d1))
      * 
     */
    public native IDBRequest openCursor(String range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d1),P(d1))
      * TE Signature : S(openCursor,P(d1),P(d1))
      * 
     */
    public native IDBRequest openCursor(String range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d13))
      * TE Signature : S(openCursor,P(d13))
      * 
     */
    public native IDBRequest openCursor(Date range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d13),P(d1))
      * TE Signature : S(openCursor,P(d13),P(d1))
      * 
     */
    public native IDBRequest openCursor(Date range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d141))
      * TE Signature : S(openCursor,P(d141))
      * 
     */
    public native IDBRequest openCursor(IDBArrayKey range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d141),P(d1))
      * TE Signature : S(openCursor,P(d141),P(d1))
      * 
     */
    public native IDBRequest openCursor(IDBArrayKey range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d142))
      * TE Signature : S(openCursor,P(d142))
      * 
     */
    public native IDBRequest openCursor(IDBKeyRange range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d142),P(d1))
      * TE Signature : S(openCursor,P(d142),P(d1))
      * 
     */
    public native IDBRequest openCursor(IDBKeyRange range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d2))
      * TE Signature : S(openCursor,P(d2))
      * 
     */
    public native IDBRequest openCursor(Number range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(d2),P(d1))
      * TE Signature : S(openCursor,P(d2),P(d1))
      * 
     */
    public native IDBRequest openCursor(Number range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(openCursor,P(dU(-13,141,142,2,1)))
      * 
     */
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */);
    /** 
      * Std Signature : S(openCursor,466,,P(dU(-13,141,142,2,1)),P(d1))
      * TE Signature : S(openCursor,P(dU(-13,141,142,2,1)),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493794
     */
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3))
      * TE Signature : S(put,P(d3))
      * 
     */
    public native IDBRequest put(Object value);
    /** 
      * Std Signature : S(put,466,,P(d3),P(d1))
      * TE Signature : S(put,P(d3),P(d1))
      * 
     */
    public native IDBRequest put(Object value, String key /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3),P(d13))
      * TE Signature : S(put,P(d3),P(d13))
      * 
     */
    public native IDBRequest put(Object value, Date key /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3),P(d141))
      * TE Signature : S(put,P(d3),P(d141))
      * 
     */
    public native IDBRequest put(Object value, IDBArrayKey key /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3),P(d142))
      * TE Signature : S(put,P(d3),P(d142))
      * 
     */
    public native IDBRequest put(Object value, IDBKeyRange key /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3),P(d2))
      * TE Signature : S(put,P(d3),P(d2))
      * 
     */
    public native IDBRequest put(Object value, Number key /* optional */);
    /** 
      * Std Signature : S(put,466,,P(d3),P(dU(-13,141,142,2,1)))
      * TE Signature : S(put,P(d3),P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@493877
     */
    public native IDBRequest put(Object value, UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
}
