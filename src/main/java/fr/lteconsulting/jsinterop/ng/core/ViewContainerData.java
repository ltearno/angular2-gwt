package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ViewContainerData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:10839
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ViewContainerData")
public class ViewContainerData extends ViewContainerRef
{

    /*
        Properties
    */

    public Array<ViewData> _embeddedViews;

    @JsProperty( name = "_embeddedViews")
    public native Array<ViewData> get_embeddedViews();

    @JsProperty( name = "_embeddedViews")
    public native void set_embeddedViews( Array<ViewData> value );
}
