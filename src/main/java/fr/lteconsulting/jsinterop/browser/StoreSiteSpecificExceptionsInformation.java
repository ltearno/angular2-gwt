package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: StoreSiteSpecificExceptionsInformation
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:281081
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StoreSiteSpecificExceptionsInformation")
public class StoreSiteSpecificExceptionsInformation extends StoreExceptionsInformation
{

    /*
        Properties
    */

    public Array<String> arrayOfDomainStrings;

    @JsProperty( name = "arrayOfDomainStrings")
    public native Array<String> getArrayOfDomainStrings();

    @JsProperty( name = "arrayOfDomainStrings")
    public native void setArrayOfDomainStrings( Array<String> value );
}
