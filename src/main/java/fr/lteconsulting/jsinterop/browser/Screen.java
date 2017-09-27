package fr.lteconsulting.jsinterop.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: Screen
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:638266
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:639232
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Screen")
public class Screen implements EventTarget
{

    /*
        Constructors
    */
    public Screen(){
    }

    /*
        Properties
    */

    public Number availHeight;

    @JsProperty( name = "availHeight")
    public native Number getAvailHeight();

    @JsProperty( name = "availHeight")
    public native void setAvailHeight( Number value );

    public Number availWidth;

    @JsProperty( name = "availWidth")
    public native Number getAvailWidth();

    @JsProperty( name = "availWidth")
    public native void setAvailWidth( Number value );

    public Number bufferDepth;

    @JsProperty( name = "bufferDepth")
    public native Number getBufferDepth();

    @JsProperty( name = "bufferDepth")
    public native void setBufferDepth( Number value );

    public Number colorDepth;

    @JsProperty( name = "colorDepth")
    public native Number getColorDepth();

    @JsProperty( name = "colorDepth")
    public native void setColorDepth( Number value );

    public Number deviceXDPI;

    @JsProperty( name = "deviceXDPI")
    public native Number getDeviceXDPI();

    @JsProperty( name = "deviceXDPI")
    public native void setDeviceXDPI( Number value );

    public Number deviceYDPI;

    @JsProperty( name = "deviceYDPI")
    public native Number getDeviceYDPI();

    @JsProperty( name = "deviceYDPI")
    public native void setDeviceYDPI( Number value );

    public Boolean fontSmoothingEnabled;

    @JsProperty( name = "fontSmoothingEnabled")
    public native Boolean getFontSmoothingEnabled();

    @JsProperty( name = "fontSmoothingEnabled")
    public native void setFontSmoothingEnabled( Boolean value );

    public Number height;

    @JsProperty( name = "height")
    public native Number getHeight();

    @JsProperty( name = "height")
    public native void setHeight( Number value );

    public Number logicalXDPI;

    @JsProperty( name = "logicalXDPI")
    public native Number getLogicalXDPI();

    @JsProperty( name = "logicalXDPI")
    public native void setLogicalXDPI( Number value );

    public Number logicalYDPI;

    @JsProperty( name = "logicalYDPI")
    public native Number getLogicalYDPI();

    @JsProperty( name = "logicalYDPI")
    public native void setLogicalYDPI( Number value );

    public String msOrientation;

    @JsProperty( name = "msOrientation")
    public native String getMsOrientation();

    @JsProperty( name = "msOrientation")
    public native void setMsOrientation( String value );

    public Function1<Event, Object> onmsorientationchange;

    @JsProperty( name = "onmsorientationchange")
    public native Function1<Event, Object> getOnmsorientationchange();

    @JsProperty( name = "onmsorientationchange")
    public native void setOnmsorientationchange( Function1<Event, Object> value );

    public Number pixelDepth;

    @JsProperty( name = "pixelDepth")
    public native Number getPixelDepth();

    @JsProperty( name = "pixelDepth")
    public native void setPixelDepth( Number value );

    public Number systemXDPI;

    @JsProperty( name = "systemXDPI")
    public native Number getSystemXDPI();

    @JsProperty( name = "systemXDPI")
    public native void setSystemXDPI( Number value );

    public Number systemYDPI;

    @JsProperty( name = "systemYDPI")
    public native Number getSystemYDPI();

    @JsProperty( name = "systemYDPI")
    public native void setSystemYDPI( Number value );

    public Number width;

    @JsProperty( name = "width")
    public native Number getWidth();

    @JsProperty( name = "width")
    public native void setWidth( Number value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(addEventListener,289,,P(d1))
      * TE Signature : S(addEventListener,P(d1))
      * 
     */
    public native void addEventListener(String type);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138))
      * TE Signature : S(addEventListener,P(d1),P(d138))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(addEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(addEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(dispatchEvent,27,,P(d77))
      * TE Signature : S(dispatchEvent,P(d77))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native Boolean dispatchEvent(Event evt);
    /** 
      * Std Signature : S(msLockOrientation,27,,P(d1))
      * TE Signature : S(msLockOrientation,P(d1))
      * 
     */
    public native Boolean msLockOrientation(String orientations);
    /** 
      * Std Signature : S(msLockOrientation,27,,P(d7<1>))
      * TE Signature : S(msLockOrientation,P(d7))
      * 
     */
    public native Boolean msLockOrientation(Array<String> orientations);
    /** 
      * Std Signature : S(msLockOrientation,27,,P(dU(-7<1>,4)))
      * TE Signature : S(msLockOrientation,P(dU(-7,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@638867
     */
    public native Boolean msLockOrientation(UnionOfArrayOfStringAndString orientations);
    /** 
      * Std Signature : S(msUnlockOrientation,289,,)
      * TE Signature : S(msUnlockOrientation,)
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@638932
     */
    public native void msUnlockOrientation();
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1))
      * TE Signature : S(removeEventListener,P(d1))
      * 
     */
    public native void removeEventListener(String type);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138))
      * TE Signature : S(removeEventListener,P(d1),P(d138))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(d138),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(d138),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dF--S(?,289,,P(d77))------)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dF--S(?,P(d77))------)),P(d27))
      * 
     */
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)))
      * 
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * Std Signature : S(removeEventListener,289,,P(d1),P(dU(-F--S(?,289,,P(d77))------),138)),P(d27))
      * TE Signature : S(removeEventListener,P(d1),P(dU(-F--S(?,P(d77))------),138)),P(d27))
      * 
     */
    /** 
      * added from type hierarchy
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
}
