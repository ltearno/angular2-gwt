package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types".BindingDef
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/view/types.d.ts:5951
  * 
 */
@JsType(isNative=true, namespace="ng.core", name="BindingDef")
public class BindingDef
{

    /*
        Properties
    */

    public BindingFlags flags;

    @JsProperty( name = "flags")
    public native BindingFlags getFlags();

    @JsProperty( name = "flags")
    public native void setFlags( BindingFlags value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String nonMinifiedName;

    @JsProperty( name = "nonMinifiedName")
    public native String getNonMinifiedName();

    @JsProperty( name = "nonMinifiedName")
    public native void setNonMinifiedName( String value );

    public String ns;

    @JsProperty( name = "ns")
    public native String getNs();

    @JsProperty( name = "ns")
    public native void setNs( String value );

    public SecurityContext securityContext;

    @JsProperty( name = "securityContext")
    public native SecurityContext getSecurityContext();

    @JsProperty( name = "securityContext")
    public native void setSecurityContext( SecurityContext value );

    public String suffix;

    @JsProperty( name = "suffix")
    public native String getSuffix();

    @JsProperty( name = "suffix")
    public native void setSuffix( String value );
}
