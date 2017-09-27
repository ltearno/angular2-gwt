package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.UnionOfArrayOfObjectAndTypeOfObject;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives".Component
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:15212
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/directives.d.ts:25710
  * 1 constructors
  * Type of the Component metadata.
  * Component decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="Component")
public class Component extends Directive
{

    /*
        Constructors
    */
    public Component(Component obj){
        super(null);
    }

    /*
        Properties
    */

    /** 
      * Animations are defined on components via an animation-like DSL. This DSL approach to describing
      * animations allows for a flexibility that both benefits developers and the framework.
      * 
      * Animations work by listening on state changes that occur on an element within
      * the template. When a state change occurs, Angular can then take advantage and animate the
      * arc in between. This works similar to how CSS transitions work, however, by having a
      * programmatic DSL, animations are not limited to environments that are DOM-specific.
      * (Angular can also perform optimizations behind the scenes to make animations more performant.)
      * 
      * For animations to be available for use, animation state changes are placed within
      * {@link trigger animation triggers} which are housed inside of the `animations` annotation
      * metadata. Within a trigger both {@link state state} and {@link transition transition} entries
      * can be placed.
      * 
      * ```typescript` symbol followed by trigger name and an expression
      * that
      * is used to determine the state value for that trigger.
      * 
      * ```html
      * <!-- animation-cmp.html -->
      * <div @myTriggerName="expression">...</div>
      * ```
      * 
      * For state changes to be executed, the `expression` value must change value from its existing
      * value
      * to something that we have set an animation to animate on (in the example above we are listening
      * to a change of state between `on` and `off`). The `expression` value attached to the trigger
      * must be something that can be evaluated with the template/component context.
      * 
      * ### DSL Animation Functions
      * 
      * Please visit each of the animation DSL functions listed below to gain a better understanding
      * of how and why they are used for crafting animations in Angular:
      * 
      * - {@link trigger trigger()}
      * - {@link state state()}
      * - {@link transition transition()}
      * - {@link group group()}
      * - {@link sequence sequence()}
      * - {@link style style()}
      * - {@link animate animate()}
      * - {@link keyframes keyframes()}
     */
    public Array<Object> animations;

