package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: LongRunningScriptDetectedEvent
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:500269
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:500416
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="LongRunningScriptDetectedEvent")
public class LongRunningScriptDetectedEvent extends Event
{

    /*
        Constructors
    */
    public LongRunningScriptDetectedEvent(){
        super(null, null);
    }

    /*
        Properties
    */

    public Number executionTime;

    @JsProperty( name = "executionTime")
    public native Number getExecutionTime();

    @JsProperty( name = "executionTime")
    public native void setExecutionTime( Number value );

    public Boolean stopPageScriptExecution;

    @JsProperty( name = "stopPageScriptExecution")
    public native Boolean getStopPageScriptExecution();

    @JsProperty( name = "stopPageScriptExecution")
    public native void setStopPageScriptExecution( Boolean value );
}
