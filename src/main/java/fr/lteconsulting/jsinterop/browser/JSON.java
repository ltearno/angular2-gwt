package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function2;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: JSON
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:38286
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:39954
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:247905

  * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="JSON")
public class JSON
{

    /*
        Static properties
    */

    // skipped static property __@toStringTag
    /*
        Static methods
    */
    /** 
      * Converts a JavaScript Object Notation (JSON) string into an object.
      * source : apis/browser-api/tsd/lib.es6.d.ts:38670
     */
    @JsMethod(namespace="JSON", name = "parse")
    public static native Object _parse(String text, Function2<Object, Object, Object> reviver /* optional */);
    /** 
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * source : apis/browser-api/tsd/lib.es6.d.ts:39126
     */
    @JsMethod(namespace="JSON", name = "stringify")
    public static native String _stringify(Object value, Function2<String, Object, Object> replacer /* optional */, PropertyKey_UnionOfNumberAndString space /* optional */);
    /** 
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * source : apis/browser-api/tsd/lib.es6.d.ts:39126
      * source : apis/browser-api/tsd/lib.es6.d.ts:39699
     */
    @JsMethod(namespace="JSON", name = "stringify")
    public static native String _stringify(Object value, Array<PropertyKey_UnionOfNumberAndString> replacer /* optional */, PropertyKey_UnionOfNumberAndString space /* optional */);

    /*
        Properties
    */

    /*
        Methods
    */
    /** 
      * Std Signature : S(parse,3,,P(d1))
      * TE Signature : S(parse,P(d1))
      * 
     */
    public native Object parse(String text);
    /** 
      * Std Signature : S(parse,3,,P(d1),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<3,6,6>))
      * TE Signature : S(parse,P(d1),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@38670
      * Converts a JavaScript Object Notation (JSON) string into an object.
     */
    public native Object parse(String text, Function2<Object, Object, Object> reviver /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3))
      * TE Signature : S(stringify,P(d3))
      * 
     */
    public native String stringify(Object value);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(d7<U(-2,1)>))
      * TE Signature : S(stringify,P(d3),P(d7))
      * 
     */
    public native String stringify(Object value, Array<PropertyKey_UnionOfNumberAndString> replacer /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(d7<U(-2,1)>),P(d1))
      * TE Signature : S(stringify,P(d3),P(d7),P(d1))
      * 
     */
    public native String stringify(Object value, Array<PropertyKey_UnionOfNumberAndString> replacer /* optional */, String space /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(d7<U(-2,1)>),P(d2))
      * TE Signature : S(stringify,P(d3),P(d7),P(d2))
      * 
     */
    public native String stringify(Object value, Array<PropertyKey_UnionOfNumberAndString> replacer /* optional */, Number space /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(d7<U(-2,1)>),P(dU(-2,1)))
      * TE Signature : S(stringify,P(d3),P(d7),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@39699
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * VERSION 1
     */
    public native String stringify(Object value, Array<PropertyKey_UnionOfNumberAndString> replacer /* optional */, PropertyKey_UnionOfNumberAndString space /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<1,3,7>))
      * TE Signature : S(stringify,P(d3),P(dF--S(?,P(d3),P(d4))------)))
      * 
     */
    public native String stringify(Object value, Function2<String, Object, Object> replacer /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<1,3,7>),P(d1))
      * TE Signature : S(stringify,P(d3),P(dF--S(?,P(d3),P(d4))------)),P(d1))
      * 
     */
    public native String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, String space /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<1,3,7>),P(d2))
      * TE Signature : S(stringify,P(d3),P(dF--S(?,P(d3),P(d4))------)),P(d2))
      * 
     */
    public native String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, Number space /* optional */);
    /** 
      * Std Signature : S(stringify,1,,P(d3),P(dFP1-,P2-,R--S(?,5,,P(d3),P(d4))------)<1,3,7>),P(dU(-2,1)))
      * TE Signature : S(stringify,P(d3),P(dF--S(?,P(d3),P(d4))------)),P(dU(-2,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@39126
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
      * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
     */
    public native String stringify(Object value, Function2<String, Object, Object> replacer /* optional */, PropertyKey_UnionOfNumberAndString space /* optional */);
}
