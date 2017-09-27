package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType983;
import fr.lteconsulting.jsinterop.browser.Map;
import fr.lteconsulting.jsinterop.browser.UnionOfAnonymousType717AndMapOfObjectAndObject;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ".DefaultKeyValueDiffer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts:308
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="DefaultKeyValueDiffer")
public class DefaultKeyValueDiffer<K, V> implements KeyValueDiffer<K, V>, KeyValueChanges<K, V>
{

    /*
        Properties
    */

    public Object _additionsHead;

    @JsProperty( name = "_additionsHead")
    public native Object get_additionsHead();

    @JsProperty( name = "_additionsHead")
    public native void set_additionsHead( Object value );

    public Object _additionsTail;

    @JsProperty( name = "_additionsTail")
    public native Object get_additionsTail();

    @JsProperty( name = "_additionsTail")
    public native void set_additionsTail( Object value );

    public Object _appendAfter;

    @JsProperty( name = "_appendAfter")
    public native Object get_appendAfter();

    @JsProperty( name = "_appendAfter")
    public native void set_appendAfter( Object value );

    public Object _changesHead;

    @JsProperty( name = "_changesHead")
    public native Object get_changesHead();

    @JsProperty( name = "_changesHead")
    public native void set_changesHead( Object value );

    public Object _changesTail;

    @JsProperty( name = "_changesTail")
    public native Object get_changesTail();

    @JsProperty( name = "_changesTail")
    public native void set_changesTail( Object value );

    public Object _mapHead;

    @JsProperty( name = "_mapHead")
    public native Object get_mapHead();

    @JsProperty( name = "_mapHead")
    public native void set_mapHead( Object value );

    public Object _previousMapHead;

    @JsProperty( name = "_previousMapHead")
    public native Object get_previousMapHead();

    @JsProperty( name = "_previousMapHead")
    public native void set_previousMapHead( Object value );

    public Object _records;

    @JsProperty( name = "_records")
    public native Object get_records();

    @JsProperty( name = "_records")
    public native void set_records( Object value );

    public Object _removalsHead;

    @JsProperty( name = "_removalsHead")
    public native Object get_removalsHead();

    @JsProperty( name = "_removalsHead")
    public native void set_removalsHead( Object value );

    public Object _removalsTail;

    @JsProperty( name = "_removalsTail")
    public native Object get_removalsTail();

    @JsProperty( name = "_removalsTail")
    public native void set_removalsTail( Object value );

    public Boolean isDirty;

    @JsProperty( name = "isDirty")
    public native Boolean getIsDirty();

    @JsProperty( name = "isDirty")
    public native void setIsDirty( Boolean value );

    public Action onDestroy;

    @JsProperty( name = "onDestroy")
    public native Action getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Action value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addToAdditions,3,,P(d3))
      * TE Signature : S(_addToAdditions,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1855
     */
    public native Object _addToAdditions(Object record);
    /** 
      * Std Signature : S(_addToChanges,3,,P(d3))
      * TE Signature : S(_addToChanges,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1892
     */
    public native Object _addToChanges(Object record);
    /** 
      * Std Signature : S(_getOrCreateRecordForKey,3,,P(d3),P(d3))
      * TE Signature : S(_getOrCreateRecordForKey,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1755
     */
    public native Object _getOrCreateRecordForKey(Object key, Object value);
    /** 
      * Std Signature : S(_insertBeforeOrAppend,3,,P(d3),P(d3))
      * TE Signature : S(_insertBeforeOrAppend,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1704
      * Inserts a record before `before` or append at the end of the list when `before` is null.
      * 
      * Notes:
      * - This method appends at `this._appendAfter`,
      * - This method updates `this._appendAfter`,
      * - The return value is the new value for the insertion pointer.
     */
    public native Object _insertBeforeOrAppend(Object before, Object record);
    /** 
      * Std Signature : S(_maybeAddToChanges,3,,P(d3),P(d3))
      * TE Signature : S(_maybeAddToChanges,P(d3),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1805
     */
    public native Object _maybeAddToChanges(Object record, Object newValue);
    /** 
      * Std Signature : S(check,27,,P(d37<3,3>))
      * TE Signature : S(check,P(d37))
      * 
     */
    public native Boolean check(Map<Object, Object> map);
    /** 
      * Std Signature : S(check,27,,P(dC(----3----)))
      * TE Signature : S(check,P(dC(----3----)))
      * 
     */
    public native Boolean check(AnonymousType717 map);
    /** 
      * Std Signature : S(check,27,,P(dU(-C(----3----),37<3,3>)))
      * TE Signature : S(check,P(dU(-C(----3----),37)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1322
      * Check the current state of the map vs the previous.
      * The algorithm is optimised for when the keys do no change.
     */
    public native Boolean check(UnionOfAnonymousType717AndMapOfObjectAndObject map);
    /** 
      * Std Signature : S(diff,3,,)
      * TE Signature : S(diff,)
      * 
     */
    public native Object diff();
    /** 
      * Std Signature : S(diff,1200<K-,V->,,P(d37<K-,V->))
      * TE Signature : S(diff,P(d37))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native KeyValueChanges<K, V> diff(Map<K, V> object);
    /** 
      * Std Signature : S(diff,1200<1,V->,,P(dC(V----4----)))
      * TE Signature : S(diff,P(dC(----3----)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native KeyValueChanges<String, V> diff(AnonymousType983<V> object);
    /** 
      * Std Signature : S(diff,3,,P(dU(-C(----3----),37<3,3>)))
      * TE Signature : S(diff,P(dU(-C(----3----),37)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_keyvalue_differ.d.ts@1079
     */
    public native Object diff(UnionOfAnonymousType717AndMapOfObjectAndObject map /* optional */);
    /** 
      * Std Signature : S(forEachAddedItem,429,,P(dFP1--S(?,429,,P(d4))------)<368<K-,V->>))
      * TE Signature : S(forEachAddedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachAddedItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachChangedItem,429,,P(dFP1--S(?,429,,P(d4))------)<368<K-,V->>))
      * TE Signature : S(forEachChangedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachChangedItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachItem,429,,P(dFP1--S(?,429,,P(d4))------)<368<K-,V->>))
      * TE Signature : S(forEachItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachPreviousItem,429,,P(dFP1--S(?,429,,P(d4))------)<368<K-,V->>))
      * TE Signature : S(forEachPreviousItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachPreviousItem(Action1<KeyValueChangeRecord<K, V>> fn);
    /** 
      * Std Signature : S(forEachRemovedItem,429,,P(dFP1--S(?,429,,P(d4))------)<368<K-,V->>))
      * TE Signature : S(forEachRemovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachRemovedItem(Action1<KeyValueChangeRecord<K, V>> fn);
}
