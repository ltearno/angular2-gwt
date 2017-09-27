package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: MSStreamReader
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:513865
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:514561
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSStreamReader")
public class MSStreamReader extends MSBaseReader implements EventTarget
{

    /*
        Constructors
    */
    public MSStreamReader(){
    }

    /*
        Properties
    */

    public DOMError error;

    @JsProperty( name = "error")
    public native DOMError getError();

    @JsProperty( name = "error")
    public native void setError( DOMError value );

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
      * Std Signature : S(readAsArrayBuffer,289,,P(d101))
      * TE Signature : S(readAsArrayBuffer,P(d101))
      * 
     */
    public native void readAsArrayBuffer(MSStream stream);
    /** 
      * Std Signature : S(readAsArrayBuffer,289,,P(d101),P(d2))
      * TE Signature : S(readAsArrayBuffer,P(d101),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@513962
     */
    public native void readAsArrayBuffer(MSStream stream, Number size /* optional */);
    /** 
      * Std Signature : S(readAsBinaryString,289,,P(d101))
      * TE Signature : S(readAsBinaryString,P(d101))
      * 
     */
    public native void readAsBinaryString(MSStream stream);
    /** 
      * Std Signature : S(readAsBinaryString,289,,P(d101),P(d2))
      * TE Signature : S(readAsBinaryString,P(d101),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@514024
     */
    public native void readAsBinaryString(MSStream stream, Number size /* optional */);
    /** 
      * Std Signature : S(readAsBlob,289,,P(d101))
      * TE Signature : S(readAsBlob,P(d101))
      * 
     */
    public native void readAsBlob(MSStream stream);
    /** 
      * Std Signature : S(readAsBlob,289,,P(d101),P(d2))
      * TE Signature : S(readAsBlob,P(d101),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@514087
     */
    public native void readAsBlob(MSStream stream, Number size /* optional */);
    /** 
      * Std Signature : S(readAsDataURL,289,,P(d101))
      * TE Signature : S(readAsDataURL,P(d101))
      * 
     */
    public native void readAsDataURL(MSStream stream);
    /** 
      * Std Signature : S(readAsDataURL,289,,P(d101),P(d2))
      * TE Signature : S(readAsDataURL,P(d101),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@514142
     */
    public native void readAsDataURL(MSStream stream, Number size /* optional */);
    /** 
      * Std Signature : S(readAsText,289,,P(d101))
      * TE Signature : S(readAsText,P(d101))
      * 
     */
    public native void readAsText(MSStream stream);
    /** 
      * Std Signature : S(readAsText,289,,P(d101),P(d1))
      * TE Signature : S(readAsText,P(d101),P(d1))
      * 
     */
    public native void readAsText(MSStream stream, String encoding /* optional */);
    /** 
      * Std Signature : S(readAsText,289,,P(d101),P(d1),P(d2))
      * TE Signature : S(readAsText,P(d101),P(d1),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@514200
     */
    public native void readAsText(MSStream stream, String encoding /* optional */, Number size /* optional */);
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
