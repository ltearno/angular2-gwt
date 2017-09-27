package fr.lteconsulting.jsinterop.ng.compiler.aot;

import fr.lteconsulting.jsinterop.ng.core.MissingTranslationStrategy;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler_options".AotCompilerOptions
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/aot/compiler_options.d.ts:262
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.aot", name="AotCompilerOptions")
public class AotCompilerOptions
{

    /*
        Properties
    */

    public Boolean enableLegacyTemplate;

    @JsProperty( name = "enableLegacyTemplate")
    public native Boolean getEnableLegacyTemplate();

    @JsProperty( name = "enableLegacyTemplate")
    public native void setEnableLegacyTemplate( Boolean value );

    public Boolean enableSummariesForJit;

    @JsProperty( name = "enableSummariesForJit")
    public native Boolean getEnableSummariesForJit();

    @JsProperty( name = "enableSummariesForJit")
    public native void setEnableSummariesForJit( Boolean value );

    public String i18nFormat;

    @JsProperty( name = "i18nFormat")
    public native String getI18nFormat();

    @JsProperty( name = "i18nFormat")
    public native void setI18nFormat( String value );

    public String locale;

    @JsProperty( name = "locale")
    public native String getLocale();

    @JsProperty( name = "locale")
    public native void setLocale( String value );

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

    public String translations;

    @JsProperty( name = "translations")
    public native String getTranslations();

    @JsProperty( name = "translations")
    public native void setTranslations( String value );
}
