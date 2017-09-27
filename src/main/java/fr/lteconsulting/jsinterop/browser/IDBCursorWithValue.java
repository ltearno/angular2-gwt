package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: IDBCursorWithValue
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:490590
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:490680
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBCursorWithValue")
public class IDBCursorWithValue extends IDBCursor
{

    /*
        Constructors
    */
    public IDBCursorWithValue(){
    }

    /*
        Properties
    */

    public Object value;

    @JsProperty( name = "value")
    public native Object getValue();

    @JsProperty( name = "value")
    public native void setValue( Object value );
}
