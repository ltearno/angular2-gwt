package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs".KeyValueDiffers
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:3028
  * 1 constructors
  * A repository of different Map diffing strategies used by NgClass, NgStyle, and others.
 */
@JsType(isNative=true, namespace="ng.core", name="KeyValueDiffers")
public class KeyValueDiffers
{

    /*
        Constructors
    */
    public KeyValueDiffers(Array<KeyValueDifferFactory> factories){
    }

    /*
        Static methods
    */
    /** 
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:3337
     */
    @JsMethod(namespace="ng.core.KeyValueDiffers", name = "create")
    public static native <S> KeyValueDiffers create(Array<KeyValueDifferFactory> factories, KeyValueDiffers parent /* optional */);
    /** 
      * Takes an array of {@link KeyValueDifferFactory} and returns a provider used to extend the
      * inherited {@link KeyValueDiffers} instance with the provided factories and return a new
      * {@link KeyValueDiffers} instance.
      * 
      * The following example shows how to extend an existing list of factories,
      *       which will only be applied to the injector for this component and its children.
      *       This step is all that's required to make a new {@link KeyValueDiffer} available.
      * 
      * ### Example
      * 
      * ```
      * source : c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts:4145
     */
    @JsMethod(namespace="ng.core.KeyValueDiffers", name = "extend")
    public static native <S> Provider_UnionOfArrayOfObjectAndClassProviderAndExistingProviderAndFactoryProviderAndTypeProviderAndValueProvider extend(Array<KeyValueDifferFactory> factories);

    /*
        Properties
    */

    public Array<KeyValueDifferFactory> factories;

    @JsProperty( name = "factories")
    public native Array<KeyValueDifferFactory> getFactories();

    @JsProperty( name = "factories")
    public native void setFactories( Array<KeyValueDifferFactory> value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(find,1202,,P(d3))
      * TE Signature : S(find,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/change_detection/differs/keyvalue_differs.d.ts@4213
     */
    public native KeyValueDifferFactory find(Object kv);
}
