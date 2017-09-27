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
public abstract class UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params extends Algorithm  {
    @JsOverlay
    public final AesKeyGenParams asAesKeyGenParams() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofAesKeyGenParams(AesKeyGenParams value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HmacKeyGenParams asHmacKeyGenParams() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofHmacKeyGenParams(HmacKeyGenParams value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final Pbkdf2Params asPbkdf2Params() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofPbkdf2Params(Pbkdf2Params value) {
        return Js.uncheckedCast( value );
    }
    
}
