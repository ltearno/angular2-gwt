package fr.lteconsulting.jsinterop.rxjs;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: "c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription".ISubscription
  * flags: 32768
  * declared in: c:/Documents/Repos/typescript2java/apis/angular4-api/tsd/rxjs/Subscription.d.ts:144
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ISubscription extends AnonymousSubscription
{

    /*
        Properties
    */

    @JsProperty( name = "closed")
    Boolean getClosed();

    @JsProperty( name = "closed")
    void setClosed( Boolean value );
}
