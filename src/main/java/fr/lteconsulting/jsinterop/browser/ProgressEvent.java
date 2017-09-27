package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: ProgressEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:552163
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:552476
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ProgressEvent")
public class ProgressEvent extends Event
{

    /*
        Constructors
    */
    public ProgressEvent(String type, ProgressEventInit eventInitDict){
        super(null, null);
    }

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

    /*
        Methods
    */
    /** 
      * Std Signature : S(initProgressEvent,289,,P(d1),P(d27),P(d27),P(d27),P(d2),P(d2))
      * TE Signature : S(initProgressEvent,P(d1),P(d27),P(d27),P(d27),P(d2),P(d2))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@552306
     */
    public native void initProgressEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Boolean lengthComputableArg, Number loadedArg, Number totalArg);
}
