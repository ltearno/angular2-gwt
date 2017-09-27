package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ErrorEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257879
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:737431
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ErrorEventInit")
public class ErrorEventInit extends EventInit
{

    /*
        Properties
    */

    public Number colno;

    @JsProperty( name = "colno")
    public native Number getColno();

    @JsProperty( name = "colno")
    public native void setColno( Number value );

    public Number conlno;

    @JsProperty( name = "conlno")
    public native Number getConlno();

    @JsProperty( name = "conlno")
    public native void setConlno( Number value );

    public Object error;

    @JsProperty( name = "error")
    public native Object getError();

    @JsProperty( name = "error")
    public native void setError( Object value );

    public String filename;

    @JsProperty( name = "filename")
    public native String getFilename();

    @JsProperty( name = "filename")
    public native void setFilename( String value );

    public Number lineno;

    @JsProperty( name = "lineno")
    public native Number getLineno();

    @JsProperty( name = "lineno")
    public native void setLineno( Number value );

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );
}
