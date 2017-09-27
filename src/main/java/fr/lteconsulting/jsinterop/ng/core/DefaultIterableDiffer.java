package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.Iterable;
import fr.lteconsulting.jsinterop.browser.NgIterable_UnionOfArrayOfVAndIterableOfV;
import fr.lteconsulting.prebuilt.Action;
import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Action3;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_iterable_differ".DefaultIterableDiffer
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_iterable_differ.d.ts:377
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="DefaultIterableDiffer")
public class DefaultIterableDiffer<V> implements IterableDiffer<V>, IterableChanges<V>
{

    /*
        Constructors
    */
    public DefaultIterableDiffer(TrackByFunction<V> trackByFn){
    }

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

    public Object _collection;

    @JsProperty( name = "_collection")
    public native Object get_collection();

    @JsProperty( name = "_collection")
    public native void set_collection( Object value );

    public Object _identityChangesHead;

    @JsProperty( name = "_identityChangesHead")
    public native Object get_identityChangesHead();

    @JsProperty( name = "_identityChangesHead")
    public native void set_identityChangesHead( Object value );

    public Object _identityChangesTail;

    @JsProperty( name = "_identityChangesTail")
    public native Object get_identityChangesTail();

    @JsProperty( name = "_identityChangesTail")
    public native void set_identityChangesTail( Object value );

    public Object _itHead;

    @JsProperty( name = "_itHead")
    public native Object get_itHead();

    @JsProperty( name = "_itHead")
    public native void set_itHead( Object value );

    public Object _itTail;

    @JsProperty( name = "_itTail")
    public native Object get_itTail();

    @JsProperty( name = "_itTail")
    public native void set_itTail( Object value );

    public Object _length;

    @JsProperty( name = "_length")
    public native Object get_length();

    @JsProperty( name = "_length")
    public native void set_length( Object value );

    public Object _linkedRecords;

    @JsProperty( name = "_linkedRecords")
    public native Object get_linkedRecords();

    @JsProperty( name = "_linkedRecords")
    public native void set_linkedRecords( Object value );

    public Object _movesHead;

    @JsProperty( name = "_movesHead")
    public native Object get_movesHead();

    @JsProperty( name = "_movesHead")
    public native void set_movesHead( Object value );

    public Object _movesTail;

    @JsProperty( name = "_movesTail")
    public native Object get_movesTail();

    @JsProperty( name = "_movesTail")
    public native void set_movesTail( Object value );

    public Object _previousItHead;

    @JsProperty( name = "_previousItHead")
    public native Object get_previousItHead();

    @JsProperty( name = "_previousItHead")
    public native void set_previousItHead( Object value );

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

    public Object _trackByFn;

    @JsProperty( name = "_trackByFn")
    public native Object get_trackByFn();

    @JsProperty( name = "_trackByFn")
    public native void set_trackByFn( Object value );

    public Object _unlinkedRecords;

    @JsProperty( name = "_unlinkedRecords")
    public native Object get_unlinkedRecords();

    @JsProperty( name = "_unlinkedRecords")
    public native void set_unlinkedRecords( Object value );

    public NgIterable_UnionOfArrayOfVAndIterableOfV<V> collection;

    @JsProperty( name = "collection")
    public native NgIterable_UnionOfArrayOfVAndIterableOfV<V> getCollection();

    @JsProperty( name = "collection")
    public native void setCollection( NgIterable_UnionOfArrayOfVAndIterableOfV<V> value );

    @JsOverlay
    public final void setCollection( Array<V> value ) { setCollection(NgIterable_UnionOfArrayOfVAndIterableOfV.ofArrayOfV( value )); }

    @JsOverlay
    public final void setCollection( Iterable<V> value ) { setCollection(NgIterable_UnionOfArrayOfVAndIterableOfV.ofIterableOfV( value )); }

    public Boolean isDirty;

    @JsProperty( name = "isDirty")
    public native Boolean getIsDirty();

    @JsProperty( name = "isDirty")
    public native void setIsDirty( Boolean value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public Action onDestroy;

    @JsProperty( name = "onDestroy")
    public native Action getOnDestroy();

    @JsProperty( name = "onDestroy")
    public native void setOnDestroy( Action value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(_addToRemovals,3,,P(d3))
      * TE Signature : S(_addToRemovals,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_iterable_differ.d.ts@1863
     */
    public native Object _addToRemovals(Object record);
    /** 
      * Std Signature : S(check,27,,P(d6<V->))
      * TE Signature : S(check,P(d6))
      * 
     */
    public native Boolean check(Iterable<V> collection);
    /** 
      * Std Signature : S(check,27,,P(d7<V->))
      * TE Signature : S(check,P(d7))
      * 
     */
    public native Boolean check(Array<V> collection);
    /** 
      * Std Signature : S(check,27,,P(dU(V-7<V->,6<5>)))
      * TE Signature : S(check,P(dU(-7,6)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/default_iterable_differ.d.ts@1785
     */
    public native Boolean check(NgIterable_UnionOfArrayOfVAndIterableOfV<V> collection);
    /** 
      * Std Signature : S(diff,1197<V->,,P(d6<V->))
      * TE Signature : S(diff,P(d6))
      * 
     */
    public native IterableChanges<V> diff(Iterable<V> object);
    /** 
      * Std Signature : S(diff,1197<V->,,P(d7<V->))
      * TE Signature : S(diff,P(d7))
      * 
     */
    public native IterableChanges<V> diff(Array<V> object);
    /** 
      * Std Signature : S(diff,1197<V->,,P(dU(V-7<4>,6<7>)))
      * TE Signature : S(diff,P(dU(-7,6)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native IterableChanges<V> diff(NgIterable_UnionOfArrayOfVAndIterableOfV<V> object);
    /** 
      * Std Signature : S(forEachAddedItem,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachAddedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachAddedItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachIdentityChange,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachIdentityChange,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachIdentityChange(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachItem,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachMovedItem,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachMovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachMovedItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachOperation,429,,P(dFP1-,P2-,P3--S(?,429,,P(d4),P(d5),P(d6))------)<365<V->,2,12>))
      * TE Signature : S(forEachOperation,P(dF--S(?,P(d3),P(d5),P(d5))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachOperation(Action3<IterableChangeRecord<V>, Number, Number> fn);
    /** 
      * Std Signature : S(forEachPreviousItem,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachPreviousItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachPreviousItem(Action1<IterableChangeRecord<V>> fn);
    /** 
      * Std Signature : S(forEachRemovedItem,429,,P(dFP1--S(?,429,,P(d4))------)<365<V->>))
      * TE Signature : S(forEachRemovedItem,P(dF--S(?,P(d3))------)))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void forEachRemovedItem(Action1<IterableChangeRecord<V>> fn);
}
