package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * base type: Canvas2DContextAttributes
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:737723
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Canvas2DContextAttributes")
public class Canvas2DContextAttributes
{

    @JsOverlay
    public final void setByIndex(String index, UnionOfBooleanAndString value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final UnionOfBooleanAndString getByIndex(String index) {
        return (UnionOfBooleanAndString) Js.asPropertyMap(this).get(index);
    }

    /*
        Properties
    */

    public Boolean alpha;

    @JsProperty( name = "alpha")
    public native Boolean getAlpha();

    @JsProperty( name = "alpha")
    public native void setAlpha( Boolean value );

    public Boolean storage;

    @JsProperty( name = "storage")
    public native Boolean getStorage();

    @JsProperty( name = "storage")
    public native void setStorage( Boolean value );

    public Boolean willReadFrequently;

    @JsProperty( name = "willReadFrequently")
    public native Boolean getWillReadFrequently();

    @JsProperty( name = "willReadFrequently")
    public native void setWillReadFrequently( Boolean value );
}
