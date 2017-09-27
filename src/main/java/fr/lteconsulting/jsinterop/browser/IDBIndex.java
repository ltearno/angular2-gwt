package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBIndex
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:492120
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:492647
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBIndex")
public class IDBIndex
{

    /*
        Constructors
    */
    public IDBIndex(){
    }

    /*
        Properties
    */

    public UnionOfArrayOfStringAndString keyPath;

    @JsProperty( name = "keyPath")
    public native UnionOfArrayOfStringAndString getKeyPath();

    @JsProperty( name = "keyPath")
    public native void setKeyPath( UnionOfArrayOfStringAndString value );

    @JsOverlay
    public final void setKeyPath( Array<String> value ) { setKeyPath(UnionOfArrayOfStringAndString.ofArrayOfString( value )); }

    @JsOverlay
    public final void setKeyPath( String value ) { setKeyPath(UnionOfArrayOfStringAndString.ofString( value )); }

    public Boolean multiEntry;

    @JsProperty( name = "multiEntry")
    public native Boolean getMultiEntry();

    @JsProperty( name = "multiEntry")
    public native void setMultiEntry( Boolean value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public IDBObjectStore objectStore;

    @JsProperty( name = "objectStore")
    public native IDBObjectStore getObjectStore();

    @JsProperty( name = "objectStore")
    public native void setObjectStore( IDBObjectStore value );

    public Boolean unique;

    @JsProperty( name = "unique")
    public native Boolean getUnique();

    @JsProperty( name = "unique")
    public native void setUnique( Boolean value );

    /*
        Methods
    */
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
      * apis/browser-api/tsd/lib.es6.d.ts@492303
     */
    public native IDBRequest count(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * Std Signature : S(get,466,,P(d1))
      * TE Signature : S(get,P(d1))
      * 
     */
    public native IDBRequest get(String key);
    /** 
      * Std Signature : S(get,466,,P(d13))
      * TE Signature : S(get,P(d13))
      * 
     */
    public native IDBRequest get(Date key);
    /** 
      * Std Signature : S(get,466,,P(d141))
      * TE Signature : S(get,P(d141))
      * 
     */
    public native IDBRequest get(IDBArrayKey key);
    /** 
      * Std Signature : S(get,466,,P(d142))
      * TE Signature : S(get,P(d142))
      * 
     */
    public native IDBRequest get(IDBKeyRange key);
    /** 
      * Std Signature : S(get,466,,P(d2))
      * TE Signature : S(get,P(d2))
      * 
     */
    public native IDBRequest get(Number key);
    /** 
      * Std Signature : S(get,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(get,P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@492359
     */
    public native IDBRequest get(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
    /** 
      * Std Signature : S(getKey,466,,P(d1))
      * TE Signature : S(getKey,P(d1))
      * 
     */
    public native IDBRequest getKey(String key);
    /** 
      * Std Signature : S(getKey,466,,P(d13))
      * TE Signature : S(getKey,P(d13))
      * 
     */
    public native IDBRequest getKey(Date key);
    /** 
      * Std Signature : S(getKey,466,,P(d141))
      * TE Signature : S(getKey,P(d141))
      * 
     */
    public native IDBRequest getKey(IDBArrayKey key);
    /** 
      * Std Signature : S(getKey,466,,P(d142))
      * TE Signature : S(getKey,P(d142))
      * 
     */
    public native IDBRequest getKey(IDBKeyRange key);
    /** 
      * Std Signature : S(getKey,466,,P(d2))
      * TE Signature : S(getKey,P(d2))
      * 
     */
    public native IDBRequest getKey(Number key);
    /** 
      * Std Signature : S(getKey,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(getKey,P(dU(-13,141,142,2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@492412
     */
    public native IDBRequest getKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
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
      * apis/browser-api/tsd/lib.es6.d.ts@492468
     */
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,)
      * TE Signature : S(openKeyCursor,)
      * 
     */
    public native IDBRequest openKeyCursor();
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d1))
      * TE Signature : S(openKeyCursor,P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(String range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d1),P(d1))
      * TE Signature : S(openKeyCursor,P(d1),P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(String range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d13))
      * TE Signature : S(openKeyCursor,P(d13))
      * 
     */
    public native IDBRequest openKeyCursor(Date range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d13),P(d1))
      * TE Signature : S(openKeyCursor,P(d13),P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(Date range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d141))
      * TE Signature : S(openKeyCursor,P(d141))
      * 
     */
    public native IDBRequest openKeyCursor(IDBArrayKey range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d141),P(d1))
      * TE Signature : S(openKeyCursor,P(d141),P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(IDBArrayKey range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d142))
      * TE Signature : S(openKeyCursor,P(d142))
      * 
     */
    public native IDBRequest openKeyCursor(IDBKeyRange range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d142),P(d1))
      * TE Signature : S(openKeyCursor,P(d142),P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(IDBKeyRange range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d2))
      * TE Signature : S(openKeyCursor,P(d2))
      * 
     */
    public native IDBRequest openKeyCursor(Number range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(d2),P(d1))
      * TE Signature : S(openKeyCursor,P(d2),P(d1))
      * 
     */
    public native IDBRequest openKeyCursor(Number range /* optional */, String direction /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(dU(-13,141,142,2,1)))
      * TE Signature : S(openKeyCursor,P(dU(-13,141,142,2,1)))
      * 
     */
    public native IDBRequest openKeyCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */);
    /** 
      * Std Signature : S(openKeyCursor,466,,P(dU(-13,141,142,2,1)),P(d1))
      * TE Signature : S(openKeyCursor,P(dU(-13,141,142,2,1)),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@492551
     */
    public native IDBRequest openKeyCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
}
