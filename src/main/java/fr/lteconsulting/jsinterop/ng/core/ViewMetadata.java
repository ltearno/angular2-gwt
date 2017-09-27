package fr.lteconsulting.jsinterop.ng.core;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/view".ViewMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/metadata/view.d.ts:1126
  * 1 constructors
  * Metadata properties available for configuring Views.
  * 
  * For details on the `@Component` annotation, see {@link Component}.
  * 
  * ### Example
  * 
  * ```
 */
@JsType(isNative=true, namespace="ng.core", name="ViewMetadata")
public class ViewMetadata
{

    /*
        Constructors
    */
    public ViewMetadata(Object opts){
    }

    /*
        Properties
    */

    /** 
      * {@link Component#animation} 
     */
    public Array<Object> animations;

    @JsProperty( name = "animations")
    public native Array<Object> getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Array<Object> value );

    /** 
      * {@link Component#encapsulation} 
     */
    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    /** 
      * {@link Component#interpolation} 
     */
    public Tuple<String, String> interpolation;

    @JsProperty( name = "interpolation")
    public native Tuple<String, String> getInterpolation();

    @JsProperty( name = "interpolation")
    public native void setInterpolation( Tuple<String, String> value );

    /** 
      * {@link Component#stylesUrl} 
     */
    public Array<String> styleUrls;

    @JsProperty( name = "styleUrls")
    public native Array<String> getStyleUrls();

    @JsProperty( name = "styleUrls")
    public native void setStyleUrls( Array<String> value );

    /** 
      * {@link Component#styles} 
     */
    public Array<String> styles;

    @JsProperty( name = "styles")
    public native Array<String> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<String> value );

    /** 
      * {@link Component#template} 
     */
    public String template;

    @JsProperty( name = "template")
    public native String getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( String value );

    /** 
      * {@link Component#templateUrl} 
     */
    public String templateUrl;

    @JsProperty( name = "templateUrl")
    public native String getTemplateUrl();

    @JsProperty( name = "templateUrl")
    public native void setTemplateUrl( String value );
}
