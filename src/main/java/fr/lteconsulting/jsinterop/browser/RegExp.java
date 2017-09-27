package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: RegExp
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:34788
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:36569
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:209560
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:248646
  * base type: RegExp
  * flags: 16384
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:34788
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:36569
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:209560
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:248646
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RegExp")
public class RegExp
{

    /*
        Constructors
    */
    public RegExp(RegExp pattern){
    }
    public RegExp(String pattern, String flags){
    }
    public RegExp(RegExp pattern, String flags){
    }

    /*
        Static properties
    */

    @JsProperty(namespace="RegExp", name="$1")
    public static String $1;

    @JsProperty(namespace="RegExp", name="$2")
    public static String $2;

    @JsProperty(namespace="RegExp", name="$3")
    public static String $3;

    @JsProperty(namespace="RegExp", name="$4")
    public static String $4;

    @JsProperty(namespace="RegExp", name="$5")
    public static String $5;

    @JsProperty(namespace="RegExp", name="$6")
    public static String $6;

    @JsProperty(namespace="RegExp", name="$7")
    public static String $7;

    @JsProperty(namespace="RegExp", name="$8")
    public static String $8;

    @JsProperty(namespace="RegExp", name="$9")
    public static String $9;

    @JsProperty(namespace="RegExp", name="lastMatch")
    public static String lastMatch;

    /*
        Static methods
    */
    // skipped static method __@species
    /*
        Properties
    */

    /** 
      * Returns a string indicating the flags of the regular expression in question. This field is read-only.
      * The characters in this string are sequenced and concatenated in the following order:
      * 
      *     - "g" for global
      *     - "i" for ignoreCase
      *     - "m" for multiline
      *     - "u" for unicode
      *     - "y" for sticky
      * 
      * If no flags are set, the value is the empty string.
     */
    public String flags;

    @JsProperty( name = "flags")
    public native String getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( String value );

    /** 
      * Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean global;

    @JsProperty( name = "global")
    public native Boolean getGlobal();

    @JsProperty( name = "global")
    public native void setGlobal( Boolean value );

    /** 
      * Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean ignoreCase;

    @JsProperty( name = "ignoreCase")
    public native Boolean getIgnoreCase();

    @JsProperty( name = "ignoreCase")
    public native void setIgnoreCase( Boolean value );

    public Number lastIndex;

    @JsProperty( name = "lastIndex")
    public native Number getLastIndex();

    @JsProperty( name = "lastIndex")
    public native void setLastIndex( Number value );

    /** 
      * Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. 
     */
    public Boolean multiline;

    @JsProperty( name = "multiline")
    public native Boolean getMultiline();

    @JsProperty( name = "multiline")
    public native void setMultiline( Boolean value );

    /** 
      * Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. 
     */
    public String source;

    @JsProperty( name = "source")
    public native String getSource();

    @JsProperty( name = "source")
    public native void setSource( String value );

    /** 
      * Returns a Boolean value indicating the state of the sticky flag (y) used with a regular
      * expression. Default is false. Read-only.
     */
    public Boolean sticky;

    @JsProperty( name = "sticky")
    public native Boolean getSticky();

    @JsProperty( name = "sticky")
    public native void setSticky( Boolean value );

    /** 
      * Returns a Boolean value indicating the state of the Unicode flag (u) used with a regular
      * expression. Default is false. Read-only.
     */
    public Boolean unicode;

    @JsProperty( name = "unicode")
    public native Boolean getUnicode();

    @JsProperty( name = "unicode")
    public native void setUnicode( Boolean value );

    /*
        Methods
    */
    // skipped method __@match
    // skipped method __@replace
    // skipped method __@replace
    // skipped method __@search
    // skipped method __@split
    // skipped method __@split
    /** 
      * Std Signature : S(compile,15,,)
      * TE Signature : S(compile,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@36108
     */
    public native RegExp compile();
    /** 
      * Std Signature : S(exec,365,,P(d1))
      * TE Signature : S(exec,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@35054
      * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
     */
    public native RegExpExecArray exec(String string);
    /** 
      * Std Signature : S(test,27,,P(d1))
      * TE Signature : S(test,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@35284
      * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
     */
    public native Boolean test(String string);
}
