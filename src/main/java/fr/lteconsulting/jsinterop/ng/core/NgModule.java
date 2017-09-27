package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject;
import fr.lteconsulting.jsinterop.UnionOfArrayOfObjectAndSchemaMetadata;
import fr.lteconsulting.jsinterop.UnionOfArrayOfObjectAndTypeOfObject;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/ng_module".NgModule
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/ng_module.d.ts:1298
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/ng_module.d.ts:4588
  * 1 constructors
  * Type of the NgModule metadata.
  * NgModule decorator and metadata.
 */
@JsType(isNative=true, namespace="ng.core", name="NgModule")
public class NgModule
{

    /*
        Constructors
    */
    public NgModule(NgModule obj){
    }

    /*
        Properties
    */

    /** 
      * Defines the components that should be bootstrapped when
      * this module is bootstrapped. The components listed here
      * will automatically be added to `entryComponents`.
     */
    //public Array<UnionOfArrayOfObjectAndTypeOfObject> bootstrap;
    public Array<?> bootstrap;

    @JsProperty( name = "bootstrap")
    public native Array<UnionOfArrayOfObjectAndTypeOfObject> getBootstrap();

    @JsProperty( name = "bootstrap")
    public native void setBootstrap( Array<UnionOfArrayOfObjectAndTypeOfObject> value );

    /** 
      * Specifies a list of directives/pipes that belong to this module.
      * 
      * ### Example
      * 
      * ```javascript
     */
    //public Array<UnionOfArrayOfObjectAndTypeOfObject> declarations;
    public Array<?> declarations;

    @JsProperty( name = "declarations")
    public native Array<UnionOfArrayOfObjectAndTypeOfObject> getDeclarations();

    @JsProperty( name = "declarations")
    public native void setDeclarations( Array<UnionOfArrayOfObjectAndTypeOfObject> value );

    /** 
      * Specifies a list of components that should be compiled when this module is defined.
      * For each component listed here, Angular will create a {@link ComponentFactory}
      * and store it in the {@link ComponentFactoryResolver}.
     */
    public Array<UnionOfArrayOfObjectAndTypeOfObject> entryComponents;

    @JsProperty( name = "entryComponents")
    public native Array<UnionOfArrayOfObjectAndTypeOfObject> getEntryComponents();

    @JsProperty( name = "entryComponents")
    public native void setEntryComponents( Array<UnionOfArrayOfObjectAndTypeOfObject> value );

    /** 
      * Specifies a list of directives/pipes/modules that can be used within the template
      * of any component that is part of an Angular module
      * that imports this Angular module.
      * 
      * ### Example
      * 
      * ```javascript
     */
    public Array<UnionOfArrayOfObjectAndTypeOfObject> exports;

    @JsProperty( name = "exports")
    public native Array<UnionOfArrayOfObjectAndTypeOfObject> getExports();

    @JsProperty( name = "exports")
    public native void setExports( Array<UnionOfArrayOfObjectAndTypeOfObject> value );

    /** 
      * An opaque ID for this module, e.g. a name or a path. Used to identify modules in
      * `getModuleFactory`. If left `undefined`, the `NgModule` will not be registered with
      * `getModuleFactory`.
     */
    public String id;

    @JsProperty( name = "id")
    public native String getId();

    @JsProperty( name = "id")
    public native void setId( String value );

    /** 
      * Specifies a list of modules whose exported directives/pipes
      * should be available to templates in this module.
      * This can also contain {@link ModuleWithProviders}.
      * 
      * ### Example
      * 
      * ```javascript
     */
    //public Array<UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject> imports;
    public Array<?> imports;

    @JsProperty( name = "imports")
    public native Array<UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject> getImports();

    @JsProperty( name = "imports")
    public native void setImports( Array<UnionOfArrayOfObjectAndModuleWithProvidersAndTypeOfObject> value );

    /** 
      * Defines the set of injectable objects that are available in the injector
      * of this module.
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
    //public Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> providers;
    public Array<?> providers;

    @JsProperty( name = "providers")
    public native Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> getProviders();

    @JsProperty( name = "providers")
    public native void setProviders( Array<Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider> value );

    /** 
      * Elements and properties that are not Angular components nor directives have to be declared in
      * the schema.
      * 
      * Available schemas:
      * - `NO_ERRORS_SCHEMA`: any elements and properties are allowed,
      * - `CUSTOM_ELEMENTS_SCHEMA`: any custom elements (tag name has "-") with any properties are
      *    allowed.
     */
    public Array<UnionOfArrayOfObjectAndSchemaMetadata> schemas;

    @JsProperty( name = "schemas")
    public native Array<UnionOfArrayOfObjectAndSchemaMetadata> getSchemas();

    @JsProperty( name = "schemas")
    public native void setSchemas( Array<UnionOfArrayOfObjectAndSchemaMetadata> value );
}
