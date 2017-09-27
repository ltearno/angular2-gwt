package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StyleSheet
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649087
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649335
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheet")
public class StyleSheet
{

    /*
        Constructors
    */
    public StyleSheet(){
    }

    /*
        Properties
    */

    public Boolean disabled;

    @JsProperty( name = "disabled")
    public native Boolean getDisabled();

    @JsProperty( name = "disabled")
    public native void setDisabled( Boolean value );

    public String href;

    @JsProperty( name = "href")
    public native String getHref();

    @JsProperty( name = "href")
    public native void setHref( String value );

    public MediaList media;

    @JsProperty( name = "media")
    public native MediaList getMedia();

    @JsProperty( name = "media")
    public native void setMedia( MediaList value );

    public Node ownerNode;

    @JsProperty( name = "ownerNode")
    public native Node getOwnerNode();

    @JsProperty( name = "ownerNode")
    public native void setOwnerNode( Node value );

    public StyleSheet parentStyleSheet;

    @JsProperty( name = "parentStyleSheet")
    public native StyleSheet getParentStyleSheet();

    @JsProperty( name = "parentStyleSheet")
    public native void setParentStyleSheet( StyleSheet value );

    public String title;

    @JsProperty( name = "title")
    public native String getTitle();

    @JsProperty( name = "title")
    public native void setTitle( String value );

    public String type;

    @JsProperty( name = "type")
    public native String getType();

    @JsProperty( name = "type")
    public native void setType( String value );
}