    @JsProperty( name = "animations")
    public native Array<Object> getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Array<Object> value );

    /** 
      * Defines the used change detection strategy.
      * 
      * When a component is instantiated, Angular creates a change detector, which is responsible for
      * propagating the component's bindings.
      * 
      * The `changeDetection` property defines, whether the change detection will be checked every time
      * or only when the component tells it to do so.
     */
    public ChangeDetectionStrategy changeDetection;

    @JsProperty( name = "changeDetection")
    public native ChangeDetectionStrategy getChangeDetection();

    @JsProperty( name = "changeDetection")
    public native void setChangeDetection( ChangeDetectionStrategy value );

    /** 
      * Specifies how the template and the styles should be encapsulated:
      * - {@link ViewEncapsulation#Native `ViewEncapsulation.Native`} to use shadow roots - only works
      *    if natively available on the platform,
      * - {@link ViewEncapsulation#Emulated `ViewEncapsulation.Emulated`} to use shimmed CSS that
      *    emulates the native behavior,
      * - {@link ViewEncapsulation#None `ViewEncapsulation.None`} to use global CSS without any
      *    encapsulation.
      * 
      * When no `encapsulation` is defined for the component, the default value from the
      * {@link CompilerOptions} is used. The default is `ViewEncapsulation.Emulated`}. Provide a new
      * `CompilerOptions` to override this value.
      * 
      * If the encapsulation is set to `ViewEncapsulation.Emulated` and the component has no `styles`
      * nor `styleUrls` the encapsulation will automatically be switched to `ViewEncapsulation.None`.
     */
    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    /** 
      * Defines the components that should be compiled as well when
      * this component is defined. For each components listed here,
      * Angular will create a {@link ComponentFactory} and store it in the
      * {@link ComponentFactoryResolver}.
     */
    public Array<UnionOfArrayOfObjectAndTypeOfObject> entryComponents;

    @JsProperty( name = "entryComponents")
    public native Array<UnionOfArrayOfObjectAndTypeOfObject> getEntryComponents();

    @JsProperty( name = "entryComponents")
    public native void setEntryComponents( Array<UnionOfArrayOfObjectAndTypeOfObject> value );

    /** 
      * Overrides the default encapsulation start and end delimiters (respectively `{{` and `}}`)
     */
    public Tuple<String, String> interpolation;

    @JsProperty( name = "interpolation")
    public native Tuple<String, String> getInterpolation();

    @JsProperty( name = "interpolation")
    public native void setInterpolation( Tuple<String, String> value );

    /** 
      * The module id of the module that contains the component.
      * Needed to be able to resolve relative urls for templates and styles.
      * In CommonJS, this can always be set to `module.id`, similarly SystemJS exposes `__moduleName`
      * variable within each module.
      * 
      * 
      * ## Simple Example
      * 
      * ```
     */
    public String moduleId;

    @JsProperty( name = "moduleId")
    public native String getModuleId();

    @JsProperty( name = "moduleId")
    public native void setModuleId( String value );

    /** 
      * If {@link Component#preserveWhitespaces Component.preserveWhitespaces} is set to `false`
      * potentially superfluous whitespace characters (ones matching the `\s` character class in
      * JavaScript regular expressions) will be removed from a compiled template. This can greatly
      * reduce AOT-generated code size as well as speed up view creation.
      * 
      * Current implementation works according to the following rules:
      * - all whitespaces at the beginning and the end of a template are removed (trimmed);
      * - text nodes consisting of whitespaces only are removed (ex.:
      *    `<button>Action 1</button>  <button>Action 2</button>` will be converted to
      *    `<button>Action 1</button><button>Action 2</button>` (no whitespaces between buttons);
      * - series of whitespaces in text nodes are replaced with one space (ex.:
      *    `<span>\n some text\n</span>` will be converted to `<span> some text </span>`);
      * - text nodes are left as-is inside HTML tags where whitespaces are significant (ex. `<pre>`,
      *    `<textarea>`).
      * 
      * Described transformations can (potentially) influence DOM nodes layout so the
      * `preserveWhitespaces` option is `true` be default (no whitespace removal).
      * In Angular 5 you need to opt-in for whitespace removal (but we might revisit the default
      * setting in Angular 6 or later). If you want to change the default setting for all components
      * in your application you can use the `preserveWhitespaces` option of the AOT compiler.
      * 
      * Even if you decide to opt-in for whitespace removal there are ways of preserving whitespaces
      * in certain fragments of a template. You can either exclude entire DOM sub-tree by using the
      * `ngPreserveWhitespaces` attribute, ex.:
      * 
      * ```html
      * <div ngPreserveWhitespaces>
      *      whitespaces are preserved here
      *      <span>    and here </span>
      * </div>
      * ```
      * 
      * Alternatively you can force a space to be preserved in a text node by using the `&ngsp;`
      * pseudo-entity. `&ngsp;` will be replaced with a space character by Angular's template
      * compiler, ex.:
      * 
      * ```html
      * <a>Spaces</a>&ngsp;<a>between</a>&ngsp;<a>links.</a>
      * ```
      * 
      * will be compiled to the equivalent of:
      * 
      * ```html
      * <a>Spaces</a> <a>between</a> <a>links.</a>
      * ```
      * 
      * Please note that sequences of `&ngsp;` are still collapsed to just one space character when
      * the `preserveWhitespaces` option is set to `false`. Ex.:
      * 
      * ```html
      * <a>before</a>&ngsp;&ngsp;&ngsp;<a>after</a>
      * ```
      * 
      * would be equivalent to:
      * 
      * ```html
      * <a>before</a> <a>after</a>
      * ```
      * 
      * The `&ngsp;` pseudo-entity is useful for forcing presence of
      * one space (a text node having `&ngsp;` pseudo-entities will never be removed), but it is not
      * meant to mark sequences of whitespace characters. The previously described
      * `ngPreserveWhitespaces` attribute is more useful for preserving sequences of whitespace
      * characters.
     */
    public Boolean preserveWhitespaces;

    @JsProperty( name = "preserveWhitespaces")
    public native Boolean getPreserveWhitespaces();

    @JsProperty( name = "preserveWhitespaces")
    public native void setPreserveWhitespaces( Boolean value );

    /** 
      * Specifies stylesheet URLs for an Angular component.
     */
    public Array<String> styleUrls;

    @JsProperty( name = "styleUrls")
    public native Array<String> getStyleUrls();

    @JsProperty( name = "styleUrls")
    public native void setStyleUrls( Array<String> value );

    /** 
      * Specifies inline stylesheets for an Angular component.
     */
    public Array<String> styles;

    @JsProperty( name = "styles")
    public native Array<String> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<String> value );

    /** 
      * Specifies an inline template for an Angular component.
      * 
      * Only one of `templateUrl` or `template` can be defined per Component.
     */
    public String template;

    @JsProperty( name = "template")
    public native String getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( String value );

    /** 
      * Specifies a template URL for an Angular component.
      * 
      * Only one of `templateUrl` or `template` can be defined per View.
     */
    public String templateUrl;

    @JsProperty( name = "templateUrl")
    public native String getTemplateUrl();

    @JsProperty( name = "templateUrl")
    public native void setTemplateUrl( String value );

    /** 
      * Defines the set of injectable objects that are visible to its view DOM children.
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
    public Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> viewProviders;

    @JsProperty( name = "viewProviders")
    public native Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> getViewProviders();

    @JsProperty( name = "viewProviders")
    public native void setViewProviders( Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> value );
}
