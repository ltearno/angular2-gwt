package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.Tuple;
import fr.lteconsulting.jsinterop.browser.AnonymousType817;
import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.ng.compiler.AstPath;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 

  * Wrapper class for all global definition of ng.compiler.mlparser (java fr.lteconsulting.jsinterop.ng.compiler.mlparser) package
 */
@JsType(isNative=true, namespace="ng", name="compiler.mlparser")
public class GlobalScope_NgCompilerMlparser
{

    /*
        Static properties
    */

    @JsProperty(namespace="ng.compiler.mlparser", name="DEFAULT_INTERPOLATION_CONFIG")
    public static InterpolationConfig DEFAULT_INTERPOLATION_CONFIG;

    @JsProperty(namespace="ng.compiler.mlparser", name="NAMED_ENTITIES")
    public static AnonymousType817 NAMED_ENTITIES;

    /*
        Static methods
    */
    @JsMethod(namespace="ng.compiler.mlparser", name = "visitAll")
    public static native Array<Object> visitAll(Visitor visitor, Array<Node> nodes, Object context /* optional */);
    @JsMethod(namespace="ng.compiler.mlparser", name = "findNode")
    public static native AstPath<Node> findNode(Array<Node> nodes, Number position);
    @JsMethod(namespace="ng.compiler.mlparser", name = "splitNsName")
    public static native Tuple<String, String> splitNsName(String elementName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "isNgContainer")
    public static native Boolean isNgContainer(String tagName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "isNgContent")
    public static native Boolean isNgContent(String tagName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "isNgTemplate")
    public static native Boolean isNgTemplate(String tagName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "getNsPrefix")
    public static native String getNsPrefix(String fullName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "getNsPrefix")
    public static native Void getNsPrefix(Void fullName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "mergeNsAndName")
    public static native String mergeNsAndName(String prefix, String localName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "getHtmlTagDefinition")
    public static native HtmlTagDefinition getHtmlTagDefinition(String tagName);
    @JsMethod(namespace="ng.compiler.mlparser", name = "replaceNgsp")
    public static native String replaceNgsp(String value);
    @JsMethod(namespace="ng.compiler.mlparser", name = "removeWhitespaces")
    public static native ParseTreeResult removeWhitespaces(ParseTreeResult htmlAstWithErrors);
    @JsMethod(namespace="ng.compiler.mlparser", name = "expandNodes")
    public static native ExpansionResult expandNodes(Array<Node> nodes);
    @JsMethod(namespace="ng.compiler.mlparser", name = "tokenize")
    public static native TokenizeResult tokenize(String source, String url, Function1<String, TagDefinition> getTagDefinition, Boolean tokenizeExpansionForms /* optional */, InterpolationConfig interpolationConfig /* optional */);
    @JsMethod(namespace="ng.compiler.mlparser", name = "getXmlTagDefinition")
    public static native XmlTagDefinition getXmlTagDefinition(String tagName);
}
