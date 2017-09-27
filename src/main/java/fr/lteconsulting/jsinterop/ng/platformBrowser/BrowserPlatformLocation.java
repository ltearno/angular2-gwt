package fr.lteconsulting.jsinterop.ng.platformBrowser;

import fr.lteconsulting.jsinterop.browser.Location;
import fr.lteconsulting.jsinterop.ng.common.PlatformLocation;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/location/browser_platform_location".BrowserPlatformLocation
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/@angular/platform-browser/src/browser/location/browser_platform_location.d.ts:278
  * 1 constructors
  * `PlatformLocation` encapsulates all of the direct calls to platform APIs.
  * This class should not be used directly by an application developer. Instead, use
  * {@link Location}.
 */
@JsType(isNative=true, namespace="ng.platformBrowser", name="BrowserPlatformLocation")
public class BrowserPlatformLocation extends PlatformLocation
{

    /*
        Constructors
    */
    public BrowserPlatformLocation(Object _doc){
    }

    /*
        Properties
    */

    public Object _doc;

    @JsProperty( name = "_doc")
    public native Object get_doc();

    @JsProperty( name = "_doc")
    public native void set_doc( Object value );

    public Object _history;

    @JsProperty( name = "_history")
    public native Object get_history();

    @JsProperty( name = "_history")
    public native void set_history( Object value );

    public Object _location;

    @JsProperty( name = "_location")
    public native Object get_location();

    @JsProperty( name = "_location")
    public native void set_location( Object value );

    public Location location;

    @JsProperty( name = "location")
    public native Location getLocation();

    @JsProperty( name = "location")
    public native void setLocation( Location value );
}
