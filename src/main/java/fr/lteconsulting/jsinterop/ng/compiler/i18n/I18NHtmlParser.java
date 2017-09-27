package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.ng.compiler.mlparser.HtmlParser;
import fr.lteconsulting.jsinterop.ng.core.Console;
import fr.lteconsulting.jsinterop.ng.core.MissingTranslationStrategy;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_html_parser".I18NHtmlParser
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/i18n_html_parser.d.ts:466
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="I18NHtmlParser")
public class I18NHtmlParser extends HtmlParser
{

    /*
        Constructors
    */
    public I18NHtmlParser(HtmlParser _htmlParser, String translations, String translationsFormat, MissingTranslationStrategy missingTranslation, Console console){
    }

    /*
        Properties
    */

    public Object _htmlParser;

    @JsProperty( name = "_htmlParser")
    public native Object get_htmlParser();

    @JsProperty( name = "_htmlParser")
    public native void set_htmlParser( Object value );

    public Object _translationBundle;

    @JsProperty( name = "_translationBundle")
    public native Object get_translationBundle();

    @JsProperty( name = "_translationBundle")
    public native void set_translationBundle( Object value );

    public Object getTagDefinition;

    @JsProperty( name = "getTagDefinition")
    public native Object getGetTagDefinition();

    @JsProperty( name = "getTagDefinition")
    public native void setGetTagDefinition( Object value );
}
