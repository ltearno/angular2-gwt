package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs".IterableDiffers
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:4648
  * 1 constructors
  * A repository of different iterable diffing strategies used by NgFor, NgClass, and others.
 */
@JsType(isNative=true, namespace="ng.core", name="IterableDiffers")
public class IterableDiffers
{

    /*
        Constructors
    */
    public IterableDiffers(Array<IterableDifferFactory> factories){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:4959
     */
    @JsMethod(namespace="ng.core.IterableDiffers", name = "create")
    public static native IterableDiffers create(Array<IterableDifferFactory> factories, IterableDiffers parent /* optional */);
    /** 
      * Takes an array of {@link IterableDifferFactory} and returns a provider used to extend the
      * inherited {@link IterableDiffers} instance with the provided factories and return a new
      * {@link IterableDiffers} instance.
      * 
      * The following example shows how to extend an existing list of factories,
      * which will only be applied to the injector for this component and its children.
      * This step is all that's required to make a new {@link IterableDiffer} available.
      * 
      * ### Example
      * 
      * ```
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts:5753
     */
    @JsMethod(namespace="ng.core.IterableDiffers", name = "extend")
    public static native Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider extend(Array<IterableDifferFactory> factories);

    /*
        Properties
    */

    public Array<IterableDifferFactory> factories;

    @JsProperty( name = "factories")
    public native Array<IterableDifferFactory> getFactories();

    @JsProperty( name = "factories")
    public native void setFactories( Array<IterableDifferFactory> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(find,1199,,P(d3))
      * TE Signature : S(find,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/iterable_differs.d.ts@5818
     */
    public native IterableDifferFactory find(Object iterable);
}
