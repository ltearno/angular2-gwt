package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.TupleOf3;
import fr.lteconsulting.jsinterop.browser.AnonymousType1039;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".ElementDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:6830
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ElementDef")
public class ElementDef
{

    /*
        Properties
    */

    /** 
      * same as visiblePublicProviders, but also includes private providers
      * that are located on this element.
     */
    public AnonymousType1039 allProviders;

    @JsProperty( name = "allProviders")
    public native AnonymousType1039 getAllProviders();

    @JsProperty( name = "allProviders")
    public native void setAllProviders( AnonymousType1039 value );

    /** 
      * ns, name, value 
     */
    public Array<TupleOf3<String, String, String>> attrs;

    @JsProperty( name = "attrs")
    public native Array<TupleOf3<String, String, String>> getAttrs();

    @JsProperty( name = "attrs")
    public native void setAttrs( Array<TupleOf3<String, String, String>> value );

    public NodeDef componentProvider;

    @JsProperty( name = "componentProvider")
    public native NodeDef getComponentProvider();

    @JsProperty( name = "componentProvider")
    public native void setComponentProvider( NodeDef value );

    public RendererType2 componentRendererType;

    @JsProperty( name = "componentRendererType")
    public native RendererType2 getComponentRendererType();

    @JsProperty( name = "componentRendererType")
    public native void setComponentRendererType( RendererType2 value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String ns;

    @JsProperty( name = "ns")
    public native String getNs();

    @JsProperty( name = "ns")
    public native void setNs( String value );

    /** 
      * visible public providers for DI in the view,
      * as see from this element. This does not include private providers.
     */
    public AnonymousType1039 publicProviders;

    @JsProperty( name = "publicProviders")
    public native AnonymousType1039 getPublicProviders();

    @JsProperty( name = "publicProviders")
    public native void setPublicProviders( AnonymousType1039 value );

    public ViewDefinition template;

    @JsProperty( name = "template")
    public native ViewDefinition getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( ViewDefinition value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(componentView,395,,P(dF--S(?,F--S(?,429,,)------),,)------)))
      * TE Signature : S(componentView,P(dF--S(?,)------)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@1002
     */
    public native ViewDefinition componentView(NodeLogger logger);
    /** 
      * Std Signature : S(handleEvent,27,,P(d392),P(d1),P(d3))
      * TE Signature : S(handleEvent,P(d392),P(d1),P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts@7667
     */
    public native Boolean handleEvent(ViewData view, String eventName, Object event);
}
