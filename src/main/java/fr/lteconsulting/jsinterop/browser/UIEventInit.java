package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: UIEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281410
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="UIEventInit")
public class UIEventInit extends EventInit
{

    /*
        Properties
    */

    public Number detail;

    @JsProperty( name = "detail")
    public native Number getDetail();

    @JsProperty( name = "detail")
    public native void setDetail( Number value );

    public Window view;

    @JsProperty( name = "view")
    public native Window getView();

    @JsProperty( name = "view")
    public native void setView( Window value );
}
