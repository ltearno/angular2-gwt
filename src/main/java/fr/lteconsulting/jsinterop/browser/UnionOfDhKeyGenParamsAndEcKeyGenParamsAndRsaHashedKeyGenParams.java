package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams extends Algorithm  {
    @JsOverlay
    public final DhKeyGenParams asDhKeyGenParams() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofDhKeyGenParams(DhKeyGenParams value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final EcKeyGenParams asEcKeyGenParams() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofEcKeyGenParams(EcKeyGenParams value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final RsaHashedKeyGenParams asRsaHashedKeyGenParams() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofRsaHashedKeyGenParams(RsaHashedKeyGenParams value) {
        return Js.uncheckedCast( value );
    }
    
}
