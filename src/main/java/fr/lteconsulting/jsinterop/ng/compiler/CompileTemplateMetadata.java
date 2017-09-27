package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.core.ViewEncapsulation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileTemplateMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:5764
  * 1 constructors
  * Metadata regarding compilation of a template.
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileTemplateMetadata")
public class CompileTemplateMetadata
{

    /*
        Constructors
    */
    public CompileTemplateMetadata(Object __0){
    }

    /*
        Properties
    */

    public Array<Object> animations;

    @JsProperty( name = "animations")
    public native Array<Object> getAnimations();

    @JsProperty( name = "animations")
    public native void setAnimations( Array<Object> value );

    public ViewEncapsulation encapsulation;

    @JsProperty( name = "encapsulation")
    public native ViewEncapsulation getEncapsulation();

    @JsProperty( name = "encapsulation")
    public native void setEncapsulation( ViewEncapsulation value );

    public Array<CompileStylesheetMetadata> externalStylesheets;

    @JsProperty( name = "externalStylesheets")
    public native Array<CompileStylesheetMetadata> getExternalStylesheets();

    @JsProperty( name = "externalStylesheets")
    public native void setExternalStylesheets( Array<CompileStylesheetMetadata> value );

    public Tuple<String, String> interpolation;

    @JsProperty( name = "interpolation")
    public native Tuple<String, String> getInterpolation();

    @JsProperty( name = "interpolation")
    public native void setInterpolation( Tuple<String, String> value );

    public Boolean isInline;

    @JsProperty( name = "isInline")
    public native Boolean getIsInline();

    @JsProperty( name = "isInline")
    public native void setIsInline( Boolean value );

    public Array<String> ngContentSelectors;

    @JsProperty( name = "ngContentSelectors")
    public native Array<String> getNgContentSelectors();

    @JsProperty( name = "ngContentSelectors")
    public native void setNgContentSelectors( Array<String> value );

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(toSummary,1220,,)
      * TE Signature : S(toSummary,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts@6831
     */
    public native CompileTemplateSummary toSummary();
}
