package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector".SelectorListContext
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/selector.d.ts:2023
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="SelectorListContext")
public class SelectorListContext
{

    /*
        Constructors
    */
    public SelectorListContext(Array<CssSelector> selectors){
    }

    /*
        Properties
    */

    public Boolean alreadyMatched;

    @JsProperty( name = "alreadyMatched")
    public native Boolean getAlreadyMatched();

    @JsProperty( name = "alreadyMatched")
    public native void setAlreadyMatched( Boolean value );

    public Array<CssSelector> selectors;

    @JsProperty( name = "selectors")
    public native Array<CssSelector> getSelectors();

    @JsProperty( name = "selectors")
    public native void setSelectors( Array<CssSelector> value );
}
