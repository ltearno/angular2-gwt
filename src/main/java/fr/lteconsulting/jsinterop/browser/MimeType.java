package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MimeType
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:525926
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:526091
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MimeType")
public class MimeType
{

    /*
        Constructors
    */
    public MimeType(){
    }

    /*
        Properties
    */

    public String description;

    @JsProperty( name = "description")
    public native String getDescription();

    @JsProperty( name = "description")
    public native void setDescription( String value );

    public Plugin enabledPlugin;

    @JsProperty( name = "enabledPlugin")
    public native Plugin getEnabledPlugin();

    @JsProperty( name = "enabledPlugin")
    public native void setEnabledPlugin( Plugin value );

    public String suffixes;

    @JsProperty( name = "suffixes")
    public native String getSuffixes();

    @JsProperty( name = "suffixes")
    public native void setSuffixes( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
