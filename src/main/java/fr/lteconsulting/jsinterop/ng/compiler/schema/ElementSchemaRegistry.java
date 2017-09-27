package fr.lteconsulting.jsinterop.ng.compiler.schema;

import fr.lteconsulting.jsinterop.browser.Array;
import fr.lteconsulting.jsinterop.browser.PropertyKey_UnionOfNumberAndString;
import fr.lteconsulting.jsinterop.ng.core.SchemaMetadata;
import fr.lteconsulting.jsinterop.ng.core.SecurityContext;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry".ElementSchemaRegistry
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts:267
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.schema", name="ElementSchemaRegistry")
public class ElementSchemaRegistry
{

    /*
        Methods
    */
    /** 
      * Std Signature : S(allKnownElementNames,7<1>,,)
      * TE Signature : S(allKnownElementNames,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@617
     */
    public native Array<String> allKnownElementNames();
    /** 
      * Std Signature : S(getDefaultComponentElementName,1,,)
      * TE Signature : S(getDefaultComponentElementName,)
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@722
     */
    public native String getDefaultComponentElementName();
    /** 
      * Std Signature : S(getMappedPropName,1,,P(d1))
      * TE Signature : S(getMappedPropName,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@664
     */
    public native String getMappedPropName(String propName);
    /** 
      * Std Signature : S(hasElement,27,,P(d1),P(d7<815>))
      * TE Signature : S(hasElement,P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@427
     */
    public native Boolean hasElement(String tagName, Array<SchemaMetadata> schemaMetas);
    /** 
      * Std Signature : S(hasProperty,27,,P(d1),P(d1),P(d7<815>))
      * TE Signature : S(hasProperty,P(d1),P(d1),P(d7))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@326
     */
    public native Boolean hasProperty(String tagName, String propName, Array<SchemaMetadata> schemaMetas);
    /** 
      * Std Signature : S(normalizeAnimationStyleProperty,1,,P(d1))
      * TE Signature : S(normalizeAnimationStyleProperty,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@978
     */
    public native String normalizeAnimationStyleProperty(String propName);
    /** 
      * Std Signature : S(normalizeAnimationStyleValue,3,,P(d1),P(d1),P(d1))
      * TE Signature : S(normalizeAnimationStyleValue,P(d1),P(d1),P(d1))
      * 
     */
    public native Object normalizeAnimationStyleValue(String camelCaseProp, String userProvidedProp, String val);
    /** 
      * Std Signature : S(normalizeAnimationStyleValue,3,,P(d1),P(d1),P(d2))
      * TE Signature : S(normalizeAnimationStyleValue,P(d1),P(d1),P(d2))
      * 
     */
    public native Object normalizeAnimationStyleValue(String camelCaseProp, String userProvidedProp, Number val);
    /** 
      * Std Signature : S(normalizeAnimationStyleValue,3,,P(d1),P(d1),P(dU(-2,1)))
      * TE Signature : S(normalizeAnimationStyleValue,P(d1),P(d1),P(dU(-2,1)))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@1050
     */
    public native Object normalizeAnimationStyleValue(String camelCaseProp, String userProvidedProp, PropertyKey_UnionOfNumberAndString val);
    /** 
      * Std Signature : S(securityContext,391,,P(d1),P(d1),P(d27))
      * TE Signature : S(securityContext,P(d1),P(d1),P(d27))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@509
     */
    public native SecurityContext securityContext(String elementName, String propName, Boolean isAttribute);
    /** 
      * Std Signature : S(validateAttribute,3,,P(d1))
      * TE Signature : S(validateAttribute,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@877
     */
    public native Object validateAttribute(String name);
    /** 
      * Std Signature : S(validateProperty,3,,P(d1))
      * TE Signature : S(validateProperty,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/schema/element_schema_registry.d.ts@777
     */
    public native Object validateProperty(String name);
}
