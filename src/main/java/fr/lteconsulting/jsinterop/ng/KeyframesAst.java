package fr.lteconsulting.jsinterop.ng;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast".KeyframesAst
  * flags: 32768
  * declared in: apis/angular4-api/tsd/@angular/animations/browser/src/dsl/animation_ast.d.ts:2965
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng", name="KeyframesAst")
public class KeyframesAst extends Ast
{

    /*
        Constructors
    */
    public KeyframesAst(Array<StyleAst> styles){
    }

    /*
        Properties
    */

    public Array<StyleAst> styles;

    @JsProperty( name = "styles")
    public native Array<StyleAst> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<StyleAst> value );
}
