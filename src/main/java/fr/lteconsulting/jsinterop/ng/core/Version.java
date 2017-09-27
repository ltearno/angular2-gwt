package fr.lteconsulting.jsinterop.ng.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/version".Version
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/core/src/version.d.ts:0
  * 1 constructors
 */
@JsType(isNative=true, namespace="ng.core", name="Version")
public class Version
{

    /*
        Constructors
    */
    public Version(String full){
    }

    /*
        Properties
    */

    public String full;

    @JsProperty( name = "full")
    public native String getFull();

    @JsProperty( name = "full")
    public native void setFull( String value );

    public String major;

    @JsProperty( name = "major")
    public native String getMajor();

    @JsProperty( name = "major")
    public native void setMajor( String value );

    public String minor;

    @JsProperty( name = "minor")
    public native String getMinor();

    @JsProperty( name = "minor")
    public native void setMinor( String value );

    public String patch;

    @JsProperty( name = "patch")
    public native String getPatch();

    @JsProperty( name = "patch")
    public native void setPatch( String value );
}
