package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfObjectAndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".RendererType2
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:4113
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="RendererType2")
public class RendererType2
{

    /*
        Properties
    */

    public AnonymousType717 data;

    @JsProperty( name = "data")
    public native AnonymousType717 getData();

    @JsProperty( name = "data")
    public native void setData( AnonymousType717 value );

    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    public Array<UnionOfArrayOfObjectAndString> styles;

    @JsProperty( name = "styles")
    public native Array<UnionOfArrayOfObjectAndString> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<UnionOfArrayOfObjectAndString> value );
}
