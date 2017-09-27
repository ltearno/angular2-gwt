package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * base type: SubtleCrypto
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:649860
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:652889
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SubtleCrypto")
public class SubtleCrypto
{

    /*
        Constructors
    */
    public SubtleCrypto(){
    }

    /*
        Methods
    */
    /** 
      * Std Signature : S(decrypt,25<26>,,P(dU(-166,167,168,169,170,171,1)),P(d172),P(dU(-26,100)))
      * TE Signature : S(decrypt,P(dU(-166,167,168,169,170,171,1)),P(d172),P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@649891
     */
    public native PromiseLike<ArrayBuffer> decrypt(UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(deriveBits,25<26>,,P(dU(-173,174,175,176,177,1)),P(d172),P(d2))
      * TE Signature : S(deriveBits,P(dU(-173,174,175,176,177,1)),P(d172),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@650077
     */
    public native PromiseLike<ArrayBuffer> deriveBits(UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString algorithm, CryptoKey baseKey, Number length);
    /** 
      * Std Signature : S(deriveKey,25<172>,,P(dU(-173,174,175,176,177,1)),P(d172),P(dU(-178,173,176,179,177,1)),P(d27),P(d7<1>))
      * TE Signature : S(deriveKey,P(dU(-173,174,175,176,177,1)),P(d172),P(dU(-178,173,176,179,177,1)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@650262
     */
    public native PromiseLike<CryptoKey> deriveKey(UnionOfConcatParamsAndDhKeyDeriveParamsAndEcdhKeyDeriveParamsAndHkdfCtrParamsAndPbkdf2ParamsAndString algorithm, CryptoKey baseKey, UnionOfAesDerivedKeyParamsAndConcatParamsAndHkdfCtrParamsAndHmacImportParamsAndPbkdf2ParamsAndString derivedKeyType, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(digest,25<26>,,P(d1),P(d100))
      * TE Signature : S(digest,P(d1),P(d100))
      * 
     */
    public native PromiseLike<ArrayBuffer> digest(String algorithm, ArrayBufferView data);
    /** 
      * Std Signature : S(digest,25<26>,,P(d1),P(d26))
      * TE Signature : S(digest,P(d1),P(d26))
      * 
     */
    public native PromiseLike<ArrayBuffer> digest(String algorithm, ArrayBuffer data);
    /** 
      * Std Signature : S(digest,25<26>,,P(d180),P(d100))
      * TE Signature : S(digest,P(d180),P(d100))
      * 
     */
    public native PromiseLike<ArrayBuffer> digest(Algorithm algorithm, ArrayBufferView data);
    /** 
      * Std Signature : S(digest,25<26>,,P(d180),P(d26))
      * TE Signature : S(digest,P(d180),P(d26))
      * 
     */
    public native PromiseLike<ArrayBuffer> digest(Algorithm algorithm, ArrayBuffer data);
    /** 
      * Std Signature : S(digest,25<26>,,P(dU(-180,1)),P(dU(-26,100)))
      * TE Signature : S(digest,P(dU(-180,1)),P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@650582
     */
    public native PromiseLike<ArrayBuffer> digest(UnionOfAlgorithmAndString algorithm, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(encrypt,25<26>,,P(dU(-166,167,168,169,170,171,1)),P(d172),P(dU(-26,100)))
      * TE Signature : S(encrypt,P(dU(-166,167,168,169,170,171,1)),P(d172),P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@650672
     */
    public native PromiseLike<ArrayBuffer> encrypt(UnionOfAesCbcParamsAndAesCfbParamsAndAesCmacParamsAndAesCtrParamsAndAesGcmParamsAndRsaOaepParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(exportKey,25<26>,,P(d1),P(d172))
      * TE Signature : S(exportKey,P(d1),P(d172))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@650929
      * VERSION 1
     */
    public native PromiseLike<ArrayBuffer> exportKey(String format, CryptoKey key);
    /** 
      * Std Signature : S(generateKey,25<U(-172,356)>,,P(d1),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d1),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651106
     */
    public native PromiseLike<UnionOfCryptoKeyAndCryptoKeyPair> generateKey(String algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<172>,,P(d177),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d177),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> generateKey(Pbkdf2Params algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<356>,,P(d181),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d181),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKeyPair> generateKey(DhKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<356>,,P(d182),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d182),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKeyPair> generateKey(EcKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<356>,,P(d183),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d183),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKeyPair> generateKey(RsaHashedKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<172>,,P(d184),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d184),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> generateKey(AesKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<172>,,P(d185),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(d185),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> generateKey(HmacKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<356>,,P(dU(-181,182,183)),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(dU(-181,182,183)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651225
      * VERSION 1
     */
    public native PromiseLike<CryptoKeyPair> generateKey(UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(generateKey,25<172>,,P(dU(-184,185,177)),P(d27),P(d7<1>))
      * TE Signature : S(generateKey,P(dU(-184,185,177)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651381
      * VERSION 2
     */
    public native PromiseLike<CryptoKey> generateKey(UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(d1),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(d1),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, String algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(d179),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(d179),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, HmacImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(d187),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(d187),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, DhImportKeyParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(d188),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(d188),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, EcKeyImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(d189),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(d189),P(d27),P(d7))
      * 
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, RsaHashedImportParams algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(d186),P(dU(-187,188,179,189,1)),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(d186),P(dU(-187,188,179,189,1)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651527
     */
    public native PromiseLike<CryptoKey> importKey(String format, JsonWebKey keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(dU(-26,100)),P(dU(-187,188,179,189,1)),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(dU(-26,100)),P(dU(-187,188,179,189,1)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651746
      * VERSION 1
     */
    public native PromiseLike<CryptoKey> importKey(String format, UnionOfArrayBufferAndArrayBufferView keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(importKey,25<172>,,P(d1),P(dU(-26,100,186)),P(dU(-187,188,179,189,1)),P(d27),P(d7<1>))
      * TE Signature : S(importKey,P(d1),P(dU(-26,100,186)),P(dU(-187,188,179,189,1)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@651986
      * VERSION 2
     */
    public native PromiseLike<CryptoKey> importKey(String format, UnionOfArrayBufferAndArrayBufferViewAndJsonWebKey keyData, UnionOfDhImportKeyParamsAndEcKeyImportParamsAndHmacImportParamsAndRsaHashedImportParamsAndString algorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(sign,25<26>,,P(dU(-168,190,191,1)),P(d172),P(dU(-26,100)))
      * TE Signature : S(sign,P(dU(-168,190,191,1)),P(d172),P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@652221
     */
    public native PromiseLike<ArrayBuffer> sign(UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(unwrapKey,25<172>,,P(d1),P(dU(-26,100)),P(d172),P(dU(-180,1)),P(dU(-180,1)),P(d27),P(d7<1>))
      * TE Signature : S(unwrapKey,P(d1),P(dU(-26,100)),P(d172),P(dU(-180,1)),P(dU(-180,1)),P(d27),P(d7))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@652357
     */
    public native PromiseLike<CryptoKey> unwrapKey(String format, UnionOfArrayBufferAndArrayBufferView wrappedKey, CryptoKey unwrappingKey, UnionOfAlgorithmAndString unwrapAlgorithm, UnionOfAlgorithmAndString unwrappedKeyAlgorithm, Boolean extractable, Array<String> keyUsages);
    /** 
      * Std Signature : S(verify,25<27>,,P(dU(-168,190,191,1)),P(d172),P(dU(-26,100)),P(dU(-26,100)))
      * TE Signature : S(verify,P(dU(-168,190,191,1)),P(d172),P(dU(-26,100)),P(dU(-26,100)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@652589
     */
    public native PromiseLike<Boolean> verify(UnionOfAesCmacParamsAndEcdsaParamsAndRsaPssParamsAndString algorithm, CryptoKey key, UnionOfArrayBufferAndArrayBufferView signature, UnionOfArrayBufferAndArrayBufferView data);
    /** 
      * Std Signature : S(wrapKey,25<26>,,P(d1),P(d172),P(d172),P(d1))
      * TE Signature : S(wrapKey,P(d1),P(d172),P(d172),P(d1))
      * 
     */
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);
    /** 
      * Std Signature : S(wrapKey,25<26>,,P(d1),P(d172),P(d172),P(d180))
      * TE Signature : S(wrapKey,P(d1),P(d172),P(d172),P(d180))
      * 
     */
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, Algorithm wrapAlgorithm);
    /** 
      * Std Signature : S(wrapKey,25<26>,,P(d1),P(d172),P(d172),P(dU(-180,1)))
      * TE Signature : S(wrapKey,P(d1),P(d172),P(d172),P(dU(-180,1)))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@652748
     */
    public native PromiseLike<ArrayBuffer> wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, UnionOfAlgorithmAndString wrapAlgorithm);
}
