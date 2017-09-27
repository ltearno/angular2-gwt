package fr.lteconsulting.jsinterop.ng.compiler.i18n;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer".SimplePlaceholderMapper
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts:1015
  * 1 constructors
  * A simple mapper that take a function to transform an internal name to a public name
 */
@JsType(isNative=true, namespace="ng.compiler.i18n", name="SimplePlaceholderMapper")
public class SimplePlaceholderMapper implements RecurseVisitor, PlaceholderMapper
{

    /*
        Constructors
    */
    public SimplePlaceholderMapper(Message message, Function1<String, String> mapName){
    }

    /*
        Properties
    */

    public Object internalToPublic;

    @JsProperty( name = "internalToPublic")
    public native Object getInternalToPublic();

    @JsProperty( name = "internalToPublic")
    public native void setInternalToPublic( Object value );

    public Object mapName;

    @JsProperty( name = "mapName")
    public native Object getMapName();

    @JsProperty( name = "mapName")
    public native void setMapName( Object value );

    public Object publicToInternal;

    @JsProperty( name = "publicToInternal")
    public native Object getPublicToInternal();

    @JsProperty( name = "publicToInternal")
    public native void setPublicToInternal( Object value );

    public Object publicToNextId;

    @JsProperty( name = "publicToNextId")
    public native Object getPublicToNextId();

    @JsProperty( name = "publicToNextId")
    public native void setPublicToNextId( Object value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(toInternalName,1,,P(d1))
      * TE Signature : S(toInternalName,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String toInternalName(String publicName);
    /** 
      * Std Signature : S(toPublicName,1,,P(d1))
      * TE Signature : S(toPublicName,P(d1))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native String toPublicName(String internalName);
    /** 
      * Std Signature : S(visitContainer,3,,P(d597))
      * TE Signature : S(visitContainer,P(d597))
      * 
     */
    public native Object visitContainer(Container container);
    /** 
      * Std Signature : S(visitContainer,3,,P(d597),P(d3))
      * TE Signature : S(visitContainer,P(d597),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitContainer(Container container, Object context /* optional */);
    /** 
      * Std Signature : S(visitIcu,3,,P(d599))
      * TE Signature : S(visitIcu,P(d599))
      * 
     */
    public native Object visitIcu(Icu icu);
    /** 
      * Std Signature : S(visitIcu,3,,P(d599),P(d3))
      * TE Signature : S(visitIcu,P(d599),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitIcu(Icu icu, Object context /* optional */);
    /** 
      * Std Signature : S(visitIcuPlaceholder,3,,P(d602))
      * TE Signature : S(visitIcuPlaceholder,P(d602))
      * 
     */
    public native Object visitIcuPlaceholder(IcuPlaceholder ph);
    /** 
      * Std Signature : S(visitIcuPlaceholder,3,,P(d602),P(d3))
      * TE Signature : S(visitIcuPlaceholder,P(d602),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitIcuPlaceholder(IcuPlaceholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitPlaceholder,3,,P(d601))
      * TE Signature : S(visitPlaceholder,P(d601))
      * 
     */
    public native Object visitPlaceholder(Placeholder ph);
    /** 
      * Std Signature : S(visitPlaceholder,3,,P(d601),P(d3))
      * TE Signature : S(visitPlaceholder,P(d601),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitPlaceholder(Placeholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitPlaceholderName,3,,P(d3))
      * TE Signature : S(visitPlaceholderName,P(d3))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/i18n/serializers/serializer.d.ts@1769
     */
    public native Object visitPlaceholderName(Object internalName);
    /** 
      * Std Signature : S(visitTagPlaceholder,3,,P(d600))
      * TE Signature : S(visitTagPlaceholder,P(d600))
      * 
     */
    public native Object visitTagPlaceholder(TagPlaceholder ph);
    /** 
      * Std Signature : S(visitTagPlaceholder,3,,P(d600),P(d3))
      * TE Signature : S(visitTagPlaceholder,P(d600),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitTagPlaceholder(TagPlaceholder ph, Object context /* optional */);
    /** 
      * Std Signature : S(visitText,3,,P(d596))
      * TE Signature : S(visitText,P(d596))
      * 
     */
    public native Object visitText(Text text);
    /** 
      * Std Signature : S(visitText,3,,P(d596),P(d3))
      * TE Signature : S(visitText,P(d596),P(d3))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Object visitText(Text text, Object context /* optional */);
}
