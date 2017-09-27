package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ElementData
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:10561

  * Data for an instantiated NodeType.Element.
  * 
  * Attention: Adding fields to this is performance sensitive!
 */
@JsType(isNative=true, namespace="ng.core", name="ElementData")
public class ElementData
{

    /*
        Properties
    */

    public ViewData componentView;

    @JsProperty( name = "componentView")
    public native ViewData getComponentView();

    @JsProperty( name = "componentView")
    public native void setComponentView( ViewData value );

    public Object renderElement;

    @JsProperty( name = "renderElement")
    public native Object getRenderElement();

    @JsProperty( name = "renderElement")
    public native void setRenderElement( Object value );

    public TemplateData template;

    @JsProperty( name = "template")
    public native TemplateData getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( TemplateData value );

    public ViewContainerData viewContainer;

    @JsProperty( name = "viewContainer")
    public native ViewContainerData getViewContainer();

    @JsProperty( name = "viewContainer")
    public native void setViewContainer( ViewContainerData value );
}
