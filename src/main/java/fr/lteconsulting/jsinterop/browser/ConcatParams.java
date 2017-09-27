package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ConcatParams
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:742309
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConcatParams")
public class ConcatParams extends Algorithm
{

    /*
        Properties
    */

    public Uint8Array algorithmId;

    @JsProperty( name = "algorithmId")
    public native Uint8Array getAlgorithmId();

    @JsProperty( name = "algorithmId")
    public native void setAlgorithmId( Uint8Array value );

    public UnionOfAlgorithmAndString hash;

    @JsProperty( name = "hash")
    public native UnionOfAlgorithmAndString getHash();

    @JsProperty( name = "hash")
    public native void setHash( UnionOfAlgorithmAndString value );

    @JsOverlay
    public final void setHash( Algorithm value ) { setHash(UnionOfAlgorithmAndString.ofAlgorithm( value )); }

    @JsOverlay
    public final void setHash( String value ) { setHash(UnionOfAlgorithmAndString.ofString( value )); }

    public Uint8Array partyUInfo;

    @JsProperty( name = "partyUInfo")
    public native Uint8Array getPartyUInfo();

    @JsProperty( name = "partyUInfo")
    public native void setPartyUInfo( Uint8Array value );

    public Uint8Array partyVInfo;

    @JsProperty( name = "partyVInfo")
    public native Uint8Array getPartyVInfo();

    @JsProperty( name = "partyVInfo")
    public native void setPartyVInfo( Uint8Array value );

    public Uint8Array privateInfo;

    @JsProperty( name = "privateInfo")
    public native Uint8Array getPrivateInfo();

    @JsProperty( name = "privateInfo")
    public native void setPrivateInfo( Uint8Array value );

    public Uint8Array publicInfo;

    @JsProperty( name = "publicInfo")
    public native Uint8Array getPublicInfo();

    @JsProperty( name = "publicInfo")
    public native void setPublicInfo( Uint8Array value );
}
