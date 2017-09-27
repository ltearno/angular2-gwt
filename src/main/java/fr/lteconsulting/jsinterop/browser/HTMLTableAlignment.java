package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: HTMLTableAlignment
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:731013
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableAlignment")
public class HTMLTableAlignment
{

    /*
        Properties
    */

    /** 
      * Sets or retrieves a value that you can use to implement your own ch functionality for the object.
     */
    public String ch;

    @JsProperty( name = "ch")
    public native String getCh();

    @JsProperty( name = "ch")
    public native void setCh( String value );

    /** 
      * Sets or retrieves a value that you can use to implement your own chOff functionality for the object.
     */
    public String chOff;

    @JsProperty( name = "chOff")
    public native String getChOff();

    @JsProperty( name = "chOff")
    public native void setChOff( String value );

    /** 
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

    @JsProperty( name = "vAlign")
    public native String getVAlign();

    @JsProperty( name = "vAlign")
    public native void setVAlign( String value );
}
