package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol".StaticSymbolCache
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol.d.ts:554

  * A cache of static symbol used by the StaticReflector to return the same symbol for the
  * same symbol values.
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="StaticSymbolCache")
public class StaticSymbolCache
{

    /*
        Properties
    */

    public Object cache;

    @JsProperty( name = "cache")
    public native Object getCache();

    @JsProperty( name = "cache")
    public native void setCache( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(get,492,,P(d1),P(d1))
      * TE Signature : S(get,P(d1),P(d1))
      * 
     */
    public native StaticSymbol get(String declarationFile, String name);
    /** 
      * Std Signature : S(get,492,,P(d1),P(d1),P(d7<1>))
      * TE Signature : S(get,P(d1),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/static_symbol.d.ts@740
     */
    public native StaticSymbol get(String declarationFile, String name, Array<String> members /* optional */);
}
