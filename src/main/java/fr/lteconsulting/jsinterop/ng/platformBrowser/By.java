package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.ng.core.DebugElement;
import fr.lteconsulting.jsinterop.ng.core.Predicate;
import fr.lteconsulting.jsinterop.ng.core.Type;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/by".By
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/by.d.ts:265

  * Predicates for use with {@link DebugElement}'s query functions.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="By")
public class By
{

    /*
        Static methods
    */
    /** 
      * Match all elements.
      * 
      * ## Example
      * 
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_all'}
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/by.d.ts:586
     */
    @JsMethod(namespace="ng.platformBrowser.By", name = "all")
    public static native Predicate<DebugElement> all();
    /** 
      * Match elements by the given CSS selector.
      * 
      * ## Example
      * 
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_css'}
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/by.d.ts:799
     */
    @JsMethod(namespace="ng.platformBrowser.By", name = "css")
    public static native Predicate<DebugElement> css(String selector);
    /** 
      * Match elements that have the given directive present.
      * 
      * ## Example
      * 
      * {@example platform-browser/dom/debug/ts/by/by.ts region='by_directive'}
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/dom/debug/by.d.ts:1046
     */
    @JsMethod(namespace="ng.platformBrowser.By", name = "directive")
    public static native Predicate<DebugElement> directive(Type<Object> type);
}
