package fr.lteconsulting.jsinterop.ng.compiler;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata".CompileDiDependencyMetadata
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/compiler/src/compile_metadata.d.ts:3870
  * 
 */
@JsType(isNative=true, namespace="ng.compiler", name="CompileDiDependencyMetadata")
public class CompileDiDependencyMetadata
{

    /*
        Properties
    */

    public Boolean isAttribute;

    @JsProperty( name = "isAttribute")
    public native Boolean getIsAttribute();

    @JsProperty( name = "isAttribute")
    public native void setIsAttribute( Boolean value );

    public Boolean isHost;

    @JsProperty( name = "isHost")
    public native Boolean getIsHost();

    @JsProperty( name = "isHost")
    public native void setIsHost( Boolean value );

    public Boolean isOptional;

    @JsProperty( name = "isOptional")
    public native Boolean getIsOptional();

    @JsProperty( name = "isOptional")
    public native void setIsOptional( Boolean value );

    public Boolean isSelf;

    @JsProperty( name = "isSelf")
    public native Boolean getIsSelf();

    @JsProperty( name = "isSelf")
    public native void setIsSelf( Boolean value );

    public Boolean isSkipSelf;

    @JsProperty( name = "isSkipSelf")
    public native Boolean getIsSkipSelf();

    @JsProperty( name = "isSkipSelf")
    public native void setIsSkipSelf( Boolean value );

    public Boolean isValue;

    @JsProperty( name = "isValue")
    public native Boolean getIsValue();

    @JsProperty( name = "isValue")
    public native void setIsValue( Boolean value );

    public CompileTokenMetadata token;

    @JsProperty( name = "token")
    public native CompileTokenMetadata getToken();

    @JsProperty( name = "token")
    public native void setToken( CompileTokenMetadata value );

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}
