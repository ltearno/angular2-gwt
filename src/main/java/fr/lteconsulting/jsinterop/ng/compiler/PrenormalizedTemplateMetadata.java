package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ViewEncapsulation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer".PrenormalizedTemplateMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/directive_normalizer.d.ts:630
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="PrenormalizedTemplateMetadata")
public class PrenormalizedTemplateMetadata
{

    /*
        Properties
    */

    public Array<CompileAnimationEntryMetadata> animations;

    @JsProperty( name = "animations")
    public native Array<CompileAnimationEntryMetadata> getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Array<CompileAnimationEntryMetadata> value );

    public Object componentType;

    @JsProperty( name = "componentType")
    public native Object getComponentType();

    @JsProperty( name = "componentType")
    public native void setComponentType( Object value );

    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    public Tuple<String, String> interpolation;

    @JsProperty( name = "interpolation")
    public native Tuple<String, String> getInterpolation();

    @JsProperty( name = "interpolation")
    public native void setInterpolation( Tuple<String, String> value );

    public String moduleUrl;

    @JsProperty( name = "moduleUrl")
    public native String getModuleUrl();

    @JsProperty( name = "moduleUrl")
    public native void setModuleUrl( String value );

    public Object ngModuleType;

    @JsProperty( name = "ngModuleType")
    public native Object getNgModuleType();

    @JsProperty( name = "ngModuleType")
    public native void setNgModuleType( Object value );

    public Boolean preserveWhitespaces;

    @JsProperty( name = "preserveWhitespaces")
    public native Boolean getPreserveWhitespaces();

    @JsProperty( name = "preserveWhitespaces")
    public native void setPreserveWhitespaces( Boolean value );

    public Array<String> styleUrls;

    @JsProperty( name = "styleUrls")
    public native Array<String> getStyleUrls();

    @JsProperty( name = "styleUrls")
    public native void setStyleUrls( Array<String> value );

    public Array<String> styles;

    @JsProperty( name = "styles")
    public native Array<String> getStyles();

    @JsProperty( name = "styles")
    public native void setStyles( Array<String> value );

    public String template;

    @JsProperty( name = "template")
    public native String getTemplate();

    @JsProperty( name = "template")
    public native void setTemplate( String value );

    public String templateUrl;

    @JsProperty( name = "templateUrl")
    public native String getTemplateUrl();

    @JsProperty( name = "templateUrl")
    public native void setTemplateUrl( String value );
}
