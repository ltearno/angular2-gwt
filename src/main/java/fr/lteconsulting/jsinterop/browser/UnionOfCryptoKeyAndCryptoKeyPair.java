package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfCryptoKeyAndCryptoKeyPair  {
    @JsOverlay
    default CryptoKey asCryptoKey() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCryptoKeyAndCryptoKeyPair ofCryptoKey(CryptoKey value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CryptoKeyPair asCryptoKeyPair() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCryptoKeyAndCryptoKeyPair ofCryptoKeyPair(CryptoKeyPair value) {
        return Js.cast( value );
    }
    
}
