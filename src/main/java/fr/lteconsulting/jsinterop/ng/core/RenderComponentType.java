package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.UnionOfArrayOfObjectAndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api".RenderComponentType
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/render/api.d.ts:306
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="RenderComponentType")
public class RenderComponentType
{

    /*
        Constructors
    */
    public RenderComponentType(String id, String templateUrl, Number slotCount, ViewEncapsulation encapsulation, Array<UnionOfArrayOfObjectAndString> styles, Object animations){
    }

    /*
        Properties
    */

    public Object animations;

    @JsProperty( name = "animations")
    public native Object getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Object value );

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

    public Number slotCount;

    @JsProperty( name = "slotCount")
    public native Number getSlotCount();

    @JsProperty( name = "slotCount")
    public native void setSlotCount( Number value );

    public Array<UnionOfArrayOfObjectAndString> styles;

    @JsProperty( name = "styles")
    public native Array<UnionOfArrayOfObjectAndString> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<UnionOfArrayOfObjectAndString> value );

    public String templateUrl;

    @JsProperty( name = "templateUrl")
    public native String getTemplateUrl();

    @JsProperty( name = "templateUrl")
    public native void setTemplateUrl( String value );
}
