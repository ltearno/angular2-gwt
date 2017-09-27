package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ObjectConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:4175
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:204882
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ObjectConstructor")
public class ObjectConstructor
{
    /** SKIPPED CALL SIGNATURE ! */
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    /** 
      * A reference to the prototype for a class of objects. 
     */
    public Object prototype;

    @JsProperty( name = "prototype")
    public native Object getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(assign,3,,P(d3))
      * TE Signature : S(assign,P(d3))
      * 
     */
    public native Object assign(Object target);
    /** 
      * Std Signature : S(assign,3,,P(d3),P(D3))
      * TE Signature : S(assign,P(d3),P(D3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@206544
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * Copy the values of all of the enumerable own properties from one or more source objects to a
      * target object. Returns the target object.
      * VERSION 3
     */
    public native Object assign(Object target, Object... sources);
    /** 
      * Std Signature : S(create,3,,P(d3))
      * TE Signature : S(create,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@5464
      * Creates an object that has the specified prototype or that has null prototype.
      * Creates an object that has the specified prototype, and that optionally contains specified properties.
     */
    public native Object create(Object o);
    /** 
      * Std Signature : S(create,3,,P(d3),P(d8))
      * TE Signature : S(create,P(d3),P(d8))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@5779
      * Creates an object that has the specified prototype or that has null prototype.
      * Creates an object that has the specified prototype, and that optionally contains specified properties.
      * VERSION 1
     */
    public native Object create(Object o, PropertyDescriptorMap properties);
    /** 
      * Std Signature : S(defineProperties,3,,P(d3),P(d8))
      * TE Signature : S(defineProperties,P(d3),P(d8))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@6754
      * Adds one or more properties to an object, and/or modifies attributes of existing properties.
     */
    public native Object defineProperties(Object o, PropertyDescriptorMap properties);
    /** 
      * Std Signature : S(defineProperty,3,,P(d3),P(d1),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(d1),P(d9))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@6273
      * Adds a property to an object, or modifies attributes of an existing property.
      * Adds a property to an object, or modifies attributes of an existing property.
     */
    public native Object defineProperty(Object o, String p, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(defineProperty,3,,P(d3),P(d2),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(d2),P(d9))
      * 
     */
    public native Object defineProperty(Object o, Number propertyKey, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(defineProperty,3,,P(d3),P(dU(-2,1)),P(d9))
      * TE Signature : S(defineProperty,P(d3),P(dU(-2,1)),P(d9))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@208123
      * Adds a property to an object, or modifies attributes of an existing property.
      * Adds a property to an object, or modifies attributes of an existing property.
      * VERSION 1
     */
    public native Object defineProperty(Object o, PropertyKey_UnionOfNumberAndString propertyKey, PropertyDescriptor attributes);
    /** 
      * Std Signature : S(freeze,T-,T-,P(dT-))
      * TE Signature : S(freeze,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@7475
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * VERSION 1
     */
    public native <T> T freeze(T f);
    /** 
      * Std Signature : S(freeze,10<T->,T-,P(d7<T->))
      * TE Signature : S(freeze,P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@7236
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
      * Prevents the modification of existing property attributes and values, and prevents the addition of new properties.
     */
    public native <T> ReadonlyArray<T> freeze(Array<T> a);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(d3),P(d1))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@4833
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not
      * inherited from the object's prototype.
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, String p);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(d3),P(d2))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(d2))
      * 
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, Number propertyKey);
    /** 
      * Std Signature : S(getOwnPropertyDescriptor,9,,P(d3),P(dU(-2,1)))
      * TE Signature : S(getOwnPropertyDescriptor,P(d3),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@207598
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not inherited from the object's prototype.
      * Gets the own property descriptor of the specified object.
      * An own property descriptor is one that is defined directly on the object and is not
      * inherited from the object's prototype.
      * VERSION 1
     */
    public native PropertyDescriptor getOwnPropertyDescriptor(Object o, PropertyKey_UnionOfNumberAndString propertyKey);
    /** 
      * Std Signature : S(getOwnPropertyNames,7<1>,,P(d3))
      * TE Signature : S(getOwnPropertyNames,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@5256
      * Returns the names of the own properties of an object. The own properties of an object are those that are defined directly
      * on that object, and are not inherited from the object's prototype. The properties of an object include both fields (objects) and functions.
     */
    public native Array<String> getOwnPropertyNames(Object o);
    /** 
      * Std Signature : S(getOwnPropertySymbols,7,,P(d3))
      * TE Signature : S(getOwnPropertySymbols,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@206743
      * Returns an array of all symbol properties found directly on object o.
     */
    public native Array getOwnPropertySymbols(Object o);
    /** 
      * Std Signature : S(getPrototypeOf,3,,P(d3))
      * TE Signature : S(getPrototypeOf,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@4496
      * Returns the prototype of an object.
     */
    public native Object getPrototypeOf(Object o);
    /** 
      * Std Signature : S(is,27,,P(d3),P(d3))
      * TE Signature : S(is,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@206957
      * Returns true if the values are the same value, false otherwise.
     */
    public native Boolean is(Object value1, Object value2);
    /** 
      * Std Signature : S(isExtensible,27,,P(d3))
      * TE Signature : S(isExtensible,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@8497
      * Returns a value that indicates whether new properties can be added to an object.
     */
    public native Boolean isExtensible(Object o);
    /** 
      * Std Signature : S(isFrozen,27,,P(d3))
      * TE Signature : S(isFrozen,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@8326
      * Returns true if existing property attributes and values cannot be modified in an object, and new properties cannot be added to the object.
     */
    public native Boolean isFrozen(Object o);
    /** 
      * Std Signature : S(isSealed,27,,P(d3))
      * TE Signature : S(isSealed,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@8097
      * Returns true if existing property attributes cannot be modified in an object and new properties cannot be added to the object.
     */
    public native Boolean isSealed(Object o);
    /** 
      * Std Signature : S(keys,7<1>,,P(d3))
      * TE Signature : S(keys,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@8787
      * Returns the names of the enumerable properties and methods of an object.
     */
    public native Array<String> keys(Object o);
    /** 
      * Std Signature : S(preventExtensions,T-,T-,P(dT-))
      * TE Signature : S(preventExtensions,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@7876
      * Prevents the addition of new properties to an object.
     */
    public native <T> T preventExtensions(T o);
    /** 
      * Std Signature : S(seal,T-,T-,P(dT-))
      * TE Signature : S(seal,P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@7016
      * Prevents the modification of attributes of existing properties, and prevents the addition of new properties.
     */
    public native <T> T seal(T o);
    /** 
      * Std Signature : S(setPrototypeOf,3,,P(d3),P(d3))
      * TE Signature : S(setPrototypeOf,P(d3),P(d3))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@207231
      * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
     */
    public native Object setPrototypeOf(Object o, Object proto);
}
