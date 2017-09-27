package fr.lteconsulting.jsinterop.ng.compiler.mlparser;

import fr.lteconsulting.jsinterop.browser.AnonymousType772;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/tags".TagDefinition
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/tags.d.ts:310
  * 
 */
@JsType(isNative=true, namespace="ng.compiler.mlparser", name="TagDefinition")
public class TagDefinition
{

    /*
        Properties
    */

    public Boolean canSelfClose;

    @JsProperty( name = "canSelfClose")
    public native Boolean getCanSelfClose();

    @JsProperty( name = "canSelfClose")
    public native void setCanSelfClose( Boolean value );

    public Boolean closedByParent;

    @JsProperty( name = "closedByParent")
    public native Boolean getClosedByParent();

    @JsProperty( name = "closedByParent")
    public native void setClosedByParent( Boolean value );

    public TagContentType contentType;

    @JsProperty( name = "contentType")
    public native TagContentType getContentType();

    @JsProperty( name = "contentType")
    public native void setContentType( TagContentType value );

    public Boolean ignoreFirstLf;

    @JsProperty( name = "ignoreFirstLf")
    public native Boolean getIgnoreFirstLf();

    @JsProperty( name = "ignoreFirstLf")
    public native void setIgnoreFirstLf( Boolean value );

    public String implicitNamespacePrefix;

    @JsProperty( name = "implicitNamespacePrefix")
    public native String getImplicitNamespacePrefix();

    @JsProperty( name = "implicitNamespacePrefix")
    public native void setImplicitNamespacePrefix( String value );

    public Boolean isVoid;

    @JsProperty( name = "isVoid")
    public native Boolean getIsVoid();

    @JsProperty( name = "isVoid")
    public native void setIsVoid( Boolean value );

    public String parentToAdd;

    @JsProperty( name = "parentToAdd")
    public native String getParentToAdd();

    @JsProperty( name = "parentToAdd")
    public native void setParentToAdd( String value );

    public AnonymousType772 requiredParents;

    @JsProperty( name = "requiredParents")
    public native AnonymousType772 getRequiredParents();

    @JsProperty( name = "requiredParents")
    public native void setRequiredParents( AnonymousType772 value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(isClosedByChild,27,,P(d1))
      * TE Signature : S(isClosedByChild,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/tags.d.ts@673
     */
    public native Boolean isClosedByChild(String name);
    /** 
      * Std Signature : S(requireExtraParent,27,,P(d1))
      * TE Signature : S(requireExtraParent,P(d1))
      * 
     */
    /** 
      * c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/ml_parser/tags.d.ts@617
     */
    public native Boolean requireExtraParent(String currentParent);
}
