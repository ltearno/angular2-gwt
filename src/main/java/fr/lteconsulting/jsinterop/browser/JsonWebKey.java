package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: JsonWebKey
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:742865
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="JsonWebKey")
public class JsonWebKey
{

    /*
        Properties
    */

    public String alg;

    @JsProperty( name = "alg")
    public native String getAlg();

    @JsProperty( name = "alg")
    public native void setAlg( String value );

    public String crv;

    @JsProperty( name = "crv")
    public native String getCrv();

    @JsProperty( name = "crv")
    public native void setCrv( String value );

    public String d;

    @JsProperty( name = "d")
    public native String getD();

    @JsProperty( name = "d")
    public native void setD( String value );

    public String dp;

    @JsProperty( name = "dp")
    public native String getDp();

    @JsProperty( name = "dp")
    public native void setDp( String value );

    public String dq;

    @JsProperty( name = "dq")
    public native String getDq();

    @JsProperty( name = "dq")
    public native void setDq( String value );

    public String e;

    @JsProperty( name = "e")
    public native String getE();

    @JsProperty( name = "e")
    public native void setE( String value );

    public Boolean ext;

    @JsProperty( name = "ext")
    public native Boolean getExt();

    @JsProperty( name = "ext")
    public native void setExt( Boolean value );

    public String k;

    @JsProperty( name = "k")
    public native String getK();

    @JsProperty( name = "k")
    public native void setK( String value );

    public Array<String> key_ops;

    @JsProperty( name = "key_ops")
    public native Array<String> getKey_ops();

    @JsProperty( name = "key_ops")
    public native void setKey_ops( Array<String> value );

    public String kid;

    @JsProperty( name = "kid")
    public native String getKid();

    @JsProperty( name = "kid")
    public native void setKid( String value );

    public String kty;

    @JsProperty( name = "kty")
    public native String getKty();

    @JsProperty( name = "kty")
    public native void setKty( String value );

    public String n;

    @JsProperty( name = "n")
    public native String getN();

    @JsProperty( name = "n")
    public native void setN( String value );

    public Array<RsaOtherPrimesInfo> oth;

    @JsProperty( name = "oth")
    public native Array<RsaOtherPrimesInfo> getOth();

    @JsProperty( name = "oth")
    public native void setOth( Array<RsaOtherPrimesInfo> value );

    public String p;

    @JsProperty( name = "p")
    public native String getP();

    @JsProperty( name = "p")
    public native void setP( String value );

    public String q;

    @JsProperty( name = "q")
    public native String getQ();

    @JsProperty( name = "q")
    public native void setQ( String value );

    public String qi;

    @JsProperty( name = "qi")
    public native String getQi();

    @JsProperty( name = "qi")
    public native void setQi( String value );

    public String use;

    @JsProperty( name = "use")
    public native String getUse();

    @JsProperty( name = "use")
    public native void setUse( String value );

    public String x;

    @JsProperty( name = "x")
    public native String getX();

    @JsProperty( name = "x")
    public native void setX( String value );

    public String x5c;

    @JsProperty( name = "x5c")
    public native String getX5c();

    @JsProperty( name = "x5c")
    public native void setX5c( String value );

    public String x5t;

    @JsProperty( name = "x5t")
    public native String getX5t();

    @JsProperty( name = "x5t")
    public native void setX5t( String value );

    public String x5u;

    @JsProperty( name = "x5u")
    public native String getX5u();

    @JsProperty( name = "x5u")
    public native void setX5u( String value );

    public String y;

    @JsProperty( name = "y")
    public native String getY();

    @JsProperty( name = "y")
    public native void setY( String value );
}
