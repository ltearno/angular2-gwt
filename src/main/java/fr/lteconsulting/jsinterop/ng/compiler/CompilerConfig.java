package fr.lteconsulting.jsinterop.ng.compiler;

import fr.lteconsulting.jsinterop.ng.core.MissingTranslationStrategy;
import fr.lteconsulting.jsinterop.ng.core.ViewEncapsulation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/config".CompilerConfig
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/config.d.ts:281
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompilerConfig")
public class CompilerConfig
{

    /*
        Constructors
    */
    public CompilerConfig(Object __0){
    }

    /*
        Properties
    */

    public ViewEncapsulation defaultEncapsulation;

    @JsProperty( name = "defaultEncapsulation")
    public native ViewEncapsulation getDefaultEncapsulation();

    @JsProperty( name = "defaultEncapsulation")
    public native void setDefaultEncapsulation( ViewEncapsulation value );

    public Boolean enableLegacyTemplate;

    @JsProperty( name = "enableLegacyTemplate")
    public native Boolean getEnableLegacyTemplate();

    @JsProperty( name = "enableLegacyTemplate")
    public native void setEnableLegacyTemplate( Boolean value );

    public MissingTranslationStrategy missingTranslation;

    @JsProperty( name = "missingTranslation")
    public native MissingTranslationStrategy getMissingTranslation();

    @JsProperty( name = "missingTranslation")
    public native void setMissingTranslation( MissingTranslationStrategy value );

    public Boolean preserveWhitespaces;

    @JsProperty( name = "preserveWhitespaces")
    public native Boolean getPreserveWhitespaces();

    @JsProperty( name = "preserveWhitespaces")
    public native void setPreserveWhitespaces( Boolean value );

    public Boolean useJit;

    @JsProperty( name = "useJit")
    public native Boolean getUseJit();

    @JsProperty( name = "useJit")
    public native void setUseJit( Boolean value );
}
