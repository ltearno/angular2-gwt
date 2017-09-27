package fr.lteconsulting.jsinterop.rxjs;

import fr.lteconsulting.jsinterop.browser.Error;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/util/TimeoutError".TimeoutError
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/util/TimeoutError.d.ts:0
  * 1 constructors
  * An error thrown when duetime elapses.
 */
@JsType(isNative=true, namespace="rxjs", name="TimeoutError")
public class TimeoutError extends Error
{

    /*
        Constructors
    */
    public TimeoutError(){
        super(null);
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
