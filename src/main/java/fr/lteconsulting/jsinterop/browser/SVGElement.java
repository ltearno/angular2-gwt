package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: SVGElement
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:576398
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:577470
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGElement extends Element
{

    /*
        Properties
    */

    @JsProperty( name = "onclick")
    Function1<MouseEvent, Object> getOnclick();

    @JsProperty( name = "onclick")
    void setOnclick( Function1<MouseEvent, Object> value );

    @JsProperty( name = "ondblclick")
    Function1<MouseEvent, Object> getOndblclick();

    @JsProperty( name = "ondblclick")
    void setOndblclick( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onfocusin")
    Function1<FocusEvent, Object> getOnfocusin();

    @JsProperty( name = "onfocusin")
    void setOnfocusin( Function1<FocusEvent, Object> value );

    @JsProperty( name = "onfocusout")
    Function1<FocusEvent, Object> getOnfocusout();

    @JsProperty( name = "onfocusout")
    void setOnfocusout( Function1<FocusEvent, Object> value );

    @JsProperty( name = "onload")
    Function1<Event, Object> getOnload();

    @JsProperty( name = "onload")
    void setOnload( Function1<Event, Object> value );

    @JsProperty( name = "onmousedown")
    Function1<MouseEvent, Object> getOnmousedown();

    @JsProperty( name = "onmousedown")
    void setOnmousedown( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmousemove")
    Function1<MouseEvent, Object> getOnmousemove();

    @JsProperty( name = "onmousemove")
    void setOnmousemove( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseout")
    Function1<MouseEvent, Object> getOnmouseout();

    @JsProperty( name = "onmouseout")
    void setOnmouseout( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseover")
    Function1<MouseEvent, Object> getOnmouseover();

    @JsProperty( name = "onmouseover")
    void setOnmouseover( Function1<MouseEvent, Object> value );

    @JsProperty( name = "onmouseup")
    Function1<MouseEvent, Object> getOnmouseup();

    @JsProperty( name = "onmouseup")
    void setOnmouseup( Function1<MouseEvent, Object> value );

    @JsProperty( name = "ownerSVGElement")
    SVGSVGElement getOwnerSVGElement();

    @JsProperty( name = "ownerSVGElement")
    void setOwnerSVGElement( SVGSVGElement value );

    @JsProperty( name = "style")
    CSSStyleDeclaration getStyle();

    @JsProperty( name = "style")
    void setStyle( CSSStyleDeclaration value );

    @JsProperty( name = "viewportElement")
    SVGElement getViewportElement();

    @JsProperty( name = "viewportElement")
    void setViewportElement( SVGElement value );

    @JsProperty( name = "xmlbase")
    String getXmlbase();

    @JsProperty( name = "xmlbase")
    void setXmlbase( String value );
}
