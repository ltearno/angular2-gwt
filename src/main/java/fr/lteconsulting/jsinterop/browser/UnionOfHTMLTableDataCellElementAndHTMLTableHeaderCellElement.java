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
public abstract class UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement extends HTMLTableCellElement  {
    @JsOverlay
    public final HTMLTableDataCellElement asHTMLTableDataCellElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement ofHTMLTableDataCellElement(HTMLTableDataCellElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HTMLTableHeaderCellElement asHTMLTableHeaderCellElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement ofHTMLTableHeaderCellElement(HTMLTableHeaderCellElement value) {
        return Js.uncheckedCast( value );
    }
    
}
