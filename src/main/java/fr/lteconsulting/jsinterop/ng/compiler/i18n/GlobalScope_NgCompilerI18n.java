package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.AnonymousType1288;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.InterpolationConfig;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.Node;
import fr.lteconsulting.jsinterop.ng.compiler.mlparser.ParseTreeResult;
import fr.lteconsulting.prebuilt.Function4;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.i18n (java fr.lteconsulting.jsinterop.ng.compiler.i18n) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.i18n")
public class GlobalScope_NgCompilerI18n
{

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.i18n", name = "digest")
    public static native String digest(Message message);
    @JsMethod(namespace="ng.compiler.i18n", name = "toPublicName")
    public static native String toPublicName(String internalName);
    @JsMethod(namespace="ng.compiler.i18n", name = "decimalDigest")
    public static native String decimalDigest(Message message);
    @JsMethod(namespace="ng.compiler.i18n", name = "serializeNodes")
    public static native Array<String> serializeNodes(Array<Node> nodes);
    @JsMethod(namespace="ng.compiler.i18n", name = "sha1")
    public static native String sha1(String str);
    @JsMethod(namespace="ng.compiler.i18n", name = "fingerprint")
    public static native Tuple<Number, Number> fingerprint(String str);
    @JsMethod(namespace="ng.compiler.i18n", name = "computeMsgId")
    public static native String computeMsgId(String msg, String meaning);
    @JsMethod(namespace="ng.compiler.i18n", name = "extractMessages")
    public static native ExtractionResult extractMessages(Array<Node> nodes, InterpolationConfig interpolationConfig, Array<String> implicitTags, AnonymousType1288 implicitAttrs);
    @JsMethod(namespace="ng.compiler.i18n", name = "mergeTranslations")
    public static native ParseTreeResult mergeTranslations(Array<Node> nodes, TranslationBundle translations, InterpolationConfig interpolationConfig, Array<String> implicitTags, AnonymousType1288 implicitAttrs);
    @JsMethod(namespace="ng.compiler.i18n", name = "createI18nMessageFactory")
    public static native Function4<Array<Node>, String, String, String, Message> createI18nMessageFactory(InterpolationConfig interpolationConfig);
    @JsMethod(namespace="ng.compiler.i18n", name = "serialize")
    public static native String serialize(Array<Node> nodes);
}
