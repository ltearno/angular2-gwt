package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".TextData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:10230

  * Data for an instantiated NodeType.Text.
  * 
  * Attention: Adding fields to this is performance sensitive!
 */
@JsType(isNative=true, namespace="ng.core", name="TextData")
public class TextData
{

    /*
        Properties
    */

    public Object renderText;

    @JsProperty( name = "renderText")
    public native Object getRenderText();

    @JsProperty( name = "renderText")
    public native void setRenderText( Object value );
}
