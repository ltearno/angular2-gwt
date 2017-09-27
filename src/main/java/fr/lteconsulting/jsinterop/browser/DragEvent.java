package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DragEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:363889
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:364433
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DragEvent")
public class DragEvent extends MouseEvent
{

    /*
        Constructors
    */
    public DragEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public DataTransfer dataTransfer;

    @JsProperty( name = "dataTransfer")
    public native DataTransfer getDataTransfer();

    @JsProperty( name = "dataTransfer")
    public native void setDataTransfer( DataTransfer value );

    /*
        Methods
    */
    /** 
      * Std Signature : S(initDragEvent,289,,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47),P(d66))
      * TE Signature : S(initDragEvent,P(d1),P(d27),P(d27),P(d45),P(d2),P(d2),P(d2),P(d2),P(d2),P(d27),P(d27),P(d27),P(d27),P(d2),P(d47),P(d66))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@363977
     */
    public native void initDragEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, Number buttonArg, EventTarget relatedTargetArg, DataTransfer dataTransferArg);
    /** 
      * Std Signature : S(msConvertURL,289,,P(d57),P(d1))
      * TE Signature : S(msConvertURL,P(d57),P(d1))
      * 
     */
    public native void msConvertURL(File file, String targetType);
    /** 
      * Std Signature : S(msConvertURL,289,,P(d57),P(d1),P(d1))
      * TE Signature : S(msConvertURL,P(d57),P(d1),P(d1))
      * 
     */
    /** 
      * apis/browser-api/tsd/lib.es6.d.ts@364347
     */
    public native void msConvertURL(File file, String targetType, String targetURL /* optional */);
}
