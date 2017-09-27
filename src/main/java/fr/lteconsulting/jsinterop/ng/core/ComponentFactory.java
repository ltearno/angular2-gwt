package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory".ComponentFactory
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory.d.ts:1825
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="ComponentFactory")
public class ComponentFactory<C>
{

    /*
        Properties
    */

    public Type<Object> componentType;

    @JsProperty( name = "componentType")
    public native Type<Object> getComponentType();

    @JsProperty( name = "componentType")
    public native void setComponentType( Type<Object> value );

    /** 
      * the inputs of the component.
     */
    public Array<Object> inputs;

    @JsProperty( name = "inputs")
    public native Array<Object> getInputs();

    @JsProperty( name = "inputs")
    public native void setInputs( Array<Object> value );

    /** 
      * selector for all <ng-content> elements in the component.
     */
    public Array<String> ngContentSelectors;

    @JsProperty( name = "ngContentSelectors")
    public native Array<String> getNgContentSelectors();

    @JsProperty( name = "ngContentSelectors")
    public native void setNgContentSelectors( Array<String> value );

    /** 
      * the outputs of the component.
     */
    public Array<Object> outputs;

    @JsProperty( name = "outputs")
    public native Array<Object> getOutputs();

    @JsProperty( name = "outputs")
    public native void setOutputs( Array<Object> value );

    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(create,382<C->,,P(d335))
      * TE Signature : S(create,P(d335))
      * 
     */
    public native ComponentRef<C> create(Injector injector);
    /** 
      * Std Signature : S(create,382<C->,,P(d335),P(d7<2<3>>))
      * TE Signature : S(create,P(d335),P(d7))
      * 
     */
    public native ComponentRef<C> create(Injector injector, Array<Array<Object>> projectableNodes /* optional */);
    /** 
      * Std Signature : S(create,382<C->,,P(d335),P(d7<2<3>>),P(d3))
      * TE Signature : S(create,P(d335),P(d7),P(d3))
      * 
     */
    public native ComponentRef<C> create(Injector injector, Array<Array<Object>> projectableNodes /* optional */, Object rootSelectorOrNode /* optional */);
    /** 
      * Std Signature : S(create,382<C->,,P(d335),P(d7<2<3>>),P(d3),P(d371<3>))
      * TE Signature : S(create,P(d335),P(d7),P(d3),P(d371))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/linker/component_factory.d.ts@2469
      * Creates a new component.
     */
    public native ComponentRef<C> create(Injector injector, Array<Array<Object>> projectableNodes /* optional */, Object rootSelectorOrNode /* optional */, NgModuleRef<Object> ngModule /* optional */);
}
