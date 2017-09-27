package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SymbolConstructor
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:217402
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:243487
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:244299
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SymbolConstructor")
public class SymbolConstructor
{

    /*
        Properties
    */

    /** 
      * A reference to the prototype. 
     */
    public Symbol prototype;

    @JsProperty( name = "prototype")
    public native Symbol getPrototype();

    @JsProperty( name = "prototype")
    public native void setPrototype( Symbol value );
}
