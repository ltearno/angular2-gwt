package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".IterableChangeRecord
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:3220

  * Record representing the item change information.
 */
@JsType(isNative=true, namespace="ng.core", name="IterableChangeRecord")
public class IterableChangeRecord<V>
{

    /*
        Properties
    */

    /** 
      * Current index of the item in `Iterable` or null if removed. 
     */
    public Number currentIndex;

    @JsProperty( name = "currentIndex")
    public native Number getCurrentIndex();

    @JsProperty( name = "currentIndex")
    public native void setCurrentIndex( Number value );

    /** 
      * The item. 
     */
    public V item;

    @JsProperty( name = "item")
    public native V getItem();

    @JsProperty( name = "item")
    public native void setItem( V value );

    /** 
      * Previous index of the item in `Iterable` or null if added. 
     */
    public Number previousIndex;

    @JsProperty( name = "previousIndex")
    public native Number getPreviousIndex();

    @JsProperty( name = "previousIndex")
    public native void setPreviousIndex( Number value );

    /** 
      * Track by identity as computed by the `trackByFn`. 
     */
    public Object trackById;

    @JsProperty( name = "trackById")
    public native Object getTrackById();

    @JsProperty( name = "trackById")
    public native void setTrackById( Object value );
}
