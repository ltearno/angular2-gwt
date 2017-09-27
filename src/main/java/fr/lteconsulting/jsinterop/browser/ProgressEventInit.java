package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ProgressEventInit
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:273196
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:739485
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProgressEventInit")
public class ProgressEventInit extends EventInit
{

    /*
        Properties
    */

    public Boolean lengthComputable;

    @JsProperty( name = "lengthComputable")
    public native Boolean getLengthComputable();

    @JsProperty( name = "lengthComputable")
    public native void setLengthComputable( Boolean value );

    public Number loaded;

    @JsProperty( name = "loaded")
    public native Number getLoaded();

    @JsProperty( name = "loaded")
    public native void setLoaded( Number value );

    public Number total;

    @JsProperty( name = "total")
    public native Number getTotal();

    @JsProperty( name = "total")
    public native void setTotal( Number value );
}
