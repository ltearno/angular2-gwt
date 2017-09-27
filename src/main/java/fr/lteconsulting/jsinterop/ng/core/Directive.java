package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.AnonymousType717;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".Directive
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:2634
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:11882
  * 1 constructors
  * Directive decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Directive")
public class Directive
{

    /*
        Constructors
    */
    public Directive(Directive obj){
    }

    /*
        Properties
    */

    /** 
      * Defines the name that can be used in the template to assign this directive to a variable.
      * 
      * ## Simple Example
      * 
      * ```
     */
    public String exportAs;

    @JsProperty( name = "exportAs")
    public native String getExportAs();

    @JsProperty( name = "exportAs")
    public native void setExportAs( String value );

    /** 
      * Specify the events, actions, properties and attributes related to the host element.
      * 
      * ## Host Listeners
      * 
      * Specifies which DOM events a directive listens to via a set of `(event)` to `method`
      * key-value pairs:
      * 
      * - `event`: the DOM event that the directive listens to.
      * - `statement`: the statement to execute when the event occurs.
      * If the evaluation of the statement returns `false`, then `preventDefault`is applied on the DOM
      * event.
      * 
      * To listen to global events, a target must be added to the event name.
      * The target can be `window`, `document` or `body`.
      * 
      * When writing a directive event binding, you can also refer to the $event local variable.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/DlA5KU?p=preview))
      * 
      * The following example declares a directive that attaches a click listener to the button and
      * counts clicks.
      * 
      * ```typescript
     */
    public AnonymousType817 host;

    @JsProperty( name = "host")
    public native AnonymousType817 getHost();

    @JsProperty( name = "host")
    public native void setHost( AnonymousType817 value );

    /** 
      * Enumerates the set of data-bound input properties for a directive
      * 
      * Angular automatically updates input properties during change detection.
      * 
      * The `inputs` property defines a set of `directiveProperty` to `bindingProperty`
      * configuration:
      * 
      * - `directiveProperty` specifies the component property where the value is written.
      * - `bindingProperty` specifies the DOM property where the value is read from.
      * 
      * When `bindingProperty` is not provided, it is assumed to be equal to `directiveProperty`.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/ivhfXY?p=preview))
      * 
      * The following example creates a component with two data-bound properties.
      * 
      * ```typescript
     */
    public Array<String> inputs;

    @JsProperty( name = "inputs")
    public native Array<String> getInputs();

    @JsProperty( name = "inputs")
    public native void setInputs( Array<String> value );

    /** 
      * Enumerates the set of event-bound output properties.
      * 
      * When an output property emits an event, an event handler attached to that event
      * the template is invoked.
      * 
      * The `outputs` property defines a set of `directiveProperty` to `bindingProperty`
      * configuration:
      * 
      * - `directiveProperty` specifies the component property that emits events.
      * - `bindingProperty` specifies the DOM property the event handler is attached to.
      * 
      * ### Example ([live demo](http://plnkr.co/edit/d5CNq7?p=preview))
      * 
      * ```typescript
     */
    public Array<String> outputs;

    @JsProperty( name = "outputs")
    public native Array<String> getOutputs();

    @JsProperty( name = "outputs")
    public native void setOutputs( Array<String> value );

    /** 
      * Defines the set of injectable objects that are visible to a Directive and its light DOM
      * children.
      * 
      * ## Simple Example
      * 
      * Here is an example of a class that can be injected:
      * 
      * ```
      * class Greeter {
      *     greet(name:string) {
      *       return 'Hello ' + name + '!';
      *     }
      * }
     */
    public Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers;

    @JsProperty( name = "providers")
    public native Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> value );

    /** 
      * Configures the queries that will be injected into the directive.
      * 
      * Content queries are set before the `ngAfterContentInit` callback is called.
      * View queries are set before the `ngAfterViewInit` callback is called.
      * 
      * ### Example
      * 
      * ```
     */
    public AnonymousType717 queries;

    @JsProperty( name = "queries")
    public native AnonymousType717 getQueries();

    @JsProperty( name = "queries")
    public native void setQueries( AnonymousType717 value );

    /** 
      * The CSS selector that triggers the instantiation of a directive.
      * 
      * Angular only allows directives to trigger on CSS selectors that do not cross element
      * boundaries.
      * 
      * `selector` may be declared as one of the following:
      * 
      * - `element-name`: select by element name.
      * - `.class`: select by class name.
      * - `[attribute]`: select by attribute name.
      * - `[attribute=value]`: select by attribute name and value.
      * - `:not(sub_selector)`: select only if the element does not match the `sub_selector`.
      * - `selector1, selector2`: select if either `selector1` or `selector2` matches.
      * 
      * 
      * ### Example
      * 
      * Suppose we have a directive with an `input[type=text]` selector.
      * 
      * And the following HTML:
      * 
      * ```html
      * <form>
      *    <input type="text">
      *    <input type="radio">
      * <form>
      * ```
      * 
      * The directive would only be instantiated on the `<input type="text">` element.
     */
    public String selector;

    @JsProperty( name = "selector")
    public native String getSelector();

    @JsProperty( name = "selector")
    public native void setSelector( String value );
}
