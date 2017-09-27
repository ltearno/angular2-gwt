package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".TemplateData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:10935
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="TemplateData")
public class TemplateData extends TemplateRef<Object>
{

    /*
        Properties
    */

    public Array<ViewData> _projectedViews;

    @JsProperty( name = "_projectedViews")
    public native Array<ViewData> get_projectedViews();

    @JsProperty( name = "_projectedViews")
    public native void set_projectedViews( Array<ViewData> value );
}
