package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSGraphicsTrust
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:505892
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:506007
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGraphicsTrust")
public class MSGraphicsTrust
{

    /*
        Constructors
    */
    public MSGraphicsTrust(){
    }

    /*
        Properties
    */

    public Boolean constrictionActive;

    @JsProperty( name = "constrictionActive")
    public native Boolean getConstrictionActive();

    @JsProperty( name = "constrictionActive")
    public native void setConstrictionActive( Boolean value );

    public String status;

    @JsProperty( name = "status")
    public native String getStatus();

    @JsProperty( name = "status")
    public native void setStatus( String value );
}
