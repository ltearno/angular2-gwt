package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: Plugin
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:549222
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:549513
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Plugin")
public class Plugin
{

    /*
        Constructors
    */
    public Plugin(){
    }

    @JsOverlay
    public final void setByIndex(int index, MimeType value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final MimeType getByIndex(int index) {
        return (MimeType) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public String description;

    @JsProperty( name = "description")
    public native String getDescription();

    @JsProperty( name = "description")
    public native void setDescription( String value );

    public String filename;

    @JsProperty( name = "filename")
    public native String getFilename();

    @JsProperty( name = "filename")
    public native void setFilename( String value );

    public Number length;

    @JsProperty( name = "length")
    public native Number getLength();

    @JsProperty( name = "length")
    public native void setLength( Number value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String version;

    @JsProperty( name = "version")
    public native String getVersion();

    @JsProperty( name = "version")
    public native void setVersion( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(item,488,,P(d2))
      * TE Signature : S(item,P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@549398
     */
    public native MimeType item(Number index);
    /** 
      * Std Signature : S(namedItem,488,,P(d1))
      * TE Signature : S(namedItem,P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@549433
     */
    public native MimeType namedItem(String type);
}
