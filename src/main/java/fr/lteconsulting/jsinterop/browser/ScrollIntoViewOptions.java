package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ScrollIntoViewOptions
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739759
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScrollIntoViewOptions")
public class ScrollIntoViewOptions extends ScrollOptions
{

    /*
        Properties
    */

    public String block;

    @JsProperty( name = "block")
    public native String getBlock();

    @JsProperty( name = "block")
    public native void setBlock( String value );

    public String inline;

    @JsProperty( name = "inline")
    public native String getInline();

    @JsProperty( name = "inline")
    public native void setInline( String value );
}
