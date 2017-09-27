package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs".KeyValueChangeRecord
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:2121

  * Record representing the item change information.
 */
@JsType(isNative=true, namespace="ng.core", name="KeyValueChangeRecord")
public class KeyValueChangeRecord<K, V>
{

    /*
        Properties
    */

    /** 
      * Current value for the key or `null` if removed.
     */
    public V currentValue;

    @JsProperty( name = "currentValue")
    public native V getCurrentValue();

    @JsProperty( name = "currentValue")
    public native void setCurrentValue( V value );

    /** 
      * Current key in the Map.
     */
    public K key;

    @JsProperty( name = "key")
    public native K getKey();

    @JsProperty( name = "key")
    public native void setKey( K value );

    /** 
      * Previous value for the key or `null` if added.
     */
    public V previousValue;

    @JsProperty( name = "previousValue")
    public native V getPreviousValue();

    @JsProperty( name = "previousValue")
    public native void setPreviousValue( V value );
}
