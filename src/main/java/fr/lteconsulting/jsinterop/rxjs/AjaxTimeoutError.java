package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.XMLHttpRequest;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable".AjaxTimeoutError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/observable/dom/AjaxObservable.d.ts:4766
  * 1 constructors
 */
@JsType(isNative=true, namespace="rxjs", name="AjaxTimeoutError")
public class AjaxTimeoutError extends AjaxError
{

    /*
        Constructors
    */
    public AjaxTimeoutError(XMLHttpRequest xhr, AjaxRequest request){
        super(null, null, null);
    }

    /*
        Properties
    */

    public String message;

    @JsProperty( name = "message")
    public native String getMessage();

    @JsProperty( name = "message")
    public native void setMessage( String value );

    public String name;

    @JsProperty( name = "name")
    public native String getName();

    @JsProperty( name = "name")
    public native void setName( String value );

    public String stack;

    @JsProperty( name = "stack")
    public native String getStack();

    @JsProperty( name = "stack")
    public native void setStack( String value );
}
